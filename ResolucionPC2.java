import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResolucionPC2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ejercicio5(lector);
    }public static void ejercicio5(Scanner lector){
        final int MAX_CLIENTES = 3;
        String [] nombres=new String[MAX_CLIENTES];
        int []edades=new  int[MAX_CLIENTES];
        String [] generos =new String[MAX_CLIENTES];

        int edad=0;
        int contador1=0,contador2=0;
        boolean salir=false;
        String nombre="";
        String genero ="";
        boolean valido =false;
        Pattern patronGenero=Pattern.compile("^[A-Za-z]+$");
        Pattern patronNombre=Pattern.compile("^[a-zA-Z ]+$");
        int opcion;
      do {
           System.out.println("=".repeat(10)+" MENU "+"=".repeat(10));        
           System.out.println("""
                    1. Registrar cliente
                    2. Mostrar reporte
                    3. Salir
                   """);
          System.out.println("Ingrese una de las opciones");
          opcion=lector.nextInt();
          System.out.println();
          switch (opcion) {
            case 1:{
                for (int i = 0; i < nombres.length; i++ ) {
                    valido=false;
                do {
                 System.out.println("Ingrese nombre del cliente");
                nombre =lector.next();
                Matcher evaluarNombre=patronNombre.matcher(nombre);
                if (evaluarNombre.matches()) {
                    nombres[i]=nombre;
                    valido=true;
                    
                }else{
                    System.out.println("Ingrese un nombre correcto");
                }
                    } while (!valido);
                
                do {
                    System.out.println("Ingrese edad del cliente :");
                    edad=lector.nextInt();
                    if (edad<=15 || edad >=80) {
                        System.out.println("Ingrese edad correctamente");

                        } 
                    }while (edad<=15 || edad >=80);
                        edades[i]=edad;
                        do {
                        System.out.println("Ingrese genero de la persona :");
                        genero=lector.next();
                        Matcher evaluarGenero=patronGenero.matcher(genero);
                        if (evaluarGenero.matches()) {
                             generos[i]=genero;
                             if (genero.equalsIgnoreCase("masculino")) {
                                contador1++;
                             }else{
                                contador2++;
                             }
                            valido=true;
                        }else{
                            System.out.println("Ingrese su genero correctamente");
                        }
                        } while (!valido);

                    }
                    }
            
                break;
            case 2:{
                StringBuilder reporte=new StringBuilder();
                reporte.append("#".repeat(10)+" REPORTE "+"#".repeat(10)+"\n");
                reporte.append(String.format("%-10s%-6s%-5s%n","NOMBRE ","EDAD","GENER0"));
                reporte.append("#".repeat(30)+"\n");
                for (int i = 0; i < generos.length; i++) {
                    reporte.append(String.format("%-10s%-6d%-5s%n",nombres[i] ,edades[i],generos[i]));

                }
                reporte.append("#".repeat(30)+"\n");
                reporte.append(String.format("La cantidad de varones es :%d%n",contador1));
                
                reporte.append(String.format("La cantidad de mujeres es :%d%n",contador2));
                
                reporte.append("#".repeat(30)+"\n");
                System.out.println(reporte);
            }

                
                break;
            case 3:{
                salir=true;
            }
                
                break;
            default:{
                System.out.println("ERROR");
                System.out.println("Solo ingrese las opciones (1-2-3)");
            }
                break;
          }


        
      } while (!salir);

    }
    public static void ejercicio4(Scanner lector){
        String [] nombre ={"JUAN","ANA","ROSA","CARLOS","GABRIELA"};
        double promedioTotal=0;
        int [] edad ={19,25,22,24,25};
        int [] grado ={5,5,4,5,5};
        int [] PC1 ={20,20,20,16,20};
        int [] PC2 ={19,17,18,18,20};
        int [] PC3 ={15,18,12,15,14};
        int [] EF ={17,16,13,12,15};
        double [] PROM=new double[5];
        StringBuilder reporte =new StringBuilder();
        reporte.append(String.format("#".repeat(20)+" REPORTE DE NOTAS "+"#".repeat(20)+"\n"));
        reporte.append(String.format("%-15s%-10s%-6s%-6s%-6s%-6s%-6s%-6s \n","NOMBRE","EDAD","GRADO","PC1","PC2","PC3","EF","PROM"));
        reporte.append("#".repeat(60)+"\n");
            for (int i = 0; i < nombre.length; i++) {
                PROM[i]=(PC1[i]+PC2[i]+PC3[i]+EF[i])/4.0;
                promedioTotal +=PROM[i];
        reporte.append(String.format("%-15s%-10d%-6d%-6d%-6d%-6d%-6d%-6.2f \n",nombre[i],edad[i],grado[i],PC1[i],PC2[i],PC3[i],EF[i],PROM[i]));
        
                }
                promedioTotal =promedioTotal/grado.length;
        reporte.append("#".repeat(60)+"\n");
        reporte.append(String.format("PROMEDIO TOTAL :%.2f\n",promedioTotal));
        reporte.append("#".repeat(60)+"\n");
        System.out.println(reporte);
 
                    } public static void ejercicio1(Scanner lector){
         int i=0, j=0,contador=0,contador1=0;
         double nota =0,suma=0,promedio=0,promedioTotal=0;
         String respuesta ="no";
         String nombre ="";
         boolean valido=false;
        while (!valido) {
            System.out.printf("Ingrese  nombnre del alumno %d \n",i+1);
            nombre=lector.next();
            i++;
            j=0;
            suma=0;
            do {
                
                System.out.printf("Ingrese nota %d del alumno %s\n",j +1,nombre);
                nota=lector.nextDouble();
                if (nota==-1) {
                    nota=-1;
                }else{
                    suma +=nota;
                    j++;
                    System.out.println("Desea continuar ?(SI/NO)");
                    respuesta=lector.next();
                    if(respuesta.equalsIgnoreCase("si")){
                    }else{
                        nota=-1;
                    }
                    
                }
                
            } while (nota!=-1); 
            promedio=suma/j;
            if (promedio>11){
            contador++;
        }else{
            contador1++;
        }
            System.out.printf("El promedio del alumno %s  es %.2f\n",nombre,promedio);
            System.out.println("Desea registrar mas alumnos ?(SI/NO)");
            respuesta=lector.next();
            
                    if(respuesta.equalsIgnoreCase("si")){

                    }else{
                        valido=true;
                    }
            promedioTotal +=promedio;
            
        }
        
        promedioTotal=promedioTotal/i;
        System.out.printf("El promedio total de los %d alumnos es %.2f :\n ",i,promedioTotal);
        System.out.printf("Los alumnos aprobados son %d \n",contador);
        System.out.printf("Los alumnos desaprobados son %d \n",contador1);


       }public static void ejercicio2(Scanner lector){
        int numero,residuo;
        String digitos="";
        System.out.println("Ingrese un numero en base decimal");
        numero=lector.nextInt();
    do {
        residuo=numero%8;
        digitos +=residuo;
        numero=numero/8;
        
    } while (numero!=0);
    
    digitos= new StringBuilder(digitos).reverse().toString();
    System.out.println(digitos);
    }public static void ejercicio3(Scanner lector){
        String color ="";
        double Crema,Azul,Celeste;
        int contador1 =0,contador2=0,contador3=0,mayor;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el color de su preferencia(Crema-Azul-Celeste) :");
            color=lector.next();
            switch (color) {
                case "crema":contador1++;
                    
                    break;
                case "azul":contador2++;
                    
                    break;
                case "celeste":contador3++;
                    
                    break;
            
                default:{
                    System.out.println("Solo ingrese uno de los 3 colores");
                }
                    break;
            }
            
        }
        Crema=contador1/100.0;
        Azul=contador2/100.0;
        Celeste=contador3/100.0;
        StringBuilder nombre =new  StringBuilder();
        if(contador1>contador2 && contador1>contador3){
            mayor=contador1;
          
          nombre.append(String.format("crema\n"));

        }else if(contador2>contador1 && contador2>contador1){
            mayor=contador2;
            
          nombre.append(String.format("azul\n"));

        }else{
            mayor=contador3;
            
          nombre.append(String.format("celeste\n"));
        }

           System.out.printf("Las personas que eligieron el color crema es  %d  y su porcentaje es %.2f %%\n",contador1,Crema*100);
           System.out.printf("Las personas que eligieron el color azul es %d y su porcentaje es %.2f %% \n",contador2,Azul*100);
           System.out.printf("Las personas que eligieron el color celeste es  %d y su porcentaje es %.2f %% \n ",contador3,Celeste*10);
           
          System.out.printf("La persona %s a sido la mas elegida \n" ,nombre);

    }
    
}
