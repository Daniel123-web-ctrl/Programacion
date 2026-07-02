package poo;

public class Automovil {
    private String codigo;
    private String marca;
    private String modelo;


    
    
    private double velocidadMaxima;
    private double caballoFuerza;
    private boolean poseeTurbo;


    public Automovil(String codigo,String marca,String modelo,double velocidadMaxima,double caballoFuerza,boolean poseeTurbo){
        this.codigo=codigo;
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadMaxima=velocidadMaxima;
        this.caballoFuerza=caballoFuerza;
        this.poseeTurbo=poseeTurbo;

    }
public double calcularPotenciaBase(){
    return caballoFuerza*velocidadMaxima;
}

public double calcularBonificacionTurbo(){
    if (poseeTurbo) {
        return calcularPotenciaBase()*0.35;
    }else{
        return 0;
    }
}

public double calcularPotenciaTotal(){
    return calcularPotenciaBase() + calcularBonificacionTurbo();
}

public  String determinarCategoria (){
   if (calcularPotenciaTotal() >9000) {
     return "Super Deportivo";
   }else if(calcularPotenciaTotal() >500){
       return "Deportivo";
   }else{
    return "Convencional";
   }
}


 public boolean puedeCompetir(){
    if(velocidadMaxima >=220){
    return true;
    }else{
        return false;
    }

 }

public String mostrarDatos(){

        return String.format(
                    "codigo                         :%s%n"+
                    "marca                          :%s%n"+
                    "modelo                         :%s%n"+
                    "Velocidad Maxima               :%.2f%n"+
                    "Caballos de fuerza             :%.2f%n"+
                    "Posee Turbo                    :%b%n"+
                    "La categoria del automovil es  :%s%n",codigo,marca,modelo,velocidadMaxima,
                caballoFuerza,poseeTurbo,determinarCategoria());
    }
public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


}
