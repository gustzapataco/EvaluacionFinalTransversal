package utils;

/**
 * NUEVA CLASE.
 * 
 * Clase utilitaria encargada de validar el formato de un RUT Chileno.
 * 
 * Puede ser utilizada por cualquier clase del sistema que necesite
 * validar un RUT antes de registrarlo.
 */
public class ValidadorRut {
    
    /**
     * Valida el formato de un RUT.
     * 
     * @param rut RUT a validar.
     * @throws RutInvalidoException si el RUT es nulo o posee un formato incorrecto. 
     */
    public static void validar(String rut) throws RutInvalidoException {
        
        if (rut == null || rut.trim().isEmpty()) {
            
            throw new RutInvalidoException("El RUT no puede estar vacio.");
        }
        
        /**
         * Formato esperado:
         * 12.345.678-9
         * 11.111.111-K
         */
        String patron = "\\d{1,2}\\.\\d{3}.\\d{3}-[\\dkK]";
        
        if (!rut.matches(patron)) {
            
            throw new RutInvalidoException("Formato de RUT invalido: " + rut);
        }
    }
    
}
