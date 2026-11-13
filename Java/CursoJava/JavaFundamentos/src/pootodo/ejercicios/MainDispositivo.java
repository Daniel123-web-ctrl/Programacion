package pootodo.ejercicios;

import java.util.Scanner;

public class MainDispositivo {
    public static void main(String[] args) {
        int opcion;
        Scanner lector = new Scanner(System.in);

        Laptop laptop1 = new Laptop("LENOVO", "iDEApad", 2500, 5, 16);
        Celular celular1 = new Celular("SAMSUMG", "Galaxy A55", 1400, 8, 256);
        Mouse mouse1 = new Mouse("Logitech", "G203", 120, 15, "USB");

        try {
            do {
                System.out.println("Ingrese la opcion del producto que desea consultar:");
                System.out.println("""
                        1: Laptop
                        2: Celulares
                        3: Mouse
                        4: Salir
                        """);

                opcion = lector.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("LAPTOP");
                        System.out.println(laptop1.consultarInformacion());
                        break;
                    case 2:
                        System.out.println("CELULAR");
                        System.out.println(celular1.consultarInformacion());
                        break;
                    case 3:
                        System.out.println("Mouse");
                        System.out.println(mouse1.consultarInformacion());
                        break;
                    case 4:
                        System.out.println("Saliendo");
                        break;
                    default:
                        System.out.println("OPCION INCORRECTA");
                        break;
                }
            } while (opcion != 4);
        } finally {
            lector.close();
        }
    }
}
