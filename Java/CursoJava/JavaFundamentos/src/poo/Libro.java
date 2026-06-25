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
        
        totalLibros ++;
    }

    public int prestarLibro(){
        if (cantidadDisponible < 3) {
            System.out.println("No se puede prestar mas libros de lo disponible");
            return 0;
            
        }else{
            return cantidadDisponible-3;
        }
        
    }

    public int devolverLibro(){
        return cantidadDisponible +1;
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
    
    public String getCantidaDisponible() {
        return cantidaDisponible;
    }
    public void setCantidaDisponible(String cantidaDisponible) {
        this.cantidaDisponible = cantidaDisponible;
    }
    
    
    public static String getTotalLibros() {
        return totalLibros;
    }
    public static void setTotalLibros(String totalLibros) {
        Libro.totalLibros = totalLibros;
    }

}
