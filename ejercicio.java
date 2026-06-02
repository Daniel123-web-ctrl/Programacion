import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ejercicio {
    public static void main(String[] args) {
        ejercicio5();
    } 
    public static void ejercicio1(){
        Scanner lector=new Scanner(System.in);
        boolean valido=false;
        String correo="PETITO",contrasena="1234";
        int intentos=2;
    while (!valido) {
        System.out.println("INGRESE CORREO");
        correo=lector.next();
        System.out.println("Ingrese contrasena");
        contrasena=lector.next();
        if (correo.equalsIgnoreCase("PETITO")&& contrasena.equalsIgnoreCase("1234")) {
            System.out.println("BIENVENIDO");
            valido=true;
            
        }else{
            System.out.println("DATOS INCORRECTOS");
            intentos--;
            if(intentos==0){
                System.out.println("sistema bloqueado");
                valido=true;
            }
        }

        
    }
    
    } public static void ejercicio2(){
        Scanner lector =new Scanner(System.in);
        boolean salir=false;
        double nota =0;
        int opcion=0;
        do {
            System.out.println("=".repeat(40));
            System.out.println("=".repeat(1)+"           opciones disponibles       " +"=".repeat(1));
            System.out.println("=".repeat(1)+"           [1] agregar notas          " +"=".repeat(1));
            System.out.println("=".repeat(1)+"           [2] ver nota               " +"=".repeat(1));
            System.out.println("=".repeat(1)+"           [3] salir                  " +"=".repeat(1));
            
                    System.out.println("INGRESE UNA OPCION");
                    opcion=lector.nextInt();
                    switch (opcion) {
                        case 1:{
                            System.out.println("INGRESE LA NOTA DEL ALUMNO");
                            nota=lector.nextDouble();
                        }
                            
                            break;
                        case 2:{
                            System.out.printf("LA nota del alumno es %.2f\n",nota);
                        }
                            
                            break;
                        case 3:{
                            System.out.println("programa finalizado");
                            salir=true;
                        }
                            
                            break;
                        default:
                            break;
                    }
        
            
        } while (!salir);

    }public static void ejercicio3(){
        Scanner lector =new Scanner(System.in);
        String []nombre=new String[2];
        String []apellido=new String[2];
        int []edad=new int[2];
        StringBuilder menu=new StringBuilder();
        menu.append("=".repeat(40)+"\n");
        menu.append(String.format("%-15s%-10s\n","NOMBRE","edad"));
        menu.append("=".repeat(40)+"\n");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("INGRESE NOPMBRE");
            nombre[i]=lector.next();
            System.out.println("INGRESE edad");
            edad[i]=lector.nextInt();
            menu.append(String.format("%-15s%-10d\n",nombre[i],edad[i]));
            
        }
        
        System.out.println(menu);
    }public static void ejercicio4(){
         Scanner lector =new Scanner(System.in);
        String correo="",contrasena="";
        Pattern patronCorreo=Pattern.compile("^[A-Za-z][0-9]{5}@[a-z]+\\.[a-z]+$");
        Pattern patronContrasena=Pattern.compile("^.{6}$");
        
        System.out.println("Ingrese correo");
        correo=lector.next();
        System.out.println("Ingrese contrasena");
        contrasena=lector.next();
        Matcher evaluarCorreo=patronCorreo.matcher(correo);
        Matcher evaluarContrasena=patronContrasena.matcher(contrasena);
        if (evaluarCorreo.matches() && evaluarContrasena.matches()) {
            System.out.println("BIENVENIDO");
            
        }else{
            System.out.println("ERROR");
        }

        
    }public static void ejercicio5(){
        Scanner lector=new Scanner(System.in);
        StringBuilder boleta=new StringBuilder();
        int [] codigo=new int[2];
        String []nombre= new String[2];
        int [] cantidad= new int[2];
        double [] precioUnidad=new double[2];
        double []importe=new double[2];
        double importeTotal=0 ,IGV=0,subtotal=0;
        
        boleta.append(" ".repeat(16)+"TIENDA ABC"+" ".repeat(20)+"\n");
        boleta.append(" ".repeat(16)+"RUC 3123456789"+" ".repeat(24)+"\n");
        boleta.append(" ".repeat(16)+"CHICLAYO-PERU"+" ".repeat(20)+"\n");
        boleta.append("CAJERO: ROSA"+"\n");
        for (int i = 0; i < importe.length; i++) {
            System.out.println("INGRESE CODIGO");
            codigo[i]=lector.nextInt();
            System.out.println("INGRESE NOMBRE DEL PRODUCTO");
            nombre[i]=lector.next();
            System.out.println("INGRESE CANTIDAD DEL PRODUCTO");
            cantidad[i]=lector.nextInt();
            System.out.println("Ingrese el precio del producto");
            precioUnidad[i]=lector.nextDouble();
            importe[i]=precioUnidad[i]*cantidad[i];

            boleta.append(String.format("%-15d%-15s\n",codigo[i],nombre[i]));
            boleta.append(String.format("%15d x %20.2f%25.2f\n",cantidad[i],precioUnidad[i],importe[i]));
            importeTotal+=importe[i];
        }
         IGV=importeTotal*0.18;
         subtotal=importeTotal-IGV;
         boleta.append(String.format("Subtotal:%.2f\n",subtotal));
         boleta.append(String.format("igv:%.2f\n",IGV));
         boleta.append(String.format("IMPORTE TOTAL:%.2f\n",importeTotal));
         
        System.out.println(boleta);
    }
    
}
