package poo;

public class CalculadoraDeEdad {
/* Calculadora de Edad: Un método recibe el año de nacimiento y el año actual, 
calcula la edad de la persona y
 muestra si es mayor o menor de edad (usando un if simple)*/
 private int agnoNacimiento;
 private int agnoActual;

 public CalculadoraDeEdad(int agnoNacimiento,int agnoActual){

this.agnoNacimiento=agnoNacimiento;
this.agnoActual=agnoActual;
    
 }


public  int calcularEdadPersona(){
  return agnoActual -agnoNacimiento;
}

 public int getAgnoNacimiento() {
    return agnoNacimiento;
}
 public void setAgnoNacimiento(int agnoNacimiento) {
    this.agnoNacimiento = agnoNacimiento;
 }
 
 public int getAgnoActual() {
    return agnoActual;
 }
 public void setAgnoActual(int agnoActual) {
    this.agnoActual = agnoActual;
 }

}

