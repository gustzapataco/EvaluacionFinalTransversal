package data;

import java.util.ArrayList;
import model.ServicioTuristico;
import utils.LectorTXT;
import utils.ConversorDatos;

/**
 * CLASE REFACTIRIZADA.
 * Administra la coleccion de servicios turisticos del sistema Llanquihue Tour.
 * 
 * Permite registrar, buscar y mostrar servicios turisticos.
 * Posteriormente podra cargar informacion desde archivos de texto.
 */
public class GestorServicios {
    
    private ArrayList<ServicioTuristico> servicios; // Coleccion que almacena todos los servicios turisticos.
    
    /**
     * Constructor.
     * Inicializa la coleccion de servicios turisticos.
     */
    public GestorServicios() {
        servicios = new ArrayList<>();
    }
    
    /**
     * Agrega un servicio turistico a la coleccion.
     * @param servicio Servicio turistico a registrar.
     */
    public void agregarServicio(ServicioTuristico servicio) {
        if (servicio != null) {
            servicios.add(servicio);
        }
    }
    
    /**
     * Retorna la coleccion completa de servicios turisticos.
     * @return Lista de servicios.
     */
    public ArrayList<ServicioTuristico> getServicios() {
        return servicios;
    }   
    
    /**
     * Muestra todos los servicios registrados.
     */
    public void mostrarServicios() {
        if (servicios.isEmpty()) {
            System.out.println("No existen servicios turisticos registraados.");
            return;
        }
        
        System.out.println("===== SERVICIOS TURISTICOS =====");
        for (ServicioTuristico servicio : servicios) {
            
            System.out.println(servicio);
            System.out.println("---------------------------------------------");
        }
    }
    
    /**
     * Busca un servicio turistico por su nombre.
     * @param nombre Nombre del servicio.
     * @return Servicio encontrado o nulo.
     */
    public ServicioTuristico buscarServicio(String nombre) {
        for (ServicioTuristico servicio : servicios) {
            if (servicio.getNombre().equalsIgnoreCase(nombre)) {
                return servicio;
            }
        }
        return null;
    }
    
    public void cargarServicios(String ruta) {
        ArrayList<String> lineas = LectorTXT.leerArchivo(ruta);
        for (String linea : lineas) {
            String[] datos = linea.split(";");
            switch (datos[0]) {
                case "RutaGastronomica":
                    agregarServicio(
                            ConversorDatos.convertirRutaGastronomica(linea));
                    break;
                case "PaseoLacustre":
                    agregarServicio(
                            ConversorDatos.convertirPaseoLacustre(linea));
                    break;
                case "ExcursionCultural":
                    agregarServicio(
                            ConversorDatos.convertirExcursionCultural(linea));
                    break;
                default:
                    System.out.println(
                            "Tipo de servicio desconocido: " + datos[0]);
            }           
        }
    }
}           