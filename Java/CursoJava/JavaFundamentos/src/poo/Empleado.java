package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {



public  Empleado(String nom ,double sue,int agno ,int mes,int dia){

nombre=nom;
sueldo=sue;
GregorianCalendar  calendario = new GregorianCalendar(agno,mes-1,dia);
altaContrato=calendario.getTime();  // aqui le dices dame la fecha de este objeto(calendario) y me la almacenas en altaContrato 

}
private String nombre;
private double sueldo;
private Date altaContrato;

public  Empleado(String nom){
    this(nom , 30000,2000,01,01);   // con este this es como si estuvieramos llamando a la clase Empleado 

}

public  Empleado(String nom  ,double sue){

}


public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public double getSueldo() {
    return sueldo;
}
public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
}

public Date getAltaContrato() {
    return altaContrato;
}

public void setAltaContrato(Date altaContrato) {
    this.altaContrato = altaContrato;
}

public void subirSueldo(double porcentaje){
    double aumento =sueldo*porcentaje/100;
    sueldo +=aumento;

}

}
