package model;

/**
 * NUEVA CLASE
 * Representa una tarjeta asociada a una persona dentro del sistema
 * Llanquihue Tour. Esta clase almacena la informacion basica de una 
 * tarjeta utilizada para realizar pagos o reservas.
 */
public class Tarjeta {
    private String numero; //Numero de la tarjeta.
    private String banco; //Banco emisor de la tarjeta.
    private String tipo; //Tipo de tarjeta (Debito o Credito).

    /**
     * Constructor con parametros.
     * 
     * @param numero Numero de la tarjeta.
     * @param banco Banco emisor.
     * @param tipo  Tipo de tarjeta.
     */
    public Tarjeta(String numero, String banco, String tipo) {
        setNumero(numero);
        setBanco(banco);
        setTipo(tipo);
    }
    
    /**
     * Obtiene el numero de la tarjeta
     * @return Numero de la tarjeta
     */
    public String getNumero() {
        return numero;
    }
    
    /**
     * Modifica el numero de la tarjeta.
     * @param numero Nuevo numero.
     */
    public void setNumero(String numero) {
        if (numero != null && !numero.trim().isEmpty()) {
            this.numero = numero;
        }
    }    
    
    /**
     * Obtiene el banco emisor.
     * @return Nombre del banco.
     */
    public String getBanco() {
        return banco;
    }
    /**
     * Modifica el banco emisor.
     * @param banco Nuevo banco.
     */
    public void setBanco(String banco) {
        if (banco != null && !banco.trim().isEmpty()) {
            this.banco = banco;
        }
    }    
    
    /**
     * Obtiene el tipo de tarjeta.
     * @return Tipo de tarjeta.
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Modifica el tipo de tarjeta.
     * @param tipo Nuevo tipo de tarjeta.
     */
    public void setTipo(String tipo) {
        if (tipo != null && !tipo.trim().isEmpty()) {
            this.tipo = tipo;
        }
    }    
    
    /**
     * Devuelve toda la informacion de la tarjeta.
     * @return Informacion de la tarjeta.
     */
    @Override
    public String toString() {
        return "Numero: " + numero
                + "\nBanco: " + banco
                + "\nTipo: " + tipo;
    }
} 