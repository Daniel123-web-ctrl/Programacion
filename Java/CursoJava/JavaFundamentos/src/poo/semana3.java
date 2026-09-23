package poo;

public class Principal {

    public static void main(String[] args) {

        Time hora = new Time(59, 59, 23);

        System.out.println("Hora inicial: " + hora);

        hora.nextSecond();

        System.out.println("Después de un segundo: " + hora);

        System.out.println("Hora: " + hora.getHour());
        System.out.println("Minuto: " + hora.getMinute());
        System.out.println("Segundo: " + hora.getSecond());

        hora.setHour(10);
        hora.setMinute(30);
        hora.setSecond(25);

        System.out.println("Nueva hora: " + hora);
    }
}