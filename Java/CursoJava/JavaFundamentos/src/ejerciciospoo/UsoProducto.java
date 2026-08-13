public class UsoProducto {
    public static void main(String[] args) {
        Producto producto1=new Producto("123", "Laptop", 1000);
        Producto producto2=new Producto("456", "Celular ", 2000);

        System.out.println(producto1.mostrarDatos());
        System.out.println(producto2.mostrarDatos());

        
    }
    
}
