package poo;

public class Laptop extends Dispositivo {

    private int  memoriaRAM;

   public Laptop(String marca, String modelo, double precio, int stock, int memoriaRAM) {
    super(marca, modelo, precio, stock); 
    this.memoriaRAM = memoriaRAM;
}

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }
    
    @Override 

    public String consultarInformacion(){
        return  super.consultarInformacion() + String.format(" %nMemoriaRAM %d GB",getMemoriaRAM() );
    }





}