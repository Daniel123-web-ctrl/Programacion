package poo.transporte;

import java.util.Scanner;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double precioDia;
    private int kilometros;
    private boolean encendido;

    public Vehiculo(boolean encendido) {
        this.encendido = encendido;
    }

    public Vehiculo(String marca, String modelo, int anio, double precioDia, int kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioDia = precioDia;
        this.kilometros = kilometros;
    }

    public Autos ingresarDatos() {
        try (Scanner lector = new Scanner(System.in)) {
            System.out.println("Ingrese la marca:");
            String marca = lector.next();

            System.out.println("Ingrese el modelo:");
            String modelo = lector.next();

            System.out.println("Ingrese el año:");
            int anio = lector.nextInt();

            System.out.println("Ingrese el costo de alquiler por día:");
            double precioDia = lector.nextDouble();

            System.out.println("Ingrese el kilometraje:");
            int kilometraje = lector.nextInt();

            System.out.println("Ingrese la cantidad de puertas:");
            int cantidadPuertas = lector.nextInt();

            return new Autos(marca, modelo, anio, precioDia, kilometraje, cantidadPuertas);
        }
    }

    public String mostrarInformacion() {
        return String.format(
                "Marca :%s%nModelo  :%s%nAnio :%d%nPrecio por Dia :%.2f%nKilometraje :%d%n",
                marca, modelo, anio, precioDia, kilometros
        );
    }

    public double calcularAlquiler(int dias) {
        return precioDia * dias;
    }

    public boolean necesitaMantenimiento() {
        return kilometros > 10000;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}
