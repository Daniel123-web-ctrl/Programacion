package poo.transporte;

public class Motocicleta extends Vehiculo {

    private int  cilindrada ;

    public  Motocicleta (String marca,String modelo,int anio,double precioDia,int kilometros,int  cilindrada){
 super(marca, modelo, anio, precioDia, kilometros);
 this.cilindrada=cilindrada;

    }


   public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

}
