package ifsc.poo.geom;

public class Ponto {
    private final double x, y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double dist(Ponto other) {
        return Math.sqrt(Math.pow((this.x-other.x), 2) + Math.pow((this.y-other.y), 2));
    }
}
