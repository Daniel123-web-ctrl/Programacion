package poo;

public class Motocicleta {
private String codigo;
 

    private String marca;
    private int cilindrada;
    private double velocidadMaxima;
    private double peso;
    private boolean poseeNitro;


    public Motocicleta(String codigo,String marca,int cilindrada,double velocidadMaxima,double peso,boolean poseeNitro){
        this.codigo=codigo;
        this.marca=marca;
        this.cilindrada=cilindrada;
        this.velocidadMaxima=velocidadMaxima;
        this.peso=peso;
        this.poseeNitro=poseeNitro;

    }
public double calcularRendimientoBase(){
    return cilindrada*velocidadMaxima;
}

public double calcularBonificacionTurbo(){
    if (poseeNitro) {
        return calcularRendimientoBase()*0.3;
    }else{
        return 0;
    }
}

public double calcularRendimientoTotal(){
    return calcularRendimientoBase() + calcularBonificacionTurbo();
}

public  String determinarCategoria (){
   if (calcularRendimientoTotal() >70000) {
     return "Super Deportivo";
   }else if(calcularRendimientoTotal() >45000){
       return "Deportivo";
   }else{
    return "Convencional";
   }
}


 public boolean puedeParticiparCarrera(){
    if(peso <= 220){
    return true;
    }else{
        return false;
    }

 }

public String mostrarDatos(){

        return String.format(
                        "Codigo                     :%s%n"+
                        "Marca                      :%s%n"+
                        "Cilindrada                 :%d%n"+
                    "Velocidad Maxima           :%.2f%n"+
                    "Caballos de fuerza         :%.2f%n"+
                    "Posee Nitro                :%b%n"+
                    "Tiene una categoria de     :%s%n"
                    ,codigo,marca,cilindrada,velocidadMaxima,peso,poseeNitro,determinarCategoria());
    }

   public String getCodigo() {
    return codigo;
}
public void setCodigo(String codigo) {
    this.codigo = codigo;
}
}
