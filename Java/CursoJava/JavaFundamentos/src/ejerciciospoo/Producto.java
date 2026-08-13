public class Producto {

    private String codigo;
    private String nombre;
    private double precio;

public Producto (String codigo,String nombre,double precio){
    this.codigo=codigo;
    this.nombre=nombre;
    this.precio=precio;

}
   
    public String mostrarDatos(){
       StringBuilder sb= new StringBuilder();
       sb.append(String.format("Codigo",getCodigo()));
       sb.append(String.format("Nombre",getNombre()));
       sb.append(String.format("Precio",getPrecio()));
       return sb.toString();
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
    
}
