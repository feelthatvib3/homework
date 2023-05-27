import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the number you want to be displayed in different numeric systems: ");
        int myNumber = myScanner.nextInt();

        System.out.println("Number " + myNumber + " in binary system is equal to: " + Integer.toBinaryString(myNumber) + ".");
        System.out.println("Number " + myNumber + " in octal system is equal to: " + Integer.toOctalString(myNumber) + ".");
        System.out.println("Number " + myNumber + " in decimal system is equal to: " + myNumber + ".");
        System.out.println("Number " + myNumber + " in hexadecimal system is equal to: " + Integer.toHexString(myNumber) + ".");

        myScanner.close();
    }
}
