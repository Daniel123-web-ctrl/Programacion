package poo;

public class UsoCoches {
    public static void main(String[] args) {

        Coche coche1=new Coche();
        
        coche1.setAsientosCuero("si");
        System.out.println(coche1.isAsientosCuero()|);
       System.out.println(coche1.getPrecio());
       //coche1.setColor("morado");
       //System.out.println(coche1.getColor());
       coche1.setClimatizador("si");
       System.out.println(coche1.isClimatizador());
       System.out.println(coche1.getPeso());
       //coche1.setRuedas(8);
       //System.out.println(coche1.getRuedas());
       //coche1.setAlto(300);
       //System.out.println(coche1.getAlto());

    }

}
