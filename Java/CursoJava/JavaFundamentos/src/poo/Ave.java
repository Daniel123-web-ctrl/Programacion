package  poo;
public class Ave extends Animales {
    private String especie;

    public Ave(String nombre, int edad, float precioBase, String especie) {
        super(nombre, edad, precioBase);
        this.especie = especie;
    }

    @Override
    public String sonido() {
        return "Pio pio";
    }

    @Override
    public float precioFinal() {
        return getPrecioBase(); // sin cargo extra
    }

    public String getEspecie() {
        return especie;
    }
}