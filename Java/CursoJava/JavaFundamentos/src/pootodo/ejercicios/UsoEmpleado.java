package pootodo.ejercicios;

import java.util.Date;
import java.util.GregorianCalendar;
public class UsoEmpleado {
    public static void main(String[] args) {

		Jefatura jefeRRHH = new Jefatura("Paco", 55000, 2000, 01, 01); // aqui  primero se intancia y luego todavia se le da un incentivo de 2570 a la variable jefeRRHH que es de tipo Jefatura
		jefeRRHH.setIncentivo(2570);

         Empleado [] misEmpleados =new Empleado[6];  //  esto es un array de tipo Empleado				
		//String [] misEmpleados=new Emppleado [3]  //  esto es un array de tipo String
		
		
	  misEmpleados[0]=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
	  misEmpleados[1]=new Empleado("Ana Lopez", 95000, 1995, 06, 2);
	  misEmpleados[2]=new Empleado("Maria Martin", 105000, 2002, 03, 17); 
	  misEmpleados[3] =new Empleado("Antonio Fernandez");
	  misEmpleados[4]=jefeRRHH;  //Aqui por el principio de la Sustitucion ,puedo usar un objeto de la clase  jefatuea siempre que el programa espere un objeto de la superclase Empleado 
	  misEmpleados[5]=new Jefatura("Maria", 95000, 1999, 05, 15);

	  // EJEMPLO DE UN CASTING ,convertir una variable de tipo double  a una  variable de tipo int
 /* double num1 = 5.7;
    int num2 = (int) num1;  // Convierte num1 a int y lo asigna a num2
 */

	  Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];  // aqui le decimos que el objeto de la posicion 5 del array misEmpleados es de tipo Jefatura y lo guardamos en la variable jefaFinanzas de tipo Jefatura
	  jefaFinanzas.setIncentivo(55000);  // aqui le decimos que a la variable jefaFinanzas le pongas un incentivo de 55000	





  // for(int i=0;i<misEmpleados.length;i++){
 for (Empleado e : misEmpleados) {
		e.subirSueldo(5);
	}
	 for (Empleado e : misEmpleados) {  //creamos un objeto de tipo empleado y lo llamamos e y con ese e  le decimos e.dame el nombre y el sueldo y la fecha de alta en la empresa
		 System.out.printf(
					"Nombre : %s%n" +
					"Sueldo: %.0f%n"+
					"Fecha de alta en la empresa: %td /%tm/%tY%n",
					e.getNombre(),e.getSueldo(),
					e.getAltaContrato(),e.getAltaContrato(),e.getAltaContrato());
	}
	}
}
 class Empleado {
	public Empleado( String nom,double sue,int agno ,int mes ,int dia) {
		
        nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario =new GregorianCalendar(agno,mes-1,dia);  // el mes se pone menos 1 porque a su mes empieza desde 0 y como de nosotros empieza desde 1 por eso se le resta '1
		
		//El metodo getTime() pertenece a la clase GregorianCalendar por eso es que lo puedo utilizar 
		altaContrato=calendario.getTime(); //  AQUI estoy diciendo dame la fecha del objeto calendario  y me la almacenas en altaContrato 

       
    }
     public Empleado(String nom){
        this(nom,30000,2000,01,01);
     }

			
			public String getNombre() {
				return nombre ;
			}
			
			
			public  double getSueldo() {
				return sueldo;
			}
			
			public Date getAltaContrato() {
				return altaContrato;
			}
			
			public void subirSueldo(double porcentaje) {
				double aumento = sueldo * porcentaje / 100;
				sueldo += aumento;
			}
				 private String nombre;
			private double sueldo;
			private Date altaContrato;
			
}

 class Jefatura extends Empleado{ // final class Jefatura extends Empleado con ese final le decimos que nadie puede heredar de la clase Jefatura y por eso es que la clase Director no puede heredar de la clase Jefatura
     public Jefatura(String nom,double sue, int agno ,int mes, int dia){

   super(nom,sue,agno,mes,dia);  // este llama al primer constructor de la clase padre (Empleado)

 }
    public Jefatura (String nom){
        super(nom);     // aqui este llama al segundo constructor de la clase padre (Empleado)
    }


 private double incentivo;


 public double getIncentivo() {
    return incentivo;
 }
 public void setIncentivo(double incentivo) {
    this.incentivo = incentivo;
 }

 public double getSueldo(){
    double sueldoJefe=super.getSueldo(); // aqui llamo al get sueldo de  la clase padre(mas arriba) por eso uso el super y eso sabemos que devuelve sueldo
                                 // luego le dices que sueldo jefe es igual al sueldo del empleado y luego mas abajo le sumas el incentivo

    return sueldoJefe + incentivo;  // con el return devuelves el sueldo del jefe mas el incentivo
 }
}













































/* 
public class Animal {

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

public class Perro extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

public class Gato extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla");
    }
}
 }



*/
 