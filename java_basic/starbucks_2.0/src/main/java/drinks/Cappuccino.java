package drinks;

public class Cappuccino {
    private String name = "Капучино";

    public Cappuccino() {
        makeCappuccino();
    }

    private void makeCappuccino() {
        System.out.println("Готовим эспрессо и добавляем вспененное молоко...");
        System.out.println(name + " готово!");
    }
}
