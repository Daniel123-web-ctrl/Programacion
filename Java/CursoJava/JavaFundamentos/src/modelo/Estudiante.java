package modelo;

public class Estudiante {

   private  String nombre;
   private String DNI;
   private int edad;

  
    public  Estudiante(String nombre,String DNI,int edad){

        setNombre(nombre);
        setDNI(DNI);
        setEdad(edad);
        
    }

    public String mostrarInformacion(){

        StringBuilder infortmacion=new StringBuilder();
        infortmacion.append(String.format("NOMBRE : %s%nDNI: %S%nEDAD:%d",getNombre(),getDNI(),getEdad()));
        
       return infortmacion.toString();
    }




      public String getNombre() {
    return nombre;
}
   public void setNombre(String nombre) {
    if (nombre == null || nombre.isBlank() ){
        throw new IllegalArgumentException("Tienes que ingresar algun nombre obligatoriamente");
    }else{
       this.nombre = nombre;
    }
   }


   public String getDNI() {
    return DNI;
   }
   public void setDNI(String dni) {
    if (dni == null || dni.isBlank()){  //Si el DNI es nulo O si el DNI está vacío, entonces ejecuta el bloque de código
        throw  new IllegalArgumentException("Ingrese obligatoriamente algun numero de Dni valido");
    }else{
       this.DNI=dni;
    }



   }
   public int getEdad() {
    return edad;
   }
   public void setEdad(int edad) {
    if (edad >0){
        
      
        this.edad = edad;
      
    }else {
        throw new IllegalArgumentException("La edad debe  ser  mayor que cero "); //Lanzar un nuevo error por argumento no válido

    }


    
   }
}
