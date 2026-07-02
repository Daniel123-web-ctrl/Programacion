package poo;

public class MainCurso {
    public static void main(String[] args) {
        StringBuilder reporte=new StringBuilder();
         Curso curso1 =new Curso("U25247183", "Programacion", 5, 20, 120);
         Curso curso2=new Curso("U24232323", "Base de Datos", 4, 35, 100);
         Curso curso3=new Curso("U23247432", "Fisica", 3, 8, 90);

         reporte.append(String.format("%-12s%-15s%-10s%-10s%-13s%-11s%-12s%-6s%n",
         "CODIGO","CURSO","CREDITOS","ALUMNOS","COSTO/CRED.","ING.TOTAL","ING.ALUMNO","DEMANDA"));


         reporte.append(String.format("%-12s%-15s%-10d%-10d%-13.2f%-11.2f%-12.2f%-5s%n",
         curso1.getCodigo(),curso1.getNombre(),curso1.getNumCreditos(),curso1.getCantidadAlumnos(),curso1.getCostoCredito(),
         curso1.calcularIngresoTotal(),curso1.calcularPromedioIngresosAlumno(),curso1.determinarDemandaCurso()));

         reporte.append(String.format("%-12s%-15s%-10d%-10d%-13.2f%-11.2f%-12.2f%-6s%n",
         curso2.getCodigo(),curso2.getNombre(),curso2.getNumCreditos(),curso2.getCantidadAlumnos(),curso2.getCostoCredito(),
         curso2.calcularIngresoTotal(),curso2.calcularPromedioIngresosAlumno(),curso2.determinarDemandaCurso()));

         reporte.append(String.format("%-12s%-15s%-10d%-10d%-13.2f%-11.2f%-12.2f%-6s%n",
         curso3.getCodigo(),curso3.getNombre(),curso3.getNumCreditos(),curso3.getCantidadAlumnos(),curso3.getCostoCredito(),
         curso3.calcularIngresoTotal(),curso3.calcularPromedioIngresosAlumno(),curso3.determinarDemandaCurso()));
         

         System.out.println(reporte);













    }

}
