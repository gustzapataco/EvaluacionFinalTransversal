package model;

/**
 * REUTILIZAR Y MEJORAR ESTA CLASE
 * 
 * Representa un guía turístico de la agencia Llanquihue Tour.
 * Hereda la informacion general desde la clase PERSONA e incorpora
 * la especialidad del guia. Implementa la interfaz Registrable 
 * para permitir mostrar un resumen de su informacion.
 * 
 * @author gzapata
 */

// Herencia
public class GuiaTuristico extends Persona implements Registrable {

    private String especialidad; // Area de especialidad del guia.

    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre del guía.
     * @param rut RUT del guía.
     * @param telefono Telefono.
     * @param email Email.
     * @param direccion Direccion.
     * @param tarjeta Tarjeta asociada.
     * @param especialidad Área de especialidad.
     */
    public GuiaTuristico(
            String nombre,
            Rut rut,
            String telefono,
            String email,
            Direccion direccion,
            Tarjeta tarjeta,
            String especialidad) {

        super(nombre, rut, telefono, email, direccion, tarjeta);
        setEspecialidad(especialidad);

    }
    
    // getters n' setters
    /**
     * Obtiene la especialidad del guia.
     * @return Especialidad.
     */
    public String getEspecialidad() {
        return especialidad;
    }
    
    /**
     * Modifica la especialidad del guia.
     * @param especialidad Nueva especialidad.
     */
    public void setEspecialidad(String especialidad) {
        if (especialidad != null && !especialidad.isEmpty()) {
            this.especialidad = especialidad;
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
     * Devuelve toda la informacion del guia turistico.
     * @return Informacion completa.
     */
    @Override
    public String toString() {

        return  "==== GUIA TURISTICO ====\n" 
                + "\nEspecialidad: " + especialidad
                + "\n"
                + super.toString();
    }
}

