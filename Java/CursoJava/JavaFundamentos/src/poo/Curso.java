    package poo;

public class Curso {

    private String codigo;
    private String nombre;
    private int numCreditos;
    private int cantidadAlumnos;
    private double costoCredito;

public Curso (String codigo,String nombre,int numCreditos ,int cantidadAlumnos,double costoCredito){

    this.codigo=codigo;
    this.nombre=nombre;
    this.numCreditos=numCreditos;
    this.cantidadAlumnos=cantidadAlumnos;
    this.costoCredito=costoCredito;

}
 public double calcularIngresoTotal(){
return numCreditos*costoCredito*cantidadAlumnos;
 }
public double calcularPromedioIngresosAlumno(){
    return calcularIngresoTotal()/cantidadAlumnos;

}
public String determinarDemandaCurso(){
    if(cantidadAlumnos>30) return "Alta ";
    else if(cantidadAlumnos>15)  return "Media"; 
    else return "Baja ";

}



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

    
    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }


public double getCostoCredito() {
    return costoCredito;
}

public void setCostoCredito(double costoCredito) {
    this.costoCredito = costoCredito;
}
}
