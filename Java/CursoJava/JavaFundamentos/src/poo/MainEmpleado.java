package poo;

public class MainEmpleado {

    public static void main(String[] args) {
        
   /*Empleado empleado1=new Empleado("Jose", 85000, 2026, 4, 12);
   Empleado empleado2=new Empleado("Carlos", 95000, 1996, 2 ,9);
   Empleado empleado3=new Empleado("Julian", 25000, 2023, 5, 10);
  
  empleado1.subirSueldo(5);
  empleado2.subirSueldo(5);
  empleado3.subirSueldo(5);

 System.out.println("nombre" + empleado1.getNombre() +"Sueldo"+ empleado1.getSueldo() +" Fecha de alta en la empresa"+ empleado1.getAltaContrato());
System.out.println("nombre" + empleado2.getNombre() +"Sueldo"+ empleado2.getSueldo() +" Fecha de alta en la empresa"+ empleado2.getAltaContrato());
System.out.println("nombre" + empleado3.getNombre() +"Sueldo"+ empleado3.getSueldo() +" Fecha de alta en la empresa"+ empleado3.getAltaContrato());*/

Empleado [] misEmpleados=new Empleado[4];

misEmpleados[0]=new Empleado("Jose", 85000, 2026, 4, 12);
misEmpleados[1]=new Empleado("Carlos", 95000, 1996, 2 ,9);
misEmpleados[2]= new  Empleado("Julian", 25000, 2023, 5, 10);
misEmpleados[3]=new  Empleado("Pedro");

for (Empleado e : misEmpleados) {
   
    e.subirSueldo(5);
}

for (Empleado e : misEmpleados) {
System.out.println("Nombre : " +  e.getNombre() +
                       "  Sueldo : " + e.getSueldo()  + 
                       " Fecha de alta en la empresa " + e.getAltaContrato());

}
/* 
for (int i = 0; i < misEmpleados.length; i++) {
    misEmpleados[i].subirSueldo(5); 
}*/

/* 
for (int i = 0; i < misEmpleados.length; i++) {
    System.out.println("Nombre : " +  misEmpleados[i].getNombre() +
                       "  Sueldo : " + misEmpleados[i].getSueldo()  + 
                       " Fecha de alta en la empresa " + misEmpleados[i].getAltaContrato());
}*/

  
     
    }

}
