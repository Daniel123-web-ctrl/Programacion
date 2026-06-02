import java.util.Scanner;

import javax.swing.JOptionPane;

public class BucleDeterminadoFor {                                                    
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        ejercicio8(lector);
    }public static void ejercicio9(Scanner lector){
 int[]edad=new int[];
 














    }
    public static void ejercicio8(Scanner lector){
        //verificar si un correo electronico  tiene el arroba 
        String correo=JOptionPane.showInputDialog("Ingrese un correo");
        boolean arroba=false;
        for(int i=0;i<correo.length();i++){
            if(correo.charAt(i)=='@'){
                arroba=true;
                
                
            }
              
        }

        if(arroba){
                    JOptionPane.showMessageDialog(null, "Si tiene arroba");
                arroba=true;
                }else{
                    JOptionPane.showMessageDialog(null, "No tiene");
                }


    }
    public static void ejercicio7 (Scanner lector){
        //Calcula el factorial de N usando un for. Por ejemplo, factorial(5) = 5×4×3×2×1 = 120.
        int n=0;
        int factorial=1;
        System.out.println("Ingrese el numero");
        n=lector.nextInt();
        for(int i=n;i>=1;i--){
        factorial *=i;
                }
          System.out.println(factorial);

    }
    public static void ejercicio6 (Scanner lector){
        //Dada la palabra "Python", usa un for para imprimir cada letra en una línea separada.
        String palabra="java";
        for(int i=0;i<=palabra.length();i++){
            System.out.println(palabra.charAt(i));
        

        }
    }
    public static void ejercicio5 (Scanner lector){
/*Usa for anidados para imprimir una pirámide de asteriscos de N filas. Con N=4:
★
★★
★★★
★★★★ */
for(int i=1;i<=4;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
 System.out.println();
}
    }
    public static void ejercicio4 (Scanner lector){
        /*Del 1 al 30: si el número es divisible entre 3 imprime 'Fizz', 
        si lo es entre 5 imprime 'Buzz', si lo es entre ambos 'FizzBuzz',
         y si no, el número.*/
      
          for(int i=1;i<=30;i++){
            if(i%3==0 && i%5==0){
                System.out.printf("%d es FizzBuzz\n",i);
            }else if (i%3==0){
                System.out.printf("%d es Fizz\n",i);

            }else if(i%5==0){
                System.out.printf("%d es Buzz\n",i);
            }else{
                System.out.println(i);
            }
          }

    }
    public static void ejercicio3 (Scanner lector){

        //Recorre los números del 1 al 20 con for. Imprime 'par' si es par e 'impar' si no lo es, junto al número.
    for(int i=1;i<=20;i++){
        if(i%2==0){
            System.out.printf("%d es par\n",i);

        }else{
            System.out.printf("%d es impar\n",i);
        }

    }
    }
    
    public static void ejercicio2 (Scanner lector){
//Pide un número al usuario e imprime su tabla de multiplicar del 1 al 10.
int numero;

System.out.println("Ingrese el numero que desee multiplicar");
numero=lector.nextInt();
for(int i=1;i<=10;i++){
    
    System.out.printf("%d * %d = %d\n",numero,i,i*numero);
}
    }
    public static void ejercicio1 (Scanner lector){
        for(int i=1; i<=10;i++){
            System.out.println(i);
        }
        
    }
}