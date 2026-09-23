package poosemana12;

public class Algoritmo {

    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();

        for (int n = 2; n <= 100 ; n++) {

            boolean esPrimo = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.print(n + " ");
            }
        }

        long fin = System.currentTimeMillis();

        System.out.println("\n\nAquí está el tiempo de ejecución: "
                + (fin - inicio) + " ms");
    }
}