package poo.ejercicios;


import java.util.Scanner;

import poo.Mouse;
public class MainDispositivo {
    public static void main(String[] args) {
        int opcion=0;

        Scanner lector=new  Scanner(System.in);
       

        Laptop laptop1=new Laptop("LENOVO", "iDEApad", 2500, 5, 16);
        Celular celular1=new Celular("SAMSUMG", "Galaxy A55", 1400, 8, 256 );
        Mouse mouse1= new Mouse("Logitech",  "G203", 120, 15, "USB");
        Dispositivo laptop2=new Laptop("ass", "asd", 3,3, 54);
        System.out.println(laptop2.consultarInformacion());
/*
       
    
       do {
         System.out.println("Ingrese la opcion del producto que desea consultar:");
         System.out.println("""
            1:Laptop
            2:Celulares
            3:Mouse
            4:Salir
                
                """);  
       
         opcion =lector.nextInt();
         switch (opcion) {
            case 1:
                System.out.println("LAPTOP");
        System.out.println(laptop1.consultarInformacion());
        
        System.out.println("Ingrese la cantidad de laptops que desea comprar ");
        int compraLaptop=lector.nextInt();

        laptop1.setNuevostock(compraLaptop);

        System.out.println("La nueva informaacion es ");
        System.out.println("LAPTOP");
        System.out.println(laptop1.consultarInformacion());
                break;
            case 2:
                 System.out.println("CELULAR");
        System.out.println(celular1.consultarInformacion());
        
        System.out.println("Ingrese la cantidad de celulares que desea comprar ");
        int compraCelular=lector.nextInt();

        celular1.setNuevostock(compraCelular);

        System.out.println("La nueva informaacion es ");
        System.out.println("CELULAR");
        System.out.println(celular1.consultarInformacion());

                
                break;
            case 3:
                System.out.println("Mouse");
        System.out.println(mouse1.consultarInformacion());                    
                            
        System.out.println("Ingrese la cantidad de celulares que desea comprar ");                    
        int compraMouse=lector.nextInt();                    
                    
       mouse1.setNuevostock(compraMouse);                    
                    
        System.out.println("La nueva informacion es ");                    
        System.out.println("Mouse");                    
        System.out.println(mouse1.consultarInformacion());                    

                
                break;
            case 4:
               System.out.println("Saliendo");
                
                break;
         
            default:System.out.println("OPCION INCNORRECTA");
                break;
         }

        
       
       
              
       } while (opcion != 4);


 */
    }

}
