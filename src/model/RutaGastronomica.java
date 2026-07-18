package model;

/**
 * Representa una ruta gastonomica.
 */
public class RutaGastronomica extends ServicioTuristico {
    private int numeroDeParadas; //cantidad de lugares gastronomicos incluidos

    public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        setNumeroDeParadas(numeroDeParadas); // Inicializa el atributo propio
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        if (numeroDeParadas > 0) {
            this.numeroDeParadas = numeroDeParadas;
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nParadas gastronomicas: "
                + numeroDeParadas; 
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("======== RUTA GASTRONOMICA =======");
        System.out.println(this);
    }
}    

