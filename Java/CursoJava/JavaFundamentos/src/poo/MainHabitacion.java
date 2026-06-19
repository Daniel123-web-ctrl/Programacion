package poo;

public class MainHabitacion {
    public static void main(String[] args) {
        StringBuilder reporte =new StringBuilder();


        Habitacion h1=new Habitacion("H101", "Suite", 5, 250, true);
        Habitacion h2 =new Habitacion("H102", "Simple", 12,90 , false);
        Habitacion h3=new Habitacion("H103", "Doble", 3, 180, true);


      reporte.append(String.format("%-2s     %-2s   %-2s   %-2s    %-9s %-11s %-12s %-13s %-6s %n","N°","TIPO°","DIAS","PRECIO","BASE","IMPUESTO","DESCUENTO","TOTAL","CATEGORIA" ));
      reporte.append(String.format("%-2s   %-2s   %-.0f    %-9.2f  %-9.2f %-11.2f %-12.2f%-14.2f %-8s %n",h1.getNumero(),h1.getTipo(),h1.getDiasHospedaje(),h1.getPrecioDia(),h1.calcularCostoBase(),h1.calcularImpuesto(),h1.calcularDescuento(),h1.calcularTotal(),h1.obtenerCategoria()));
     reporte.append(String.format( "%-2s   %-5s  %-5.0f  %-8.2f  %-9.2f %-11.2f %-11.2f %-13.2f  %-8s %n",h2.getNumero(),h2.getTipo(),h2.getDiasHospedaje(),h2.getPrecioDia(),h2.calcularCostoBase(),h2.calcularImpuesto(),h2.calcularDescuento(),h2.calcularTotal(),h2.obtenerCategoria()));
     reporte.append(String.format( "%-2s   %-2s   %-2.0f     %-9.2f %-9.2f %-11.2f %-11.2f %-13.2f  %-8s %n",h3.getNumero(),h3.getTipo(),h3.getDiasHospedaje(),h3.getPrecioDia(),h3.calcularCostoBase(),h3.calcularImpuesto(),h3.calcularDescuento(),h3.calcularTotal(),h3.obtenerCategoria()));


       

        System.out.println(reporte);
    }

}
