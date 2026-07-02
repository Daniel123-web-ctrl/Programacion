package poo;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;
   
    
    public CuentaBancaria(String numeroCuenta,String titular,double saldo){

        this.numeroCuenta=numeroCuenta;
        this.titular=titular;
        this.saldo=saldo;

    }

    public void depositar(double monto){
               
        this.saldo +=monto;

    }

    public void retirar(double monto){
        if(monto<=0){
            System.out.println("Monto invalido");

        }else if (monto>saldo) {
            System.out.println("Saldo insuficiente");
            
           
        }else{
            this.saldo -=monto;
        }
        
       

    }


    public double consultarSaldo(){
        return this.saldo;

    }


    public String MostrarDatos(){
        StringBuilder reporte=new StringBuilder();
        reporte.append(String.format("Numero de cuenta %s %n",getNumeroCuenta()));
        reporte.append(String.format("Titular : %s %n ",getTitular()));
        reporte.append(String.format("Saldo final : %.2f %n",getSaldo()));


        return reporte.toString();


    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    }




