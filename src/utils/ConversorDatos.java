package utils;

import model.Cliente;
import model.Direccion;
import model.Producto;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;
import model.Tarjeta;
import model.Rut;

/**
 * NUEVA CLASE.
 * 
 * Clase utilitaria encargada de convertir lineas de texto
 * en objetos del sistema Llanquihue Tour.
 * 
 * Cada metodo recibe una linea del archivo .txt y construye
 * el objeto correspondiente.
 */
public class ConversorDatos {
    
    /**
     * Convierte una linea de texto en un objeto Cliente.
     * 
     * Formato esperado:
     * Nombre;Rut;Telefono;Email;Calle;Numero;Ciudad;NumeroTarjeta;CodigoCliente
     * 
     * @param linea Linea proveniente del archivo clientes.txt
     * @return Cliente creado.
     */
    public static Cliente convertirCliente(String linea) {
        String[] datos = linea.split(";");
        
        Direccion direccion = new Direccion(
                datos[4],
                datos[5],
                datos[6]);
        
        Tarjeta tarjeta = new Tarjeta(
                datos[7],     // Numero
                datos[8],     // Banco
                datos[9]);    // Tipo
        
        Rut rut = new Rut(
                datos[1]);
        
        return new Cliente(
                datos[0],     // Nombre
                rut,
                datos[2],     // Telefono
                datos[3],     // E-mail
                direccion,
                tarjeta,
                datos[10]);   // Codigo del cliente 
    }
    
    /**
     * Convierte una linea en un objeto Producto.
     * 
     * Formato esperado:
     * Codigo;Nombre;Descripcion;Precio;Stock
     * 
     * @param linea Linea del archivo productos.txt
     * @return Producto creado.
     */
    public static Producto convertirProducto(String linea) {
        String[] datos = linea.split(";");
        return new Producto(
                datos[0],                      // Codigo
                datos[1],                      // Nombre
                datos[2],                      // Descripcion
                Double.parseDouble(datos[3]),  // Precio
                Integer.parseInt(datos[4]));   // Stock
    }
    
    /**
     * Convierte una linea en una Ruta Gastronomica.
     * 
     * Formato:
     * RutaGastronomica;Nombre;Duracion;Paradas
     * 
     * @param linea Linea del archivo.
     * @return RutaGastronomica creada.
     */
    public static RutaGastronomica convertirRutaGastronomica(String linea) {
        String[] datos = linea.split(";");
        return new RutaGastronomica(
                datos[1],
                Double.parseDouble(datos[2]),
                Integer.parseInt(datos[3]));
    }
    
    /**
     * Convierte una linea en un Paseo Lacustre.
     * 
     * Formato:
     * PaseoLacustre;Nombre;Duracion;Embarcacion
     * 
     * @param linea Linea del archivo.
     * @return PaseoLacustre creado.
     */
    public static PaseoLacustre convertirPaseoLacustre(String linea) {
        String[] datos = linea.split(";");
        return new PaseoLacustre(
                datos[1],
                Double.parseDouble(datos[2]),
                datos[3]);
    }
    
    /**
     * Convierte una linea en una Excursion Cultural.
     * 
     * Formato:
     * ExcursionCultural;Nombre;Duracion;Lugar
     * 
     * @param linea Linea del archivo.
     * @return ExcursionCultural creada. 
     */
    public static ExcursionCultural convertirExcursionCultural(String linea) {
        String[] datos = linea.split(";");
        return new ExcursionCultural(
                datos[1],
                Double.parseDouble(datos[2]),
                datos[3]);
    }
}