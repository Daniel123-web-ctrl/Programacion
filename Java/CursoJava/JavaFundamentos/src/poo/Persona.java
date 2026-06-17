package poo;

public class Persona {
    public  Persona(){

        nombre ="JUAN";


    }

    

    private String nombre;
    private int edad;
    private int DNI;



    
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
        this.edad=edad;
        

    }

    
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        this.DNI=DNI;
    }

}
