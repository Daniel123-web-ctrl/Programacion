package colecciones;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        
  //Delaracion y creacion
  ArrayList<String> names =new ArrayList<>();
 // var numbers  =new ArrayList<Integer>();

  //tamanio
  System.out.println(names.size()); //0

  //anadir elementos    add
//  names.add("Dani");
//  names.add("Daniel");
 // names.add("Ramos");
  //System.out.println(names.size());    //3
/*
  //Acceder a los elementos   get
  System.out.println(names.getFirst());       //Imprime el primero de la lista
  System.out.println(names.get(1));    //Daniel
  System.out.println(names.getLast());        // Imprimero el ultimo de la lista
  System.out.println(names.getClass());
    

  //Modificar los elementos     set
  names.set(0,"Roberto");
  //names.set(2,"Cervantes");   //te pide el indice donde quieres modificar y tambien el nuevo string
  System.out.println(names);               //[Dani,Daniel,Ramos]
  


  //Eliminar elementos    remove
  names.remove(2);            //Elimina el elemento de la posicion que ingreses
   System.out.println(names);        //[Dani,Daniel]
    


  //Buscar elementos      contains
  System.out.println(names.contains("Dani"));         //True
  System.out.println(names.contains("Jorge"));        //False

  //Limpiar ArrayList      clear     Elimina todos los elemtos de names  */

  names.clear();
  names.add("josecarlos");
  names.add("pedrocarlos");
  names.add("josemanuel");
 System.out.println(names);
  names.getFirst();
  names.set(2, "josecarlos");
  System.out.println(names);

  System.out.println(names.size());
    }
}
