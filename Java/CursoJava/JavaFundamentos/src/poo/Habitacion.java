package poo;

public class Habitacion {
    private String numero;
    private String tipo;   //Simple ,Double, Suite
     private double precioDia ;
      private double diasHospedaje;
     private boolean ocupada;

public Habitacion(String numero,String tipo,int diasHospedaje,double precioDia,boolean ocupada){

    this.numero=numero;
    this.tipo=tipo;
    this.diasHospedaje=diasHospedaje;
    this.precioDia=precioDia;
    this.ocupada=ocupada;
}

public double calcularCostoBase(){
    return precioDia*diasHospedaje;
}

public double calcularDescuento(){
    if(diasHospedaje> 10){
        return 0.2*calcularCostoBase();
    }else if(diasHospedaje>=5 ){

        return 0.1*calcularCostoBase();
    }else{
        return 0;

    }
}

public double calcularImpuesto(){
    return 0.18*calcularCostoBase();
}
  public double calcularTotal(){
    return (calcularCostoBase()-calcularDescuento())+calcularImpuesto();
  }


public String  obtenerCategoria(){
    if (calcularTotal() >=3000 ) {
     return "Premium"  ;     
    }else if (calcularTotal()>=1500 && calcularTotal() <3000){
        return "Ejecutiva";

    }else{
       return "Economica";
    }
}

 public boolean estaDisponible(){
    if (ocupada ==false) {
        return true;
        
    }else{
        return false;
    }

 }

  public String mostrarDatos(){
   return String.format("Numero de habitacion : %s %n Tipo de habitacion : %s %nDias de hospedaje :%.2f %nPrecio por dia :%.2f %nTotal a pagar :%.2f%nCategoria : %s%nDisponible : %b %n",
    getNumero(),getTipo(),getDiasHospedaje(),getPrecioDia(),calcularCostoBase(),obtenerCategoria(),estaDisponible());

  }


public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }


    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDiasHospedaje() {
        return diasHospedaje;
    }

    public void setDiasHospedaje(int diasHospedaje) {
        this.diasHospedaje = diasHospedaje;
    }

    public double getPrecioDia() {
        return precioDia;
    }


    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

public boolean isOcupada() {
        return ocupada;
    }




    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

}
