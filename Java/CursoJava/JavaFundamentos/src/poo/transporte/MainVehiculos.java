package poo.transporte;
import java.util.*;
public class MainVehiculos {
    public static void main(String[] args) {
        int opcion =0;
   Scanner lector = new Scanner(System.in);

   StringBuilder sistema =new StringBuilder();

   
   

do {
    
    sistema.append(String.format("=".repeat(10)+"SISTEMA DE TRANSPORTE "+"=".repeat(10)+"\n"));
    sistema.append(String.format("""
                                1. Registrar Auto
                                2. Registrar Motocicleta
                                3. Registrar Camión
                                4. Mostrar información
                                5. Calcular alquiler
                                6. Verificar mantenimiento
                                7. Encender vehículo
                                8. Apagar vehículo
                                9. Salir
            """));
    sistema.append("=".repeat(44)+"\n");
     
    sistema.append("Seleccione una opcion :");
    System.out.println(sistema);
   opcion=lector.nextInt();

   Autos auto1 = null;
Motocicleta motocicleta1 = null;
Camiones camion1 = null;


   switch (opcion) {
    case 1:
        auto1=new Autos(null, null, opcion, opcion, opcion, opcion);
        auto1.ingresarDatos();
     
        
        break;
    case 2:
     motocicleta1=new Motocicleta("Honda", "CB190R", 2023, 80, 12000, 2);
        
        break;
    case 3:
     camion1 = new Camiones("Volvo","FH" , 2022, 250, 30000,12000, 3);
        
        break;
    case 4:
        System.out.println("QUE TIPO DE VEHICULO DESEA VER  ?");
        System.out.println("""
                1-.Autos
                2-.Motocicletas 
                3-.Camiones
                """);
        int tipoDeVehiculo=lector.nextInt();
        switch (tipoDeVehiculo) {
            case 1:
                System.out.println(auto1.mostrarInformacion());
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                break;
        }
        
        break;
    case 5:
        
        break;
    case 6:
        
        break;
    case 7:
        
        break;
    case 8:
        
        break;
    case 9:
        
        break;
    default:
        break;
   }
  
  
} while (opcion !=9);























   System.out.println(sistema);




        
    }

}
