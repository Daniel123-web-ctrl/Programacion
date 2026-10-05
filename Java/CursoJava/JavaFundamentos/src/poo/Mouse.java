package poo;

public class Mouse  extends  Dispositivo{

    private String tipoConexion;



    public Mouse(String marca, String modelo, double precio, int stock,String tipoConexion ){
        super(marca, modelo, precio, stock);

        this.tipoConexion=tipoConexion;


    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    
    @Override
    public String consultarInformacion() {
        
        return super.consultarInformacion() + String.format(" %nTipo de Conexion %s ",getTipoConexion() );
    }





}
