package poo;

public class Videojuegos {
    
    private  String codigo;
    private  String nombre;
    private  double precio;
    private  String categoria;
    private  int  horasJuego;
    private  boolean esMulijugador;


    public Videojuegos(String codigo,String nombre,double precio,String categoria,int  horasJuego,boolean esMulijugador){

        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
        this.horasJuego=horasJuego;
        this.categoria=categoria;
        this.esMulijugador=esMulijugador;

    }

public double calcularDescuento(){
   if (categoria.equalsIgnoreCase("Accion")) {
    return 0.15*precio; 
   }else if (categoria.equalsIgnoreCase("Aventura")){
    return  0.1*precio;
   }else if(categoria.equalsIgnoreCase("Deportes")){
    return  0.08*precio;
   }else{
    return 0.05*precio;
   }
    }

    public double calcularImpuesto(){
        return 0.18*precio;
    }

    public double calcularPrecioFinal(){
        return precio +calcularImpuesto()-calcularDescuento();
    }

    public double calcularPuntaje(){
        if (esMulijugador) {
            return (horasJuego*precio)+200;
        }else{
            return horasJuego*precio;
        }
    }

    public String  obtenerCategoria(){
        if(calcularPrecioFinal()>250){
            return "PREMIUM";

        }else{
            return "ESTANDAR";
        }
    }

     public String mostrarDatos(){
        return String.format(
            "Codigo            :%s%n"+
            "Nombre            :%s%n"+
            "Precio            :%.2f%n"+
            "Horas de juego    :%d%n"+
            "Categoria         :%s%n"+
            "Multijugador      :%s%n"+
            "Descuento         :%.2f%n"+
            "Impuesto          :%.2f%n"+
            "Precio Final      :%.2f%n"+
            "Puntaje           :%.2f%n"+
            "Categoria Final   :%s%n",codigo,nombre,precio,horasJuego,categoria,esMulijugador,
            calcularDescuento(),calcularImpuesto(),calcularPrecioFinal(),calcularPuntaje(),obtenerCategoria() );

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
   
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
    public int getHorasJuego() {
        return horasJuego;
    }
    public void setHorasJuego(int horasJuego) {
        this.horasJuego = horasJuego;
    }
    
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
       this.categoria=categoria;
    }
    public boolean isEsMulijugador() {
        if (esMulijugador) {
            return true;
        }else{
            return false;

        }
    }
    public void setEsMulijugador(String esMulijugador) {

        if (esMulijugador.equalsIgnoreCase("si")) this.esMulijugador=true;
        else this.esMulijugador= false;
        
    }





}
