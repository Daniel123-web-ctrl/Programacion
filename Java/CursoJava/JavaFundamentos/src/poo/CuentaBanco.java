package poo;

public class CuentaBanco {

private String numeroCuenta;
private String nombreTitular;
private double saldoDisponible;
private static double comision=5;
private static int totalOperacion;
private double montoDeposito;
private double montoRetiro;
private static int totalCuentas = 0;



public CuentaBanco (String numeroCuenta,String nombreTitular,double saldoDisponible,double montoDeposito,double montoRetiro){

     this.numeroCuenta=numeroCuenta;
     this.nombreTitular=nombreTitular;
     this.saldoDisponible=saldoDisponible;
     this.montoDeposito=montoDeposito;
     this.montoRetiro=montoRetiro;
    

    totalCuentas++;

}

public double realizarDeposito(){
    

return saldoDisponible+montoDeposito;


}

public double realizarRetiro(){
    
    return  realizarDeposito()- (montoRetiro + comision);
    
}
public double verSaldoFinal(){

return realizarRetiro();

}
public static int getTotalCuentas() {
    return totalCuentas;
}


public String verCuenta(){

 return String.format(
           "Numero de cuenta         :  %s%n"+
           "Titular                  :  %s%n"+ 
           "Saldo disponible Final   :  %.2f%n",numeroCuenta,nombreTitular,verSaldoFinal());
}

public static int getTotaOperaciones(){

 return totalOperacion;

}

public String getNumeroCuenta() {
    return numeroCuenta;
}
public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
}

public String getNombreTitular() {
    return nombreTitular;
}
public void setNombreTitular(String nombreTitular) {
    this.nombreTitular = nombreTitular;
}

public double getSaldoDisponible() {
    return saldoDisponible;
}
public void setSaldoDisponible(double saldoDisponible) {
    this.saldoDisponible = saldoDisponible;
}
public double getMontoDeposito() {
    return montoDeposito;
}

public void setMontoDeposito(double montoDeposito) {
    this.montoDeposito = montoDeposito;
}

public double getMontoRetiro() {
    return montoRetiro;
}

public void setMontoRetiro(double montoRetiro) {
    this.montoRetiro = montoRetiro;
}




}
