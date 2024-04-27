package Domain;

import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private ReaccionIncidente reaccionIncidente;
    private Estado estado;

    public Direccion seleccionarOrigen(){
    }

    public Direccion seleccionarDestino(){
    }

    public List<Persona> seleccionarCuidadores(List<Persona> cuidadores){
    }

    public void reaccionarIncidente(Viaje viaje){
    }

    public void activar(){
        this.estado = Estado.ACTIVO;
    }



}
