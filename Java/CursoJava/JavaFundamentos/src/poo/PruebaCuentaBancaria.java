package poo;

import java.util.Scanner;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        
        int opcion;
        double deposito;
        double retiro;
        Scanner lector =new Scanner(System.in);
          CuentaBancaria cuenta1= new CuentaBancaria("12345","Juan", 1000);
          CuentaBancaria cuenta2=new CuentaBancaria("54321", "Lucas", 3000);
          CuentaBancaria cuenta3=new CuentaBancaria("6789", "Dani", 10000);
          System.out.println(lector);

          
          do {
         System.out.println("Ingrese una de las opciones");
          System.out.println("""
                  1-Depositar
                  2-Retirar
                  3-ConsultarSaldo
                  4-MostrarDatos
                  5_Salir
                  """);
                  
                  opcion=lector.nextInt();
                  switch (opcion) {

                    case 1:{
                        
                        System.out.println("Ingrese el monto que desea depositar");
                      deposito=lector.nextDouble();
                      cuenta1.depositar(deposito);
                      cuenta2.depositar(deposito);
                      System.out.printf("Se hizo un deposito de : %.2f %n su saldo actual es %.2f %n",deposito,cuenta1.getSaldo());

                    }   
                        break;
                    case 2:{
                        
                        System.out.println("Ingrese el monto que desea retirar");
                        retiro=lector.nextDouble();
                        cuenta1.retirar(retiro);
                        System.out.println(cuenta1.getSaldo());

                    }
                        
                        break;
                    case 3:{
                        System.out.printf("Saldo final :%.2f%n",cuenta1.consultarSaldo());
                    }
                        
                        break;
                    case 4:{
                        System.out.println(cuenta1.MostrarDatos());
                        System.out.println(cuenta2.MostrarDatos());
                        System.out.println(cuenta3.MostrarDatos());
                        
                    }
                
                        
                        break;
                  
                    default:{
                        System.out.println("Opcion incorrecta");
                    }
                        break;
                  }
                   } while (opcion!=5);

      
    }

}
