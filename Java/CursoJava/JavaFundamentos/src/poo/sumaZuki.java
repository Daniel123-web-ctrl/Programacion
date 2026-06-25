package poo;

public class sumaZuki {
/*Suma de Dos Numeros:  crea un metodo que pida dos metodos en el main ,los reciba como parametros y muestre su suma */

private double num1;
private double num2;

 public sumaZuki(double num1,double num2){
  this.num1=num1;
  this.num2=num2;
}

 public double sumarNumeros(){
  return num1+num2;
 }

public double restarNumeros(){
    return num1-num2;
}

public double multiplicarNumeros(){
  return num1*num2;
 }

public double dividirNumeros(){
    if (num2 != 0) {
        return  num1/num2;
    }else {
        System.out.println("Error : No se puede dividir entre 0");
        return 0;
    }
}





public double getNum1() {
    return num1;
}


public void setNum1(int num1) {
    this.num1 = num1;
}
public double getNum2() {
    return num2;
}


public void setNum2(int num2) {
    this.num2 = num2;
}





}
