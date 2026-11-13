package principal;

import modelo.Estudiante;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String nombre ,DNI;
        int edad;
        boolean valido= false;
         
        while (!valido ) {
            
        }

        Scanner lector =new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante");
        nombre=lector.nextLine();
        System.out.println("Ingrese el DNI del estudiante");
        DNI =lector.next();    
        System.out.println("Ingrese la edad del estudiante ");
        edad=lector.nextInt();
Estudiante estudiante1 =new Estudiante(nombre, DNI, edad);

System.out.println("\n---INFORMACION DEL ESTUDIANTE---");
System.out.println(estudiante1.mostrarInformacion());

lector.close();

























































































































/*try {           // intenta 
    estudiante1.setEdad(-5);
} catch (IllegalArgumentException e) {  //Capturar una excepción de argumento ilegal, identificada como e
    System.out.println("Error :" + e.getMessage());
}
System.out.println("Edad actual "+estudiante1.getEdad());

/*try {
    estudiante1.setEdad(35);
     System.out.println("Edad actualizada correctamente");
} catch (IllegalArgumentException e) {
  System.out.println("Error :" + e.getMessage());
}
 System.out.println("Edad actual " + estudiante1.getEdad());

try {
    estudiante1.setNombre("");
    
} catch (IllegalArgumentException e) {
    System.out.println("Error : "+ e.getMessage());
}
System.out.println(estudiante1.getNombre());

try {
    estudiante1.setDNI("");
    
} catch (IllegalArgumentException e) {
    System.out.println("Error : "+e.getMessage());
}
System.out.println(estudiante1.getDNI());
*/
}
}