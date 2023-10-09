
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

    public Negyzet(double a, Koordinata koordinata) {
        this.a = a;
        this.koordinata = koordinata;
    }

    public Negyzet(double a) {
        this(a, new Koordinata(0,0));
    }    
    
    public Negyzet() {
        this(1, new Koordinata(0,0));
    } 

    @Override
    public String toString() {
        return "Negyzet{" + "a=" + a + ", terulet=" + terulet + ", koordinata=" + koordinata + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Negyzet other = (Negyzet) obj;
        return Double.doubleToLongBits(this.a) == Double.doubleToLongBits(other.a);
    }
    
}
