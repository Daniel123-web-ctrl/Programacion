package poo;

public class Mago {
     private String codigo;
    private String nombre;
    private int nivel;
private int puntosVida;
private int poderMagico;
private boolean poseeBaston;

public Mago(String codigo,String nombre,int nivel,int puntosVida,int poderMagico,boolean poseeBaston){
    this.codigo=codigo;
    this.nombre=nombre;
    this.nivel=nivel;
    this.puntosVida=puntosVida;
    this.poderMagico=poderMagico;
    this.poseeBaston=poseeBaston;

}
public double calcularDanioBase(){
    return nivel * poderMagico;

}
public  double calcularBonificacionBaston(){
    if (poseeBaston==true) {
        return 0.3*calcularDanioBase();
    }else{
        return 0;
    }
     
}
 public double calcularDanioTotal(){
    return calcularDanioBase() +calcularBonificacionBaston();
 }


  public String determinarCategoria(){
    if (calcularDanioTotal()>300) {
        return "Archimago";
        
    }else if(calcularDanioTotal()>120){
        return "Hechicero";
    }else{
        return "Aprendiz";
    }
  }


  public boolean puedeLanzarHechizoLegendario(){
    if (nivel>15) return true;
    else return false;

  }

  public String mostrarDatos(){
    return String.format(
        "Codigo                :%s%n"+
        "Nombre                :%s%n"+
        "Nivel                 :%d%n"+
        "Puntos de Vida        :%d%n"+
        "Poder Magico          :%d%n"+
        "Posee Baston          :%b%n"+
        "Daño Base             :%.2f%n"+
        "Bonificacion          :%.2f%n"+
        "Daño  Total           :%.2f%n"+
        "Categoria             :%s%n"+
        "Hechizo Legendario    :%b%n",
    codigo,nombre,nivel,puntosVida,poderMagico,poseeBaston,
    calcularDanioBase(),calcularBonificacionBaston(),
    calcularDanioTotal(),determinarCategoria(),
    puedeLanzarHechizoLegendario());


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
    
    public int getPuntosVida() {
        return puntosVida;
    }
    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }
    public int getPoderMagico() {
    return poderMagico;
}

public void setPoderMagico(int poderMagico) {
    this.poderMagico = poderMagico;
}
  
public boolean isPoseeBaston() {
    if (poseeBaston)   return true;
    else  return false;
        
    }


public void setPoseeBaston(String poseeBaston) {
if (poseeBaston.equalsIgnoreCase("si"))  this.poseeBaston=true;

else   this.poseeBaston=false;
}
    
    
    

}
