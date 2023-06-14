import pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(24);
        Pizza pizza2 = new Pizza(28);

        System.out.println("Caloric difference is: " + (pizza2.getCalories() - pizza1.getCalories()));
    }
}
