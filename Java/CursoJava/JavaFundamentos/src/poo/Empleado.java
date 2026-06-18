package poo;

public class Empleado {

    private String codigo ;
    private String nombre ;
    private String cargo ;
    private double horasTrabajadas ;
    private double pagoPorHora ;
    private String activo ;
    
    public Empleado(String codigo,String nombre,String cargo,double horasTrabajadas,double pagoPorHora,String activo){

        this.codigo=codigo;
        this.nombre=nombre;
        this.cargo=cargo;
        this.horasTrabajadas=horasTrabajadas;
        this.pagoPorHora=pagoPorHora;
        this.activo=activo;
        

    }
    

    public double calcularSueldoBruto(){
        return horasTrabajadas*pagoPorHora;
        
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

    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

   
    
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    
    
    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }



}
