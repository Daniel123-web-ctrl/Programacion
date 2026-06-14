package MOUREDEV;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
         
        //Delaracion y creacion
  HashMap<String,String> names =new HashMap<>();
  var numbers  =new HashMap<Integer,String>();

  //tamano
  System.out.println(names.size()); //0

   //anadir elementos    put
  names.put("Dani","Ramos");
  names.put("Daniel","Cervantes");
  names.put("Ramos","Pulgar");
  System.out.println(names.size());                                   //3
   
   //Acceder a los elementos   get
  System.out.println(names.get("Dani"));                         //Ramos
  System.out.println(names.get("Daniel"));                       //Cervantes

//Verificar elementos
  System.out.println(names.containsKey("Dani"));                 //True
  System.out.println(names.containsValue("Cervantes"));        //True
    }
    
}
