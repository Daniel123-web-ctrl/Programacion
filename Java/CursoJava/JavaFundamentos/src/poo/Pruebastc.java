package poo;

public class Pruebastc {
    public static void main(String[] args) {
        final Empleados trabajador1=new Empleados("Paco");
        Empleados trabajador2=new Empleados("Ana");
        trabajador1.cambiaSeccion("RRHH");
        Empleados trabajador3=new Empleados("Maria");
        Empleados trabajador4=new Empleados("Maria");

        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
        System.out.println(trabajador3.devuelveDatos());
       System.out.println(trabajador4.devuelveDatos());
       System.out.println(Empleados.getIdSiguiente());

       System.out.printf("%s%n"+
       "%s%n"+
       "%s%n"+
       "%s%n"+
       "%s%n",trabajador1.devuelveDatos(),trabajador2.devuelveDatos(),
       trabajador3.devuelveDatos(),trabajador4.devuelveDatos(),Empleados.getIdSiguiente());

    }

}




class Empleados{

    public Empleados (String nombre ){
        this.nombre=nombre;
        seccion="Administracion";
         // aqui tambien podria ser Empleados.id=id;   aqui id pertenece a la clase ya no pertenece a ninguna instancia 
        id=idSiguiente;//aqui en la primera vuelta id vale 1 porque se le inicializa abajo
        idSiguiente++;   // luego en cada que se crea un objeto ,este aumenta en 1
    }

    public  void cambiaSeccion(String seccion){
        this.seccion=seccion;
    }


    public String devuelveDatos(){
        return "El nombre es : "+ nombre +" y la seccion es " + seccion + " y el id es : " +id ;
    }


    public static  String getIdSiguiente(){


        return String.format("EL id siguiente es %d%n ",idSiguiente);
    }

    private final String nombre;
    private String seccion;
     private int id;
    private  static int idSiguiente=1;

    
    



}