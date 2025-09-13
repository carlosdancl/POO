public class Punto {
    double x = 1, y = 1;

    public Punto() {}

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Punto (x = " + x + " , y = " + y + ")";
    }
}