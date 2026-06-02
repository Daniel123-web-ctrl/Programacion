import java.util.Scanner;

public class UsoDeStringBuilder {
    public static void main(String[] args) {
        Scanner lector=new Scanner((System.in));
        ejercicio3(lector);
    }public static void ejercicio4(Scanner lector){
        /*================================================
         TECHSTORE PERU S.A.C.
         RUC: 20512345678
         Av. Javier Prado 1240, Lima
================================================
 FACTURA N°: F001-00042
 Fecha     : 22/05/2026
 Estado    : PAGADO
------------------------------------------------
 CLIENTE
 Nombre : Carlos Mendoza Ruiz
 DNI    : 45678912
 Dir.   : Jr. Los Pinos 340, Miraflores
------------------------------------------------
 DESCRIPCION            CANT   P.UNIT     TOTAL
------------------------------------------------
 Laptop Lenovo IdeaPad    1   S/2350.00  S/2350.00
 Mouse Logitech           2   S/  85.00  S/ 170.00
 Mochila Samsonite        1   S/ 220.00  S/ 220.00
------------------------------------------------
                    Subtotal : S/2740.00
                    IGV (18%): S/ 493.20
                    TOTAL    : S/3233.20
================================================
 Pago: Tarjeta de credito
 Gracias por su compra!
================================================ */
 StringBuilder  factura= new StringBuilder();
 double igv=0, TOTAL=0; 
 String[] descripcion={"lenovo","mouse","mochila"};
 double Subtotal=0;
 int[] cantidad={1,2,1};
 double[] precioUnit={2350.00,85.00,220.00};
 double[] total=new double[3];
 factura.append("=".repeat(60)+"\n");
 factura.append("TECHSTORE.S.A.C\n");
 factura.append("Av.javier prado\n");
 factura.append("=".repeat(60)+"\n");
factura.append(String.format("%-20s%-15s%-10s%-6s\n","DESCRIPCION","CANTIDAD","P.UNIT","TOTAL"));
for (int i = 0; i < cantidad.length; i++) {
    total[i]=precioUnit[i]*cantidad[i];
    factura.append(String.format("%-20s%-15d%-10.2f%-6.2f\n",descripcion[i],cantidad[i],precioUnit[i],total[i]));
    
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
    public static void ejercicio3(Scanner lector){
StringBuilder reporte =new StringBuilder();
double promedioGeneral=0.0;
String[] nombre={"Diego","Mario","Luis","Pedro","Carlos","Andres","Juan","Felipe"};
int [] edad={21,24,20,23,22,19,25,21},part1={2,1,0,0,1,3,0,0},part2={1,2,3,0,1,0,1,0},
part3={0,1,2,1,0,1,0,0},part4={3,2,1,0,1,2,1,0};
String[] posicion={"Delantero","Mediocampista","Delantero","Defensa","Mediocampista","Delantero","Defensa","Arquero"};
double promedioGoles[]=new double[8];
reporte.append(String.format("#".repeat(20)+" REPORTE DE JUGADORES"+"#".repeat(29)+"\n"));
reporte.append(String.format("%-13s%-6s%-13s%-6s%-6s%-6s%-6s%-13s\n","NOMBRE","EDAD","POSICION","PART1","PART2","PART3","PART4","PROMEDIO GOLES"));
reporte.append("#".repeat(69)+"\n");
for (int i = 0; i < edad.length; i++) {
    promedioGoles[i]=(part1[i]+part2[i]+part3[i]+part4[i])/8.0;
    promedioGeneral +=promedioGoles[i];
    reporte.append(String.format("%-13s%-6d%-13s%-6d%-6d%-6d%-6d%-13.2f\n",nombre[i],edad[i],posicion[i],part1[i],part2[i],part3[i],part4[i],promedioGoles[i]));
}
promedioGeneral/=edad.length;
reporte.append("#".repeat(69)+"\n");
reporte.append(String.format("Promedio General del equipo : %.2f",promedioGeneral));
System.out.println(reporte);
    }
    public static void ejercicio2(Scanner lector){
        
    StringBuilder reporte =new StringBuilder();
    double promedioTotal=0.0;
    String [] nombre={"Juan","Ana","Rosa","Carlos","Gabriela",""};
    int [] edad={19,25,22,24,25},grado={5,5,4,5,5},PC1={20,20,20,16,20},PC2={19,17,18,18,20},PC3={15,18,12,15,14},EF={17,16,13,12,15};
    double [] promedio=new double[5];
    reporte.append("#".repeat(23)+" REPORTE DE NOTAS "+"#".repeat(23)+"\n");
     reporte.append(String.format("%-20s%-10s%-6s%-6s%-6s%-6s%-6s%-6s\n","NOMBRE","EDAD","GRADO","PC1","PC2","PC3","EF","PROM"));
     reporte.append("#".repeat(64)+"\n");
for(int i=0;i<edad.length;i++){
    promedio[i]=(PC1[i]+PC2[i]+PC3[i]+EF[i])/4.0;
 promedioTotal +=promedio[i];
 reporte.append(String.format("%-20s%-10d%-6d%-6d%-6d%-6d%-6d%-6.2f\n",nombre[i],edad[i],grado[i],PC1[i],PC2[i],PC3[i],EF[i],promedio[i]));
}
promedioTotal /=edad.length;

reporte.append("#".repeat(64)+"\n");
reporte.append(String.format("Promedio Total %.2f",promedioTotal));
System.out.println(reporte);
reporte.append("#".repeat(64)+"\n");

    }
    public static void ejercicio1(Scanner lector){
        String nombre="Daniel";
        int edad=27;
        StringBuilder mensaje=new StringBuilder();
        mensaje.append("Nombre:").append(nombre).append("Edad:").append(edad);
        System.out.println(mensaje);
    }
    
}
