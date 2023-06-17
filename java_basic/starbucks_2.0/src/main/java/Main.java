import drinks.Americano;
import drinks.Cappuccino;
import drinks.Espresso;
import drinks.Tea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Выберите желаемый напиток (где 1 — эспрессо, 2 — американо, 3 — капучино, 4 — чай): ");
        byte drinkType = sc.nextByte();
        sc.close();

        switch (drinkType) {
            case 1  -> {
                Espresso espresso = new Espresso();
            }
            case 2  -> {
                Americano americano = new Americano();
            }
            case 3  -> {
                Cappuccino cappuccino = new Cappuccino();
            }
            case 4  -> {
                Tea tea = new Tea();
            }
            default -> System.out.println("Incorrect number!");
        }
    }
}