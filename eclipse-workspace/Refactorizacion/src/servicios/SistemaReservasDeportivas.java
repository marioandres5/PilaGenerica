package servicios;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import entidades.Reserva;
/**
 * @author Mario Andres
 */
/**
 * Sistema de Reservas Deportivas que permite gestionar la reserva de pistas,
 * activar o desactivar la iluminación y verificar la disponibilidad.
 */
public class SistemaReservasDeportivas {

    private List<Reserva> reservas;
    GestorIluminacion data = new GestorIluminacion();
	static final int MAX_PISTAS = 10; // Máximo de pistas disponibles

    /**
     * Constructor que inicializa la lista de reservas y el estado de iluminación de las pistas.
     */
    public SistemaReservasDeportivas() {
        reservas = new ArrayList<>();
        data.iluminacion = new boolean[MAX_PISTAS];
    }

    /**
     * Reserva una pista en una fecha determinada.
     * @param idPista ID de la pista a reservar.
     * @param fecha Fecha de la reserva.
     * @param duracion Duración de la reserva en horas.
     * @return true si la reserva fue exitosa, false si la pista ya está reservada o el ID es inválido.
     */
    public boolean reservarPista(Reserva reserva) {
        if (reserva.getIdPista() < 0 || reserva.getIdPista() >= MAX_PISTAS) {
            return false;
        }
        for (Reserva r : reservas) {
            if (r.getIdPista() == reserva.getIdPista() && esFechaDisponible(reserva.getFecha(), r)) {
                return false;
            }
        }
        reservas.add(reserva);
        return true;
    }

    /**
     * Cancela una reserva existente.
     * @param idReserva ID de la reserva a cancelar.
     * @return true si la reserva fue cancelada, false si no se encontró.
     */
    public boolean cancelarReserva(int idReserva) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getIdPista() == idReserva) {
                reservas.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica la disponibilidad de una pista en una fecha y hora determinada.
     * @param idPista ID de la pista.
     * @param fecha Fecha a verificar.
     * @param hora Hora a verificar .
     * @return true si la pista está disponible, false si ya está reservada.
     */
    public boolean verificarDisponibilidad(int idPista, LocalDateTime fecha, String hora) {
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false;
        }
        for (Reserva r : reservas) {
            if (r.getIdPista() == idPista && esFechaDisponible(fecha, r)) {
                return false;
            }
        }
        return true;
    }

	private boolean esFechaDisponible(LocalDateTime fecha, Reserva r) {
		return r.getFecha().equals(fecha);
	}
}
