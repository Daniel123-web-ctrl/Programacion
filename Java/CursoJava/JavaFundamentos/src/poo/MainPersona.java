package poo;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona1=new Persona();
        int edad ;
        String DNI;
       
        Boolean valido=false;
        Pattern patronDNI=Pattern.compile("^[0-9]{8}$");
        Scanner lector =new Scanner(System.in);


       System.out.println(persona1.getNombre());
        
        do {
            System.out.println("Ingrese la edad de la  persona");
        edad=lector.nextInt();
            
        } while (edad<18);
        persona1.setEdad(edad);
       System.out.printf("La edad de la persona es %d %n",persona1.getEdad());

        do {
            System.out.println("Ingrese el DNI de la persona");
            DNI=lector.next();
            Matcher evaluarDNI=patronDNI.matcher(DNI);
            if (evaluarDNI.matches()) {
          
                persona1.setDNI(Integer.parseInt(DNI));
                valido=true;
                 
                
            }else{
                System.out.println("INGRESE su DNI correctamente");
            }
            
        } while (!valido);
      
        
        
        
    }

}
