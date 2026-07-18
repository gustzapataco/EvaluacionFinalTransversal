package model;

/**
 * Representa una excursion cultural 
 */
public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;
    /**
     * 
     * @param nombre Nombre del servicio turistico.
     * @param duracionHoras Duracion estimada del recorrido.
     * @param lugarHistorico Lugar historico que se visita.
     */
    public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras); // Inicializa los atributos heredados
        setLugarHistorico(lugarHistorico); // Inicializa el atributo propio
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        if (lugarHistorico != null && !lugarHistorico.isEmpty()) {
            this.lugarHistorico = lugarHistorico;
        }
    }           

    @Override
    public String toString() {
        return super.toString()
                + "\nLugar historico: "
                + lugarHistorico; 
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("======= EXCURSION CULTURAL =======");
        System.out.println(this);
    }
}        
       

