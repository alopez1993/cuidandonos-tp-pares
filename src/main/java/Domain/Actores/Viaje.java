package Domain.Actores;

import Domain.Demoras.TipoDemora;
import Domain.Incidentes.ReaccionIncidente;
import java.util.List;

public class Viaje {
    private Direccion ubicacion;
    private List<Direccion> destinos;
    private Persona transeunte;
    private List<Persona> cuidadores;
    private ReaccionIncidente reaccionIncidente;
    private TipoDemora tipoDemora;
    private List<Integer> demoras;

    public void reaccionarIncidente(){
        this.reaccionIncidente.reaccionar();
    }

    public void calcularDemoras(){
        this.tipoDemora.calcularDemoras(dict. this);
    }
}

