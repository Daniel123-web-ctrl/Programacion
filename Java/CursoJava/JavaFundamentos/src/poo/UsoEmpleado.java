package poo;
import java.util.Date;
import java.util.GregorianCalendar;
public class UsoEmpleado {
    public static void main(String[] args) {
         Empleado [] misEmpleados =new Empleado[3];  //  esto es un array de tipo Empleado				
		//String [] misEmpleados=new Emppleado [3]  //  esto es un array de tipo String
		
		
	  misEmpleados[0]=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
	  misEmpleados[1]=new Empleado("Ana Lopez", 95000, 1995, 06, 2);
	  misEmpleados[2]=new Empleado("Maria Martin", 105000, 2002, 03, 17); 

 for (Empleado e : misEmpleados) {
		e.setsubirSueldo(5);
	}
	 for (Empleado e : misEmpleados) {
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
			
			
			public double getSueldo() {
				return sueldo;
			}
			
			public Date getAltaContrato() {
				return altaContrato;
			}
			
			
			 public void setsubirSueldo(double porcentaje ) {      //setter
				 double aumento=sueldo * porcentaje /100;
				 sueldo+=aumento;
			 }
				 private String nombre;
			private double sueldo;
			private Date altaContrato;
			
}
 class Jefatura extends Empleado{

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
                                 // luego le dices que sueldo jefe es igual al sueldo del empleado y luego

    return sueldoJefe + incentivo;  // con el return devuelves el sueldo del jefe mas el incentivo
 }

}
