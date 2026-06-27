package poo;

import javax.swing.JOptionPane;

public class PruebaCalculadoraEdad {
public static void main(String[] args) {
     

CalculadoraDeEdad calculo1=new CalculadoraDeEdad(2000, 2026);

int edad =calculo1.calcularEdadPersona();
if (edad>=18) {

    JOptionPane.showMessageDialog(null, String.format("La persona tiene %d años%n es  mayor de edad",edad));
    
}else{
 JOptionPane.showMessageDialog(null, String.format("La persona tiene %d años%n es  menor de edad",edad));
}


}

}
