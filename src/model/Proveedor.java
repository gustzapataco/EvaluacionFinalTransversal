package model;

/**
 * REUTILIZAR Y MEJORAR ESTA CLASE
 * 
 * Representa un proveedor asociado a la agencia Llanquihue Tour.
 * Hereda la informacion general desde la clase PERSONA e incorpora
 * el tipo de servicio que presta a la empresa.
 * 
 * Implementa la interfaz Registrable para permitir mostrar
 * un resumen de su informacion dentro del sistema.
 * @author gzapata
 */
public final class Proveedor extends Persona implements Registrable {
    
    // Servicio que presta el Proveedor a la agencia.
    private String servicio;

    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre del proveedor.
     * @param rut RUT del proveedor.
     * @param telefono Telefono del proveedor.
     * @param email Correo electronico del proveedor.
     * @param direccion Direccion del proveedor.
     * @param tarjeta Tarjeta asociada.
     * @param servicio Tipo de servicio prestado.
     */
    public Proveedor(
            String nombre,
            Rut rut,
            String telefono,
            String email,
            Direccion direccion,
            Tarjeta tarjeta,
            String servicio) {

        super(nombre, rut, telefono, email, direccion, tarjeta);
        setServicio(servicio);

    }
    
    /**
     * Obtiene el servicio prestado por el Proveedor.
     * @return Servicio.
     */
    public String getServicio() { // Getter
        return servicio;
    }

    /**
     * Modifica el servicio prestado.
     * @param servicio Nuevo servicio.
     */
    public void setServicio(String servicio) {     // Setter con validacion 
        if (servicio != null && !servicio.trim().isEmpty()) {
            this.servicio = servicio;
        }

    }
    
    /**
     * Implementa el metodo definido por la interfaz Registrable.
     */
    @Override
    public void mostrarResumen() {
        System.out.println(this);
    }    
    
    /**
     * Devuelve toda la informacion del proveedor.
     * @return Informacion completa del proveedor.
     */
    @Override
    public String toString() {
        return  "===== PROVEEDOR =====" 
                + "\nServicio: " + servicio
                + "\n"
                + super.toString();

    }
    

}
