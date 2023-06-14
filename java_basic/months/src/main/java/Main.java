import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month's number (1-12): ");
        int monthNumber = sc.nextInt();

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

        sc.close();
    }
}
