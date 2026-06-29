package Java.EjerciciosJava;

import java.util.Scanner;

public class TareaAcademica1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
      short num1;
      short num2;
      short opcion = 0;
      int resultado = 0;
      
      System.out.println("CALCULADORA");
      System.out.println("""
         1:Sumar
         2:Restar
         3:Multiplicar
         4:Dividir
            
            """);
      System.out.println("Ingrese una opcion(1-4)");
      opcion = lector.nextShort();

      switch (opcion) {
         case 1:
            System.out.println("Ingrese el primer numero");
             num1 = lector.nextShort();
            System.out.println("Ingrese el segundo numero");
          num2 = lector.nextShort();
            resultado = num1 + num2;
            break;
         case 2:
            System.out.println("Ingrese el primer numero");
             num1 = lector.nextShort();
            System.out.println("Ingrese el segundo numero");
             num2 = lector.nextShort();
            resultado = num1 - num2;
            break;
         case 3:
            System.out.println("Ingrese el primer numero");
             num1 = lector.nextShort();
            System.out.println("Ingrese el segundo numero");
          num2 = lector.nextShort();
            resultado = num1 * num2;
            break;
         case 4:
            System.out.println("Ingrese el primer numero");
            num1 = lector.nextShort();
            System.out.println("Ingrese el segundo numero");
             num2 = lector.nextShort();
             if (num2 == 0) {
               System.out.println("No se puede dividir entre 0");
            } else {
               resultado = num1 / num2;
            }
            break;
         default:
            System.out.println("OPCION INVALIDA");
      }

     System.out.printf("el resultado es %d%n",resultado);
     
   }
}
    