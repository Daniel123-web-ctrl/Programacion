package bucles;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import poosemana12.Estudiante;

public class BucleIndeterminadoDoWhile {
    static final int  NOTAS=3; 
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Estudiante estudiante1=new Estudiante();
        ejercicio21(lector);

    }public static void  ejercicio23(Scanner lector){
/*Implementar 5 programas en Java para:
• Resolver un problema que utilice una estructura do-while usando un contador progresivo.
• Resolver un problema que utilice una estructura do-while usando un contador regresivo.
• Resolver un problema que utilice una estructura do-while usando un acumulador progresivo.
• Resolver un problema que utilice una estructura do-while usando un acumulador y un
contador.
• Elaborar un programa que muestre un menú de 5 opciones y cada opción permita resolver
algún ejercicio desarrollado en alguna tarea previa. */

    }public static void  ejercicio22(Scanner lector){
/* Escribir un programa en Java para convertir un número de
base decimal a binario, aplicando el método de divisiones
sucesivas.*/

    }public static void  ejercicio21(Scanner lector){
        /*Una empresa almacena los datos de N empleados ,para esto ,en un proceso repetitivo
        se ingresa el sexo y el salario de cada empleado .Se pide calcular  :
        -La cantidad de personas que ganan  mas de 700 al mes
        -El promedio de salarios
        -El porcentaje de mujeres que trabajan en esa empresa
        -El porcentaje de varones que trabajan en esa empresa
        
        */
 int numeroDeEmpleados; 
double promedioSueldos=0;
 int contadorSueldoAlto=0,contadorSexoM=0,contadorSexoF=0;
 String sexo ="";
int sumaSueldos=0;
 numeroDeEmpleados =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados"));
 
 int [] sueldos=new int[numeroDeEmpleados];

for (int i = 0; i < numeroDeEmpleados; i++) {
    System.out.printf("Ingrese sueldo del empleado %d ",i+1);
    sueldos[i]=lector.nextInt();
    if (sueldos[i]>700) {
 contadorSueldoAlto++;       
    }
    System.out.printf("Ingrese sexo del empleado :");
    sexo =lector.next();
    if (sexo.equalsIgnoreCase("m")) {
        contadorSexoM++;
        
    }else if(sexo.equalsIgnoreCase("f")){
        contadorSexoF++;
    }
    sumaSueldos +=sueldos[i];
}
  promedioSueldos=sumaSueldos/numeroDeEmpleados;

System.out.printf("La cantidad de peronas que ganan sueldo mas de 7000 es %d%n",contadorSueldoAlto);
System.out.printf("El promedio de sueldos de todos los empleados es : %.2f%n",promedioSueldos);
System.out.printf("EL porcentaje de las mujeres que trabajan en la empresa es %.2f%n",(double)contadorSexoF/100);
System.out.printf("EL porcentaje de las varones que trabajan en la empresa es %.2f%n",(double)contadorSexoM/100);
    }public static void  ejercicio20(Scanner lector){
/*Hacer un algoritmo  que lea N  consumos  de un restaurante ,
si el consumo ingresado excede los 70 soles ,el descuento sera de 5%.Muestre todos los pagos hechos  */

   int cantidad;
double  consumo;
double descuento =0;


cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de consumos que se realizo"));
    double [] consumos =new double[cantidad];

for (int i = 0; i < cantidad; i++) {
 
    consumo =Double.parseDouble(JOptionPane.showInputDialog(String.format("Ingrese el consumo %d",i+1)));
 
 
 if (consumo>70) {
descuento=consumo*0.05;
consumo=consumo-descuento;    
 }
consumos[i]=consumo;
 
}

String  mensaje ="";

for (int i = 0; i < cantidad; i++) {
    mensaje +=String.format("El consumo de %d es %.2f pagara : %.2f%n",i+1,consumos[i],consumos[i]);
    
}
JOptionPane.showMessageDialog(null, mensaje);

    }public static void  ejercicio19(Scanner lector){
         double promedio=0;
         int [] notas =new  int[NOTAS];
         int sumaNota=0;
         for (int i = 0; i < NOTAS; i++) {

            do { 
                System.out.printf("Ingrese la nota %d del alumno ",i+1);
            notas[i]=lector.nextInt();
                
             sumaNota +=notas[i];
            } while (notas[i]>=20 || notas[i] <=0);
            
            
         }
         promedio=sumaNota/3;               
        if (promedio >10) {
            System.out.println("APROBADO");
            
        }else{
            System.out.println("DESAPROBADO");
        }

    }public static void  ejercicio18(Scanner lector){
           double nota =0;
           int contadorAprobado=0;
           int contadorDesaprobado=0;
        do {
            System.out.println("Ingrese nota (0-20) ");
            nota=lector.nextInt();
            if (nota >20 || nota <0) {
                System.out.println("Nota fuera de rango");

            }else{
                if (nota >=12 ) {
                    contadorAprobado++;
                }else{
                    contadorDesaprobado++;

                }
            }
            
        } while (nota>= 0 && nota<=20 );
          System.out.printf("Alumnos aprobados : %d %n ",contadorAprobado);
          System.out.printf("Alumnos desaprobados : %d %n ",contadorDesaprobado);

    }
    public static void  ejercicio17(Scanner lector){

        String usuario="",contrasena="",codigo="";
        Pattern patronUsuario=Pattern.compile("^[A-Za-z0-9]+$");
        Pattern patronContrasena=Pattern.compile("^[A-Za-z0-9]{8,}$");
        Pattern patronCodigo=Pattern.compile("^[A-Za-z0-9]{6}$");
         int intentos=3,opcion=0;
         boolean valido=false,salir=false;
         while (!valido) {
            System.out.println("Ingrese  usuario : ");
            usuario=lector.next();
            System.out.println("Ingrese contrasena : ");
            contrasena=lector.next();
            System.out.println("Ingrese codigo : ");
            codigo=lector.next();
            Matcher evaluarUsuario=patronUsuario.matcher(usuario);        
            Matcher evaluarContrasena=patronContrasena.matcher(contrasena);
            Matcher evaluarCodigo=patronCodigo.matcher(codigo);
            if (evaluarUsuario.matches()  &&evaluarContrasena.matches() &&evaluarCodigo.matches()) {
                do {
                    System.out.println("Ingrese una de las opciones :");
                    System.out.println("""
                                       1:Registrar productos
                                       2: Mostrar productos registrados
                                       3: Generar factura
                                       4: Ingresar ventas hasta superar S/10000
                                       5:Salir
                            """);
                    opcion=lector.nextInt();
                    switch (opcion) {
                        case 1:{

                           // String []nombre={"laptop","teclado","mouse"};
                            //int [] cantidad ={1,2,3};
                            //int[]precio ={1000000,300,200};
                            //int []total =new int[3];


                        }
                            
                            break;
                        case 2:{
                            StringBuilder factura =new StringBuilder();
                            factura.append(String.format("Productos registrados:%s%s%s\n","Laptop","Teclado","Mouse"));
                            System.out.println(factura);
                        
                        }
                            
                            break;
                        case 3:{
                            StringBuilder factura = new StringBuilder();
                             int gastoTotal=0;
                             double igv=0,descuento=0,pagoFinal;
                            String []nombre={"laptop","teclado","mouse"};
                            int [] cantidad ={1,2,3};
                            int[]precio ={1000000,300,200};
                            int []total =new int[3];
                            
        System.out.println(igv);
                            factura.append("=".repeat(60)+"\n");
                            factura.append(String.format("%-20s%-10s%-10s%-10s\n","NOMBRE","CANTIDAD","PRECIO","TOTAL"));
                            factura.append("=".repeat(60)+"\n");
                            for (int i = 0; i < cantidad.length; i++) {
                                total[i]=cantidad[i]*precio[i];
                                factura.append(String.format("%-20s%-10d%-10d%-10d\n",nombre[i],cantidad[i],precio[i],total[i]));
                               gastoTotal+=total[i];   
                               
                            }
                           factura.append("=".repeat(60)+"\n");
                           igv=gastoTotal*0.18;
                           if (gastoTotal>5000) {
                            descuento=gastoTotal*0.1;
                            pagoFinal=gastoTotal-descuento;
                            factura.append(String.format("El total a pagar sera :%.2f\n",pagoFinal));
                           }else if(gastoTotal>10000){
                            descuento=gastoTotal*1.5;
                            pagoFinal=gastoTotal-descuento;
                            factura.append(String.format("El total a pagar sera :%.2f\n",pagoFinal));


                           }else{
                            pagoFinal=gastoTotal;
                            factura.append("No se le aplica ningun descuento");
                            factura.append(String.format("El total a pagar sera :%.2f\n",pagoFinal));

                           }  
                          System.out.println(factura);
                        }
                            
                            break;
                        
                        case 4:{
                            System.out.println("FINALIZANDO");

                        }
                            
                            salir=true;
                            break;
                            

                        default:{
                            System.out.println("Solo ingrese opciones correctas");
                        }
                            break;
                    }
                    
                } while (!salir);

                
            }else{
                intentos--;
                if (intentos==0) {
                    System.out.println("Limite de intentos alcanzado\nTarjeta Bloqueada");
                    valido=true;
                }
            }

         }

    }
    public static void  ejercicio16(Scanner lector){
        boolean finalizar=true;
        double promedio=0,suma=0 , monto=0 ,acumulador=0;
        System.out.println(suma);
        int contador=0;
        while(!finalizar){
            System.out.println("Ingrese el monto de venta realizada");
            monto=lector.nextDouble();
            if (monto==0){
                finalizar=true;
            }else{
                if (monto<0){
                    System.out.println("Solo ingrese numeros positivos");
                }else{
                    contador++;
                    acumulador=acumulador+monto;
                    
                }
            }
        }

        promedio=acumulador/contador;
        System.out.printf("El promedio  es %.2f\n",promedio);
    
    }public static void  ejercicio15(Scanner lector){
  String usuario= "" , PIN ="";
  int intentos =3;
  boolean valido =false;

  Pattern patronUsuario = Pattern.compile("^[A-za-z0-9]{5,12}$");
  Pattern patronPIN = Pattern.compile("^1234$");
  while(!valido){
   System.out.println("*".repeat(18)+"Ingrese su usuario"+"*".repeat(18));
   usuario=lector.next();
   System.out.println("*".repeat(19)+"Ingrese su PIN"+"*".repeat(19));
   PIN= lector.next();

   Matcher evaluarUsuario =patronUsuario.matcher(usuario);
   Matcher evaluarPIN = patronPIN.matcher(PIN);

   if(evaluarUsuario.matches() && evaluarPIN.matches()){
    System.out.println("Sesion iniciada correctamente");
    valido=true;

   }else{
    System.out.println("Credenciales incorrectas");
    intentos--;
    System.out.printf("Le quedan %d intentos\n",intentos);
    if(intentos==0){
        System.out.println("Acceso bloqueado contacte al administrados");
        valido=true;
    }

   }
  }

    }
    public static void  ejercicio13(Scanner lector){
  String expresion ="" ,primeraLetra="",segundaLetra="";
 int contador=1 ;
 String acumulador="";
 boolean valido=false ,permitido=true;
 int numero=0;
Pattern patronExpresion=Pattern.compile("^[a-z]{2}=[1-9]$");

System.out.println(numero);

 do{
System.out.println("Ingrese la expresion");
expresion=lector.next();

Matcher evaluarExpresion=patronExpresion.matcher(expresion);
if (evaluarExpresion.matches()){
    while(permitido){
        
System.out.printf("La expresion es %s\n",expresion);
primeraLetra=""+ expresion.charAt(0);
System.out.printf("La primera letra es %s\n",primeraLetra);
segundaLetra=""+ expresion.charAt(1);
numero=Integer.parseInt(""+expresion.charAt(3));
 
 contador++;
 if(contador%2!=0){
    acumulador=acumulador+primeraLetra;


 }else{
    acumulador=acumulador+segundaLetra;
 }

    }
    valido=true;
}else{
    valido=true;
}

 }while(!valido);

    }
    public static void  ejercicio12(Scanner lector){
String usuario="" , contrasena="" ,pin="";
int intentos = 3 ,opcion=0 , deposito=0,retiro=0 ,saldo=0,option=0;
boolean valido= false,salir=false , bloqueado=false , validar=false;
Pattern patronUsuario=Pattern.compile("^[A-Za-z0-9]+$");
Pattern patronContrasena=Pattern.compile("^[A-Z]+[a-z]+[0-9]+$");
Pattern patronPin=Pattern.compile("^[A-Za-z0-9]+$");

System.out.println("=".repeat(15)+"MENU PRINCIPAL "+"=".repeat(15));
System.out.println("Ingrese el tipo de acceso que desee ");
System.out.println(""" 
      1-Ingresar como ADMIN
      2-Ingresar como USUARIO
      3-Salir  """);
        System.out.println("=".repeat(45));
        option=lector.nextInt();
        switch (option) {
            case 1:{
                while(!valido){
                    System.out.println("Ingresaste como ADMIN");
                    System.out.println("Ingrese usuario");
                    usuario=lector.next();
                    System.out.println("Ingrese contrasena");
                    contrasena=lector.next();
                    
                    Matcher evaluarUsuario=patronUsuario.matcher(usuario);
                    Matcher evaluarContrasena=patronContrasena.matcher(contrasena);

                    if(evaluarUsuario.matches() && evaluarContrasena.matches()){
                        do {
                        System.out.println("=".repeat(17)+"MENU ADMIN"+"=".repeat(17));
                        System.out.println("Ingrese la opcion que desee");
                        System.out.println("""
                                1-Depositar dinero al sistema
                                2-Retirar dinero del sistema
                                3-Ver saldo actual
                                4-Reiniciar saldo del usuario
                                5-Bloquear cuenta del usuario
                                6-Salir
                                """);
                                System.out.println("=".repeat(45));
                        opcion=lector.nextInt();
                        switch (opcion) {
                            case 1:{
                                System.out.println("Ingrese el monto que desea depositar");
                                deposito=lector.nextInt();
                                if(deposito<0){
                                    System.out.println("Solo se perimite depositos positivos");
                                    System.out.println("Ingrese nuevamente");
                                }else{
                                saldo=saldo+deposito;
                            }
                            }
                                
                                break;
                            case 2 :{
                                System.out.println("Ingrese el monto que desee retirar");
                                retiro=lector.nextInt();
                                if(retiro>saldo){
                                    System.out.println("Saldo insuficiente");
                                    System.out.println("No se puede realizar el retiro");
                                }else{
                                saldo=saldo-retiro;
                                }
                            }
                                
                                break;
                            case 3:{
                                System.out.printf("Su saldo actual es %d\n",saldo);

                            }
                                
                                break;
                            case 4:{
                                saldo=0;
                                System.out.printf("Su saldo se reinicio y ahora tiene %d \n",saldo);
                            }
                                
                                break;
                            case 5:{
                                bloqueado=true;
                                if(bloqueado){
                                    System.out.println("Su cuenta esta bloqueada");
                                }else{

                                }

                            }
                                
                                break;
                            case 6:{
                                System.out.println("Saliendo");
                                salir=true;
                            }
                                
                                break;
                        
                            default:{
                                System.out.println("Opcion incorrecta ");
                                System.out.println("solo ingrese la opcion(1-6) ");
                            }
                                break;
                                
                        }
                            
                        } while (!salir);
                        valido=true;
                    }

                }
            }
                
                break;
            case 2:{
                System.out.println("Ingresaste como USUARIO");
                while(!validar){
                System.out.println("Ingrese PIN");
                pin=lector.next();
                
                Matcher evaluarPin=patronPin.matcher(pin);
                if(evaluarPin.matches()){
                    System.out.println("=".repeat(17)+ "MENU USUARIO" +"=".repeat(17));
                    System.out.println("Ingrese una opcion que desee");
                    System.out.println("""
                                    1-Depositar dinero
                                    2-Retirar dinero
                                    3-Consultar saldo
                                    4-Salir
                            """);
                            System.out.println("=".repeat(46));
                            opcion=lector.nextInt();
                            switch (opcion) {
                                case 1:{
                                    System.out.println("Ingrese el monto que desea depositar");
                                    deposito=lector.nextInt();
                                    if(deposito<0){
                                        System.out.println("Es deposito no retiro ");

                                    }else{
                                    saldo=saldo+deposito;
                                    }
                                }
                                    
                                    break;
                                case 2:{
                                    System.out.println("Ingrese cuanto de dinero desea retirar");
                                    retiro=lector.nextInt();
                                    if(retiro>saldo){
                                        System.out.println("Dinero insuficiente");
                                        
                                    }else{
                                    saldo=saldo-retiro;
                                    }
                                }
                                    
                                    break;
                                case 3:
                                    System.out.printf("Su saldo actual es %d\n",saldo);
                                    break;
                                case 4:{
                                    System.out.println("Saliendo");
                                    validar=true;
                                }
                                    
                                    break;
                            
                                default:
                                    break;
                            }
                    
                }else{
                    intentos--;
                    if(intentos==0){
                        System.out.println("Tarjeta bloqueada");
                        validar=true;
                    }
                }
                }
            }
                
                break;
            case 3:
                System.out.println("Programa finalizado");
                valido=true;
                
                break;
        
            default:{
                System.out.println("Opcion Incorrecta\n Intente nuevamente");
            }
                break;
        }

    }
    public static void  ejercicio11(Scanner lector){
        /*Crea un programa que simule un cajero automático simple. Primero pide al usuario un PIN de 4 dígitos, con máximo 3 intentos.
         El PIN debe ser exactamente 4 números. Si falla los 3 intentos, el programa termina; si es correcto, entra al sistema.

Dentro del sistema muestra un menú que se repite: 
1) Depositar dinero (solo aceptar montos positivos), 
2) Retirar dinero (no permitir retirar más de lo que hay en saldo), 
3) Consultar saldo,
 4) Ingresar varios montos hasta que el saldo supere 500 (ignorar montos negativos y contar cuántos válidos ingresó), 
 5) Salir.
 El saldo inicial empieza en 0 y debes ir actualizándolo según las operaciones. El programa sigue funcionando hasta que el usuario elija salir. */

String pin="";
int intentos=3,monto=0,deposito=0 ,opcion=0,saldoFinal=0 ,retiro=0 , saldoInicial=0;
boolean valido=false ,salir=false ,validar=false;
Pattern patronPin=Pattern.compile("^[0-9]{4}$");

while (!valido) {
    System.out.println("Ingrese el PIN ( solo 4 digitos)");
    pin=lector.next();
    Matcher evaluarPin =patronPin.matcher(pin);
    if(evaluarPin.matches()){
        
        while(!salir){
            System.out.println("Ingrese la opcion que dese");
            System.out.println("""
                    1-Depositar dinero
                    2-Retirar dinero
                    3-Consultar saldo
                    4-Ingresar varios montos hasta que el saldo supere los 500
                    5-Salir
                    """);
            opcion =lector.nextInt();
          switch (opcion) {
            case 1:{
                validar=false;
                while (!validar) {
                
                System.out.println("Ingrese el monto que desea depositar\n");
                deposito=lector.nextInt();
                if(deposito>0){
                    saldoFinal=saldoInicial+ deposito;
                    System.out.printf("Se realizo un deposito de %d \n ",deposito);
                    System.out.printf("Tu saldo ahora es de :%d\n ",saldoFinal);
                    saldoInicial=saldoFinal;
                    validar=true;
                }else{
                    System.out.println("Monto no puede ser negativo \n Intente nuevamente \n");
                }
            }
        
    }
                break;
            case 2:{
                System.out.println("Ingrese el monto que desea retitar\n");
                retiro=lector.nextInt();
                if(retiro>saldoInicial){
                    System.out.println("No tiene suficiente saldo para realizar esta operacion\n");
                }else{
                    saldoFinal=saldoInicial-retiro;
                    System.out.printf("Usted realizo un retiro de %d soles\n",retiro); 
                    System.out.printf("Usted tiene un saldo de %d\n",saldoFinal);
                    saldoInicial=saldoFinal;

                    saldoInicial=saldoFinal;
                }
            }
                
                break;
            case 3:{
                System.out.printf("Usted tiene actualmente un saldo de %d\n",saldoInicial);

            }
                
                break;
            case 4 :{
                do {
                    System.out.println("Ingrese el monto que desee\n");
                    monto=lector.nextInt();
                    saldoFinal=saldoInicial+monto;
                    
                } while (saldoFinal<=500);
                System.out.printf("usted tiene un saldo total de %d soles\n",saldoFinal);
            }
                
                break;  
            case 5 :{
               System.out.println("PROGRAMA FINALIZADO");
               validar=true;
               valido=true;
               salir=true;

            }   
            break;         
            default:{
                System.out.println("Opcion Incorrecta \n Intente nuevamente");
            }
                break;
          }          
        }
    }else{
        System.out.println("numero de PIN incorrecto \n");
        intentos--;
        System.out.printf("Le quedan %d intentos \n",intentos);
        if(intentos==0){
            System.out.println("Limite de intentos alcanzado\n");
            valido=true;
        }
    }
    
}

    }public static void  ejercicio10(Scanner lector){

        String correo ="" , contrasena ="" , dni="" , contrasenaNueva="";
        int intentos = 3 ,suma=0,opcion =0,contador =0, numero=0;
        boolean valido=false ,salir=false ,validar=false;
       
        Pattern patronCorreo =Pattern.compile("^[A-Za-z]{1,}@[a-z]{1,}\\.[a-z]{1,}$");
        Pattern patronContrasena =Pattern.compile("^[A-Za-z0-9]{8,}$");
        Pattern patronDNI =Pattern.compile("^[0-9]{8}$"); 
        Pattern patronContrasenaNueva=Pattern.compile("^[A-Za-z0-9]{8,}$");
         while(!valido){
            System.out.println("Ingrese correo");
            correo=lector.next();
            System.out.println("Ingrese contrasena"); 
            contrasena=lector.next();
            System.out.println("Ingrese su DNI :");
            dni=lector.next();

            Matcher evaluarCorreo=patronCorreo.matcher(correo);
            Matcher evaluarContrasena=patronContrasena.matcher(contrasena);
            Matcher evaluarDni=patronDNI.matcher(dni);

            if(evaluarCorreo.matches() && evaluarContrasena.matches() && evaluarDni.matches()){
                while(!salir){
                       System.out.println("Elige una opcion");
                       System.out.println("""
                               1-Cambiar contrasena
                               2-Mostrar datos
                               3-Ingrese numeros hasta que la suma supere los 100
                               4-Salir
                               """);
                    opcion=lector.nextInt();

                    switch (opcion) {
                        case 1:{
                            
                            System.out.printf("Su contrasena es %s\n ",contrasena);
                            while(!validar){
                            System.out.println("Ingrese contrasena nueva\n");
                            contrasenaNueva=lector.next();

                            Matcher evaluarcontrasenaNueva=patronContrasenaNueva.matcher(contrasenaNueva);

                            if(evaluarcontrasenaNueva.matches()){
                                System.out.printf("Su contrasena nueva es %s \n",contrasenaNueva);
                                contrasena=contrasenaNueva;
                                validar=true;
                            
                            }else{
                                System.out.println("Ingrese contrasena correcta\n");
                            }
                        
                        }


                        }
                            break;
                        case 2:{
                                 System.out.printf("Su correo es %s \n",correo);
                                 System.out.printf("Su contrasena es %s \n",contrasenaNueva);
                                 System.out.printf("Su DNI es  %s \n",dni);

                        }
                            
                            break;

                        case 3:{
                            do{
                                System.out.println("Ingrese un numero");
                                numero=lector.nextInt();
                                if(numero<0){
                                    System.out.println();
                                }
                                 suma=suma+numero;
                                 contador++;

                            }while(suma<100);
                            System.out.printf("La suma total es %d \n ",suma);
                            System.out.printf("Se ingresaron %d  numeros\n ",contador);
                        }
                            
                            break;
                        case 4  :{
                                 System.out.println("Programa Finalizado");
                                
                        }
                        salir=true;
                                 valido=true;
                            
                            break;        
                        default:{
                            System.out.println("Opcion incorrecta");
                        }
                            break;
                    }
                }
               

            }else{

                intentos--;
                System.out.printf("Te quedan %d intentos\n ",intentos);
                if(intentos==0){
                    System.out.println("Limite de intentos alcanzado");
                    valido=true;
                }
        
            }
        
        }

}public static void  ejercicio9(Scanner lector){
String correo ="", contrasena ="";
int  opcion=0;
int intentos=3;
boolean valido = false,salir=false;
Pattern patronCorreo =Pattern.compile("^[A-Za-z]+@[a-z]+\\.[a-z]{2,}$");
Pattern patronContrasena = Pattern.compile("^([A-Z][a-z][0-9]){1,}$");
 
while(!valido){
    System.out.println("Ingrese el correo ");
    correo=lector.next();
    System.out.println("Ingrese la contrasena");
    contrasena=lector.next();
    

    Matcher evaluarCorreo=patronCorreo.matcher(correo);
    Matcher evaluarContrasena=patronContrasena.matcher(contrasena);

    if (evaluarCorreo.matches() && evaluarContrasena.matches()){
       while (!salir) {
             System.out.println("Elige una opcion:");
        System.out.println("""
                1-Cambiar contrasena
                2-Mostrar correo ingresado
                3-salir
                """);
                
        opcion=lector.nextInt();
        switch (opcion) {
            case 1:System.out.println("cambiar contrasena");
                
                break;
            case 2:System.out.printf("el correo es %s \n",correo);
                
                break;
            case 3:System.out.println("Programa finalizado");
                salir=true;
                valido=true;
                break;
            default:
                System.out.println("opcion invalida\n Ingrese nuevamente \n");
                break;
        }
            
        }
        
        
        valido=true;
    }else{
    intentos--;
    System.out.printf("Contrasena o correo incorrecto\n te quedan : %d intentos\n",intentos);
    if (intentos==0){
        System.out.println("Te quedaste sin intentos");
        valido=true;
    }
    }
}


    }
    public static void  ejercicio8(Scanner lector){
        int numero =0 , suma=0,contador=0;
        boolean valido=true;
        while (valido){
            System.out.println("Ingrese un numero");
            numero=lector.nextInt();
            if(numero<0){
                System.out.println("ERROR");
    
            }else{
                contador++;
                suma=suma+numero;
            }
            if (suma>100){
                valido=false;
            }
            
        }
        System.out.printf("La suma total es %d \n",suma);
        System.out.printf("se sumaron %d numeros ",contador);
        

    }
    public static void  ejercicio7(Scanner lector){
int nota =0 ,contador=1 ,aprobado=0 , desaprobado =0;
double promedio =0 ,suma =0;
boolean valido =true;
System.out.println(valido);
while(valido=true ){
    System.out.println("Ingrese una nota (0-20)");
    nota=lector.nextInt();
    if(nota ==-1){
        System.out.println("terminado");
        valido =false;
    }else{
    if( nota >20 || nota <0){
        System.out.println("Ingrese nota valida");
    
    }else{
        contador++;
        suma =suma+nota;

        if (nota>=11){
            aprobado++;
        }else{
            desaprobado++;
        }
    }

}
}
 promedio =suma/(contador-1);
 System.out.printf("El promedio general es%.2f\n",promedio);
System.out.printf("Aprobados %d \n",aprobado);
System.out.printf("Desaprobados %d",desaprobado);
    }

    public static void  ejercicio6(Scanner lector){
        int aprobado=0 ,desaprobado=0;
        int nota=0;
        int suma=0;
        int contador=0;
        double promedio=0;
        String respuesta="";
        while(!respuesta.equalsIgnoreCase("NO")){
            System.out.printf("ingrese la nota del estudiante %d\n",contador+1);
            nota=lector.nextInt();
            if (nota!=1){
            contador++;

                suma=suma +nota;
            if(nota>10){
                aprobado++;
            }else{
                desaprobado++;
            }
        }
         
            
            System.out.println("Desea continuar (SI/NO)");
            respuesta=lector.next();
            if(respuesta.equalsIgnoreCase("NO")){
                System.out.println("programa terminado");
                 nota=-1;
            }else if(respuesta.equalsIgnoreCase("SI")){
                
            }else{
                System.out.println("solo escribe (SI/NO)");
                respuesta=lector.next();
            }
       
        }
            promedio=(double)suma/contador;
            System.out.printf("El promedio global es %.2f\n",promedio);
            System.out.printf("El numero de aprobados es %d\n",aprobado);
            System.out.printf("El numero de desaprobados es %d\n",desaprobado);
       
    }
    public static void  ejercicio5(Scanner lector){
       int opcion =0;
       int sueldoMensual =0 , contador=0;
       String nombre ="";
       String apellido ="";
       boolean valido =false;
       Pattern patronNombre = Pattern.compile("^[A-Za-z]+$");
       Pattern patronApellido = Pattern.compile("^[A-Za-z]+$");
    do {
         System.out.println("""
                 MENU DE OPCIONES
                 1.Ingresar empleado
                 2.Ingresar salario mensual
                 3.Emitir boleta
                 4.Salir
                 """);
                 while (!valido) {
       
      System.out.println("Ingrese el nombre del empleado");
      nombre = lector.next();
      System.out.println("Ingrese su apellido");
      apellido=lector.next();
         Matcher evaluarNombre =patronNombre.matcher(nombre);
       Matcher evaluarApellido = patronApellido.matcher(apellido);
      if(evaluarNombre.matches()==true && evaluarApellido.matches() ==true){
        System.out.println("CONTINUE");
     valido=true;
      }else{
        System.out.println("INGRESE NUEVAMENTE");
      }
      
     System.out.println("Ingrese su sueldo ");
     sueldoMensual = lector.nextInt();
   
    System.out.printf("su sueldo en %d  es  %d \n",contador ,sueldoMensual);
contador++;
   
    }

        
    } while(opcion==4);        

      }  public static void  ejercicio4(Scanner lector){
 String genero = "";
 int altura=0;
 double pesoIdeal=0;

 do { 
    altura= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura"));
    genero=JOptionPane.showInputDialog("Ingrese su genero");
    if(genero.equalsIgnoreCase("H")){
     pesoIdeal=altura-110;
    }else{
        pesoIdeal=altura-120;
    }
JOptionPane.showMessageDialog(null, "Su peso ideal es "+ pesoIdeal);
    
 } while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
   


    }
    public static void  ejercicio3(Scanner lector){
   int pesoIdeal = 0;
   int altura =0;
   String genero ="" ,respuesta="";
   boolean valido =false;
Pattern patronGenero =Pattern.compile("^[MFmf]$");

 while (!valido) {
    
    System.out.println("Ingrese su altura");
     altura=lector.nextInt();
     System.out.println("Ingrese su genero");
     genero=lector.next();

      Matcher evaluarGenero = patronGenero.matcher(genero);
      if(evaluarGenero.matches()){
         if(genero.equalsIgnoreCase("M")){
               pesoIdeal=altura-110;
        System.out.printf("El usuario es de genero %s y su peso ideal es %d\n",genero,pesoIdeal);
         }else{
            pesoIdeal=altura-120;
            System.out.printf("El usuario es de genero %s y su peso ideal es %d\n",genero,pesoIdeal);
         }
         System.out.println("Desea continuar? (SI/NO)");
          respuesta=lector.next();
          if (respuesta.equalsIgnoreCase("NO")) {
            valido=true;
          }else if (respuesta.equalsIgnoreCase("SI")){


          }else{
            System.out.println("RESPUESTA NO DEFINIDA");
          }
        }
      
 }
    }
     
    public static void  ejercicio2(Scanner lector){
    /* Elaborar un programa donde nos pida la altura en cm y nuestro genero  y que en funcion de la altura  y el genero nos diga cual es nuestro peso ideal*/

    double altura = 0;
    String genero="";
    double pesoIdeal =0;  
    boolean salir=false;

    do{
    altura=Double.parseDouble(JOptionPane.showInputDialog("ingrese su altura"));

    genero = JOptionPane.showInputDialog("Ingrese su genero (H/M)");

    if (genero.equalsIgnoreCase("M")){
        pesoIdeal = altura - 110;
    }else if (genero.equalsIgnoreCase("F")){
        pesoIdeal=altura-120;
    } else{
        JOptionPane.showMessageDialog(null, "Genero incorrecto");
    }
    
  JOptionPane.showMessageDialog(null, "Tu peso ideal es: " + pesoIdeal);

    int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?");
    
    if (opcion == JOptionPane.NO_OPTION) {
        salir = true;
    }

} while (!salir);


    }
    public static void  ejercicio1(Scanner lector){
int aleatorio = (int) (Math.random()*100);  // Aqui el math random toma cualuier numero aleatoriamente pero en decimales,por eso se le multiplica por 100  y como es decimal y quizas llegue a ser 0 osea tiene que entrar aunquesea una vez al while por eos se usa el DO while

int intentos=0;
int numeroUsuario=0     ;
do {
    String input = JOptionPane.showInputDialog("Ingrese un numero entre 1 y 100");    
    numeroUsuario = Integer.parseInt(input);
    
    if(aleatorio>numeroUsuario){
        System.out.println("MAS ALTO");
    }else if(aleatorio<numeroUsuario){
        System.out.println("Mas bajo");

    }
    intentos++;
    
}
while (numeroUsuario!=aleatorio);
System.out.println("Correcto");
System.out.printf("Lo conseguiste en %d intentos",intentos);
if(intentos<5){
        System.out.println("Eres un genio");
        JOptionPane.showMessageDialog(null, "Eres un genio");

    }else{
        System.out.println("ESTAS EN PROCESO DE APRENDIZAJE ");
        JOptionPane.showMessageDialog(null, "ESTAS EN PROCESO DE APRENDIZAJE ");
    }

    }
    
}
