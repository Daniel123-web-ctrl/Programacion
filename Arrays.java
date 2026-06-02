import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arrays {
    
  static final int  NUMERO_ESTUDIANTES =5;
  static final int NUMERO_NOTAS =3;
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);

       ejercicio14(lector);
          
    }public static void ejercicio14(Scanner lector){
       int [][] matriz =new int[5][7]; 
       double [] promedios = new double[7];
       String [] nombres = {"LUIS","CARLOS","JUAN","PEDRO","DANI"};
     int suma = 0;
     int [] sumas = new int[7];

      for (int i = 0; i <5; i++) {
        suma=0;
        for (int j = 0; j < 7; j++) {
            System.out.println("Ingrese numero");
            matriz [i][j] =lector.nextInt();
            suma +=matriz[i][j];

        }
        sumas[i]=suma;
        promedios[i]=suma/7.0;
      }
     System.out.printf("%-10s %4s %4s %4s %4s %4s %4s %4s %7s %8s%n","nombres","L","M","M","J","V","S","D","SUMA","PROMEDIO");
      for (int i = 0; i < 5; i++) {
        System.out.printf("%-10s",nombres[i]);
        for (int j = 0; j < sumas.length; j++) {
            System.out.printf("%4d ",matriz[i][j]);
            
        }
        System.out.printf("%7d %8.2f%n",sumas[i],promedios[i]);
      }

    }public static void ejercicio13(Scanner lector){
 
/*Registrar las temperaturas de 4 ciudades durante 7 días en una matriz 4x7.
Calcular para cada ciudad:
Temperatura promedio.

Guardar los resultados en vectores y mostrarlos. */
 
int [] [] matriz = new int[4][7];
int suma =0;
double [] promedios=new double[4]; 
int []  sumas =new int[4];
String [] ciudades =  {"Lima","Arequipa","Trujillo","Ayacucho"};
for (int i = 0; i < 4; i++) {
    suma=0;
    for (int j = 0; j < 7; j++) {
        System.out.printf("Ingrese temperatura  de la posicion [%d  /  %d] %n", i,j);
        matriz [i][j]=lector.nextInt();
        suma +=matriz[i][j];
    }
    sumas[i]=suma;
    promedios[i]=suma/7.0;
    System.out.println();
}
 
System.out.printf("%-10s %4s %4s %4s %4s %4s %4s %4s %7s %8s%n","CIUDAD","L","M","M","J","V","S","D","SUMA","PROMEDIO");
for (int i = 0; i < 4; i++) {
    System.out.printf("%-10s",ciudades[i]);
    for (int j = 0; j < 7; j++) {
        System.out.printf("%4d ",matriz[i][j]);
    }
     System.out.printf("%7d %8.2f%n", sumas[i], promedios[i]);
    
}

    }public static void ejercicio12(Scanner lector){
    
/*Escribir un programa en Java que solicite números reales para una matriz de 3x5.
Calcular por cada columna:
La suma.
El promedio.
Guardar los resultados en vectores paralelos y mostrarlos en pantalla. */
  
int suma =0;
 int [][] matriz =new int[3][5];
int [] sumas =new int[5]; 
double [] promedios =new double[5];
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 5; j++) {
      System.out.print("INGRESE NUMERO");       
      matriz[i][j] =lector.nextInt();
    }
}

for (int j = 0; j < 5; j++) {
    suma=0;
    for (int i = 0; i < 3; i++) {
        suma +=matriz [i][j];    
    }
    sumas[j]=suma;
    promedios [j]=suma/3.0;
}
  StringBuilder resultado =new StringBuilder();
  resultado.append(String.format("%-15s %5s %7s %n","CUADRO","SUMA","PROMEDIO"));

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 5; j++) {
        resultado.append(matriz[i][j]+" ");
    }
    resultado.append(String.format("%10d %7.2f %n",sumas[i],promedios[i]));
    
}
System.out.println(resultado);

/* for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 5; j++) {
        System.out.print(matriz[i][j] +"   ");
    }
    System.out.print(sumas[i]+"   ");
    System.out.print(promedios[i] + "   " );
    System.out.println();
}
*/
    }public static void ejercicio11(Scanner lector){
        /*Escribir un programa en Java que solicite las notas de 5 estudiantes en 3 exámenes (matriz 5x3).
Calcular por estudiante:
El promedio de notas.
La cantidad de notas aprobatorias (≥ 11).
Guardar los resultados en vectores paralelos y mostrarlos. */
int suma=0;
int [] sumas=new  int [5];
int [][] matriz =new int[NUMERO_ESTUDIANTES][NUMERO_NOTAS];

 for (int i = 0; i < NUMERO_ESTUDIANTES; i++) {
    suma=0;
    System.out.printf("INGRESE NOTA DEL ESTUDIANTE %d %n",i);
    for (int j = 0; j < NUMERO_NOTAS; j++) {
        System.out.print("INGRESE NOTA :");
        matriz [i][j]=lector.nextInt();
        suma +=matriz[i][j];
    }
    
    sumas [i]=suma;
 }
 
for (int i = 0; i < NUMERO_ESTUDIANTES; i++) {
    for (int j = 0; j < NUMERO_NOTAS; j++) {
        System.out.print(matriz[i][j]+"   ");
        
    }
    System.out.print(sumas[i]);
    System.out.println();
    
}

 /* 
 for (int i = 0; i < 5; i++) {
    
    for (int j = 0; j < 3; j++) {
        System.out.print(matriz[i][j]+"   ");
        
        
    }
    System.out.print(suma);
    System.out.println();
    
 }
*/

    } public static void ejercicio10(Scanner lector){
         int [][] matriz =new int[3][3];
         int [] sumas =new int[3];
         double [] promedios=new double [3];
         int suma =0;
         for (int i = 0; i < 3; i++) {
            suma=0;
            
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese numero : ");
                matriz[i][j]=lector.nextInt();
                suma +=matriz[i][j];
                sumas[i]=suma;
            }
            promedios[i] =suma/3.0;
            
         }
        StringBuilder reporte =new StringBuilder();
        
            reporte.append(String.format("%-18s%-10s%-10s%n","Cuadro","Suma","Promedio"));
        for (int i = 0; i < promedios.length; i++) {

            for (int j = 0; j < promedios.length; j++) {
                reporte.append(String.format("%d   ",matriz[i][j]));
            }
            System.out.println();
            reporte.append(String.format("%10d     ",sumas[i]));
            reporte.append(String.format("%5.2f%n",promedios[i]));
        }
       System.out.println(reporte);

     /*  for (int i = 0; i < 3; i++) {

        for (int j = 0; j <3; j++) {
            System.out.print(matriz[i][j]+"      ");
            
        }
        System.out.print(sumas[i]+"    ");
        System.out.printf("%.2f%n",promedios[i]);
    System.out.println();
      }*/

    }public static void ejercicio9(Scanner lector){
        int suma=0;
        int [] sumas=new int[4]; 
  int [][] matriz =new int[4][4];


   for (int i = 0; i < 4; i++) {
    for (int j = 0; j <4; j++) {
        System.out.print("Ingrese numero");
        matriz [i][j]=lector.nextInt();
    }
   }
  
  
   for (int j = 0; j < 4; j++) {
    suma = 0;

    for (int i = 0; i < 4; i++) {
        suma += matriz[i][j];
    }

    sumas[j] = suma;
}

for (int i = 0; i < matriz.length; i++) {
    System.out.println();
    for (int j = 0; j < matriz.length; j++) {
        System.out.print(matriz[i][j]+" ");
        
    }
    System.out.print(sumas[i]);
}
   }public static void ejercicio8(Scanner lector){
    int [] numeros =new int[6];
    int suma=0;
    double promedio=0;
    for (int i = 0; i < numeros.length; i++) {
        System.out.print("Ingrese numero :");
        numeros [i]=lector.nextInt();
        suma +=numeros[i];
    }
    promedio =suma/6.0;
    
    System.out.printf("El  promedio de los numeros ingrersados es :%.2f%n",promedio);
    for (int i = 0; i < 6; i++) {
        if (numeros[i]>promedio) {
            
 System.out.print(numeros[i]+" ");           
        }
        
    }
    }public static void ejercicio7(Scanner lector){
/*Escribe un programa en Java que llene un arreglo de 5 números enteros ingresados por el usuario. 
Calcula e imprime la suma total y el promedio de todos los elementos. */        

 int [] arreglo=new int[5];
 int suma=0;
 double promedio=0;
  for (int i = 0; i < 5; i++) {
   System.out.print("INGRESE NUMERO");
   arreglo [i]=lector.nextInt();
   suma +=arreglo[i];
   
  }
  promedio =suma/5.0;
System.out.printf("El  promedio es %.2f%n",promedio);

System.out.printf("La suma es %d%n",suma);
    }public static void ejercicio6(Scanner lector){
        double promediTotal =0;
        String []nombres={"JUAN carlo","ANA luis","ROSA","CARLOS","GABY"};
        int [] edades={19,25,22,24,25};
        int[] grado ={5,5,4,5,5};
        int [] PC1 ={20,20,20,16,20};
        int [] PC2 ={19,17,18,18,20};
        int [] PC3 ={15,18,12,15,14};
        int [] EF ={17,16,13,12,15};
        double [] PROM=new double[5];
 StringBuilder reporte =new StringBuilder();
 reporte.append("#".repeat(20)+" REPORTE DE NOTAS "+"#".repeat(30)+"\n");
 reporte.append(String.format("%-15s%-8s%-8s%-8s%-8s%-8s%-8s%-8s%n","NOMBRE","EDAD","GRADO","PC1","PC2","PC3","EF","PROM"));
 reporte.append("#".repeat(68)+"\n");
 for (int i = 0; i < PROM.length; i++) {
    PROM [i]=(PC1[i]+PC2[i]+PC3[i]+EF[i])/4.0;
    reporte.append(String.format("%-15s%-8s%-8s%-8s%-8s%-8s%-8s%-8s%n",nombres[i],edades[i],grado[i],PC1[i],PC2[i],PC3[i],EF[i],PROM[i]));
    promediTotal +=PROM[i];
 }
 promediTotal /=5.0;
 reporte.append("#".repeat(68)+"\n");
reporte.append("PROMEDIO TOTAL: "+" ".repeat(47)+promediTotal+"\n");
reporte.append("#".repeat(68)+"\n");
System.out.println(reporte);
    }public static void ejercicio1(Scanner lector){
        
    
      //String [] numero=new int[5];
        /*paises [0]="peru";
        paises [1]="colombia";
        paises [2]="venezuela";
        paises [3]="argentina";
        paises [4]="chile";
        JOptionPane.showMessageDialog(null, paises[0]);*/
          //for (String elemento : paises) System.out.println(elemento);
          // para cada elemento de tipo string que tenemos en paises ,tienes que  hacer esto  System.out.println(elemento);
           
         /* 
         /*for (int i = 0; i < paises.length; i++) {
            paises[i]=JOptionPane.showInputDialog("INGRESE PAIS");
            
          }
          JOptionPane.showMessageDialog(null, paises); */ 

            }public static void ejercicio2(Scanner lector){
        int[] numero=new int[200];
        for (int i = 0; i < numero.length; i++) {
            numero[i]=(int)(Math.random()*100);
            
        }
        for (int elemento : numero) {
             System.out.print(elemento+"-");
            
        }
        
    }public static void ejercicio3(Scanner lector){
    int [][] numero={
    {12,1,3,45,4 },
    {45,23,23,4,65},
    {34,3456,465,5,6},
    {21,23,5,6,32},
    };
    
/*for (int i = 0; i < 4; i++) {
    for (int j = 0; j <5 ; j++) {
        System.out.print(numero[ i][j]+"-");
        
    }
    System.out.println();
    
}*/

for (int[] fila : numero) {
    for (int columna : fila) {
        System.out.print(columna +" ");
        
    }
    System.out.println();
    
}

    }public static void ejercicio5(Scanner lector){
        int acumulador =0;
        
        
          int [][] matriz=new int[3][3];

          int [][] suma = new int[3][1];
          double [][] promedios = new  double[3][1];

           for (int i = 0; i < 3; i++) {
            acumulador=0;
        
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese numero");
                matriz[i][j]=lector.nextInt();
                
                acumulador +=matriz [i][j];
                suma[i][0]=acumulador;
                promedios[i][0]=acumulador/3.0;
            }
            
           }  
           StringBuilder cuadro =new StringBuilder();
                
                cuadro.append(String.format("%-20s%-20s%-20s%n","cuadro","suma","promedio"));
                System.out.println();
            for (int i = 0; i <3; i++) {
                
                for (int j = 0; j <3; j++) {
                    cuadro.append(String.format("%-2d",matriz[i][j]));
                    
                }
                cuadro.append(String.format("%15d",suma[i][0]));
                
                cuadro.append(String.format("%25.2f%n",promedios[i][0]));
                
            }
            System.out.println(cuadro);
             /*for (int x = 0; x < matriz.length; x ++) {
                System.out.println();
                for (int y = 0; y < matriz.length; y ++) {
                    System.out.printf("%d%n",matriz[x][y]);

                }
                System.out.print(" ");
            }*/

    }public static void ejercicio4(Scanner lector){
        double acumulador;
        double interes=0.1;

      double [][]saldo =new  double[5][6];
        for (int i = 0; i < saldo.length; i++) {
            
            saldo[i][0]=10000;  // en fila 0 columna 0 le das 1000 ,en fila 1 columna 0 le das 1000,en fila 2 columna 0 le das 1000...
            acumulador =10000;  // luego lo acumulas en aqui 
            for (int j = 1; j < saldo[i].length; j++) { //luego aqui empizas en 1 porque anteriormente el 0 ya esta rel;lenado todos con 10000.
                 acumulador =acumulador + (acumulador*interes);
                
                saldo[i][j]=acumulador; // almacenas cada acumulador en cada  vuelta 
            }
              interes += 0.01;// aqui aumnetas el interes en 1 pore ciewnto despues de que finalice cada for interno(10%,11%%,12%...)
    
        }
        
   for (int fila = 0; fila < 5; fila++) {
    System.out.println();
    for (int columna = 0; columna < 6; columna++) {
          System.out.printf("%.2f    ",   saldo[fila][columna]);
                
    }
    System.out.println();  
   }


    }
     
}
