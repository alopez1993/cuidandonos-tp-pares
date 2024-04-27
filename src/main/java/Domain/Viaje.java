package Domain;

import java.util.List;

public class Viaje {
    private Direccion origen;
    private Direccion destino;
    private Integer tiempoDemora;
    private Persona transeunte;
    private List<Persona> cuidadores;

    public void describirViaje(Direccion origen, Direccion destino,
                               Persona transeunte, List<Persona> cuidadores, Integer tiempoDemora){
        this.origen = origen;
        this.destino = destino;
        this.transeunte = transeunte;
        this.cuidadores = cuidadores;
        this.tiempoDemora = tiempoDemora;
    }
}
