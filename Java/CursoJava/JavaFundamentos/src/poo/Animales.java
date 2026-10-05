
package poo;
public abstract class Animales {

    private String nombre;
    private int edad;
    private float precioBase;

    public Animales(String nombre, int edad, float precioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.precioBase = precioBase;
    }

    // Cada tipo de animal define su propio sonido
    public abstract String sonido();

    // Cada tipo de animal calcula su propio precio final
    public abstract float precioFinal();

    public String mostrarInformacion() {
        StringBuilder informacion = new StringBuilder();
        informacion.append(String.format("nombre %s%nedad %d%nprecioBase %.2f", nombre, edad, precioBase));
        return informacion.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        if (precioBase < 0) {
            System.out.println("El precio no puede ser negativo");
        } else {
            this.precioBase = precioBase;
        }
    }
}