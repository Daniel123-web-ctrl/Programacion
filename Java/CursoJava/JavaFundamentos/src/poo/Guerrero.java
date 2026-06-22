package poo;

public class Guerrero {
    private String codigo;
    private String nombre;
    private int nivel;
private int puntosVida;
private int fuerza;
private boolean poseeEspada;


public Guerrero(String codigo,String nombre,int nivel,int puntosVida,int fuerza,boolean poseeEspada){
    this.codigo=codigo;
    this.nombre=nombre;
    this.nivel=nivel;
    this.puntosVida=puntosVida;
    this.fuerza=fuerza;
    this.poseeEspada=poseeEspada;

}
public double calcularDanioBase(){
    return nivel*fuerza;
}
public double calcularBonificacionArma(){
    if (poseeEspada==true) {
        return 0.2*calcularDanioBase();
    }else{
        return 0;
    }
}

public double calcularDanioTotal(){
    return calcularDanioBase()+calcularBonificacionArma();
}
 
public String determinarCategoria(){
    if (calcularDanioTotal()>250) {
        return "Experto";
        
    }else if(calcularDanioTotal()>100){
        return "Intermedio";

    }else{
        return "Novato";

    }
}
public boolean puedeEntrarTorneo(){
    if (nivel >10) {
        return true;
        
    }else {
        return false;
    }
}

public String mostrarDatos(){
    return String.format(
        "Codigo                :%s%n"+
        "Nombre                :%s%n"+
        "Nivel                 :%d%n"+
        "Puntos de Vida        :%d%n"+
        "Fuerza                :%d%n"+
        "Posee Espada          :%b%n"+
        "Daño Base             :%.2f%n"+
        "Bonificacion          :%.2f%n"+
        "Daño  Total           :%.2f%n"+
        "Categoria             :%s%n"+
        "Puede Entrar Torneo   :%b%n",
    codigo,nombre,nivel,puntosVida,fuerza,poseeEspada,
    calcularDanioBase(),calcularBonificacionArma(),
    calcularDanioTotal(),determinarCategoria(),
    puedeEntrarTorneo());



    
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
    
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public int getPuntosVida() {
        return puntosVida;
    }
    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }
    
    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    public boolean isPoseeEspada() {
        if (poseeEspada) {
            return true;
        }else{
            return false;

        }
    }
    public void setPoseeEspada(String poseeEspada) {
        if(poseeEspada.equalsIgnoreCase("si")) this.poseeEspada=true;
        else this.poseeEspada=false;
    }

}
