package es.centro.incidencias;

/**
 * Excepcion que indica que no existe una incidencia con el ID solicitado.
 *
 * @author David Lozano Miragaya
 * @version 1.0.0
 * @since 1.0.0
 * @see GestorIncidencias#buscarPorId(String)
 */
public class IncidenciaNoEncontradaException extends Exception {

    /**
     * Construye un mensaje de error que incluye el ID no encontrado.
     *
     * @param id identificador que no se ha podido localizar
     */
    public IncidenciaNoEncontradaException(String id) {
        super("No existe ninguna incidencia con el identificador " + id + ".");
    }
}
