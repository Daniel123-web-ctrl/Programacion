package poo;

public class Piloto {

  private String codigo ;
  private String nombre ;
  private int nivel ;
  private int experiencia;
  private double  velocidad;
   private boolean poseeNave ;

public Piloto(String codigo,String nombre,int nivel,int experiencia,double  velocidad,boolean poseeNave){

this.codigo=codigo;
this.nombre=nombre;
this.nivel=nivel;
this.experiencia=experiencia;
this.velocidad=velocidad;
this.poseeNave=poseeNave;

}


 public double calcularPuntajeBase(){
    return nivel*velocidad;
 }

 public double calcularBonificacionNave(){
    if (poseeNave) {
        return 0.25*calcularPuntajeBase();
    } else{
        return 0;
    }
 }

public double calcularPuntajeTotal(){
  return   calcularPuntajeBase() + calcularBonificacionNave();
}

public  String calcularRango(){
if (calcularPuntajeTotal() >=280) {
  return "Comandante";
}else if(calcularPuntajeTotal() >150 &&calcularPuntajeTotal() <280 ){
    return "Capitan";

}else{
    return "Cadete";

}
}
public boolean puedeParticiparMision(){
if (nivel >=12) {
        return true;
    }else{

        return false;
    }
}


public String mostrarDatos(){
//ublic Piloto(String codigo,String nombre,int nivel,int experiencia,double  velocidad,boolean poseeNave){
return String.format(
           "Codigo          :%s%n"+
           "Nombre          :%s%n"+
           "Nivel           :%d%n"+
           "Experiencia     :%d%n"+
           "Velocidad       :%.2f%n"+
           "Posee nave      :%b%n"+
           "Puntaje Total   :%.2f%n",
           codigo,nombre,nivel,experiencia,velocidad,poseeNave,calcularPuntajeTotal()
        );

}


  public String getCodigo() {
    return codigo;
}
  public void setCodigo(String codigo) {
    this.codigo = codigo;
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
  
  public int getExperiencia() {
    return experiencia;
}
  public void setExperiencia(int experiencia) {
    this.experiencia = experiencia;
  }
   
  public double getVelocidad() {
    return velocidad;
}
  public void setVelocidad(double velocidad) {
    this.velocidad = velocidad;
  }
 
  public boolean isPoseeNave() {
    return poseeNave;
  }
  public void setPoseeNave(boolean poseeNave) {
    this.poseeNave = poseeNave;
  }


}
