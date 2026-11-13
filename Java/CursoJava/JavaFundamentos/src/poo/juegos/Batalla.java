package poo.juegos;

import java.util.Scanner;

public class Batalla {
    public static void main(String[] args) {
Scanner lector=new Scanner(System.in);
 int opcion=0;
int [] batallas =new int[3];


Mago mago1=new Mago("Merlin", 1, 100, 15);
Guerrero guerrero1 =new Guerrero("thor", 1, 100, 20);


do {
    System.out.println(" ".repeat(11)+"BATALLA  "+" ".repeat(11) +"\n");
    System.out.println("=".repeat(30));
    System.out.println("""
        1. Ver personajes
        2. Primera batalla
        3. Salir 
        """);
    System.out.println("Que deseas hacer?");
     opcion =lector.nextInt();

switch (opcion) {
    case 1:
        System.out.println(guerrero1.mostrarInformacion());
        System.out.println(mago1.mostrarInformacion()); 
        break;
    case 2:
        for (int i = 0; i < batallas.length; i++) {
            
        

        System.out.println(" ".repeat(30));
        System.out.printf("%s BATALLA %d %s%n"," ".repeat(7), i + 1, " ".repeat(7));
        System.out.println();
        System.out.printf("MAGO        :%s       Vida  :%d%n",mago1.getNombre(),mago1.getVida());
        System.out.printf("GUERRERO    :%s         Vida  :%d%n",guerrero1.getNombre(),guerrero1.getVida());
        System.out.println();
        System.out.println("La batalla comienza...");
        System.out.println();

                            if (Math.random() < 0.5) {
                                System.out.println("MAGO ataca al GUERRERO");
                            } else {
                                System.out.println("GUERRERO ataca al MAGO");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Saliendo del juego...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } while (opcion != 3);
        } finally {
            lector.close();
        }
    }
}
