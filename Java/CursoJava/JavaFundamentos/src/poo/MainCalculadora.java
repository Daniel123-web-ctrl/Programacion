package poo;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner  lector= new Scanner(System.in);
        int numero1;
        int numero2;
        int opcion;
        int resultado=0;

        System.out.println("Ingrese el primero numero");
        numero1=lector.nextInt();

        System.out.println("Ingrese el segundo numero");
        numero2=lector.nextInt();
        Calculadora casio =new Calculadora();
        

        casio.setNum1(numero1);
         casio.setNum2(numero2);
         System.out.println("""
            1-suma
            2-resta
            3-multiplicacion
            4-division
                 
                 """);
            System.out.println("Ingrese una de las operaciones");
            opcion=lector.nextInt();

            switch (opcion) {
                case 1:
                    resultado=casio.sumar();
                    break;
                case 2:
                    resultado=casio.restar();
                    break;
            
                case 3:
                    resultado=casio.multiplicar();
                    break;
                case 4:{
                    
                }
                    
                    break;
            
                default:System.out.println("Opcion invalida");
                    break;
            }

            System.out.println(resultado);
    

        }
}