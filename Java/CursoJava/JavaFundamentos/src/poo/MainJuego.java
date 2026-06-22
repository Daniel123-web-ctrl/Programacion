package poo;

import java.util.Scanner;

public class MainJuego {
    public static void main(String[] args) {
        int opcion=0;
        Scanner lector=new Scanner(System.in);
        Guerrero guerrero1=new Guerrero("GOO1", "Ares", 12, 500, 20, false);
        Mago mago1=new Mago("M001", "Luna", 20, 300, 50, false);
        ComparacionesResultados juego =new ComparacionesResultados(mago1, guerrero1);
        mago1.setPoseeBaston("si");
        guerrero1.setPoseeEspada("si");

         System.out.println("""
                1-Ver reporte de Mago
                2-Ver reporte de Guerreo
                3-Ver resultado final
                4-Salir """);


        do {
            
        
        System.out.println("Ingrese una de las opciones :");
       
        opcion=lector.nextInt();
        switch (opcion) {
            case 1:{
                System.out.println("MAGO");
                System.out.println(mago1.mostrarDatos());
                }
                break;
            case 2: {
               System.out.println("GUERRERO");
               System.out.println(guerrero1.mostrarDatos());

                }
                break;
            
            case 3:System.out.println(juego.mostrarGanador());
                break;
            case 4: {
                System.out.println("Juego finalizado ");
            
               }
               opcion=5;
                break;
            default:{
                System.out.println("Opcion Invalida");
            }
                break;
        }
        } while (opcion<5);
     
    }

}
