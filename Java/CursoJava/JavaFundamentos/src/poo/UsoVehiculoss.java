package poo;

public class UsoVehiculoss {

    public static void main(String[] args) {
        

        Coche4 lamborguini=new Coche4(0); // instancia o tambien podemos  llamarlo que se creo un objeto 
        Furgoneta ferrary  =new  Furgoneta(23, 3);
        //Al crear un objeto de la clase Furgoneta y como este hereda de la clase coche ,automaticamente tambien hereda los metods que tiene  la clase coche
        
       // System.out.println(lamborguini.getPeso());
       // System.out.println(lamborguini.getPrecio());

        lamborguini.setAsientosDeCuero("si");
        lamborguini.setClimatizador("si");

       // System.out.printf("El peso es %.2f %n" ,lamborguini.getPeso());
       // System.out.printf("El precio es %.2f  ",lamborguini.getPrecio());
       // System.out.println("Plaza extra " + ferrary.getDatosFurgoneta());

       ferrary.setColor("Rojo Plateado");
        ferrary.setAsientosDeCuero("si");
         ferrary.setClimatizador("si");
         ferrary.setAlto(23);
       
       
       
       System.out.printf("el auto tiene una altura de %.2f  metros",ferrary.getAlto());
        


    }
}
