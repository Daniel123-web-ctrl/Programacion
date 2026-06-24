package poo;

import java.time.LocalDate;

public class MainEmpleado {
    public static void main(String[] args) {
        //double AFP;
       
        Empleado empleado1=new Empleado("123", "Juan", "Java Dev",48 , 75,true);
        
        empleado1.mostrarDatos();
        System.out.println(empleado1.mostrarDatos());
       
        LocalDate fecha = LocalDate.now();
System.out.println(fecha);












    }

}
