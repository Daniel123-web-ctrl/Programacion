
package poo;

public class Coche4 { // esta clase se llama coche 4 
    private double ancho;
    private double alto;
    private double peso;
    private double pesoBase;
    private String Color;
    private int ruedas;
    private boolean climatizador;
    private boolean asientosDeCuero;
    private double precioBase;
    private double precio;

    public Coche4() {
        ruedas = 4;
        Color = "gris";
        pesoBase= 1350.25;
        precioBase = 15650.25;
        peso=pesoBase;
        precio=precioBase;

        
    }

    public String isClimatizador() {
        if (climatizador == true) {
            return "El coche incorpora Climatizador";
        } else {
            return "El coche tiene aire acondicionado";
        }
    }

    public void setClimatizador(String climatizador) {
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }

        setPrecio(precio);
        setPeso(peso);
    }

    public String isAsientosDeCuero() {
        if (asientosDeCuero == true) {
            return "El coche tiene asiento de cuero";
        } else {
            return "El coche no tiene asientos de cuero";
        }
    }

    public void setAsientosDeCuero(String asientosDeCuero) {
        if (asientosDeCuero.equalsIgnoreCase("si")) {
            this.asientosDeCuero = true;
        } else {
            this.asientosDeCuero = false;
        }

        setPrecio(precio);
        setPeso(peso);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
        setPrecio(precio);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        double precioFinal = precioBase;

        if (asientosDeCuero) {
            precioFinal += 3250.20;
        }

        if (climatizador) {
            precioFinal += 3500;
        }

        this.precio = precioFinal;
    }

    public double getPesoBase() {
        return pesoBase;
    }

    public void setPesoBase(double pesoBase) {
        this.pesoBase = pesoBase;
        setPeso(peso);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        double pesoFinal = pesoBase;

        if (asientosDeCuero) {
            pesoFinal += 50;
        }

        if (climatizador) {
            pesoFinal += 70;
        }

        this.peso = pesoFinal;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        if (ruedas < 4) {
            System.out.println("Es una moto");
        } else {
            System.out.println("Es un carro");
        }

        this.ruedas = ruedas;
    }

    void arrancar() {

    }

    void frenar() {

    }

    void girar() {

    }

}