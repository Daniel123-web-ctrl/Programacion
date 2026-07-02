package poo;

public class ComparacionVehiculos {



    public String mostrarGanador(Automovil automovil,Motocicleta motocicleta1){
        double potenciaAutomovil=automovil.calcularPotenciaTotal();
        double rendimientoMotocicleta=motocicleta1.calcularRendimientoTotal();
        String nombreAutomovil=automovil.getCodigo();
        String nombreMotocicleta=motocicleta1.getCodigo();

        

        if (potenciaAutomovil >rendimientoMotocicleta) {
           return  String.format("El ganador es el %s Con puntaje %.2f %n",nombreAutomovil,potenciaAutomovil); 
        }else if(potenciaAutomovil < rendimientoMotocicleta){
           return String.format("El ganador es el %s Con puntaje %.2f %n",nombreMotocicleta,rendimientoMotocicleta); 
        }else{
             return String.format("EMPATE");
        }


        

    }
    

}
