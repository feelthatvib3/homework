import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        float firstNumber = myScanner.nextFloat();

        System.out.print("Enter your second number: ");
        float secondNumber = myScanner.nextFloat();

        int result = (int) (firstNumber + secondNumber);

        System.out.println("The result of multiplication of your numbers is: " + result);

        myScanner.close();
    }
}
