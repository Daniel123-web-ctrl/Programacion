package poo;

public class Celular extends Dispositivo {

private int capacidadAlmacenamiento;



public Celular(String marca,String modelo,double precio,int stock, int capacidadAlmacenamiento){
    super(marca, modelo, precio, stock);
    this.capacidadAlmacenamiento=capacidadAlmacenamiento;

}

public int getCapacidadAlmacenamiento() {
    return capacidadAlmacenamiento;
}

public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
    this.capacidadAlmacenamiento = capacidadAlmacenamiento;
}



@Override
public String consultarInformacion() {
    
    return super.consultarInformacion() + String.format("%nCapacidad de Almacenamiento %d GB", getCapacidadAlmacenamiento());
}



}

