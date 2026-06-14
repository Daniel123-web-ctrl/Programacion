package bucles;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BucleDeterminadoFor {                                                    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        ejercicio15(lector);
    }public static void ejercicio15(Scanner lector){
        
        
    /*En una boletería, se atienden varios turnos al día. 
    Por cada turno, se atiende a un número determinado de clientes.
     El programa debe registrar el tipo de boleto y mostrar 
     el monto recaudado por cada tipo de boleto y por turnos." */
     StringBuilder reporte =new StringBuilder();
    int turnos ,numeroClientes,tipoBoleta;
    final int GENERAL= 20, ESTUDIANTE= 10,VIP= 50;
    int recaudacion=0 ,recaudacionTotal=0,recaudacionFinal=0;;
    int contador1=0,contador2=0,contador3=0;
System.out.println("Ingrese la cantidad de turnos");
turnos=lector.nextInt();

for (int i = 0; i < turnos; i++) {
    System.out.println("Ingrese la cantidad de clientes");
    numeroClientes=lector.nextInt();
    recaudacionTotal=0;
    System.out.println("""
                1. General ($20)
                2. Estudiante ($10)
                3. VIP ($50)
               """);
    for (int j = 0; j < numeroClientes; j++) {
        System.out.printf("Ingrese el tipo de boleta del cliente %d %n",j+1);
       tipoBoleta=lector.nextInt();     
    switch (tipoBoleta) {
        case 1:{
            recaudacion=GENERAL;
            contador1 ++;
        }
            break;
        case 2:{
            recaudacion=ESTUDIANTE;
           contador2 ++;
        }
            break;
        case 3:{
            recaudacion=VIP;
            contador3 ++;
        }
            break;
        default:System.out.println("Solo ingrese una de las 3 opciones");
            break;
    }
   
recaudacionTotal +=recaudacion;
    }
    
    System.out.println(recaudacionTotal);
    recaudacionFinal +=recaudacionTotal;
}
System.out.printf("%d%n",recaudacionFinal);

}public static void ejercicio13(Scanner lector){
/*Actividad para la
Participación en Clase (PA)(FOR II)
Implementar 5 programas en Java para:
1. Resolver un problema que utilice una estructura for con
un contador interno progresivo .
2. Resolver un problema que utilice una estructura for
con un contador adicional y un acumulador .
3. Elaborar un programa que genere un reporte ASCII
utilizando la estructura repetitiva for .
4. Resolver un problema que utilice anidamiento entre
estructuras repetitivas.
5. Resolver un problema que utilice anidamiento entre
estructuras condicionales y repetitivas.
Nota: Los programas 1,2,3 deben incluir alguna estructura de control
revisada en clases previas. */
    }public static void ejercicio12(Scanner lector){
/* Escribir un programa para recoger los votos
de 10 personas que elegirán un color para
una campaña publicitaria. Los colores son:
celeste, morado y turquesa.
• Mostrar al final, cuántos votos obtuvo cada
color, su porcentaje y qué color resultó
elegido.
• Todo el reporte debe generarse y
almacenarse en una cadena utilizando
String.format()*/
StringBuilder reporte =new StringBuilder();
int  opcion =0;
String colorF="";

int contador1=0;
int contador2=0;
int contador3=0;
System.out.println("""
            1-celeste
            2-morado
            3-turquesa
            """);

for (int i = 0; i < 10; i++) {
    System.out.println("Ingrese la opcion segun el color que desee");
    opcion=lector.nextInt();
    switch (opcion) {
        case 1:
            contador1 ++;
          break;
        case 2:
             contador2 ++;
      break;
        case 3:
            contador3 ++;
        
            break;    
        default:{
            System.out.println("Solo ingrese una de esas 3 opciones");
        }
            break;
    }

}
if (contador1>contador2 && contador1>contador3) {
        colorF="celeste";
    
}else if (contador2>contador1 && contador2>contador3) {
    colorF="Morado";
}else if (contador3>contador1 && contador3>contador2){
   
    colorF="Turquesa";
}else{
    colorF="Empate";
}
reporte.append(String.format("El color celeste obtuvo %d %% %n",contador1*10));
reporte.append(String. format("El color morado obtuvo %d %% %n",contador2*10));
reporte.append(String. format("El color turquesa obtuvo %d %% %n",contador3*10));
reporte.append(String. format("El color que fue el mas elegido es %s %n",colorF));
 System.out.println(reporte);

    }public static void ejercicio11(Scanner lector){

        /*Escribir un programa para mostrar los N
primeros números de la serie de
Fibonacci, donde N es un valor entero
positivo ingresado por el usuario
(validar)
• Mostrar al final, la suma de los números
mostrados.
• Utilizar String.format() para acumular en
una cadena la serie de números a
mostrar. */
int N ;
int acumulador =0;
int nuevoNumero=0;
int suma=0;
System.out.println("Ingrese la cantidad de numeros que desee mostrar");
N=lector.nextInt();
for (int i = 0; i <N; i++) {


}

    }public static void ejercicio10(Scanner lector){
/*ver for ii• Elaborar un programa que permita ingresar
mediante un menú la información de un
empleado, su salario y sus boletas emitidas .
Opción 1: Se debe pedir el nombre y el tipo de empleado
(contratado o nombrado)reporte.append("#".repeat(40)+"\n");reporte.append("#".repeat(40)+"\n");
Opción 2: Se debe ingresar el salario mensual, número de
boletas emitidas y número de mes en curso .
Opción 3: Elaborar el reporte ASCII (validar que los datos
hayan sido ingresados)
• Utilizar String.format() para generar el reporte.
Almacene el reporte en una variable String. */


int salario=0,cantBoletas=0,numeroMes=0;
boolean opciones=true;
 int opcion;
 String tipoEmpleado="";
 String nombre="";
 String contratado="" ,nombrado="";
 String [] meses={"ENE","FEB","MAR","ABR"};
  String [] boletas={"SI","SI","SI","NO"};
do {
    System.out.println("""
            1-Ingresar datos
            2-Ingrese salario ,boleta y numero de mes en curso
            3-Mostrar reporte
            """);
    System.out.println("Ingrese una de las opciones");
    opcion=lector.nextInt();
    switch (opcion) {
        case 1:{
            System.out.println("Ingrese el nombre del empleado : ");
            nombre=lector.next();
            System.out.println("Ingrese el tipo de empleado (contratado /nombrado)");
            tipoEmpleado=lector.next();
            if (tipoEmpleado.equalsIgnoreCase("contratado")) {
                contratado ="X";
                nombrado="";
            }else{
                contratado ="";
                nombrado="x";
            }
        }
            break;
        case 2:{
            System.out.println("Ingrese el salario del empleado");
            salario=lector.nextInt();
            System.out.println("Ingrese la cantidad de boletas emitidas");
            cantBoletas=lector.nextInt();
            System.out.println("Ingrese el numero de mes en curso (0-12)");
            numeroMes=lector.nextInt();
        }
            
            break;
        case 3:{
            StringBuilder reporte=new StringBuilder();
            reporte.append("#".repeat(40)+"\n");
            reporte.append(String.format("RESUMEN DE BOLETAS DE PAGO "+"\n"));
            reporte.append("#".repeat(40)+"\n");
            reporte.append(String.format("Empleado : %s %n",nombre));
            reporte.append(String.format("Tipo : (%s)Contratado (%s) Nombrado %n",contratado,nombrado));
            reporte.append("#".repeat(40)+"\n");
            reporte.append(String.format("%-20s %-10s%n","Datos del Salario","Boleta"));
            for (int i = 0; i < meses.length; i++) {
            reporte.append(String.format("Salario %s : /$. %d  %-30s %n",meses[i],salario,boletas[i]));    
            }
            reporte.append("#".repeat(40)+"\n");
            reporte.append(String.format("Boletas emitidas : %d  Boletas restantes :%d %n",cantBoletas,1));
            reporte.append(String.format("Monto total pagados :%d %n",salario*4));
            reporte.append("#".repeat(40)+"\n");
            System.out.println(reporte);


        }
            
            break;
        default:System.out.println("Opcion invalida");
        opciones=false;
        
            break;
    }
    
} while (opciones);









    }public static void ejercicio9(Scanner lector){
 /*• Escribir un programa en Java para mostrar
los N primeros números de una progresión
aritmética o geométrica.
• El usuario determina el tipo de progresión,
y proporciona el valor inicial, la razón y el
número de términos a generar.
• La serie de números debe acumularse en
una cadena utilizando String.format() antes
de mostrar la progresión. */
 














    }
    public static void ejercicio8(Scanner lector){
        //verificar si un correo electronico  tiene el arroba 
        String correo=JOptionPane.showInputDialog("Ingrese un correo");
        boolean arroba=false;
        for(int i=0;i<correo.length();i++){
            if(correo.charAt(i)=='@'){
                arroba=true;
                
                
            }
              
        }

        if(arroba){
                    JOptionPane.showMessageDialog(null, "Si tiene arroba");
                arroba=true;
                }else{
                    JOptionPane.showMessageDialog(null, "No tiene");
                }


    }
    public static void ejercicio7 (Scanner lector){
        //Calcula el factorial de N usando un for. Por ejemplo, factorial(5) = 5×4×3×2×1 = 120.
        int n=0;
        int factorial=1;
        System.out.println("Ingrese el numero");
        n=lector.nextInt();
        for(int i=n;i>=1;i--){
        factorial *=i;
                }
          System.out.println(factorial);

    }
    public static void ejercicio6 (Scanner lector){
        //Dada la palabra "Python", usa un for para imprimir cada letra en una línea separada.
        String palabra="java";
        for(int i=0;i<=palabra.length();i++){
            System.out.println(palabra.charAt(i));
        

        }
    }
    public static void ejercicio5 (Scanner lector){
/*Usa for anidados para imprimir una pirámide de asteriscos de N filas. Con N=4:
★
★★
★★★
★★★★ */
for(int i=1;i<=4;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
 System.out.println();
}
    }
    public static void ejercicio4 (Scanner lector){
        /*Del 1 al 30: si el número es divisible entre 3 imprime 'Fizz', 
        si lo es entre 5 imprime 'Buzz', si lo es entre ambos 'FizzBuzz',
         y si no, el número.*/
      
          for(int i=1;i<=30;i++){
            if(i%3==0 && i%5==0){
                System.out.printf("%d es FizzBuzz\n",i);
            }else if (i%3==0){
                System.out.printf("%d es Fizz\n",i);

            }else if(i%5==0){
                System.out.printf("%d es Buzz\n",i);
            }else{
                System.out.println(i);
            }
          }

    }
    public static void ejercicio3 (Scanner lector){

        //Recorre los números del 1 al 20 con for. Imprime 'par' si es par e 'impar' si no lo es, junto al número.
    for(int i=1;i<=20;i++){
        if(i%2==0){
            System.out.printf("%d es par\n",i);

        }else{
            System.out.printf("%d es impar\n",i);
        }

    }
    }
    
    public static void ejercicio2 (Scanner lector){
//Pide un número al usuario e imprime su tabla de multiplicar del 1 al 10.
int numero;

System.out.println("Ingrese el numero que desee multiplicar");
numero=lector.nextInt();
for(int i=1;i<=10;i++){
    
    System.out.printf("%d * %d = %d\n",numero,i,i*numero);
}
    }
    public static void ejercicio1 (Scanner lector){
        for(int i=1; i<=10;i++){
            System.out.println(i);
        }
        
    }
}