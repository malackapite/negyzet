package negyzet;

public class View {
    void kiIr(){
         Negyzet negyzet = new Negyzet();
         negyzet.setA(2.2);
         System.out.println("A: "+negyzet.getA());
         System.out.println("Terület: "+ negyzet.getTerulet());
    }
}
