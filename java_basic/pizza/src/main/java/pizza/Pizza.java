package pizza;

public class Pizza {
    private final int diameter;
    private final int calories = 40;

    public Pizza(int diameter) {
        this.diameter = diameter;
        printCalories();
    }

    private void printCalories() {
        System.out.println(diameter + " cm pizza has " + getCalories() + " calories");
    }

    public int getCalories() {
        return diameter * calories;
    }
}
