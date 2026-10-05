package poo;

import java.util.*;

public class Prueba {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Tienda tienda = new Tienda();
        int operacion;

        do {
            System.out.println("Que operacion desea realizar");
            System.out.println("""
                    1: Agregar animales al inventario.
                    2: Mostrar todos los animales con su sonido y su precio final.
                    3: Vender un animal, que lo saca del inventario.
                    4: Calcular el valor total del inventario.
                    5: Salir
                    """);
            operacion = lector.nextInt();

            switch (operacion) {
                case 1:
                    System.out.println("Cuantos animales desea agregar?");
                    int cantidadAnimales = lector.nextInt();
                    lector.nextLine(); 

                    for (int i = 0; i < cantidadAnimales; i++) {
                        System.out.println(" Animal " + (i + 1) + " ");
                        System.out.println("""
                                Que tipo de animal es?
                                1: Perro
                                2: Gato
                                3: Ave
                                """);
                        int tipo = lector.nextInt();
                        lector.nextLine();

                        System.out.print("Nombre: ");
                        String nombre = lector.nextLine();
                        System.out.print("Edad: ");
                        int edad = lector.nextInt();
                        System.out.print("Precio base: ");
                        float precioBase = lector.nextFloat();
                        lector.nextLine();

                        Animales nuevoAnimal;
                        switch (tipo) {
                            case 1:
                                System.out.print("Raza: ");
                                String razaPerro = lector.nextLine();
                                nuevoAnimal = new Perro(nombre, edad, precioBase, razaPerro);
                                break;
                            case 2:
                                System.out.print("Raza: ");
                                String razaGato = lector.nextLine();
                                nuevoAnimal = new Gato(nombre, edad, precioBase, razaGato);
                                break;
                            case 3:
                                System.out.print("Especie: ");
                                String especie = lector.nextLine();
                                nuevoAnimal = new Ave(nombre, edad, precioBase, especie);
                                break;
                            default:
                                System.out.println("Tipo invalido, se omite este animal.");
                                continue;
                        }
                        tienda.agregarAnimal(nuevoAnimal);
                    }
                    break;

                case 2:
                    tienda.mostrarAnimales();
                    break;

                case 3:
                    System.out.print("Nombre del animal a vender: ");
                    lector.nextLine();
                    String nombreVender = lector.nextLine();
                    try {
                        tienda.venderAnimal(nombreVender);
                    } catch (NoSuchElementException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Valor total del inventario: " + tienda.valorTotalInventario());
                    break;

                case 5:
                    System.out.println("Sesion finalizada");
                    break;

                default:
                    System.out.println("INGRESE SOLO LAS OPCIONES (1-5)");
                    break;
            }

        } while (operacion != 5);
    }
}