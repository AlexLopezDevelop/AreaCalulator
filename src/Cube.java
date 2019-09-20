public class Cube {

    private int edge;

    public Cube(int edge) {

        this.edge = edge;
    }

    public double calculateArea() {
        return 6 * Math.pow(edge, 2);
    }
}
