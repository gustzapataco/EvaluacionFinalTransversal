package data;

import java.util.ArrayList;
import model.Reserva;
import utils.LectorTXT;

/**
 * NUEVA CLASE Y REFACTORIZADA.
 * Administra la coleccion de reservas del sistema Llanquihue Tour.
 * 
 * Permite registrar, buscar y mostrar reservas realizadas por los clientes.
 * Posteriormente podra cargar informacion desde archivos de texto.
 */
public class GestorReservas {
    private ArrayList<Reserva> reservas; // Coleccion que almacena todas las reservas.
    
    /**
     * Constructor.
     * Inicializa la coleccion de reservas.
     */
    public GestorReservas() {
        reservas = new ArrayList<>(); 
       
    }    
    
    /**
     * Agrega una nueva reserva a la coleccion. 
     * @param reserva Reserva a registrar.
     */
    public void agregarReserva(Reserva reserva) {
        if (reservas != null) {
            reservas.add(reserva);
        }
    }            
    
    /**
     * 
     * Retorna la coleccion completa de reservas.
     * @return Lista de reservas.
     */
    public ArrayList<Reserva> getReservas() {
        return reservas;
        
    }
    
    /**
     * Muestra todas las reservas registradas.
     */
    public void mostrarReservas() {
        if (reservas.isEmpty()) {
            
            System.out.println("No existen reservas registradas.");
            return;
        }
        
        System.out.println("===== RESERVAS REGISTRADAS =====");
        for (Reserva reserva : reservas) {
            
            System.out.println(reserva);
            System.out.println("---------------------------------------");
        }
    }
    /**
     * Busca una reserva por su codigo.
     * @param codigoReserva Codigo de la reserva.
     * @return Reserva encontrada o nulo.
     */
    public Reserva buscarReserva(String codigoReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getCodigoReserva().equalsIgnoreCase(codigoReserva)) {
                return reserva;
            }
        }
        return null;
    }
    
    public void cargarReservas(String ruta) {
        ArrayList<String> lineas = LectorTXT.leerArchivo(ruta);
        for (String linea : lineas) {
            System.out.println(linea);
        }
    }
}
    

