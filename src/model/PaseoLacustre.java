package model;

/**
 * Representa un paseo lacustre. 
 */
public class PaseoLacustre extends ServicioTuristico {
    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, double duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras); //Inicializa la superclase
        setTipoEmbarcacion(tipoEmbarcacion); // Inicializa el atributo propio
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }
    
    // Validacion 
    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        if (tipoEmbarcacion != null && !tipoEmbarcacion.isEmpty()) {
            this.tipoEmbarcacion = tipoEmbarcacion;
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nEmbarcacion: "
                + tipoEmbarcacion;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("========= PASEO LACUSTRE =========");
        System.out.println(this);
    }
}              

