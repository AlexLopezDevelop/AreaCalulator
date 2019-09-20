public class Triangle {

    private int base;
    private int height;

    public Triangle (int base, int height) {

        this.base = base;
        this.height = height;
    }

    public double calculateArea() {

        return (base * height) / 2;
    }
}
