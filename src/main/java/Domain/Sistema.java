package Domain;

import java.util.List;

public class Sistema {
    private List<Persona> cuidadores;
    private List<Viaje> viajesActivos;

    public Viaje solicitarCuidador(Persona transeunte) {
        Viaje viaje = new Viaje();
        viaje.describirViaje(transeunte.seleccionarOrigen(), transeunte.seleccionarDestino(),
                transeunte, transeunte.seleccionarCuidadores(cuidadores), 0);
        transeunte.activar();
        return viaje;
    }

    public Viaje confirmarCuidador(Viaje viaje){
        viaje.cuidadores = this.notificarCuidadores(viaje.cuidadores);
        return viaje;
    }

    public Viaje calcularTiempoDemora(Viaje viaje){
        // Calculo utilizando origen y destino.
        // notifico a los cuidadores.
        return viaje; //Retorno viaje con tiempoDemora calculado.
    }

    public void reaccionarIncidente(Viaje viaje){
        viaje.transeunte.reaccionarIncidente(viaje);
    }

    //Transeúnte avisa "llegué bien"
    public void terminarViaje(Viaje viaje){
        //Elimina el viaje de los viajes activos y habilita las notificaciones
    }




}
