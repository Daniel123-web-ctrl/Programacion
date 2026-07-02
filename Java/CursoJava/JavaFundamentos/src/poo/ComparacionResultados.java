package poo;

public class ComparacionResultados {

    public void mostrar(Piloto piloto1,Robot robot1){

       piloto1.calcularPuntajeTotal();
       robot1.calcularAtaqueTotal();
        piloto1.getNombre();
        robot1.getModelo();
    }
       public String mostrarGanador(Piloto piloto1,Robot robot1){
        double puntajePiloto=piloto1.calcularPuntajeTotal();
       double ataqueRobot=robot1.calcularAtaqueTotal();
        String nombrePiloto=piloto1.getNombre();
        String modeloRobot=robot1.getModelo();
        if (puntajePiloto > ataqueRobot) {
            return String.format("EL ganador es %s con puntaje %.2f %n", nombrePiloto,puntajePiloto);
        }else if(puntajePiloto < ataqueRobot){
            return String.format("EL ganador es %s con puntaje %.2f%n ", modeloRobot,ataqueRobot);
        }else{
            return "empate";
        }

       }
    }


