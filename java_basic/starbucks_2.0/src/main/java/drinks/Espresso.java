package drinks;

public class Espresso {
    private String name = "Эспрессо";

    public Espresso() {
        makeEspresso();
    }

    private void makeEspresso() {
        System.out.println(name + " готово!");
    }
}
