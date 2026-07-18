package model;
/**
 * REUTILIZAR Y MEJORAR ESTA CLASE
 * 
 * Interfaz que define el comportamiento de todas las entidades
 * que pueden ser registradas dentro del sistema.
 * 
 * Esta interfaz actua como contrato.
 * Las clases que implementan definen el metodo mostrarResumen()
 * @author gzapa
 */
public interface Registrable {
    /**
     * Muestra un resumen de la informacion de la entidad.
     * cada clase implementara este metodo de acuerdo con 
     * sus propios atributos
     */
    public void mostrarResumen();
}



