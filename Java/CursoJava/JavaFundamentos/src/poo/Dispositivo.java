package poo;

public class Dispositivo {

 private   String marca;
  private  String modelo;
  private  double precio;
  private  int stock;
  



public  Dispositivo(String marca,String modelo,double precio,int stock){
 this.marca=marca;
   this.modelo=modelo;
   this.precio=precio;
 this.stock=stock;
 

}

public String consultarInformacion(){
    
    StringBuilder informacion=new StringBuilder();
    informacion.append(String.format("Marca:%s %nModelo:%s %nPrecio:%s %nStock:%s "
    ,getMarca(),getModelo(),getPrecio(),getStock()));
   return  informacion.toString();

}



 public String getMarca() {
    return marca;
}
  public void setMarca(String marca) {
    this.marca = marca;
  }
  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public double getPrecio() {
    return precio;
  }
  public void setPrecio(double precio) {
    this.precio = precio;
  }
  public int getStock() {
    return stock;
  }
  public void setStock(int stock) {
    this.stock = stock;
  }

 
  public void setNuevostock(int nuevostock) {
    if(nuevostock >stock) {
        System.out.println("Stock insuficiente");

    }else{
    this.stock = stock-nuevostock;
  }
    }
    
  }


 

