package poo.transporte;

public class Camiones extends Vehiculo {

    private double  capacidadCarga;
    private int cantidadEjes;


   


    public  Camiones (String marca,String modelo,int anio,double precioDia,int kilometros,double  capacidadCarga,int cantidadEjes){
 super(marca, modelo, anio, precioDia, kilometros);
 this.capacidadCarga=capacidadCarga;
this.cantidadEjes=cantidadEjes;
    }



 public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }


    
}
