package model;

import utils.RutInvalidoException;
import utils.ValidadorRut;

/**
 * NUEVA CLASE
 * Representa el RUT de una persona dentro del sistema Llanquihue Tour.
 * Esta clase encapsula el numero de identificacion de una persona y permitira
 * en futuras etapas validar su formato mediante excepciones personalizadas.
 */
public class Rut {
    private String numero; // Almacena el RUT de la persona.
    /**
     * Constructor.
     * @param numero Numero de RUT.
     */
    public Rut(String numero) {
        setNumero(numero);
    }
    /**
     * Obtiene el RUT.
     * @return Numero de RUT.
     */
    public String getNumero() {
        return numero;
    }
    /**
     * Modifica el RUT.
     * @param numero Nuevo RUT. 
     */
    public void setNumero(String numero) {
        
        try {
            ValidadorRut.validar(numero);
            this.numero = numero;
            
        } catch (RutInvalidoException e) {
            System.out.println(e.getMessage());
        
        }
    }
    /**
     * Devuelve el RUT en formato texto.
     * @return RUT de la persona.
     */
    @Override
    public String toString() {
        return numero;
    }
}