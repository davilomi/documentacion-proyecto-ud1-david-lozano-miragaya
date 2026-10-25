package es.centro.incidencias;

import java.util.Locale;

/**
 * Representa una incidencia de soporte del centro educativo.
 * Conserva su identificador, titulo, prioridad y estado.
 *
 * @author David Lozano Miragaya
 * @version 1.0.0
 * @since 1.0.0
 */
public final class Incidencia {

    private final String id;
    private final String titulo;
    private final String prioridad;
    private final boolean abierta;

    /**
     * Crea una incidencia con los datos indicados.
     *
     * @param id identificador de la incidencia
     * @param titulo descripcion breve del problema
     * @param prioridad nivel de prioridad
     * @param abierta {@code true} si la incidencia sigue abierta
     */
    public Incidencia(String id, String titulo, String prioridad, boolean abierta) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.abierta = abierta;
    }

    /**
     * Devuelve el identificador de la incidencia.
     *
     * @return identificador de la incidencia
     */
    public String getId() {
        return id;
    }

    /**
     * Devuelve el titulo de la incidencia.
     *
     * @return titulo de la incidencia
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve la prioridad de la incidencia.
     *
     * @return prioridad asignada a la incidencia
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Indica si la incidencia sigue abierta.
     *
     * @return {@code true} si la incidencia esta abierta; {@code false} si no
     */
    public boolean isAbierta() {
        return abierta;
    }

    /**
     * Comprueba si el ID o el titulo contiene el texto buscado.
     * La comparacion no distingue mayusculas de minusculas.
     *
     * @param texto criterio de busqueda
     * @return {@code true} cuando coincide el ID o el titulo
     */
    public boolean coincideCon(String texto) {
        String criterio = texto.toLowerCase(Locale.ROOT);
        return id.toLowerCase(Locale.ROOT).contains(criterio)
                || titulo.toLowerCase(Locale.ROOT).contains(criterio);
    }

}
