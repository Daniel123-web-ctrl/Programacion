

public class MainVideojuegos {

    public static void main(String[] args) {
        Videojuegos juego1=new Videojuegos("V001", "Minecraft", 500, "Aventura",300, true);
        Videojuegos juego2=new Videojuegos("V002", "GTA VI", 320, "Deportes", 250, true);
        ComparacionesResultados resultado1=new ComparacionesResultados(juego1, juego2);

      juego1.setCategoria("accion");
      juego1.setEsMulijugador("si");
      juego2.setCategoria("Deportes");
      juego2.setEsMulijugador("si"); 

      System.out.println("JUEGO 1");
       System.out.println(juego1.mostrarDatos());
       System.out.println("JUEGO 2");
       System.out.println(juego2.mostrarDatos());
       System.out.println(resultado1.mostrarGanador());






    }
}
