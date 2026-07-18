package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * NUEVA CLASE Y REFACTORIZADA
 * Clase utilitaria encargada de leer archivos de texto.
 * 
 * Permite cargar el contenido de un archivo .txt y almecenarlo
 * en una coleccion de lineas para su posterior procesamiento.
 * 
 * Permite obtener el contenido de un archivo linea por linea,
 * facilitando posteriormente la creacio de objetos del sistema.
 */
public class LectorTXT {

    /**
     * Lee un archivo de texto y devuelve todas sus lineas.
     * @param ruta Ruta del archivo.
     * @return Lista con las lineas del archivo.
     */
    public static ArrayList<String> leerArchivo(String ruta) {
        ArrayList<String> lineas = new ArrayList<>();
        
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {
            String linea;
            
            while ((linea = lector.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    lineas.add(linea);
                }
            }
        
        } catch (IOException e) {
            
            System.out.println("Error al leer archivo: " + ruta);
            System.out.println(e.getMessage());
        }
        return lineas;
    }
}    
    
    

