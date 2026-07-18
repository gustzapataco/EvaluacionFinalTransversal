package data;

import java.util.ArrayList;
import model.Producto;
import utils.ConversorDatos;
import utils.LectorTXT;

/**
 * NUEVA CLASE Y REFACTORIZADA.
 * Administra la coleccion de productos del sistema Llanquihue Tour.
 * Permite agregar, buscar y mostrar productos registrados.
 * Posteriormente podra cargar informacion desde archivos de texto.
 */
public class GestorProductos {
    
    private ArrayList<Producto> productos; // Coleccion que almacena todos los productos. 
    
    /**
     * Constructor.
     * Inicializa la coleccion de productos.
     */
    public GestorProductos() {
        productos = new ArrayList<>(); 
    }
    
    /**
     * Agrega un nuevo producto a la coleccion.
     * @param producto Producto a registrar.
     */
    public void agregarProducto(Producto producto) {
        if (producto != null) {
            productos.add(producto);
        }
    }
    
    /**
     * Retorna la coleccion completa de productos.
     * @return Lista de productos.
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    /**
     * Muestra todos los productos registrados.
     */
    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No existen productos registrados.");
            return;
        }
        
        System.out.println("===== PRODUCTOS REGISTRADOS =====");
        for (Producto producto : productos) {
            System.out.println(producto);
            System.out.println("-----------------------------------------");
        }
    }
    
    /**
     * Busca un producto por su codigo.
     * @param codigo Codigo del producto.
     * @return Producto encontrado o nulo.
     */
    public Producto buscarProducto(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equalsIgnoreCase(codigo)) {
                return producto;
            }
        }
        return null;
    }
    
    public void cargarProductos(String ruta) {
        ArrayList<String> lineas = LectorTXT.leerArchivo(ruta);
        for (String linea : lineas) {
            Producto producto = ConversorDatos.convertirProducto(linea);
            agregarProducto(producto);
        }
    }
    /**
     * Filtra y muestra los productos con precio sea 
     * menor o igual al valor indicado.
     * @param precioMaximo Precio maximo a considerar.
     */
    public void filtrarPorPrecio(double precioMaximo) {
        System.out.println("===== PRODUCTOS HASTA $" + precioMaximo + " =====");
        boolean encontrado = false;
        for (Producto producto : productos) {
            if (producto.getPrecio() <= precioMaximo) {
                
                System.out.println(producto);
                System.out.println("-------------------------------");
                
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No existen productos dentro de ese rango de precio.");
        }
    }
}
