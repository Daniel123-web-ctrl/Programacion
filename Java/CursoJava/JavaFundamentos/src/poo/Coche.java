package poo;



public class Coche {
    //Constructor ,le da un estado inicial en este caso a ruedas ,color ,etc
    public Coche(){
 
        
        color ="gris";
        pesoBase =1350.25;
        precioBase =15650.25;
        alto=150;
       
        peso =pesoBase;
        precio=precioBase;
       }
  
     private double alto;

     private double peso;

     private String color;

     private double pesoBase;

     private double ancho;

     private int ruedas;  

    private boolean asientosCuero;

    private boolean climatizador;    //se encampsula  con private 
      
     private double precioBase;

     private double precio;



     //Getter y setter


     public double getPesoBase() {
        return pesoBase;
    }
    public void setPesoBase(double pesoBase) {
         this.pesoBase = pesoBase;
     }

       
   
     public  String  isClimatizador() {
        if (climatizador)   return "El coche incorpora climatizador";    // if (climatizador==true) 
        else return "El coche incorpora aire acondicionado";
      
    }
     public void setClimatizador(String climatizador) {
        if (climatizador.equalsIgnoreCase("si"))  this.climatizador = true;  //this  es para referirte a  al climatizador campo de clase(atributo)
        else  this.climatizador=false;
        
        //aqui se llama a estos dos metodos porque estos dos dependen de que si tiene climatizador   o no .

        setPrecioBase();
        setPeso();
     }





     
     public String isAsientosCuero() {
        if (asientosCuero==true)   return "el coche tiene asientos de cuero";
        else  return "El coche no tienes asientos de cuero ";
    }
     public void setAsientosCuero(String asientosCuero) {
       
           if (asientosCuero.equalsIgnoreCase("si"))  this.asientosCuero = true;
        else this.climatizador=false;

        //aqui se llama a estos dos metodos porque estos dos dependen de que si tiene asiento cuero o no 
        setPrecioBase();
        setPeso();
     } 

    






     public double getPrecioBase() {
        return precio;
    }
    private void setPrecioBase() {
         if (climatizador)  precioBase +=3250.20;
       if(asientosCuero ) precioBase +=3500;
      
       precio=precioBase;
            
        }



     






     
     public double getAncho() {
        return ancho;
    }
     public void setAncho(double ancho) {
         this.ancho = ancho;
     }







      
     public double getAlto() {
        return alto;

    }
     public void setAlto(double alto) {
        if(alto>200){
            System.out.println("El coche es demasiado alto tienes que modificarlo");
            this.alto=alto;
        }else{
            System.out.println("El carro esta por debajo de los 200 asi que si tiene buena altura");
        }
         this.alto = alto;
     }
      





     
     public double getPeso() {
        return peso;
    }
     private void setPeso() {
       if(asientosCuero ) pesoBase +=50;
       if (climatizador)  pesoBase +=70;
        
       peso=pesoBase;                  
     }



     
    public String getColor() {
        
        return color;
    }
     public void setColor(String color) {
        if(color.equalsIgnoreCase("celeste")) {
            System.out.println("El color celeste es hermoso ,tienes buenos gustos");
        this.color=color;
        }
        else{
            System.out.println("El  color es diferente a celeste asi que esta horrible");
        }

         this.color=color;
     }




    
     public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        if (ruedas>4 || ruedas<3) {
            
            System.out.println("El numero de ruedas es erroneo ");
            this.ruedas=ruedas;
        }else{
            this.ruedas=ruedas;
        }

    }








void arrancar(){

}
void frenar (){

}

void girar(){

    
}

    
}
 