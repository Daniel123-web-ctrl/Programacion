package ejerciciospoo;



import java.util.Scanner;

public class PrestamoBibliotecaUniversitaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] codigosISBN = new int[10];
        String[] titulos = new String[10];
        String[] autores = new String[10];
        int[] copiasDisponibles = new int[10];

        codigosISBN[0] = 501;
        codigosISBN[1] = 502;
        codigosISBN[2] = 503;
        codigosISBN[3] = 504;

        titulos[0] = "Clean Code";
        titulos[1] = "Estructuras de Datos";
        titulos[2] = "Cien Años de Soledad";
        titulos[3] = "Sapiens";

        autores[0] = "R. Martin";
        autores[1] = "O. Cairo";
        autores[2] = "G. García Márquez";
        autores[3] = "Y. N. Harari";

        copiasDisponibles[0] = 3;
        copiasDisponibles[1] = 0;
            copiasDisponibles[2] = 5
        copiasDisponibles[3] = 2;

        System.out.println("########################################");
        System.out.println("   INGRESO DE 6 LIBROS ADICIONALES");
        System.out.println("########################################");

        for (int i = 4; i < 10; i++) {

            System.out.println("\nLibro " + (i + 1));

            codigosISBN[i] = leerEntero(sc, "Ingrese código ISBN: ");

            titulos[i] = leerTexto(sc, "Ingrese título: ");

            autores[i] = leerTexto(sc, "Ingrese autor: ");

            copiasDisponibles[i] = leerEnteroNoNegativo(
                    sc,
                    "Ingrese copias disponibles: "
            );
        }

        System.out.println("\n########################################");
        System.out.println("       LIBROS INGRESADOS");
        System.out.println("########################################");

        mostrarLibros(
                codigosISBN,
                titulos,
                autores,
                copiasDisponibles
        );

        ordInsercionPorCodigo(
                codigosISBN,
                titulos,
                autores,
                copiasDisponibles
        );

        System.out.println("\n########################################");
        System.out.println("   LIBROS ORDENADOS POR CÓDIGO ISBN");
        System.out.println("########################################");

        mostrarLibros(
                codigosISBN,
                titulos,
                autores,
                copiasDisponibles
        );

        System.out.println("\n########################################");
        System.out.println("          BÚSQUEDA BINARIA");
        System.out.println("########################################");

        int codigo = leerEntero(sc, "Ingrese el código ISBN que desea buscar: ");

        int posicion = buscarLibroPorCodigo(
                codigosISBN,
                titulos,
                autores,
                copiasDisponibles,
                codigo
        );

        if (posicion != -1) {

            System.out.println("\n########################################");
            System.out.println("          LIBRO ENCONTRADO");
            System.out.println("########################################");

            System.out.println("ISBN: "
                    + codigosISBN[posicion]);

            System.out.println("Título: "
                    + titulos[posicion]);

            System.out.println("Autor: "
                    + autores[posicion]);

            System.out.println("Copias disponibles: "
                    + copiasDisponibles[posicion]);

        } else {

            System.out.println("\nNo se encontró un libro con el código "
                    + codigo);
        }

        sc.close();
    }

    public static int leerEntero(Scanner sc, String mensaje) {

        while (true) {

            System.out.print(mensaje);

            String entrada = sc.nextLine();

            try {

                return Integer.parseInt(entrada);

            } catch (NumberFormatException e) {

                System.out.println(
                        "Error: ingrese un número entero válido. Intente nuevamente."
                );
            }
        }
    }

    public static int leerEnteroNoNegativo(Scanner sc, String mensaje) {

        while (true) {

            int numero = leerEntero(sc, mensaje);

            if (numero >= 0) {

                return numero;

            } else {

                System.out.println(
                        "Error: las copias no pueden ser negativas. Ingrese nuevamente."
                );
            }
        }
    }

    public static String leerTexto(Scanner sc, String mensaje) {

        while (true) {

            System.out.print(mensaje);

            String texto = sc.nextLine().trim();

            if (texto.isEmpty()) {

                System.out.println(
                        "Error: no puede dejar este campo vacío. Ingrese nuevamente."
                );

            } else if (texto.matches(".*\\d.*")) {

                System.out.println(
                        "Error: ingrese un texto correcto, no números. Intente nuevamente."
                );

            } else {

                return texto;
            }
        }
    }

    public static void mostrarLibros(
            int[] codigosISBN,
            String[] titulos,
            String[] autores,
            int[] copiasDisponibles) {

        for (int i = 0; i < codigosISBN.length; i++) {

            System.out.println("\nÍndice: " + i);
            System.out.println("ISBN: " + codigosISBN[i]);
            System.out.println("Título: " + titulos[i]);
            System.out.println("Autor: " + autores[i]);
            System.out.println("Copias disponibles: "
                    + copiasDisponibles[i]);
        }
    }

    public static void ordInsercionPorCodigo(
            int[] codigosISBN,
            String[] titulos,
            String[] autores,
            int[] copiasDisponibles) {
              
          // B) ORDENAMIENTO POR INSERCIÓN

        for (int i = 1; i < codigosISBN.length; i++) {

            int codigo = codigosISBN[i];
            String titulo = titulos[i];
            String autor = autores[i];
            int copias = copiasDisponibles[i];

            int j = i - 1;

            while (j >= 0 && codigosISBN[j] > codigo) {

                codigosISBN[j + 1] = codigosISBN[j];

                titulos[j + 1] = titulos[j];

                autores[j + 1] = autores[j];

                copiasDisponibles[j + 1] =
                        copiasDisponibles[j];

                j--;
            }

            codigosISBN[j + 1] = codigo;

            titulos[j + 1] = titulo;

            autores[j + 1] = autor;

            copiasDisponibles[j + 1] = copias;
        }
    }

    public static int buscarLibroPorCodigo(
            int[] codigosISBN,
            String[] titulos,
            String[] autores,
            int[] copiasDisponibles,
            int codigo) {

    
    //    C) BÚSQUEDA BINARIA

        int inicio = 0;

        int fin = codigosISBN.length - 1;

        while (inicio <= fin) {

            int medio = (inicio + fin) / 2;

            if (codigosISBN[medio] == codigo) {

                return medio;
            }

            if (codigo > codigosISBN[medio]) {

                inicio = medio + 1;

            } else {

                fin = medio - 1;
            }
        }

        return -1;
    }
}