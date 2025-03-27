package servicios;

public class GestorIluminacion {
	public boolean[] iluminacion;

	public GestorIluminacion() {
	}

	/**
	 * Activa la iluminación de una pista específica.
	 * @param sistemaReservasDeportivas TODO
	 * @param idPista ID de la pista.
	 * @return true si la iluminación fue activada, false si el ID es inválido.
	 */
	public boolean encenderLuces(SistemaReservasDeportivas sistemaReservasDeportivas, int idPista) {
	    if (idPista < 0 || idPista >= SistemaReservasDeportivas.MAX_PISTAS) {
	        return false;
	    }
	    iluminacion[idPista] = true;
	    return true;
	}

	/**
	 * Desactiva la iluminación de una pista específica.
	 * @param sistemaReservasDeportivas TODO
	 * @param idPista ID de la pista.
	 * @return true si la iluminación fue desactivada, false si el ID es inválido.
	 */
	public boolean apagarLuces(SistemaReservasDeportivas sistemaReservasDeportivas, int idPista) {
	    if (idPista < 0 || idPista >= SistemaReservasDeportivas.MAX_PISTAS) {
	        return false;
	    }
	    iluminacion[idPista] = false;
	    return true;
	}
}