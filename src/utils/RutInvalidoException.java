package utils;

/**
 * NUEVA CLASE.
 * 
 * Excepcion personalizada utilizada cuando un RUT no cumple
 * con el formato o la validacion requerida
 */
public class RutInvalidoException extends Exception {
    
    /**
     * Constructor.
     * 
     * @param mensaje Mensaje descriptivo del error. 
     */
    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }
       
}
