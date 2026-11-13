package poo.juegos;
public class Personaje {

    private String nombre;
     private int nivel ;
    private int vida;
    private int daño;

     public Personaje (String nombre,int nivel,int vida,int daño){

        this.nombre=nombre;
        this.nivel=nivel;
        this.vida=vida;
        this.daño=daño;
     }
     


     public void atacar (){


     }

     public  void recibirDano(){


     }

     

     public String obtenerTipo (){

        return "PERSONAJE";
     }

     public String mostrarInformacion(){

        StringBuilder informacion =new StringBuilder();
        informacion.append(String.format("==".repeat(30)+ "\n"));
        informacion.append(obtenerTipo()+ "\n");
        informacion.append(String.format("==".repeat(30)+ "\n"));
        informacion.append(String.format("Nombre :%s %nNivel : %d %nVida :%d %nDano :%d ",nombre,nivel,vida,daño));

        return informacion.toString();
     }



















    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getDaño() {
        return daño;
    }
    public void setDaño(int daño) {
        this.daño = daño;
    }
    

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
   

}
