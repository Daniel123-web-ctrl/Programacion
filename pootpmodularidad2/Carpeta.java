package pootpmodularidad2;
import java.time.LocalDateTime;

public class Carpeta {

    private String nombre;
    private LocalDateTime FechaHoraCreacion;
    private Carpeta[] carpetas;
    private Archivo [] archivos;
    private  int cantidadCarpetas;
    private  int cantidadArchivos ;
    private Carpeta carpetaPadre;


    public Carpeta(String nombre, LocalDateTime fechaHoraCreacion, Carpeta carpetaPadre) {
        this.nombre = nombre;
       this.FechaHoraCreacion = fechaHoraCreacion;
        this.carpetaPadre = carpetaPadre;

        carpetas = new Carpeta[5];
        archivos = new Archivo[5];

        cantidadCarpetas = 0;
        cantidadArchivos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public  LocalDateTime getFechaHoraCreacion() {
        return FechaHoraCreacion;
    }

    public Carpeta[] getCarpetas() {
        return carpetas;
    }

    public Archivo[] getArchivos() {
        return archivos;
    }

    public int getCantidadCarpetas() {
        return cantidadCarpetas;
    }

    public int getCantidadArchivos() {
        return cantidadArchivos;
    }

    public Carpeta getCarpetaPadre() {
        return carpetaPadre;
    }

    public void setCantidadCarpetas(int cantidadCarpetas) {
        this.cantidadCarpetas = cantidadCarpetas;
    }

    public void setCantidadArchivos(int cantidadArchivos) {
        this.cantidadArchivos = cantidadArchivos;
    }
}

