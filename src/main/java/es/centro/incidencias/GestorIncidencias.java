package es.centro.incidencias;

import java.util.List;

/**
 * Proporciona las consultas disponibles sobre el listado de incidencias.
 * Los registros iniciales se crean en el constructor.
 *
 * @author David Lozano Miragaya
 * @version 1.0.0
 * @since 1.0.0
 * @see Incidencia
 */
public final class GestorIncidencias {

    private final List<Incidencia> incidencias;

    /**
     * Crea un gestor con cuatro incidencias de ejemplo.
     */
    public GestorIncidencias() {
        incidencias = List.of(
                new Incidencia("INC-001", "No se puede iniciar sesión", "alta", true),
                new Incidencia("INC-002", "Actualizar el navegador", "media", false),
                new Incidencia("INC-003", "Impresora sin conexión", "baja", true),
                new Incidencia("INC-004", "Fallo de red en el aula", "alta", true)
        );
    }

    /**
     * Obtiene todas las incidencias registradas.
     *
     * @return listado completo de incidencias
     */
    public List<Incidencia> listar() {
        return incidencias;
    }

    /**
     * Filtra el listado para mostrar solo las incidencias abiertas.
     *
     * @return incidencias que siguen abiertas
     */
    public List<Incidencia> listarAbiertas() {
        return incidencias.stream()
                .filter(Incidencia::isAbierta)
                .toList();
    }

    /**
     * Busca incidencias cuyo ID o titulo contenga el texto indicado,
     * sin distinguir mayusculas de minusculas.
     *
     * @param texto texto utilizado como criterio de busqueda
     * @return incidencias que coinciden con el criterio
     * @see Incidencia#coincideCon(String)
     */
    public List<Incidencia> buscar(String texto) {
        return incidencias.stream()
                .filter(incidencia -> incidencia.coincideCon(texto))
                .toList();
    }

    /**
     * Localiza una incidencia por su identificador completo.
     *
     * @param id identificador que se desea consultar
     * @return incidencia que tiene el identificador indicado
     * @throws IncidenciaNoEncontradaException si no existe ese identificador
     * @see IncidenciaNoEncontradaException
     */
    public Incidencia buscarPorId(String id) throws IncidenciaNoEncontradaException {
        return incidencias.stream()
                .filter(incidencia -> incidencia.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new IncidenciaNoEncontradaException(id));
    }

    /**
     * Consulta antigua por ID, mantenida por compatibilidad.
     * No se recomienda usarla porque devuelve {@code null} cuando no existe
     * la incidencia y obliga a comprobar ese resultado manualmente.
     * Utiliza {@link #buscarPorId(String)} en su lugar, ya que informa
     * del error mediante {@link IncidenciaNoEncontradaException}.
     *
     * @param id identificador de la incidencia
     * @return incidencia encontrada o {@code null} si no existe
     * @deprecated desde 1.0.0; sustituir por {@link #buscarPorId(String)}
     * @see #buscarPorId(String)
     */
    @Deprecated(since = "1.0.0", forRemoval = false)
    public Incidencia obtenerIncidencia(String id) {
        try {
            return buscarPorId(id);
        } catch (IncidenciaNoEncontradaException excepcion) {
            return null;
        }
    }
}
