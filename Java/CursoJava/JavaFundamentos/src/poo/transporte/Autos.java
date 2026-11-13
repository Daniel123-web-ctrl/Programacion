package poo.transporte;

public class Autos extends Vehiculo {

    private int  cantidadPuertas ;


   


    public  Autos (String marca,String modelo,int anio,double precioDia,int kilometros,int  cantidadPuertas){
 super(marca, modelo, anio, precioDia, kilometros);
 this.cantidadPuertas=cantidadPuertas;

    }



     public int getCantidadPuertas() {
        return cantidadPuertas;
    }


    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
}
