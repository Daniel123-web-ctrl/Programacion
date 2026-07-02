package pootpmodularidad2;

import java.time.LocalDateTime;

public class Archivo {
    private String nombre;
     private LocalDateTime fechaHoraCreacion;
    private int tamaño;

 public Archivo(String nombre,LocalDateTime fechaHoraCreacion, int tamaño){
    this.nombre=nombre;
    this.fechaHoraCreacion=fechaHoraCreacion;
    this.tamaño=tamaño;


 }





























    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public LocalDateTime getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }
    public void setFechaHoraCreacion(LocalDateTime fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }
   
    public int getTamaño() {
        return tamaño;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }



    

}
