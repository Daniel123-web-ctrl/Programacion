package poo;

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
