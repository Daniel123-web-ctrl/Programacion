package poo;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner lector =new Scanner(System.in);
        System.out.println(lector);
        int num;
        Duplicador obj =new Duplicador();
        System.out.println("Ingrese un numero entero:");
        num=lector.nextInt();

        System.out.println("Valor de num= "+ num);

        obj.duplicar(num);
        

    } 
    
}
