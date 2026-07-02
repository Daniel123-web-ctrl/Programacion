package poo;

import javax.swing.JOptionPane;

public class Calificacion {


public static void main(String[] args) {
    int puntaje;
    int contadorEstudiante=0,contadorA=0,contadorB=0,contadorC=0;

do {

puntaje=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el puntaje del estudiante"));
   if (puntaje >=0 ) {
    if (puntaje>=70 && puntaje <=100) {
        contadorA++;
    }else if (puntaje <=69 && puntaje >=30) {
        contadorB ++;
    }else12
     {
        contadorC++;
    }
contadorEstudiante++;
   }else{
    System.out.println("Fin");
   }

} while (puntaje >= 0);

 JOptionPane.showMessageDialog(null, String.format(
  "El numero total de estudiantes es                             %d%n " +
  "El numero total de estudiantes con calificacion de A son      %d%n " +
  "El numero total de estudiantes con calificacion de B son      %d%n " +
  "El numero total de estudiantes con calificacion de C son      %d%n " ,contadorEstudiante,contadorA,contadorB,contadorC));


}

}
