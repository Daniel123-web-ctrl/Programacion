package poo;
import java.util.ArrayList;
import java.util.*;
import java.util.NoSuchElementException;


public class Tienda {
    private ArrayList<Animales> inventario=new ArrayList<>();

    public Tienda() {
        this.inventario = new ArrayList<>();
    }

    public void agregarAnimal(Animales animal) {
        inventario.add(animal);
    }

    public void mostrarAnimales() {
        if (inventario.isEmpty()) {   //inventario.size()==0
            System.out.println("El inventario esta vacio");
            return;
        }
        for (Animales a : inventario) {//Para cada animal que hay dentro de inventario,
        //  guárdalo temporalmente en una variable llamada a, y con ese animal haz lo que
        //  sigue adentro de las llaves."
           System.out.println(a.mostrarInformacion()
                    + "\nSonido: " + a.sonido()
                    + "\nPrecio final: " + a.precioFinal()
                    + "\n");
        }
    }

    public void venderAnimal(String nombre) {
        Animales encontrado = null;
        for (Animales a : inventario) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = a;
                break;
            }
        }
        if (encontrado == null) {
            throw new NoSuchElementException("No existe un animal con el nombre: " + nombre);
        }
        inventario.remove(encontrado);
        System.out.println(nombre + " fue vendido.");
    }

    public float valorTotalInventario() {
        float total = 0;
        for (Animales a : inventario) {
            total += a.precioFinal();
        }
        return total;
    }
}