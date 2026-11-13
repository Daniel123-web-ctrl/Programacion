package ejerciciosprincipiante;
import java.util.*;  
public class EjerciciosBasicos {

    /*Calculadora simple: pide dos números y una operación (+, -, *, /) y muestra el resultado. Controla la división entre cero. */

    public static void main(String[] args) {

         int resultado=0;

Scanner lector = new Scanner(System.in);
        System.out.println("INGRESE DOS NUMEROS ");
        System.out.println("ingrese el primero numero :");
        int num1=lector.nextInt();
        System.out.println("Ingrese el segundo numero ");        
        int num2=lector.nextInt();

        System.out.println("Ingrese la operacin que desee relaizar (+, -, *, /)");
        String operacion = lector.next();

        if(operacion.equalsIgnoreCase("+")){

            resultado=num1+num2;


        }else  if (operacion=="-"){
            resultado=num1-num2;
        }else if (operacion=="*" ){
            resultado= num1*num2;
        }

        System.out.println(" el resultado es "+resultado);
        
    }

    
}
