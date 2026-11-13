package poo.juegos;

public class Mago extends Personaje {

    public Mago(String nombre, int nivel, int vida, int daño){

    
    super( nombre, nivel, vida,  daño);
 }

@Override 

public String mostrarInformacion(){

    StringBuilder informacion =new StringBuilder();
        informacion.append(String.format("==".repeat(30)+ "\n"));
        informacion.append(String.format("MAGO"+ "\n"));
        informacion.append(String.format("==".repeat(30)+ "\n"));
        informacion.append(String.format("Nombre :%s %nNivel : %d %nVida :%d %nDano :%d ",getNombre(),getNivel(),getVida(),getDaño()));

        return informacion.toString();

  
    
}


}
