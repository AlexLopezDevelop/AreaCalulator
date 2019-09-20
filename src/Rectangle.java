public class Rectangle {

    private int height;
    private int base;

    public Rectangle (int base, int height) {

        this.base = base;
        this.height = height;
    }

    public int calculateArea() {

        return base * height;
    }

    /*public static void main(String[] args) {

        Rectangle rectangulo1 = new Rectangle(12, 15); // Apunta rectangulo1 a el Rectangulo(12, 15)
        int area = rectangulo1.calculateArea();
        System.out.print("Area: " + area);
    }*/
}
