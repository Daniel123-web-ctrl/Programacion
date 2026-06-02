import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProyectoDia1 {
    public static void main(String[] args) {
          Scanner lector=new Scanner(System.in);
          proyecto3(lector);
    }public static void proyecto1(Scanner lector){
                boolean salir =false;
        String respuesta="";
       int resultado =0;
       do {
           int numero1=Integer.parseInt( JOptionPane.showInputDialog(null, "INGRESE EL PRIMERO NUMERO"));
        
        String operacion= JOptionPane.showInputDialog(null, """
                Ingrese operacion/salir:
                suma
                resta
                multiplicacion
                division
                """);
                
        int numero2=Integer.parseInt( JOptionPane.showInputDialog(null, "INGRESE EL SEGUNDO NUMERO"));
        switch (operacion) {
            case "suma":
                resultado=numero1 +numero2;
                JOptionPane.showInputDialog(null, "Resultado :" + resultado);
                break;
        
            case "resta":
                resultado=numero1 - numero2;
                JOptionPane.showInputDialog(null, "Resultado :"+ resultado);
                break;
            case "multiplicacion":
                resultado=numero1 *  numero2;
                JOptionPane.showInputDialog(null, "Resultado : " + resultado);
                
                break;
            case "division":
                resultado=numero1 +numero2;
                JOptionPane.showInputDialog(null, "Resultado : "+ resultado);
                break;
            
            default:{
                JOptionPane.showMessageDialog(null, "Solo ingrese una de las 4 operaciones : ");
            }
                break;
                
        }
        respuesta =JOptionPane.showInputDialog(null,"Desea continuar (SI/NO) ? ");
        if (respuesta.equalsIgnoreCase("si")) {
            
            JOptionPane.showMessageDialog(null, "Continue");
        }else{
            JOptionPane.showMessageDialog(null, "Programa finalizado");
            salir=true;
        }
       } while (!salir);
         
    }public static void proyecto2(Scanner lector){
        String saludo ="hola";
        String saludoInvertido=new StringBuilder(saludo).reverse().toString();
        System.out.println(saludo);
         System.out.println(saludoInvertido);
    }public static void proyecto3(Scanner lector){
        int numero,digito;
        String binario ="",binarioFinal;
        System.out.println("Ingrese un numero decimal");
        numero =lector.nextInt();
        do {
            digito=numero % 2;
            binario += digito;
            numero=numero /2;
        } while (numero != 0);
        System.out.println(binario);
  //     binarioFinal=new StringBuilder(binario).reverse().toString();
//System.out.println(binarioFinal);
    }
}