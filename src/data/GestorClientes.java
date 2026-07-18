package data;

import java.util.ArrayList;
import model.Cliente;
import model.Rut;
import utils.LectorTXT;
import utils.ConversorDatos;

/**
 * NUEVA CLASE Y REFACTIRIZADA.
 * Administra la coleccion de clientes del sistema Llanquihue Tour.
 * Permite agregar, buscar y mostrar clientes registrados.
 * Posteriormente podra cargar informacion desde archivos de texto.
 */
public class GestorClientes {
    private ArrayList<Cliente> clientes; // Coleccion que almacena todos los clientes.
    
    /**
     * Constructor.
     * Inicializa la coleccion de clientes.
     */
    public GestorClientes() {
        clientes = new ArrayList<>();
    }
    
    /**
     * Agrega un nuevo cliente a la coleccion. 
     * @param cliente Cliente a registrar. 
     */
    public void agregarCliente(Cliente cliente) {
        if (cliente != null) {
            clientes.add(cliente);
        }
    }
    
    /**
     * Retorna la coleccion completa de clientes.
     * @return Lista de clientes.
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    /**
     * Muestra todos lso clientes registrados.
     */
    public void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No existen clientes registrados.");
            return;
        }
        System.out.println("===== CLIENTES REGISTRADOS =====");
        for (Cliente cliente : clientes) {
            
            System.out.println(cliente);
            System.out.println("-------------------------------------");
        }
    }
    /**
     * Busca un cliente por su RUT.
     * @param rut RUT a buscar.
     * @return Cliente encontrado o nulo.
     */
    public Cliente buscarCliente(Rut rut) {
        for (Cliente cliente : clientes) {
            if (cliente.getRut().toString().equals(rut.toString())) {
                return cliente;
            }
        }
        return null;
    }
    /**
     * Carga clientes desde un archivo de texto.
     * Cada linea del archivo es convertida en un objeto Cliente
     * mediante la clase utilitaria ConversorDatos.
     * @param ruta Ruta del archivo clientes.txt
     */
    public void cargarClientes(String ruta) {
        ArrayList<String> lineas = LectorTXT.leerArchivo(ruta);
        for (String linea : lineas) {
            Cliente cliente = ConversorDatos.convertirCliente(linea);
            agregarCliente(cliente);
        }
    }
    /**
     * Filtra y muestra los clientes registrados
     * perteneciente a una comuna determinada.
     * @param comuna Comuna utilizada cmo criterio de busqueda.
     */
    public void filtrarPorComuna(String comuna) {
        System.out.println("===== CLIENTES DE " + comuna.toUpperCase() + " =====");
        boolean encontrado = false;
        for (Cliente cliente : clientes) { 
            if (cliente.getDireccion().getComuna()
                    .equalsIgnoreCase(comuna)) {
                
                System.out.println(cliente);
                System.out.println("-------------------------------");
                
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No existen clientes registrados en esa comuna.");
        }
    }
}