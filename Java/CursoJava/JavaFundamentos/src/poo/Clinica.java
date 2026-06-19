package poo;

public class Clinica {
    private String codigo;
    private String nombre;
    private int edad;
    private double costoDiasHospitalizacion;
    private int numeroDiasHospitalizacion;
    private boolean seguroMedico;

public Clinica(String codigo,String nombre,int edad,double costoDiasHospitalizacion,int numeroDiasHospitalizacion,boolean seguroMedico){
    this.codigo=codigo;
    this.nombre=nombre;
    this.edad=edad;
    this.costoDiasHospitalizacion=costoDiasHospitalizacion;
    this.numeroDiasHospitalizacion=numeroDiasHospitalizacion;
    this.seguroMedico=seguroMedico;
}
public double calcularCostoBaseHospitalizacion(){
    return costoDiasHospitalizacion*numeroDiasHospitalizacion;
}
public double calcularDescuentoPorSeguro(){
    if ( seguroMedico) {
        return 0.15*calcularCostoBaseHospitalizacion();
    }else{
        return 0;
    }
}
public double  calcularImpuesto(){
    return 0.1*calcularCostoBaseHospitalizacion();
 }

 public double calcularTotalPagar(){
    return calcularCostoBaseHospitalizacion() +calcularImpuesto()-calcularDescuentoPorSeguro();
 }
 public String verificarCategoria(){
    if (calcularTotalPagar()>200) {
        return "premium";
        
    }else if(calcularTotalPagar()>100){
        return "Preferencial";

    }else{
        return "Regular";
    }
 }
 public boolean esAdultoMayor(){
    if (edad >=60) {
        return true;
        
    }else{
        return  false;
    }
 }

public String mostrarDatos(){

    return String.format(
        "Codigo del paciente : %s%n" +
        "Nombre              : %s%n"+
        "Edad                :%d  anios %n"+
        "Dias Hospitalizados :%d%n"+
        "Costo por dia       :%.2f%n"+
        "Costo Base          :%.2f%n"+
        "Descuento           :%.2f%n"+
        "Impuesto            :%.2f%n"+
        "Total a pagar       :%.2f%n"+
        "Categoria           :%s%n"+
        "Adulto mayor        :%b%n ",
         codigo,nombre,edad,numeroDiasHospitalizacion,
         costoDiasHospitalizacion,
         calcularCostoBaseHospitalizacion(),
         calcularDescuentoPorSeguro(),
         calcularImpuesto(),
         calcularTotalPagar()
         ,verificarCategoria(),
         esAdultoMayor());

}
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int  getNumeroDiasHospitalizacion() {
        return numeroDiasHospitalizacion;
    }
    public void setNumeroDiasHospitalizacion(int numeroDiasHospitalizacion) {
        this.numeroDiasHospitalizacion = numeroDiasHospitalizacion;
    }
    
    public double getCostoDiasHospitalizacion() {
        return costoDiasHospitalizacion;
    }
    public void setCostoDiasHospitalizacion(double costoDiasHospitalizacion) {
        this.costoDiasHospitalizacion = costoDiasHospitalizacion;
    }
    
    public String isSeguroMedico() {
        if (seguroMedico) return "Si tiene  seguro medico";
        else  return "No tiene seguro medico";
        
    }
    public void setSeguroMedico(String seguroMedico) {
        if (seguroMedico.equalsIgnoreCase("si"))  this.seguroMedico=true;
        else this.seguroMedico=false;
    }



}
