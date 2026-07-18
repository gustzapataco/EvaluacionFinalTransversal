package model;

/**
 * REUTILIZAR Y MEJORAR ESTA CLASE
 * 
 * Representa una dirección asociada a una persona.
 * @author gzapata
 */
public class Direccion {
    
    // Atributos
    private String calle;
    private String comuna;
    private String region;

    /**
     * Constructor con parámetros.
     *
     * @param calle Nombre de la calle.
     * @param comuna Comuna de residencia.
     * @param region Región de residencia.
     */
    public Direccion(String calle, String comuna, String region) {
        setCalle(calle);
        setComuna(comuna);
        setRegion(region);
    }
    
    // getters n' setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {

        if (calle != null && !calle.isEmpty()) {
            this.calle = calle;
        }
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {

        if (comuna != null && !comuna.isEmpty()) {
            this.comuna = comuna;
        }
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {

        if (region != null && !region.isEmpty()) {
            this.region = region;
        }
    }

    @Override
    public String toString() {

        return calle + ", " + comuna + ", " + region;

    }
}
