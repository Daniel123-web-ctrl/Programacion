package poo;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        int resultado=0;
        int numero1;
        int numero2;


        Calculadora casio=new Calculadora();

        Scanner lector =new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero1=lector.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2=lector.nextInt();

        casio.setNum1(numero1);
        casio.setNum2(numero2);

        int opcion;
        System.out.println("""
                1=suma
                2=resta
                3=multiplicacion
                4=division
                """);
        System.out.println("Ingrese una opcion(1-4)");
        opcion=lector.nextInt();
        switch (opcion) {
            case 1:
                 resultado =casio.sumar();

                break;
            case 2:
                 resultado =casio.restar();
                break;
            case 3:
                resultado =casio.multiplicar();
                break;
            case 4:
                resultado =casio.dividir();
                break;
            
            default:{
                System.out.println("Operacion incorrecta");
            }
                break;
        }

System.out.println(resultado);
       

       

}
}