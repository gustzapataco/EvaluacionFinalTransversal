package model;

/**
 * REUTILIZAR Y MEJORAR ESTA CLASE.
 * 
 * Clase base para representar personas relacionadas
 * con la agencia Llanquihue Tour.
 * Esta clase contiene la informacion comun para todas las personas del
 * sistema y aplica composicion con las clases Direccion, Rut y Tarjeta.
 * @author gzapata
 */
public class Persona {

    private String nombre; //Nombre completo de la persona.
    private Rut rut; // RUT de la persona.
    private String telefono; //Numero de telefono.
    private String email; //Correo electronico.
    private Direccion direccion; //Direccion asociada a la PERSONA.
    private Tarjeta tarjeta; // NUEVO ATRIBUTO - Tarjeta asociada a la PERSONA

    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre de la persona.
     * @param rut Rut de la persona.
     * @param telefono Teléfono de contacto.
     * @param email Email de contacto.
     * @param direccion Dirección asociada.
     * @param tarjeta Tarjeta asociada.
     */
    public Persona(String nombre,
            Rut rut,
            String telefono,
            String email,
            Direccion direccion,
            Tarjeta tarjeta) {

        setNombre(nombre);
        setRut(rut);
        setTelefono(telefono);
        setEmail(email);
        setDireccion(direccion);
        setTarjeta(tarjeta);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }
    
    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        if (rut != null) {
            this.rut = rut;
        }
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && !telefono.trim().isEmpty()) {
            this.telefono = telefono;
        }
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && !email.trim().isEmpty()) {
            this.email = email;
        }
    }    
    

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        if (direccion != null) {
            this.direccion = direccion;
        }
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        if (tarjeta != null) {
            this.tarjeta = tarjeta;
        }
    }
    
    /**
     * Devuelve toda la informacion de la PERSONA.
     * @return Informacion de la PERSONA.
     */
    @Override
    public String toString() {

        return "Nombre: " + nombre
                + "\nRUT: " + rut
                + "\nTelefono: " + telefono
                + "\nE-mail: " + email
                + "\nDireccion: \n" + direccion
                + "\nTarjeta: \n" + tarjeta; 

    }
}
