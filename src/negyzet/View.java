package negyzet;

public class View {
    void kiIr(){
         Negyzet negyzet = new Negyzet(1.1, new Koordinata(3, 32));
         System.out.println("A: "+negyzet.getA());
         System.out.println("Terület: "+ negyzet.getTerulet());
         System.out.println("X: "+ negyzet.getKoordinata().getX());
         System.out.println("Y: "+ negyzet.getKoordinata().getY());
         Negyzet negyzet2 = new Negyzet(1.1);
         System.out.println(negyzet.equals(negyzet2));
    }
}
