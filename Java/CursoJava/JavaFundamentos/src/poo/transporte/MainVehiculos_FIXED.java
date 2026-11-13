package poo.transporte;

import java.util.Scanner;

public class MainVehiculos_FIXED {
    public static void main(String[] args) {
        int opcion;
        Scanner lector = new Scanner(System.in);

        Autos auto1 = new Autos("Toyota", "Corolla", 2024, 120, 15000, 4);
        Motocicleta motocicleta1 = new Motocicleta("Honda", "CB190R", 2023, 80, 12000, 2);
        Camiones camion1 = new Camiones("Volvo", "FH", 2022, 250, 30000, 12000, 3);

        try {
            do {
                System.out.println("=".repeat(10) + " SISTEMA DE TRANSPORTE " + "=".repeat(10));
                System.out.println("""
                        1. Registrar Auto
                        2. Registrar Motocicleta
                        3. Registrar Camión
                        4. Mostrar información
                        5. Calcular alquiler
                        6. Verificar mantenimiento
                        7. Encender vehículo
                        8. Apagar vehículo
                        9. Salir
                        """);
                System.out.print("Seleccione una opcion: ");
                opcion = lector.nextInt();

                switch (opcion) {
                    case 1 -> System.out.println(auto1.getMarca() + " registrado correctamente.");
                    case 2 -> System.out.println(motocicleta1.getMarca() + " registrada correctamente.");
                    case 3 -> System.out.println(camion1.getMarca() + " registrado correctamente.");
                    case 4 -> {
                        System.out.println("AUTO:");
                        System.out.println(auto1.getMarca() + " " + auto1.getModelo());
                        System.out.println("MOTOCICLETA:");
                        System.out.println(motocicleta1.getMarca() + " " + motocicleta1.getModelo());
                        System.out.println("CAMION:");
                        System.out.println(camion1.getMarca() + " " + camion1.getModelo());
                    }
                    case 5 -> System.out.println("Alquiler estimado: " + (auto1.getPrecioDia() * 3));
                    case 6 -> System.out.println("Mantenimiento: " + (auto1.getKilometros() > 10000));
                    case 7 -> {
                        auto1.setEncendido(true);
                        System.out.println("Auto encendido.");
                    }
                    case 8 -> {
                        auto1.setEncendido(false);
                        System.out.println("Auto apagado.");
                    }
                    case 9 -> System.out.println("Saliendo del sistema...");
                    default -> System.out.println("Opción inválida.");
                }
            } while (opcion != 9);
        } finally {
            lector.close();
        }
    }
}
