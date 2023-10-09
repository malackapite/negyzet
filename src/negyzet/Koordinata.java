package negyzet;

public class Koordinata {
    private double x,y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Koordinata(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
