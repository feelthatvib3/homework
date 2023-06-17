package drinks;

public class Americano {
    private String name = "Американо";

    public Americano() {
        makeAmericano();
    }

    private void makeAmericano() {
        System.out.println("Готовим эспрессо и заливаем кипятком...");
        System.out.println(name + " готов!");
    }
}
