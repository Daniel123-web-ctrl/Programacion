package poo;

public class UsoVehiculos {
    public static void main(String[] args) {

        Coche coche1=new Coche();
        coche1.setAncho(200);
        
        
       // coche1.setAsientosCuero("si");
       // System.out.println(coche1.isAsientosCuero());
       //System.out.println(coche1.getPrecio());
       //coche1.setColor("morado");
       //System.out.println(coche1.getColor());
       //coche1.setClimatizador("si");
       //System.out.println(coche1.isClimatizador());
       //System.out.println(coche1.getPeso());
       //coche1.setRuedas(8);
       //System.out.println(coche1.getRuedas());
       //coche1.setAlto(300);
       //System.out.println(coche1.getAlto());
       
    Furgoneta furgoneta1= new Furgoneta(2, 1500);
      furgoneta1.setColor("Celeste");
      furgoneta1.setAsientosCuero("si");
      furgoneta1.setClimatizador("si");
   furgoneta1.setAncho(250);

  //    System.out.printf("El coche tiene  %d ruedas%n y mide %.2f cm%n y tiene un peso de %.2f kilos%n  ",coche1.getRuedas(),coche1.getAncho(),coche1.getPeso());
     
    //  System.out.printf("El coche tiene  %d ruedas%n y mide %.2f cm%n y tiene un peso de %.2f kilos%n  ",furgoneta1.getRuedas(),furgoneta1.getAncho(),furgoneta1.getPeso());
    
System.out.println(furgoneta1.getDatosFurgoneta());

    }

}
