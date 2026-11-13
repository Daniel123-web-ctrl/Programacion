package poo.juegos;

public class Guerrero  extends Personaje{
 

 public Guerrero(String nombre, int nivel, int vida, int daño){


    super( nombre, nivel, vida,  daño);
 }

@Override 
public String obtenerTipo(){
    return "GUERRERO";
}







}
