package Domain;

import java.util.List;

public class Viaje {
    private Direccion origen;
    private Direccion destino;
    private Integer tiempoDemora;
    private Persona transeunte;
    private List<Persona> cuidadores;
    private ReaccionIncidente reaccionIncidente;

    public void describirViaje(Direccion origen, Direccion destino,
                               Persona transeunte, List<Persona> cuidadores,
                               Integer tiempoDemora, ReaccionIncidente reaccionIncidente){
        this.origen = origen;
        this.destino = destino;
        this.transeunte = transeunte;
        this.cuidadores = cuidadores;
        this.tiempoDemora = tiempoDemora;
    }

    public void reaccionarIncidente(){
        this.reaccionIncidente.reaccionar();
    }
}
