package poo;

public class Libro {

    private String codigo;
    private String titulo;
    private String autor;
    private int cantidadDisponible;
    private static int totalLibros;


    public Libro (String codigo,String titulo,String autor,int cantidadDisponible){

        this.codigo=codigo;
        this.titulo=titulo;
        this.autor=autor;
        this.cantidadDisponible=cantidadDisponible;
         totalLibros += cantidadDisponible;
        
    }

    public  void prestarLibro(int prestamo){

        cantidadDisponible -=prestamo;
        totalLibros-=prestamo;

    }
    
    public  void devolverLibro(int devolucion){

        cantidadDisponible +=devolucion;
         totalLibros +=devolucion;
    }

public static int verTotalDeLibros(){
    return totalLibros;
}

    public String mostrarInformacion(){

        return String.format(
               "Codigo            :%s%n"+
               "Titulo            :%s%n"+
               "Autor             :%s%n"+
               "Cantidad          :%d%n",
            codigo,titulo,autor,cantidadDisponible);

    }


    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
   public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    

}
