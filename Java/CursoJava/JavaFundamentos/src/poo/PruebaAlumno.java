package poo;

public class PruebaAlumno {
    public static void main(String[] args) {
        StringBuilder reporte= new StringBuilder();
        reporte.append(String.format("%-5s  %-3s  %-3s  %-3s  %-3s  %-3s %-4S %n","Nombre","Edad","PC1","PC2","PC3","EF","PROM"));
        
        Alumno alumno1= new Alumno("juan", 19, 20, 19, 15, 17);
        double promedio=alumno1.calcularPromedio();
        reporte.append(String.format("%-5s    %-3s  %-3s  %-3s  %-3s  %-3s%-4.2f%n",alumno1.getNombre(),alumno1.getEdad(),alumno1.getPC1(),alumno1.getPC2(),alumno1.getPC3(),alumno1.getEF(),promedio));



      


        System.out.println(reporte);








    }
}
