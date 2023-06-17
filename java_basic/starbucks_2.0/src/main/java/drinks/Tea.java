package drinks;

public class Tea {
    private String name = "Чай";

    public Tea() {
        makeTea();
    }

    private void makeTea() {
        System.out.println("Добавляем пакетик чая и заливаем кипятком...");
        System.out.println(name + " готов!");
    }
}
