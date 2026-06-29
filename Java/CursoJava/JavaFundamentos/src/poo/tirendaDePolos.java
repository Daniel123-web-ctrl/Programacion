package poo;

import java.util.Scanner;

public class tirendaDePolos {
    public static void main(String[] args) {

Scanner lector= new Scanner(System.in);

ejercicio2(lector);

    }public static void ejercicio2(Scanner lector){

/*En la de la universidad, se necesita calcular el pago que debe hacer cada
de los comensales, se sabe que una persona puede consumir más de un menú y que
cada menú cuesta S/.12.00. Además se debe calcular el total recaudado de todos
los pagos hechos por los clientes y el menor pago realizado. El programa termina
cuando se ingresa una cantidad de platos negativa.*/


int cantPlatos=0;
double menorPago =0;
double totalPago=0 ;
double pagoComensal;
boolean primerPago =true;

do {

    
        System.out.println("Ingrese la cantidad de platos que desea consumir :");
    cantPlatos=lector.nextInt();
    if (cantPlatos >0) {
    pagoComensal=cantPlatos*12.00;
    System.out.printf("La persona pidio %d platos por lo que debera de pagar %.2f  soles %n",cantPlatos,pagoComensal);
    totalPago +=pagoComensal;
    
    if (primerPago) {
            menorPago = pagoComensal;
            primerPago = false;
        } else if (pagoComensal < menorPago) {
            menorPago = pagoComensal;
        }
    }else{
System.out.println("Finalizado");
    }

    
} while (cantPlatos >0 );

System.out.printf("El total recaudado es %.2f %n ",totalPago);
System.out.printf("El menor pago realizado es %.2f %n",menorPago);


    }
    public static void ejercicio1(Scanner lector){
        
 /*En una tienda de venta de polos, se ofrecen los siguientes precios:

Categoría        Precio
mujer           S/. 18.00
varón           S/. 20.50

Se atiende a varios clientes durante el día, por tanto en un proceso repetitivo
se ingresa la cantidad de polos que va a comprar y la categoría (mujer o varón), se desea calcular:
a) El monto a pagar por la compra.
b) Cuántos clientes pidieron polos de varón.
c) Cuántos clientes pidieron polos de mujer.
d) El mayor monto pagado.
e) El total recaudado por la tienda de todas las ventas.

El proceso repetitivo termina cuando se ingresa una categoría no válida. */


String categoria="";
 int cantidad;
 double gasto1 =0 , gasto2=0;
 int contadorVaron =0 ;
 int contadorMujer=0;
 double gastoTotal1=0,gastoTotal2=0,gastoTotalFinal=0;
 double mayorMonto =0;
 

        do {

            System.out.println("Ingrese su categoria ");
            categoria=lector.next();
            if (categoria.equalsIgnoreCase("mujer")) {
                System.out.println("Ingrese la  cantidad de polos que desea comprar");
                cantidad=lector.nextInt();
                gasto1=cantidad* 18.00;
                gastoTotal1+=gasto1;
                contadorMujer++;
                System.out.printf("Se compra %d polos y se paga %.2f soles %n",cantidad,gasto1);
                if (gasto1 >mayorMonto) {
                    mayorMonto=gasto1;
                }
                
            }else if (categoria.equalsIgnoreCase("varon")){
                System.out.println("Ingrese la cantidad de polos que desea comprar");
                cantidad=lector.nextInt();
                gasto2=cantidad*20.50;
                gastoTotal2 +=gasto2;
                 contadorVaron++;
                 System.out.printf("Se compra %d polos y se paga %.2f soles %n",cantidad,gasto2);
                if (gasto2 >mayorMonto) {
                    mayorMonto=gasto2;
                }
                

            }
            
        } while (categoria.equalsIgnoreCase("varon" ) || categoria.equalsIgnoreCase("mujer"));


        gastoTotalFinal=gastoTotal1 +gastoTotal2;

        
        System.out.printf("La cantidad de clientes que pidieron polo de varon son %d %n",contadorVaron);
        System.out.printf("La cantidad de clientes que pidieron polo de mujer son %d  %n",contadorMujer);
        System.out.printf("El mayor monto pagado es %.2f %n ",mayorMonto);
        System.out.printf("El total recaudado por la tienda de todas las ventas fue de  %.2f  soles%n",gastoTotalFinal);

        


    }
}
