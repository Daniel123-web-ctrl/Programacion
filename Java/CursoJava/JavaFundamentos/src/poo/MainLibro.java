package poo;

import java.util.Scanner;

public class MainLibro {

public static void main(String[] args) {
    int prestamo;
    int devolucion;
    Libro libro1=new Libro("L001", "Java Basic", "Deitel", 10);
    Libro libro2=new Libro("L002", "POO en Java", "Schildt", 8);
    Libro libro3=new Libro("L003", "Base de Datos", "Coronel", 5);

    Scanner lector=new Scanner(System.in);

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  

    System.out.println("Ingrese la cantidad de libros que desea prestar");
    prestamo=lector.nextInt();
    libro1.prestarLibro(prestamo);
    System.out.printf("Se prestaron  : %d libros y quedan ahora %d libros %n ",prestamo,libro1.getCantidadDisponible());
    System.out.println("Ingrese la cantidad de libros que desea devolver");
    devolucion=lector.nextInt();
    libro1.devolverLibro(devolucion);
    System.out.printf("Se devolvieron  : %d libros y ahora en total hay  %d libros %n ",devolucion,libro1.getCantidadDisponible());
    System.out.printf("%nLibro 1 %s%n" 
                               ,libro1.mostrarInformacion());


   System.out.println(Libro.verTotalDeLibros());
  


    
}


}
