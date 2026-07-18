package model;

/**
 * Superclase que representa un servicio turistico.
 */
public class ServicioTuristico {
    private String nombre; //nombre del servicio turistico
    private double duracionHoras; //duracion estimada en hora
 /**
 * @param nombre Nombre del servicio.
 * @param duracionHoras Duracion del recorrido.
 */
    public ServicioTuristico(String nombre, double duracionHoras) {
        setNombre(nombre);
        setDuracionHoras(duracionHoras); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    } 
    
    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        if (duracionHoras > 0) {
            this.duracionHoras = duracionHoras;
        }
    }    
    /**
     * Muestra la informacion general del servicio turistico.
     * 
     * Este metodo podra ser sobrecrito por las subclases
     * para mostrar informacion mas especofoca.
     */
    public void mostrarInformacion() {
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nDuracion: " + duracionHoras + " hora";
    }
      
    
}
