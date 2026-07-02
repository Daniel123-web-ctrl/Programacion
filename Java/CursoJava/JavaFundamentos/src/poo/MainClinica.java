package poo;

public class MainClinica {

     public static void main(String[] args) {
          StringBuilder reporte =new StringBuilder();

        
        Clinica clinica1=new Clinica("P001", "Juan ", 65,450, 8, false);
        Clinica clinica2=new Clinica("P002", "Maria ", 30,300, 4, false);
        Clinica clinica3=new Clinica("P003", "Carlos ", 70,600, 12, false);
        clinica1.setSeguroMedico("no");
        clinica2.setSeguroMedico("si");
        clinica3.setSeguroMedico("si");

        reporte.append(String.format("%-8s%-8s%-8s%-8s%-10s%-8s%-8s%-8s%-8s%-8s%n",
        "CODIGO","NOMBRE","EDAD","DIAS","COSTO/DIA","BASE","DESC.","IMP.","TOTAL","CATEGORIA"));
       reporte.append(String.format("%-8s%-8s%-8d%-8d%-10.2f%-8.2f%-8.2f%-8.2f%-8.2f%-8s%n",
       clinica1.getCodigo(),clinica1.getNombre(),clinica1.getEdad(),clinica1.getNumeroDiasHospitalizacion(),
       clinica1.getCostoDiasHospitalizacion(),clinica1.calcularCostoBaseHospitalizacion(),clinica1.calcularDescuentoPorSeguro(),
       clinica1.calcularImpuesto(),clinica1.calcularTotalPagar(),
       clinica1.verificarCategoria()));

       reporte.append(String.format("%-8s%-8s%-8d%-8d%-10.2f%-8.2f%-8.2f%-8.2f%-8.2f%-8s%n",
       clinica2.getCodigo(),clinica2.getNombre(),clinica2.getEdad(),clinica2.getNumeroDiasHospitalizacion(),
       clinica2.getCostoDiasHospitalizacion(),clinica2.calcularCostoBaseHospitalizacion(),clinica2.calcularDescuentoPorSeguro(),
       clinica2.calcularImpuesto(),clinica2.calcularTotalPagar(),
       clinica2.verificarCategoria()));
       reporte.append(String.format("%-8s%-8s%-8d%-8d%-10.2f%-8.2f%-8.2f%-8.2f%-8.2f%-8s%n",
       clinica3.getCodigo(),clinica3.getNombre(),clinica3.getEdad(),clinica3.getNumeroDiasHospitalizacion(),
       clinica3.getCostoDiasHospitalizacion(),clinica3.calcularCostoBaseHospitalizacion(),clinica3.calcularDescuentoPorSeguro(),
       clinica3.calcularImpuesto(),clinica3.calcularTotalPagar(),
       clinica3.verificarCategoria()));

       

        System.out.println(reporte);


     }

}
