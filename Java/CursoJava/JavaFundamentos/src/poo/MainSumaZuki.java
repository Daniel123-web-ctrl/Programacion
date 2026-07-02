package poo;

import java.util.Scanner;

public class MainSumaZuki {

public static void main(String[] args) {
    double numero1 ,numero2;
   String  opcion;

Scanner  lector =new Scanner(System. in);

System.out.println("Ingrese el primer numero");
numero1=lector.nextDouble();
System.out.println("Ingrese el segundo numero");
numero2=lector.nextDouble();
lector.nextLine();
sumaZuki calculo1=new sumaZuki(numero1,numero2);

do {
    System.out.println("Ingrese una de las opciones :");
    System.out.println("""
            1-Suma
            2-Resta
            3-Multiplicacion
            4-Division
            5-Salir
            """);
     
    opcion=lector.nextLine();
    switch (opcion.toLowerCase()) {
        case "suma":
            System.out.println("La suma es :  " + calculo1.sumarNumeros() );
            break;
        case "resta":
            System.out.println("La resta es :  " + calculo1.restarNumeros() );
            break;
        case "multiplicacion":
            System.out.println("El producto  es :  " + calculo1.multiplicarNumeros() );
            break;
        case "division":
             System.out.println("El cociente  es :  " + calculo1.dividirNumeros() );
            
            break;
        
        default:
            System.out.println("Solo ingrese una de las 4 opciones");
            break;
    }
   
} while (! opcion.equalsIgnoreCase("salir"));
System.out.println("Programa Finalizado");
}
}

