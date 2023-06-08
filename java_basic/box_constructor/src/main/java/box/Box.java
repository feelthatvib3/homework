package box;

public class Box {
    public double width;
    public double height;
    public double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void calculateVolume() {
        double volume = length * width * height;

        System.out.println("The volume of the box is: " + volume + " cm^3");
    }
}
