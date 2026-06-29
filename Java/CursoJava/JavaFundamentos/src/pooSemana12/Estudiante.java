package poosemana12;

public class Estudiante {

    private String codigo;
    private String nombre;
    private String carrera;
    private int ciclo;
    private double promedio;
    private boolean becado;

    public Estudiante() {

        codigo = "u25247183";
        nombre = "Juan Carlos";
        carrera = "Ing. de Software";
        ciclo = 3;
        promedio = 19.5;
        becado = false;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public boolean isBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }
}