import java.net.Socket;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjerciciosCombinados {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ejercicio2(lector);
    }public static void ejercicio2(Scanner lector){

        String [] nombre=new String[3];
        String [] dni=new String[3]; 
        String [] correoElectronico=new String[3];
        double []nota1=new double[3];
        double []nota2=new double[3];
        double []nota3=new double[3];
        double [] promedio=new double[3];
        double promedioGeneral =0.0;
        Pattern patronNombre=Pattern.compile("^[A-Za-z ]+$");
        Pattern patronDni=Pattern.compile("^[0-9]{8}$");
        Pattern patronCorreoElectronico=Pattern.compile("^[a-z]+\\@[a-z]+\\.[a-z]+$");
        boolean salir=false,valido=false;
        int opcion=0;
        do {
            System.out.println("Ingrese una de las opciones :");
            System.out.println("=".repeat(10)+"MENU PRINCIPAL"+"=".repeat(10));
            System.out.println("""
                        1. Registrar estudiante
                        2. Registrar notas
                        3. Mostrar estudiantes registrados
                        4. Mostrar promedio general
                        5. Mostrar estudiante con mayor promedio
                        6. Salir
                    """);
            opcion=lector.nextInt();
            lector.nextLine();
            switch (opcion) {
                case 1:{
                    for (int i = 0; i < nombre.length; i++) {
                        valido=false;
                        while (!valido) {
                        System.out.println("Ingrese nombre completo");
                        nombre[i]=lector.nextLine();
            
                        System.out.println("Ingrese DNI :");
                        dni[i]=lector.next();
                        lector.nextLine();
            
                        System.out.println("Ingrese correo electronico");
                        correoElectronico[i]=lector.next();
                        lector.nextLine();
                        Matcher evaluarNombre=patronNombre.matcher(nombre[i]);
                        Matcher evaluardni=patronDni.matcher(dni[i]);
                        Matcher evaluarCorreoElectronico =patronCorreoElectronico.matcher(correoElectronico[i]);
                        if (evaluarNombre.matches() && evaluardni.matches()&& evaluarCorreoElectronico.matches()) {
                            System.out.println("CLIENTE REGISTRADO CORRECTAMENTE");
                          valido=true;
                        } else {

                            System.out.println("Datos incorrectos,ingrese nuevamente");
                        }
                    }
                    }

                }
                    
                    break;
                case 2:{
                    
                    for (int i = 0; i < nombre.length; i++) {
                        System.out.printf("Notas de %s\n",nombre[i]);
                        System.out.println("Ingrese nota 1:");
                        nota1[i]=lector.nextDouble();
                        System.out.println("Ingrese la nota2 :");
                        nota2[i]=lector.nextDouble();
                        System.out.println("Ingrese la nota3 :");
                        nota3[i]=lector.nextDouble();  
                        promedio[i]=(nota1[i]+nota2[i]+nota3[i])/3;
                        promedioGeneral+=promedio[i];
                        System.out.printf("EL promedio de %s es %.2f\n",nombre[i],promedio[i]);
                    }


                }
                    
                    break;
                case 3:{
                    StringBuilder registro =new StringBuilder();
                    registro.append("=".repeat(20)+" LISTA DE ESTUDIANTES "+"=".repeat(20)+"\n");
                    registro.append(String.format("%-20%-15s%-15s%-10s\n","NOMBRE","DNI","CORREO","PROMEDIO"));
                    registro.append("=".repeat(60)+"\n");
                    for (int i = 0; i < nombre.length; i++) {
                    registro.append(String.format("%-20%-15s%-15s%-10.2f\n",nombre[i],dni[i],correoElectronico[i],promedio[i]));
                 }
                 System.out.println(registro);
                }
                    
                    break;
                case 4:System.out.printf("El promedio general es %.2f",promedioGeneral);
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                default:
                    break;
            }
            
        } while (!salir);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }public static void ejercicio1(Scanner lector){
        boolean salir=false ,valido=false;
        String nombreProducto="";
        int opcion=0;
        String[]DNI=new String      [3];
        String []producto=new String[3];
        int [] cantidad=new int[3];
        int[] precioUnit=new int[3];
        String nombre="";
        String correoElectronico="";       
        String dni="";
        String[] nombreClientes=new String[3];

        
        Pattern patronNombre=Pattern.compile("^[a-zA-Z ]+$");
        Pattern patronDNI=Pattern.compile("^[0-9]{8}$");
        Pattern patronCorreoElectronico=Pattern.compile("^[A-Za-z]+\\@[a-z]+\\.[a-z]+$");


        do {
            System.out.println("=".repeat(60));
            System.out.println("Seleccione una opcion del menu ");
            System.out.println("MENU PRINCIPAL");
            System.out.println("""
                    
                        1.Registrar cliente
                        2.Registrar compra
                        3.Mostrar clientes
                        4.Mostrar factura general
                        5.Buscar cliente
                        6.Mostrar cliente con mayor compra
                        7.Salir
                    """);
            opcion=lector.nextInt();
            System.out.println("=".repeat(60));
            switch (opcion) {
                case 1:{ 
                    while (!valido) {
                    System.out.println("Ingrese nombre del cliente: ");
                    nombre=lector.next();
                    System.out.println("Ingrese DNI");
                    dni=lector.next();  
                    System.out.println("Ingrese correo : ");
                    correoElectronico=lector.next();
                     
                    Matcher evaluarNombre=patronNombre.matcher(nombre);
                    Matcher evaluarDNI=patronDNI.matcher(dni);
                    Matcher evaluarCorreoElectronico=patronCorreoElectronico.matcher(correoElectronico);
                    if (evaluarNombre.matches()&&evaluarDNI.matches()&& evaluarCorreoElectronico.matches()) {
                        System.out.println("CLIENTE REGISTRADO CORRECTAMENTE");
                        valido=true;
                        nombreClientes[0]=nombre;       
                    } else {
                        System.out.println("EL nombre ingresado no es valido ,ingrese nuevamente");

                        
                    }
                    }

                }
                    
                    break;
                case 2:{ 
                    for (int i = 0; i < producto.length; i++) {
                        System.out.println("Ingrese el nombre del producto");
                        producto[i]=lector.next();
                        System.out.println("Ingrese la cantidad del producto");
                        cantidad[i]=lector.nextInt();
                        System.out.println("Ingrese el precio unitario del producto");
                        precioUnit[i]=lector.nextInt();
                        
                    }
                }
                    
                    break;
                case 3:{
                    System.out.println("CLIENTES REGISTRADOS");
                    System.out.printf("%-20s%-15s%-10s\n","NOMBRE","DNI","CORREO");
                    System.out.printf("%-20s%-15s%-10s\n",nombre,DNI,correoElectronico);
                }
                    
                    break;
                case 4:{
                    StringBuilder factura =new StringBuilder();
                    double Subtotal=0.0,igv=0.0,TOTAL=0.0;
                    double [] total=new double[3];
                    factura.append("=".repeat(60)+"\n");
                    factura.append(String.format("%-20s%-15s%-10s%-6s\n","DESCRIPCION","CANTIDAD","P.UNIT","TOTAL"));
                    for (int i = 0; i < cantidad.length; i++) {
                        total[i]=precioUnit[i]*cantidad[i];
                        factura.append(String.format("%-20s%-15d%-10.2f%-6.2f\n",producto[i],cantidad[i],precioUnit[i],total[i]));
                        
                        Subtotal+=total[i];
                        igv+=igv=total[i]*18/100;
                        
                        
                    } 
                    TOTAL=igv+Subtotal;
                    factura.append("=".repeat(60)+"\n");
                    factura.append(String.format("Subtotal:%.2f\n",Subtotal));
                    factura.append(String.format("IGV(18):%.2f\n",igv));
                    factura.append(String.format("TOTAL :%.2f\n",TOTAL));
                    
                    factura.append("=".repeat(60)+"\n");
                    factura.append(String.format("GRACIAS POR SU COMPRA\n"));
                    
                    factura.append("=".repeat(60)+"\n"); 
                    System.out.println(factura);
                }
                    
                    break;
                case 5:{
                    System.out.println("Ingrese el DNI del cliente que desea buscar");                  
                    String DNIbusqueda=lector.next();
                    if (DNIbusqueda.equals(DNI)) {
                        System.out.println("CLIENTE ENCONTRADO");
                        System.out.printf("%-20s%-15s%-10s\n","NOMBRE","DNI","CORREO");
                        System.out.printf("%-20s%-15s%-10s\n",nombre,DNI,correoElectronico);
                    } else {
                        System.out.println("CLIENTE NO ENCONTRADO");
                    }       
                }
                    break;
                case 6:{
                    System.out.println("EL cliente con mayor compra es : "+nombre);         
                }
                    break;
                case 7:{
                    salir=true;
                    System.out.println("SALIENDO DEL PROGRAMA");
                }
                    
                    break;
                default:
                    break;
            }
        } while (!salir);
    }
    
}
