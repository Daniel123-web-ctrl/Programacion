package poo;

public class Estudiante  extends Persona{


    private final String codigo;
    private String carrera;
    private double promedio;
    private static int contador;

public Estudiante (String nombre ,int edad, String codigo,String carrera,double promedio){
    super(nombre, edad);
    this.codigo=codigo;
    this.carrera =carrera;
    this.promedio=promedio;
    contador ++;

}



public String motrarDatos(){
    return String.format("=".repeat(40)  +"\n"+ " ".repeat(8)+"INSTITUTO TECNOLOGICO \n" +"=".repeat(40)+"\n"+
"Codigo          :%s%n"+
"Nombre          :%s%n"+
"Edad            :%d%n"+
"Carrera         :%s%n"+
"Promedio        :%.2f%n",codigo,getNombre(),getEdad(),carrera,promedio);
    
}

public static int contadorEstudiantes(){
    return contador;

}


    public String getCodigo() {
        return codigo;
    }
    
    
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    


     

}
