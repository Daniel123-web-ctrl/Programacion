package poo.ejercicios;

public class Furgoneta extends Coche4{  // aqui dispones de todo aquello que es  public de la clase Coche


    private int capacidadCarga;
    private int plazaExtra;

    public Furgoneta(int plazaExtra,int capacidadCarga){ 

        super(capacidadCarga); // este llama al constructor de la clase padre en este caso llama al constructor de Coche4 que vendria a ser la clase padre


        this.plazaExtra=plazaExtra;
        this.capacidadCarga=capacidadCarga;
        
    }

public String getDatosFurgoneta(){
    return "La capacidad de carga es " + capacidadCarga +" y las plazas extras son " + plazaExtra;
}


}
