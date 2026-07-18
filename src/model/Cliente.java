package model;

/**
 * NUEVA CLASE
 * Representa un CLIENTE registrao en el sistema Llanquihue Tour. 
 * Hereda los datos generales desde la clase PERSONA e incorpora un
 * codigo unico que identifica al cliente dentro del sistema.
 */
public class Cliente extends Persona implements Registrable {
    private String codigoCliente; //Codigo unico del cliente.

    /**
     *  Constructor con paramtros.
     * 
     * @param nombre Nombre del cliente.
     * @param rut Obejeto Rut.
     * @param telefono Telefono de contacto.
     * @param email Correo electronico. 
     * @param direccion Direccion del cliente.
     * @param tarjeta Tarjeta asociada.
     * @param codigoCliente Codigo interno del cliente.
     */
    public Cliente(
            String nombre,
            Rut rut,
            String telefono,
            String email,
            Direccion direccion,
            Tarjeta tarjeta,
            String codigoCliente) {
        super(nombre, rut, telefono, email, direccion, tarjeta);
        setCodigoCliente(codigoCliente);
    }
    
    /**
     * Obtiene el codigo del cliente.
     * @return Codigo del cliente.
     */
    public String getCodigoCliente() {
        return codigoCliente;
    }
    
    /**
     * Modifica el codigo del cliente.
     * @param codigoCliente Nuevo codigo.
     */
    public void setCodigoCliente(String codigoCliente) {
        if (codigoCliente != null && !codigoCliente.trim().isEmpty()) {
            this.codigoCliente = codigoCliente;
        }
    }
    
    /**
     * Implementa el metodo definido por la interdaz Registrable
     */
    @Override 
    public void mostrarResumen() {
        System.out.print(this);
    }
    
    /**
     * Devuelve toda la informacion del cliente.
     * @return Informacion del cliente.
     */
    @Override
    public String toString() {
        return "===== CLIENTE ====="
                + "\nCodigo Cliente: " + codigoCliente
                + "\n"
                + super.toString();
    }
}