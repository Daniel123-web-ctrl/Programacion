package poo;

import java.util.GregorianCalendar;

public class Empleado {

    
    
    public Empleado(String nom,double sueldo,int agno,int mes,int dia){

        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        altaContrata =calendario.getTime();
        
        

    }
    

    public double calcularSueldoBruto(){
        return horasTrabajadas*pagoPorHora;
        
    }
     
    public double calcularBono(){
        if(horasTrabajadas>=45){
            return 200;
        }else if(horasTrabajadas>35 && horasTrabajadas<45){
            return 100;

        }else{
            return 0;
        }
    }

    public double calcularDescuentoAFP(){
        return -calcularSueldoBruto()*0.13;

    }

    public double calcularSueldoNeto(){
        return calcularSueldoBruto()+calcularBono() -calcularDescuentoAFP();
    }

    public String obtenerCategoria(){
        if (calcularSueldoNeto()>=3000) {
            return "Senior";
            
        }else if (calcularSueldoNeto()>=1800 ){
            return "Semi Senior";

        }else{
            return "Junior";
        }
    }
      
    public boolean puedeAscender(){
        if (obtenerCategoria().equalsIgnoreCase("Senior") ) {
            
            return true;
            
        }else{
            return false;
        }

    }

    public String mostrarDatos(){
        StringBuilder reporte=new StringBuilder();
        reporte.append(String.format("%-5s  %-5s  %-5s    %-5s  %-5s    %-5s    %-5s    %-5s  %-5s  %n"
        ,"CODIGO","NOMBRE","CARGO","HORAS","BRUTO","BONO","AFP","NETO","CATEGORIA"));
        reporte.append(String.format("%-5s   %-5s  %-5s  %-5.0f  %-5.0f  %-5.2f  %-5.2f   %-5.2f  %-5s %n"
        ,getCodigo(),getNombre(),getCargo(),getHorasTrabajadas(),calcularSueldoBruto(),calcularBono(),calcularDescuentoAFP(),calcularSueldoNeto(),obtenerCategoria(),puedeAscender()));
        
        return reporte.toString();
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

    

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }



}
