package poo;

public class InstitutoTecnologico {
    public static void main(String[] args) {
        
         

       
        Estudiante  estudiante1= new Estudiante("Juan",34,"1234567", "Ing de software", 20);
        Estudiante  estudiante2= new Estudiante("Jhan",43,"89236", "Ing de sistemas", 19);
        Estudiante  estudiante3= new Estudiante("Pedro",53,"82936", "Medicina", 17);

        System.out.println(estudiante1.motrarDatos());
        System.out.println(estudiante2.motrarDatos());
        System.out.println(estudiante3.motrarDatos());
        System.out.printf("Total de Estudiantes registrados %d%n",Estudiante.contadorEstudiantes());






    }

}
