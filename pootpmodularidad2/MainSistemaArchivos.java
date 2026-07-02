package pootpmodularidad2;

import java.time.LocalDateTime;

public class MainSistemaArchivos {
 public static void main(String[] args) {

          // Crear un archivo
        Archivo archivo1 = new Archivo("tarea.pdf",LocalDateTime.of(2026, 6, 30, 18, 0),    2500);

        // Mostrar sus datos
        System.out.println("Nombre: " + archivo1.getNombre());
        System.out.println("Fecha: " + archivo1.getFechaHoraCreacion());
        System.out.println("Tamaño: " + archivo1.getTamaño());

        System.out.println("-------------------------");

        // Crear una carpeta
       Carpeta carpeta1 = new Carpeta(
    "Documentos",
    LocalDateTime.of(2026, 6, 30, 18, 10),
    null
);

        // Mostrar sus datos
        System.out.println("Nombre: " + carpeta1.getNombre());
        System.out.println("Fecha: " + carpeta1.getFechaHoraCreacion());

        System.out.println("-------------------------");

        // Crear el sistema de archivos
        SistemaArchivos sistema = new SistemaArchivos();

        System.out.println("Sistema creado correctamente.");

    }

}
