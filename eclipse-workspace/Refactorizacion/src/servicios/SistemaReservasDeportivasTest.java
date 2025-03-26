package servicios;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Mario Andres
 */
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para el sistema de reservas deportivas.
 * Esta clase realiza pruebas unitarias sobre el sistema de reservas de pistas deportivas
 * utilizando el marco de pruebas JUnit 5.
 */
public class SistemaReservasDeportivasTest {

    /**
     * Instancia del sistema de reservas deportivas.
     */
    static SistemaReservasDeportivas sistemasReservas;

    /**
     * Configura la instancia del sistema de reservas antes de ejecutar cualquier prueba.
     * Este método se ejecuta una vez antes de las pruebas debido a la anotación @BeforeAll.
     * 
     * @throws Exception Si ocurre un error durante la configuración.
     */
    @BeforeAll
    static void serUpBeforeClass() throws Exception {
        sistemasReservas = new SistemaReservasDeportivas();
    }

    /**
     * Prueba para verificar el funcionamiento de la reserva de una pista.
     * Este método prueba que las reservas puedan realizarse correctamente en
     * diferentes condiciones.
     * 
     * Se verifican los siguientes casos:
     * <ul>
     * <li>Reserva exitosa de una pista disponible.</li>
     * <li>Reserva fallida debido a que la pista ya está reservada.</li>
     * <li>Reserva exitosa de una pista no reservada previamente.</li>
     * <li>Reserva fallida debido a una pista inexistente.</li>
     * </ul>
     */
    @Test
    void reservarPista() {
        assertTrue(sistemasReservas.reservarPista(1,"21-03-2025 12:00",60));
        assertFalse(sistemasReservas.reservarPista(1,"21-03-2025 12:00",60));
        assertTrue(sistemasReservas.reservarPista(3,"21-03-2025 12:00",60));
        assertFalse(sistemasReservas.reservarPista(10,"21-03-2025 12:00",60));
    }

    /**
     * Prueba para verificar el funcionamiento de la cancelación de una reserva de pista.
     * Este método prueba que las cancelaciones de reservas se realicen correctamente en
     * diferentes escenarios.
     * 
     * Se verifican los siguientes casos:
     * <ul>
     * <li>Cancelación exitosa de una reserva existente.</li>
     * <li>Cancelación fallida debido a que la reserva ya fue cancelada.</li>
     * <li>Cancelación exitosa de una reserva en otra pista.</li>
     * <li>Cancelación fallida de una reserva para una pista inexistente.</li>
     * </ul>
     */
    @Test
    void cancelarPista() {
        assertTrue(sistemasReservas.cancelarReserva(1));
        assertFalse(sistemasReservas.cancelarReserva(1));
        assertTrue(sistemasReservas.cancelarReserva(3));
        assertFalse(sistemasReservas.cancelarReserva(10));
    }
}
