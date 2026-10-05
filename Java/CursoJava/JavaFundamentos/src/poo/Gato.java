package poo;
public class Gato extends Animales {
    private String raza;

    public Gato(String nombre, int edad, float precioBase, String raza) {
        super(nombre, edad, precioBase);
        this.raza = raza;
    }

    @Override
    public String sonido() {
        return "Miau";
    }

    @Override
    public float precioFinal() {
        return getPrecioBase() * 1.05f; // +5% por vacunas
    }

    public String getRaza() {
        return raza;
    }
}