package poosemana12;

import java.io.PrintWriter;

public class UsoEstudiante {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();

        try {

            PrintWriter archivo = new PrintWriter("reporte.html");

            archivo.println("<!DOCTYPE html>");                                //es una declaración que le indica al navegador que el archivo que va a leer es un documento HTML."
            archivo.println("<html>"); 

            archivo.println("<head>");
            
            archivo.println("<title>semana 12 PA</title>");
            archivo.println("</head>");

            archivo.println("<body>");

            archivo.println("<center>");

            archivo.println("<h1>REPORTE DEL ESTUDIANTE</h1>");

           
            archivo.println("<img src='imagen.png' width='220px'><br><br>");

           

            archivo.println("<h2>Datos del Estudiante</h2>");

            archivo.println("<p><b>Código:</b> " + estudiante1.getCodigo() + "</p>");
            archivo.println("<p><b>Nombre:</b> " + estudiante1.getNombre() + "</p>");
            archivo.println("<p><b>Carrera:</b> " + estudiante1.getCarrera() + "</p>");
            archivo.println("<p><b>Ciclo:</b> " + estudiante1.getCiclo() + "</p>");
            archivo.println("<p><b>Promedio:</b> " + estudiante1.getPromedio() + "</p>");

            if (estudiante1.isBecado()) {
                archivo.println("<p><b>Becado:</b> Sí</p>");
            } else {
                archivo.println("<p><b>Becado:</b> No</p>");
            }

            archivo.println("</center>");

            archivo.println("</body>");
            archivo.println("</html>");

            archivo.close();

            System.out.println("Reporte generado correctamente.");

        } catch (Exception e) {

            System.out.println("Error al generar el reporte.");
        }

    }
}