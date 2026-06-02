import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
      
     Scanner lector =new Scanner(System.in);
     ejercicio1(lector);
    }public static void ejercicio1(Scanner lector){
        int[] edad=new int[5];
        String[] nombre=new String[5];
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Ingrese nombre de la persona ");
            nombre[i]=lector.next();
            System.out.println("Ingrese edad de la persona");
            edad[i]=lector.nextInt();
            
        }
        for (int i = 0; i < nombre.length-1; i++) {
            for (int j = 0; j < nombre.length-1; j++) {
                if (edad[j]>edad[j+1]) {
                    int momento=edad[j];
                    edad[j]=edad[j+1];
                    edad[j+1]=momento;
                    

                    String temporal=nombre[j];
                     nombre[j]=nombre[j+1];
                    nombre[j+1]=temporal;

                    
                }
            }
            
            
            
        }
        for (int i = 0; i < edad.length; i++){
        System.out.printf("Nombre : %-12s Edad: %-2d \n",nombre[i],edad[i]);
        }
    }
}
