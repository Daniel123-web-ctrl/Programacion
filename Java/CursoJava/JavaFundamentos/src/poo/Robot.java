package poo;

public class Robot {

  private String codigo ;
  private String modelo ;
  private int nivel ;
  private int energia;
  private double  potencia;
   private boolean poseeEscudo ;

public Robot(String codigo,String modelo,int nivel,int energia,double potencia,boolean poseeEscudo){

this.codigo=codigo;
this.modelo=modelo;
this.nivel=nivel;
this.energia=energia;
this.potencia=potencia;
this.poseeEscudo=poseeEscudo;

}


 public double calcularAtaqueBase(){
    return nivel*potencia;
 }

 public double calcularBonificacionEscudo(){
    if (poseeEscudo) {
        return 0.20*calcularAtaqueBase();
    } else{
        return 0;
    }
 }

public double 	calcularAtaqueTotal(){
  return   calcularAtaqueBase() + calcularBonificacionEscudo();
}

public  String determinarClasificacion() {
if (calcularAtaqueTotal() >=250) {
  return "Elite";
}else if(calcularAtaqueTotal() >130 && calcularAtaqueTotal() <250 ){
    return "Avanzado";

}else{
    return "Basico";

}
}
public boolean puedeDefenderBase() {
if (energia >=300) {
        return true;
    }else{

        return false;
    }
}


public String mostrarDatos(){

return String.format(
                            "Codigo          :%s%n"+
                            "Modelo          :%s%n"+
                            "Nivel           :%d%n"+
                            "Energia         :%d%n"+
                            "Potencia        :%.2f%n"+
                            "Posee escudo    :%b%n"+
                            "Ataque total    :%.2f%n",codigo,modelo,nivel,energia,potencia,poseeEscudo,calcularAtaqueTotal());

}







  public String getCodigo() {
    return codigo;
}
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  
  public String getModelo() {
    return modelo;
}
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
 
  public int getNivel() {
    return nivel;
}
  public void setNivel(int nivel) {
    this.nivel = nivel;
  }
  
  public int getEnergia() {
    return energia;
}
  public void setEnergia(int energia) {
    this.energia = energia;
  }
   
  public double getPotencia() {
    return potencia;
}
  public void setPotencia(double potencia) {
    this.potencia = potencia;
  }
 
  public boolean isPoseeEscudo() {
    return poseeEscudo;
  }
  public void setPoseeEscudo(boolean poseeEscudo) {
    this.poseeEscudo = poseeEscudo;
  }




}
