package entidades;

import java.time.LocalDateTime;

/**
 * @author Mario Andres
 */
/**
 * Representa una reserva de una pista deportiva en una fecha determinada y con una duración específica.
 */
public class Reserva {
    private int idPista;
    private LocalDateTime fecha;
    private int duracion;

    /**
     * Constructor para crear una nueva reserva.
     *
     * @param idPista  Identificador de la pista reservada.
     * @param fecha    Fecha de la reserva en formato "YYYY-MM-DD".
     * @param duracion Duración de la reserva en minutos.
     */
    public Reserva(int idPista, LocalDateTime fecha, int duracion) {
        this.idPista = idPista;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    /**
     * Obtiene el identificador de la pista reservada.
     *
     * @return ID de la pista.
     */
    public int getIdPista() {
        return idPista;
    }

    /**
     * Obtiene la fecha de la reserva.
     *
     * @return Fecha de la reserva en formato "YYYY-MM-DD".
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Obtiene la duración de la reserva en minutos.
     *
     * @return Duración de la reserva.
     */
    public int getDuracion() {
        return duracion;
    }
}
