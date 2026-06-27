package poo;

import java.util.Scanner;

public class Alumno {
     private String nombre;
     private int edad;
     private int PC1;
     private int PC2;
     private int PC3;
     private int EF;
    
    
     public Alumno(String nombre ,int edad,int PC1,int PC2,int PC3,int EF){
        this.nombre=nombre;
        this.edad=edad;
        this.PC1=PC1;
        this.PC2=PC2;
        this.PC3=PC3;
        this.EF=EF;
        

Scanner lector=new Scanner(System.in);
int cantidadAccidentes;

    int cantidadConductores;
    String nombre="";
    int codigoEmpleado;
    double horasTrabajadasMes;
    double kilometrajeRecorrido;
    int saldoBonificacion ;
    double sueldoBase;
    int zonaDistribucion;

System.out.println("Ingrese la cantidad de conductores a evaluar :");
cantidadConductores=lector.nextInt();

int [] conductores=new int[cantidadConductores];

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
    /*
     System.out.println("Ingrese la cantidad de accidentes que tuvo el conductor : " + i+1 );
    cantidadAccidentes=lector.nextInt();
    if (cantidadAccidentes ==0) {
        saldoBonificacion=50;
        System.out.println("FELICITACIONES ,USTED ES UN EXCELENTE CONDUCTOR !!");
    }

    System.out.println("Ingrese su sueldo base " );
    sueldoBase =lector.nextDouble();

    System.out.println("Ingrese su zona de distribucion ");
    

    Conductores prueba1= new Conductores(nombre, codigoEmpleado, horasTrabajadasMes, kilometrajeRecorrido, sueldoBase);*/

}

     }

     public String getNombre() {
        return nombre;
    }
     public void setNombre(String nombre) {
         this.nombre = nombre;
     }
     
    public int getEdad() {
        return edad;
    }
     public void setEdad(int edad) {
         this.edad = edad;
     }
    
    public int getPC1() {
        return PC1;
    }
    public void setPC1(int pC1) {
        PC1 = pC1;
    }
    
    public int getPC2() {
        return PC2;
    }
    public void setPC2(int pC2) {
        PC2 = pC2;
    }

    public int getPC3() {
        return PC3;
    }
    public void setPC3(int pC3) {
        PC3 = pC3;
    }
    
    public int getEF() {
        return EF;
    }
    public void setEF(int eF) {
        EF = eF;
    }
    
     
     

   
    public  double calcularPromedio(){

        return (getPC1()+getPC2()+getPC3()+getEF())/4.0;
    }
    

}
