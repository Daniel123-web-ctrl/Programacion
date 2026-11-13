package pootodo.ejercicios.utilidades;

public class UsoSemana3 {
    public static void main(String[] args) {
        Time hora = new Time(59, 59, 23);

        System.out.println("Hora inicial: " + hora);
        hora.nextSecond();
        System.out.println("Después de un segundo: " + hora);
    }
}
