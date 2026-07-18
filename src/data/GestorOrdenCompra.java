package data;

import java.util.ArrayList;
import model.OrdenCompra;
import utils.LectorTXT;

/**
 * REFACTORIZADA.
 * Adminitra la coleccion de ordenes de compra del sistema Llanquihue Tour.
 * Permite registrar, buscar y mostrar ordenes de compra.
 * Posteriormente podra cargar informacion desde archivos de texto.
 */
public class GestorOrdenCompra {
    private ArrayList<OrdenCompra> ordenesCompra; // coleccion que almacena todas las ordenes de compra.
    
    /**
     * Constructor.
     * Inicializa la coleccion de ordenes de compra.
     */
    public GestorOrdenCompra() {
        ordenesCompra = new ArrayList<>();
    }
    
    /**
     * Agrega una nueva orden de compra.
     * @param ordenCompra Orden de compra a registrar.
     */
    public void agregarOrdenCompra(OrdenCompra ordenCompra) {
        if (ordenCompra != null) {
            ordenesCompra.add(ordenCompra);
        }
    }
    
    /**
     * Retorna la coleccion completa de ordenes de compra.
     * @return Lista de ordenes de compra.
     */
    public ArrayList<OrdenCompra> getOrdenesCompra() {
        return ordenesCompra;
    }
    
    /**
     * Muestra todas las ordenes registradas.
     */
    public void mostrarOrdenesCompra() {
        if (ordenesCompra.isEmpty()) {
            System.out.println("No existen ordenes de compra registrada.");
            return;
        }
        
        System.out.println("===== ORDENES DE COMPRA =====");
        for (OrdenCompra orden : ordenesCompra) {
            
            System.out.println(orden);
            System.out.println("----------------------------------------");
        }
    }
    
    /**
     * Busca una orden de compra por su numero.
     * 
     * @param numeroOrden Numero de la orden.
     * @return Orden encontrada o nulo.
     */
    public OrdenCompra buscarOrdenCompra(String numeroOrden) {
        for (OrdenCompra orden : ordenesCompra) {
            if (orden.getNumeroOrden().equalsIgnoreCase(numeroOrden)) {
                return orden;
            }
        }
        return null;
    }
    
    public void cargarOrdenesCompra(String ruta) {
        ArrayList<String> lineas = LectorTXT.leerArchivo(ruta);
        for (String linea : lineas) {
            System.out.println(linea);
        }
    }
}