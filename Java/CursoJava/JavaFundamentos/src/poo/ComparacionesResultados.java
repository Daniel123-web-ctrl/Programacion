package poo;


public class ComparacionesResultados {
    

private Videojuegos juego1;
private Videojuegos juego2;
public ComparacionesResultados(Videojuegos juego1,Videojuegos juego2){
    //this.guerrero1=guerrero1;
   // this.mago1=mago1;

    this.juego1=juego1;
    this.juego2=juego2;

}
public String mostrarGanador(){   
    String masCaro;
    String mayorPuntaje;
    if(juego1.calcularPrecioFinal()>juego2.calcularPrecioFinal()){
        masCaro= String.format("EL videojuego %s es el mas caro %n",juego1.getNombre());
    }else{
        masCaro=String.format("El videojuego %s es el mas caro %n",juego2.getNombre());
    }

    if (juego1.calcularPuntaje()>juego2.calcularPuntaje()) {
        mayorPuntaje= String.format("El videojuego con mayor puntaje es %s%n",juego1.getNombre());
    }else{
        mayorPuntaje= String.format("El videojuego con mayor puntaje es %s%n",juego2.getNombre());

    }

    return masCaro+mayorPuntaje;








}
}
       

