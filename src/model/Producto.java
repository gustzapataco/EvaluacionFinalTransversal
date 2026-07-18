package model;

/**
 * NUEVA CLASE
 * Representa  un producto o servicio ofrecido por Llanquihue Tour.
 * Un producto puede corresponder a un tour, excursion, paseo o cualquier
 * servicio disponible para ser reservado o adquirido por un cliente.
 */
public class Producto {
    
    private String codigo; // codigo identificador del producto.
    private String nombre; // Nombre del producto.
    private String descripcion; // Descripcion del producto.
    private double precio; // Precio del producto.
    private int stock; // Cantidad disponible.

    /**
     * Constructor con parametros.
     * 
     * @param codigo Codigo del producto.
     * @param nombre Nombre del producto.
     * @param descripcion Descripcion del producto.
     * @param precio Precio del producto.
     * @param stock Cantidad disponible del producto.
     */
    public Producto(String codigo, String nombre, String descripcion, double precio, int stock) {
        setCodigo(codigo);
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecio(precio);
        setStock(stock);
    }
    
    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.trim().isEmpty()) {
            this.descripcion = descripcion;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }
    
    @Override
    public String toString() {
        return ""
                + "\nCodigo: " + codigo
                + "\nNombre: " + nombre
                + "\nDescripcion: " + descripcion
                + "\nPrecio: $" + precio
                + "\nStock: " + stock;
    }     
}