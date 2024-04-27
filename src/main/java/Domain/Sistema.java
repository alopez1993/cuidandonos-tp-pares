package Domain;

import java.util.List;

public class Sistema {
    private List<Persona> cuidadores;
    private List<Viaje> viajesActivos;

    public Viaje solicitarCuidador(Persona transeunte) {
        Viaje viaje = new Viaje();
        viaje.describirViaje(transeunte.seleccionarOrigen(), transeunte.seleccionarDestino(),
                transeunte, transeunte.seleccionarCuidadores(cuidadores),
                0, transeunte.seleccionarReaccion());
        transeunte.activar();
        return viaje;
    }

    //Transeúnte presiona "confirmar cuidadores"
    public Viaje notificarViajeCuidadores(Viaje viaje){
        //Se envía viaje a todos los cuidadores;
        //Si al menos uno responde se envía el viaje con los cuidadores que aceptaron como atributo.
        return viaje;
    }

    //Transeúnte presiona "comenzar"
    public Viaje calcularTiempoDemora(Viaje viaje){
        // Calculo utilizando origen y destino (Llamada a API de Google).
        // Notifico a los cuidadores.
        // Agrego viajes a la lista de viajesActivos.
        return viaje; //Retorno viaje con tiempoDemora calculado.
    }

    public void reaccionarIncidente(Viaje viaje){
        viaje.reaccionarIncidente();
    }

    //Transeúnte avisa "llegué bien"
    public void finalizarViaje(Viaje viaje){
        //Elimina el viaje de los viajes activos y habilita las notificaciones
    }




}
