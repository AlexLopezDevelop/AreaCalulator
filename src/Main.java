public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(15, 20);
        int rectangleArea = rectangle.calculateArea();

        Cube cube = new Cube(15);
        double cubeArea = MathTools.roundToTwoNumbers(cube.calculateArea());

        Sphere sphere = new Sphere(15);
        double sphereArea = MathTools.roundToTwoNumbers(sphere.calculateArea());

        Triangle triangle = new Triangle(15, 20);
        double triangleArea = MathTools.roundToTwoNumbers(triangle.calculateArea());

        System.out.println("Area Rectangle: " + rectangleArea);
        System.out.println("Area Cube: " + cubeArea);
        System.out.println("Area Sphere: " + sphereArea);
        System.out.println("Area Triangle: " + triangleArea);

    }
}
