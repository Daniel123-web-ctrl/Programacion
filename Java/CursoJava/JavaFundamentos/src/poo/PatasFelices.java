package poo;
public class PatasFelices {
 
     public static void main(String[] args) {
        
        // =====================================================
        // A) CUATRO ARREGLOS PARALELOS
        // Mismo índice = mismo producto
        // =====================================================

        int[] codigos = {
            301, 302, 303, 304, 305,
            306, 307, 308, 309, 310
        };

        String[] nombres = {
            "Alimento Perro Adulto 15kg",
            "Shampoo Antipulgas",
            "Correa Retráctil",
            "Vitaminas Multiuso",
            "Arena para Gatos 10kg",
            "Juguete Pelota",
            "Comedero para Perro",
            "Antiparasitario",
            "Cama para Mascota",
            "Alimento para Gatos 10kg"
        };

        double[] precios = {
            145.90, 32.50, 28.90, 55.00, 42.90,
            15.50, 35.90, 48.00, 89.90, 120.00
        };

        int[] stocks = {
            40, 65, 30, 22, 50,
            80, 35, 27, 18, 45
        };


        // =====================================================
        // B) ORDENAR LOS PRODUCTOS POR CÓDIGO
        // =====================================================

        ordenSeleccionPorCodigo(codigos, nombres, precios, stocks);


        // Mostrar productos ordenados
        System.out.println("===== PRODUCTOS ORDENADOS POR CÓDIGO =====");

        for (int i = 0; i < codigos.length; i++) {

            System.out.println(
                "Código: " + codigos[i]
                + " | Nombre: " + nombres[i]
                + " | Precio: S/ " + precios[i]
                + " | Stock: " + stocks[i]
            );
        }


        // =====================================================
        // C) BUSCAR PRODUCTO POR CÓDIGO
        // =====================================================

        int codigoBuscado = 307;

        int posicion = buscarProductoPorCodigo(
            codigos,
            nombres,
            precios,
            stocks,
            codigoBuscado
        );


        // Mostrar resultado de la búsqueda
        System.out.println("\n===== BÚSQUEDA DEL PRODUCTO =====");

        if (posicion != -1) {

            System.out.println("Producto encontrado:");
            System.out.println("Código: " + codigos[posicion]);
            System.out.println("Nombre: " + nombres[posicion]);
            System.out.println("Precio: S/ " + precios[posicion]);
            System.out.println("Stock: " + stocks[posicion]);

        } else {

            System.out.println("Producto con código "
                    + codigoBuscado + " no encontrado.");
        }
    }


    // =========================================================
    // B) MÉTODO SELECTION SORT
    // Ordena de menor a mayor código
    // Mantiene sincronizados los 4 arreglos
    // =========================================================

    public static void ordenSeleccionPorCodigo( int[] codigos,String[] nombres,double[] precios,int[] stocks) {

        // Recorremos el arreglo buscando el menor código
        for (int i = 0; i < codigos.length - 1; i++) {

            // Suponemos que el menor está en i
            int posMenor = i;

            // Buscamos el índice del menor
            for (int j = i + 1; j < codigos.length; j++) {

                if (codigos[j] < codigos[posMenor]) {
                    posMenor = j;
                }
            }

            // =================================================
            // INTERCAMBIO DE CODIGOS
            // =================================================

            int auxCodigo = codigos[i];
            codigos[i] = codigos[posMenor];
            codigos[posMenor] = auxCodigo;


            // =================================================
            // INTERCAMBIO DE NOMBRES
            // =================================================

            String auxNombre = nombres[i];
            nombres[i] = nombres[posMenor];
            nombres[posMenor] = auxNombre;


            // =================================================
            // INTERCAMBIO DE PRECIOS
            // =================================================

            double auxPrecio = precios[i];
            precios[i] = precios[posMenor];
            precios[posMenor] = auxPrecio;


            // =================================================
            // INTERCAMBIO DE STOCKS
            // =================================================

            int auxStock = stocks[i];
            stocks[i] = stocks[posMenor];
            stocks[posMenor] = auxStock;
        }
    }


    // =========================================================
    // C) BÚSQUEDA BINARIA
    // Busca un producto por su código
    // =========================================================

    public static int buscarProductoPorCodigo(
            int[] codigos,
            String[] nombres,
            double[] precios,
            int[] stocks,
            int codigo) {

        int inicio = 0;
        int fin = codigos.length - 1;

        // Mientras exista un rango donde buscar
        while (inicio <= fin) {

            // Calculamos la posición central
            int medio = (inicio + fin) / 2;

            // Si encontramos el código
            if (codigos[medio] == codigo) {
                return medio;
            }

            // Si el código buscado es mayor,
            // buscamos en la mitad derecha
            if (codigo > codigos[medio]) {
                inicio = medio + 1;
            }

            // Si el código buscado es menor,
            // buscamos en la mitad izquierda
            else {
                fin = medio - 1;
            }
        }

        // Si no encontramos el producto
        return -1;
    }


     }


