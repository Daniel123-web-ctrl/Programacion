package poo;

import java.util.Scanner;

public class MainSistemaDeGestionDeRendimiento {

    public static double calcularEficiencia( double kilometrosRecorridos ,double horasTrabajadas){
       return   kilometrosRecorridos * horasTrabajadas;
       if ((kilometrosRecorridos * horasTrabajadas) >15)  {
        
       }
    }


    public static double obtenerPorcentajeZona(int zona){
        switch (zona) {
            case 1:
                 return  0.05;
                
            case 2:
                return 0.08;
               
            case 3:
                return 0.12;
                
            default:
                return 0.0;
                
        }
    }

    public static String mostrarReporteConductor(){
        return String.format("");
    }

public static void main(String[] args) {
    Scanner lector=new Scanner(System .in);
    String nombre ;
    int numeroConductores,codigoEmpleado ,numeroAccidentes,zona;
    double horasTrabajadasMes,kilometrajeRecorrido, salarioBase ,eficiencia ,porcentajeZona,Bonificacion;
     final int  INSENTIVO =50;
   

    System.out.println("Ingrese la cantidad de conductores");
    numeroConductores=lector.nextInt();

    int [] conductores =new int[numeroConductores];


    for (int i = 0; i < conductores.length; i++) {
    System.out.println("Ingrese su nombre :");
    nombre=lector.next();
    
    do {
        System.out.println("Ingrese su codigo : ");
    codigoEmpleado=lector.nextInt();
    if (codigoEmpleado <0) {
        System.out.println("Error :CODIGO NO VALIDO !!");
    }

    } while (codigoEmpleado < 0);

    System.out.println("Ingrese las horas totales trabajadas en el mes : ");
    horasTrabajadasMes=lector.nextDouble();

    System.out.println("Ingrese los  kilometrajes recorridos en el mes : ");
    kilometrajeRecorrido=lector.nextDouble();
    System.out.println("Ingrese su salario base ");
    salarioBase =lector.nextDouble();
    
    System.out.println("Ingrese la cantidad de accidentes");
    numeroAccidentes=lector.nextInt();
    if (numeroAccidentes ==0 ) {
        salarioBase  + INSENTIVO;
    }else{

    }




    }

}

}
