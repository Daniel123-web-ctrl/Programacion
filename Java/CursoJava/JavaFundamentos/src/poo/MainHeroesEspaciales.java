package poo;

import java.util.Scanner;

public class MainHeroesEspaciales {
/*Ejercicio Propuesto: Sistema de Héroes Espaciales
Se desea desarrollar un programa orientado a objetos para administrar la información de dos tipos de héroes espaciales: Piloto y Robot.
Clase Piloto
•	Atributos privados: código, nombre, nivel, experiencia, velocidad, poseeNave (boolean).
•	Constructor con todos los atributos.
•	calcularPuntajeBase(): nivel * velocidad.
•	calcularBonificacionNave(): 25% del puntaje base si posee nave; de lo contrario 0.
•	calcularPuntajeTotal(): Puntaje Base + Bonificación.
•	determinarRango(): >280 Comandante; >150 Capitán; caso contrario Cadete.
•	puedeParticiparMision(): true si nivel >= 12.
•	mostrarDatos(): usando String.format().
Clase Robot
•	Atributos privados: código, modelo, nivel, energía, potencia, poseeEscudo (boolean).
•	Constructor con todos los atributos.
•	calcularAtaqueBase(): nivel * potencia.
•	calcularBonificacionEscudo(): 20% del ataque base si posee escudo; de lo contrario 0.
•	calcularAtaqueTotal(): Ataque Base + Bonificación.
•	determinarClasificacion(): >250 Elite; >130 Avanzado; caso contrario Básico.
•	puedeDefenderBase(): true si energía >= 300.
•	mostrarDatos(): usando String.format().
Clase ComparacionResultados
Recibe un objeto Piloto y un objeto Robot. Implementa mostrarGanador() comparando calcularPuntajeTotal() y calcularAtaqueTotal(). Muestra el ganador o Empate y ambos puntajes.
Clase MainJuego
1.	1. Ver reporte del Piloto
2.	2. Ver reporte del Robot
3.	3. Ver ganador
4.	4. Salir
 */

public static void main(String[] args) {
    int opcion =0;
Scanner lector=new Scanner(System.in);

    Piloto piloto1=new Piloto("P001", "Carlos Vega", 15, 3200, 22.5, true);

    Robot robot1=new Robot("R001", "RX-900", 14, 350, 22, true);

    ComparacionResultados juego1= new ComparacionResultados();

    juego1.mostrar(piloto1, robot1);

    do {
        System.out.println("Ingrese una de las opciones");
        System.out.println("""
                        1. Ver reporte del Piloto
                        2. Ver reporte del Robot
                        3. Ver ganador
                        4. Salir

                """);
                opcion=lector.nextInt();
                switch (opcion) {
                    case 1:
                       System.out.println(piloto1.mostrarDatos()); 
                        break;
                    case 2:
                        System.out.println(robot1.mostrarDatos());
                        
                        break;
                    case 3:
                        System.out.println(juego1.mostrarGanador(piloto1, robot1));
                        
                        break;
                    case 4:
                        System.out.println("Saliendo del juego");
                        opcion=5;

                        break;   
                
                    default:
                        break;
                }
        
    } while (opcion  !=5);



}
}
