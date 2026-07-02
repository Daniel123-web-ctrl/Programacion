package poo;

public class MainCuentaBanco {
    public static void main(String[] args) {
    CuentaBanco cliente1 =new CuentaBanco("1001", "Juan Perez", 2000, 500, 100);
    CuentaBanco cliente2 =new CuentaBanco("1002", "JMaria Lopez", 2000, 300, 200);
    CuentaBanco cliente3 =new CuentaBanco("1003", "Carlos Diaz", 3000, 1000, 500);

    System.out.println(cliente1.verCuenta());
    System.out.println(cliente2.verCuenta());
    System.out.println(cliente3.verCuenta());
    System.out.println("Total de cuentas creadas: " + CuentaBanco.getTotalCuentas());
    }
}
