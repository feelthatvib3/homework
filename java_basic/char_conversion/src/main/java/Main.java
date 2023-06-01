public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
=======

>>>>>>> cc33f13 (Add char_conversion task)
        // first approach (ASCII table)
        char x = '0';
        int xx = x;

        System.out.println(xx);
        // or
        // System.out.println((int) x);

        // second approach (parseInt() method)
        char y = '0';
        int yy = Integer.parseInt(String.valueOf(y));

        System.out.println(yy);

        // third approach (getNumericValue() of the character's class method)
        char z = '0';
        int zz = Character.getNumericValue(z);

        System.out.println(zz);
    }
}
