package poo;

import java.util.Scanner;

public class MainCompetenciaVehiculos {
public static void main(String[] args) {
    int opcion=0;
Scanner lector = new Scanner(System.in);
    Automovil automovil1=new Automovil("A003", "Audi","A4", 250.0, 201.0, true);
    Motocicleta motocicleta1=new Motocicleta("M001", "YAMAHA", 300, 220, 180 ,false);
    ComparacionVehiculos competencia1=new ComparacionVehiculos();
 do {
    System.out.println("Ingrese una de las opciones");
    System.out.println("""
        	1. Ver reporte del Automóvil
        	2. Ver reporte de la Motocicleta
        	3. Mostrar ganador
        	4. Modificar datos del Automóvil
        	5. Modificar datos de la Motocicleta
        	6. Salir
            """);
    opcion=lector.nextInt();
switch (opcion) {
    case 1:
        System.out.println(automovil1.mostrarDatos());
        break;
    
    case 2:
        System.out.println(motocicleta1.mostrarDatos());
        break;
    case 3:
        System.out.println(competencia1.mostrarGanador(automovil1, motocicleta1));
        break;
    case 4:System.out.println("Que dato del automovil desea modificar?");
        
        break;
    case 5:System.out.println("Que dato de la motocicleta desea modificar?");
        
        break;
    case 6:
        System.out.println("Competecia finalisada");
        opcion =7;

        break;

    default:System.out.println("ERROR !!Esta opcion no es valida");
        break;
}
 } while (opcion < 7);



    
}
}
//System.out.println(competencia1.mostrarGanador( automovil1, motocicleta1));