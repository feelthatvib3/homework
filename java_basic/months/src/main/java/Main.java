import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month's number (1-12): ");
        int monthNumber = sc.nextInt();
        sc.close();

        /*
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            System.out.println("It is winter!");
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            System.out.println("It is spring!");
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("It is summer!");
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("It is autumn!");
        } else {
            System.out.println("Incorrect number!");
        }
         */

        /*
        if (monthNumber >= 1 && monthNumber <= 12) {
            if (monthNumber > 2 && monthNumber < 6) {
                System.out.println("It's spring!");
            } else if (monthNumber > 5 && monthNumber < 9) {
                System.out.println("It's summer!");
            } else if (monthNumber > 8 && monthNumber < 12) {
                System.out.println("It's autumn!");
            } else {
                System.out.println("It's winter!");
            }
        } else {
            System.out.println("Incorrect number!");
        }
        */

        switch(monthNumber) {
            case 1, 2, 12   -> System.out.println("It's winter!");
            case 3, 4, 5    -> System.out.println("It's spring!");
            case 6, 7, 8    -> System.out.println("It's summer!");
            case 9, 10, 11  -> System.out.println("It's autumn!");
            default         -> System.out.println("Incorrect number!");
        }

        // слишком много способов решения на одну квадратную задачу :)
    }
}
