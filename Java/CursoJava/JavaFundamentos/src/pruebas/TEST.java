package pruebas ;



public class TEST {

    public static void main(String[] args) {
        
        Empleado emp1=new Director();
        Director dir1 =new Director();

        emp1.trabaja();

        
    }

}


 class Empleado{

   
    public  void trabaja(){

        System.out.println("Realizo las tareas tipicas de un empleado ");
    }
 
 }
 //UN DIRECTOR ES SIEMPRE UN EMPLEADO 
 
 class Director extends Empleado {

    private String nombre  ; 
    private int edad;
    private double salario;
    private  double incetivo;
    

    public  void trabaja(){

        System.out.println("Realizo las tareas tipicas de un director ");
    }

   }
 