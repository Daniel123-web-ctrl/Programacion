import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class BucleIndeterminadoWhile {
    public static void main(String[] args) {
         Scanner lector =new Scanner(System.in);
         ejercicio9(lector);
    } public static void ejercicio15(Scanner lector){
/* */



    } public static void ejercicio14(Scanner lector){
/*REPORTE ASSCIII
INGRESAR EMPLEADO
//      SALARIO
 EMITIR BOLETA
SALIR
Ejercicio 1
• Escribir un programa para ingresar mediante
un menú la información de un empleado y
sus salarios .
• Opción 1: Se debe pedir el nombre y apellidos
del empleado, por separado.
• Opción 2: Se debe ingresar y validar el sueldo
mensual.
• Opción 3: Elaborar el reporte ASCII (verificar que
1 y 2 se hayan realizado antes)
• Validar nombres y apellidos con Pattern &
Matcher.\
 */







    } public static void ejercicio13(Scanner lector){
/*Actividad grupal para la
Participación en Clase (PA)
• Escribir un programa que solicite n
datos al usuario utilizando el bucle
while.
• Escribir un programa que use el
bucle while para realizar algún
procesamiento o cálculo.
• Escribir un programa que utilice el
bucle while para imprimir
información en pantalla. */



    }public static void ejercicio12 (Scanner lector){
/* Escribir un programa en Java que pida una dirección de
correo y una clave de acceso. Mostrar “Acceso denegado”
mientras el correo no cumpla con el formato correcto
(clases Pattern & Matching) o mientras la clave ingresada
sea diferente de “P@55w0rd”. Haga uso del bucle while.
• Si se ingresan las credenciales correctas se mostrará
“Bienvenido al sistema” y el programa termina.
• El número máximo de intentos es 5. Si el usuario excede el
límite se mostrará “Cuenta suspendida” y el programa
termina.*/



        
    }public static void ejercicio11 (Scanner lector){

/*• Escribir un programa en Java que solicite al
usuario las calificaciones de los estudiantes de
un curso.
• El programa termina cuando el usuario ya no
desea ingresar más notas o cuando ingresa
una nota igual a -1.
• Al terminar, deberá mostrar el promedio global,
así como el número de estudiantes aprobados
y desaprobados. */





















    }public static void ejercicio10 (Scanner lector){
/* • Escribir un programa en Java para solicitar un número
repetidamente mientras este se encuentre entre 1 y 100.
• Ingresado un valor válido, el programa continúa si el
usuario responde Sí a “¿Desea continuar? (Sí/No)”. Si
contesta No, el programa termina.
• Validar las diferentes respuestas con una expresión
regular (No, no, NO, si, Si, sí, SÍ, Sí) dentro de un bucle
while.*/


















    }  public static void ejercicio9 (Scanner lector){

    String usuario ="";
    boolean valido =false;
   Pattern patronUsuario =Pattern.compile("^U[0-9]{8}$");
 while (!valido) {
      usuario=JOptionPane.showInputDialog("Ingrese usuario");
      Matcher evaluarUsuario =patronUsuario.matcher(usuario);
      if (evaluarUsuario.matches()) {
        JOptionPane.showMessageDialog(null, "Bienvenido");
        valido=true;
      }else{
        JOptionPane.showInternalMessageDialog(null, "Usuario incorrecto ,intente nuevamente");
      }
 }
    }public static void ejercicio8 (Scanner lector){
 /*Escribir un programa en Java que solicite un correo electrónico y una contraseña.
         El correo será válido únicamente si termina en “@empresa.com” y la contraseña correcta 
         será “P@55w0rd”.
          Mientras las credenciales sean incorrectas se mostrará “Acceso denegado”. 
          El usuario tendrá un máximo de 5 intentos. Si excede el límite se mostrará “Cuenta suspendida”.
           Si las credenciales son correctas se mostrará “Bienvenido al sistema” y 
           luego se deberá mostrar un menú de opciones con las alternativas: Ver perfil,
            Cambiar contraseña y Cerrar sesión.
            Si el usuario elige Ver perfil se mostrará “Mostrando perfil del usuario”. 
            Si elige Cambiar contraseña se solicitará una nueva contraseña y se mostrará “Contraseña actualizada”.
             Si elige Cerrar sesión se mostrará “Sesión finalizada” y el programa terminará.
         El programa deberá usar Pattern, Matcher, while y switch.
        */
       String correo ="",contrasena="";
       int intentos=5;
       int opcion=0;
         Pattern patronCorreo=Pattern.compile("^[A-Za-z]+@[a-z]{7}\\.[a-z]{3}$");
         Pattern patronContrasena=Pattern.compile("^[A-Z]@[0-9]{2}[a-z][0-9][a-z]{2}$");
          boolean valido=false,salir=false;
while (!valido) {
correo=JOptionPane.showInputDialog("Ingrese su correo ");
contrasena=JOptionPane.showInputDialog("Ingrese su contrasena ");   
Matcher evaluarCorreo=patronCorreo.matcher(correo); 
Matcher evaluarContrasena=patronContrasena.matcher(contrasena);
if (evaluarCorreo.matches() && evaluarContrasena.matches()) {
      JOptionPane.showMessageDialog(null, "Bienvenido al Sistema");
    do {
        System.out.println("INGRESE UNA DE LAS OPCIONES");      
        System.out.println("""
                1:Ver perfil
                2:Cambiar contrasena
                3:Salir
                """);
                opcion=lector.nextInt();
        switch (opcion) {
            case 1:{
                System.out.println("#".repeat(20)+" MOSTRANDO PERFIL DEL USUARIO "+"#".repeat(20));
                System.out.printf("Su correo es %s :\n",correo);
                System.out.printf("Su comtrasena es %s :\n",contrasena);
                System.out.println("#".repeat(70));
            }
                
                break;
            case 2:{
                System.out.println("Ingrese contrasena nueva");
                contrasena=lector.next();
                System.out.println("Contrasena actualizada");
                System.out.printf("Su nueva contrasena es %s\n",contrasena);
            }
                
                break;
            case 3:{
                System.out.println("SESION FINALIZADA");
               valido=true;
               salir=true;
            }
                salir=true;
                break;
            default:{
                System.out.println("Ingrese opcion valida");
            }
                break;
        }
    } while (!salir);
}else{
    System.out.println("ACCESO DENEGADO");
    intentos--;
    if (intentos==0) {
        JOptionPane.showMessageDialog(null, "Cuenta suspendida");
        valido=true;
    }
}
}

    }
    public static void ejercicio7 (Scanner lector){
        /*Escribir un programa para ingresar mediante
un menú la información de un empleado y
sus salarios.
• Opción 1: Se debe pedir el nombre y apellidos
del empleado, por separado.
• Opción 2: Se debe ingresar y validar el sueldo
mensual.
• Opción 3: Elaborar el reporte ASCII (verificar que
1 y 2 se hayan realizado antes)
• Validar nombres y apellidos con Pattern &
Matcher. */
boolean salir =false ,valido=false;
String nombre="" ,apellido="";
int salario=0,opcion=0,total=0;
Pattern patronNombre=Pattern.compile("^[A-Za-z]+$");
Pattern patronApellido=Pattern.compile("^[A-Za-z]+$");


do {
   System.out.println("*".repeat(60) );
    System.out.println("*"+" ".repeat(21)+"MENU DE OPCIONES"+" ".repeat(21)+"*");
       System.out.println("*".repeat(60) );
System.out.println("* Ingrese una de las opciones"+" ".repeat(30)+"*");
System.out.println(
    """
        *1.Ingrese Empleado                                        * 
        *2.Ingresar Salario mensual                                *
        *3.Emmitir boleta                                          *
        *4.Salir                                                   * """);
        System.out.println("*".repeat(60));
opcion=lector.nextInt();
switch (opcion) {
    case 1:{
        valido=false;
        while(!valido){
        System.out.println("Ingrese el nombre del empleado");
        nombre=lector.next();
        
        System.out.println("Ingrese apellido del empleado");
        
        apellido=lector.next();
        Matcher evaluarNombre=patronNombre.matcher(nombre);
        Matcher evaluarApellido=patronApellido.matcher(apellido);
        if (evaluarNombre.matches() && evaluarApellido.matches()) {
            System.out.printf("Bienvenido senor %s  %s\n",nombre,apellido);
            valido=true;
        }else{
            System.out.println("Ingrese nombre y apellido correctamente");

        }
        }
    }
        
        break;
    case 2:
        System.out.println("Ingrese salario del empleado");
        salario=lector.nextInt();
        
        break;
    case 3:{
        
        System.out.println("*".repeat(60));
        System.out.println("* RESUMEN DE BOLETAS DE PAGO   "+ " ".repeat(29) +"*");
        System.out.println("*".repeat(60));
    System.out.printf("Nombre del empleado : %s \n",nombre);        
    System.out.printf("Apellido del empleado: %s \n",apellido);
    System.out.printf("*Salario Ene:%d\t Salario Feb:%d *\n",salario,salario);
    System.out.printf("*Salario Mar:%d\t Salario Abr:%d\n",salario,salario);
    System.out.printf("*Salario May:%d\t Salario Jun:%d\n",salario,salario);
    System.out.printf("*Salario Jul:%d\t Salario Ago:%d\n",salario,salario);
    System.out.printf("*Salario Sep:%d\t Salario Oct:%d\n",salario,salario);
    System.out.printf("*Salario Nov:%d\t Salario Dic:%d\n",salario,salario);
    System.out.println("*".repeat(60));
    lector.nextLine();
    total=salario*12;
    System.out.printf("*  Total: %d \t\t\t\t\t\t   *\n" ,total);

    }
        
        break;
    case 4:{
        System.out.println("Programa finalizado");
        salir=true;
    }
        
        break;
    default:{
        System.out.println("OPCION INCORRECTA");
    }
        break;
}

} while (!salir);

    }public static void ejercicio6 (Scanner lector){
        /*Escribir un programa en Java que solicite un correo electrónico y una contraseña.
         El correo será válido únicamente si termina en “@empresa.com” y la contraseña correcta será “P@55w0rd”.
          Mientras las credenciales sean incorrectas se mostrará “Acceso denegado”. 
          El usuario tendrá un máximo de 5 intentos. Si excede el límite se mostrará “Cuenta suspendida”.
           Si las credenciales son correctas se mostrará “Bienvenido al sistema” y 
           luego se deberá mostrar un menú de opciones con las alternativas: Ver perfil, Cambiar contraseña y Cerrar sesión.
            Si el usuario elige Ver perfil se mostrará “Mostrando perfil del usuario”. 
            Si elige Cambiar contraseña se solicitará una nueva contraseña y se mostrará “Contraseña actualizada”.
             Si elige Cerrar sesión se mostrará “Sesión finalizada” y el programa terminará.
         El programa deberá usar Pattern, Matcher, while y switch. */
        
         String correo="" ,contrasena="" ,contrasenaNueva="";
         int intentos=5;
         int opciones=0;
         boolean valido = false , salir =false;
         Pattern patronCorreo=Pattern.compile("^[a-zA-Z]+@[a-z]{7}\\.[a-z]{3}$");
         Pattern patronContrasena=Pattern.compile("^[A-Z]@[0-9]{2}[a-z][0-9][a-z]{2}");
         Pattern patronContrasenaNueva=Pattern.compile("^[A-Z]@[0-9]{2}[a-z][0-9][a-z]{2}");
         while (!valido) {
            System.out.println("Ingrese su correo electronico");
            correo=lector.next();
            System.out.println("Ingrese su contrasena");
            contrasena=lector.next();
            Matcher evaluarCorreo =patronCorreo.matcher(correo);
            Matcher evaluarContrasena =patronContrasena.matcher(contrasena);
            if (evaluarCorreo.matches() && evaluarContrasena.matches()) {
                System.out.println("BIENVENIDO AL SISTEMA");
                do {
                System.out.println("Ingrese una de las opciones");
                System.out.println("""
                        1:Ver perfil
                        2:Cambiar Contrasena
                        3:Salir
                        """);
                opciones=lector.nextInt();
                     switch (opciones) {
                    case 1:{
                        System.out.printf("Su correo es %s\n",correo);
                        System.out.printf("Su contrasena es %s\n",contrasena);
                    }
                        
                        break;
                    case 2:{
                        System.out.println("ingrese nueva contrasena");
                        contrasenaNueva=lector.next();
                        Matcher evaluarcontrasenaNueva=patronContrasenaNueva.matcher(contrasenaNueva);
                        if (evaluarcontrasenaNueva.matches()) {
                            contrasena=contrasenaNueva;
                            
                        }
                        break;
                    }
                     case 3:{
                        salir=true;
                    }   
                        break;
                }
                    
                } while (!salir);
                
            System.out.println("Programa Finalizado");
            valido=true;
                
            }else{
                System.out.println("Correo o contrasena incorrecta");
                intentos--;
              System.out.printf("Le quedan %d intentos\n ",intentos);
              if (intentos==0) {
                System.out.println("Cuenta suspendida");
                valido=true;
              }

            }

            
         }
 
    }public static void ejercicio5 (Scanner lector){   
   /* Escribir un programa en Java que pida un nombre de usuario y una contraseña.
    El usuario solo puede contener letras y números, y la contraseña correcta será “Java2026”.
     Mientras las credenciales sean incorrectas se mostrará “Acceso denegado”.
      El programa debe hacer uso de las clases Pattern y Matcher junto con el bucle while.
       El usuario tendrá un máximo de 4 intentos. Si supera el límite se mostrará “Usuario bloqueado”. 
   Si las credenciales son correctas se mostrará “Bienvenido”. */

String nombre ="" , contrasena="";
boolean valido = false;
int intentos=4;
Pattern patronNombre=Pattern.compile("^[a-zA-Z0-9]+$");
Pattern patronContrasena=Pattern.compile("^[A-Z][a-z]{3}[0-9]{4}$");
while (!valido) {
    System.out.println("Ingrese su nombre ");
    nombre=lector.next();
    System.out.println("Imgrese su contrasena");
    contrasena=lector.next();
    Matcher evaluarNombre=patronNombre.matcher(nombre);
    Matcher evaluarContrasena=patronContrasena.matcher(contrasena);
    if(evaluarNombre.matches() && evaluarContrasena.matches()){
        System.out.println("BIENVENIDO");
        valido=true;


    }else{
        System.out.println("Nombre de usuario o contrasena incorrecta");
        intentos--;
        if(intentos==0){
            System.out.println("Usuario Bloqueado");
            valido=true;
        }

    }
    
}


    }
    public static void ejercicio4 (Scanner lector){
        boolean salir=false;
        do{
            
            System.out.println("ingrese dos");
         int numero=2;


        }while(!salir);



    }
    public static void ejercicio3 (Scanner lector){
  int aleatorio = (int) (Math.random()*100)+1;  // Aqui el math random toma cualuier numero aleatoriamente pero en decimales,por eso se le multiplica por 100 y luego se suma 1 porque  l;uego te pedira que el numero que ingrese este comprendido entre 0-100
int intentos=0;
int numeroUsuario=0     ;

while (numeroUsuario!=aleatorio) {
    String input = JOptionPane.showInputDialog("Ingrese un numero entre 1 y 100");    
    numeroUsuario = Integer.parseInt(input);
    
    if(aleatorio>numeroUsuario){
        System.out.println("MAS ALTO");
    }else if(aleatorio<numeroUsuario){
        System.out.println("Mas bajo");

    }
    intentos++;
    
}
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
    public static void ejercicio1 (Scanner lector){

        String clave="Lunes";
        String pass="";
        while(clave.equalsIgnoreCase(pass)==false){  // aqui decimos que esto es correcto porque dice  que es falso que lunes y pass son uguales 
            pass =JOptionPane.showInputDialog("Introduce contrasena");
            if (clave.equalsIgnoreCase(pass)==false) System.out.println("Contrasena Incorrecta");

        }
   System.out.println("Acceso correcto");


    }public static void ejercicio2 (Scanner lector){
        String clave ="";
        boolean valido=false; 

        while(!valido){
            System.out.println("Ingrese clave");
            clave =lector.next();
            
            if(clave.equalsIgnoreCase("lunes")){
                System.out.println("Contrasena correcta ");
                valido=true;
            }


        }

    }
}
