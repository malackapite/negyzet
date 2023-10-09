
package negyzet;

public class Negyzet {
    private double a, terulet;
    private Koordinata koordinata;

    public void setKoordinata(Koordinata koordinata) {
        this.koordinata = koordinata;
    }

    public Koordinata getKoordinata() {
        return koordinata;
    }
    
    public void setA(double a) {
        this.a = a<=0?1:a;
    }

    public double getA() {
        return a;
    }

    public double getTerulet() {
        return a*a;
    }
}
