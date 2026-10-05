package poo;
public class Perro extends Animales {
    private String raza;

    public Perro(String nombre, int edad, float precioBase, String raza) {
        super(nombre, edad, precioBase);
        this.raza = raza;
    }

    @Override
    public String sonido() {
        return "Guau guau";
    }

    @Override
    public float precioFinal() {
        return getPrecioBase() * 1.10f; // +10% por vacunas
    }

    public String getRaza() {
        return raza;
    }
}



