package app;

/**
 * CLASE REFACTORIZADA. 
 */

import data.GestorServicios; //Importar la clase GestorServicios
import data.GestorClientes;
import data.GestorProductos;
import data.GestorReservas;
import data.GestorOrdenCompra;
import model.Rut;

/**
 * Clase principal del sistema Llanquihue Tour.
 * 
 * Inicializa los gestores del sistema y carga la informacion
 * almacenada en archivos de texto.
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("===============================");
        System.out.println("    SISTEMA LLANQUIHUE TOUR    ");
        System.out.println("===============================");
        
        // Crear Gestores
        GestorClientes gestorClientes = new GestorClientes();
        GestorProductos gestorProductos = new GestorProductos();
        GestorServicios gestorServicios = new GestorServicios();
        GestorReservas gestorReservas = new GestorReservas();
        GestorOrdenCompra gestorOrdenCompra = new GestorOrdenCompra();
        
        // Cargar Archivos
        gestorClientes.cargarClientes("src/resources/clientes.txt");
        gestorProductos.cargarProductos("src/resources/productos.txt");
        gestorServicios.cargarServicios("src/resources/servicios.txt");
        gestorReservas.cargarReservas("src/resources/reservas.txt");
        gestorOrdenCompra.cargarOrdenesCompra("src/resources/ordenes.txt");
        
        // Mostrar clientes
        System.out.println("\n===== CLIENTES =====");
        gestorClientes.mostrarClientes();
        
        // Mostrar productos
        System.out.println("\n===== PRODUCTOS =====");
        gestorProductos.mostrarProductos();
        
        // Mostrar servicios
        System.out.println("\n===== SERVICIOS =====");
        gestorServicios.mostrarServicios();
        
        // Mostrar reservas
        System.out.println("\n===== RESERVAS =====");
        gestorReservas.mostrarReservas();
        
        // Mostrar ordenes
        System.out.println("\n===== ORDENES DE COMPRA =====");
        gestorOrdenCompra.mostrarOrdenesCompra();
        
        // Demostracion de busqueda
        System.out.println("===============================");
        System.out.println("BUSQUEDA DE CLIENTE            ");
        System.out.println("===============================");
        
        Rut rutBuscar = new Rut("11.111.111-1");
        
        if (gestorClientes.buscarCliente(rutBuscar) != null) {
            System.out.println(gestorClientes.buscarCliente(rutBuscar));
        } else {  
            System.out.println("Cliente no encontrado.");
        }
        
        // Demostracion de filtros
        System.out.println("===============================");
        System.out.println("FILTRO DE CLIENTES POR COMUNA  ");
        System.out.println("===============================");
        
        gestorClientes.filtrarPorComuna("Puerto Varas");
        
        System.out.println("===============================");
        System.out.println("FILTRO DE PRODUCTO POR PRECIO  ");
        System.out.println("===============================");
        
        gestorProductos.filtrarPorPrecio(20000);
        
        // Programa finalizado
        System.out.println("===============================");
        System.out.println("Sistema finalizado correctamente.");
        System.out.println("===============================");
    }         
}