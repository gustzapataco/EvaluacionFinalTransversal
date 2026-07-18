package model;

/**
 * NUEVA CLASE
 * 
 * @author gzapa
 */
public class OrdenCompra {
    private String numeroOrden; // Numero identificador de la orden.
    private Cliente cliente; // Cliente que realiza la compra.
    private Producto producto; // Producto adquirido.
    private int cantidad; // Cantidad de compra.
    private double total; // Total de la compra.

    /**
     * Constructor con parametros-
     * 
     * @param numeroOrden Numero de la orden.
     * @param cliente Cliente que realiza la compra.
     * @param producto Producto adquirido.
     * @param cantidad Cantidad de compra.
     */
    public OrdenCompra(String numeroOrden, Cliente cliente, Producto producto, int cantidad) {
        setNumeroOrden(numeroOrden);
        setCliente(cliente);
        setProducto(producto);
        setCantidad(cantidad);
        
        calcularTotal();
    }

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        if (numeroOrden != null && !numeroOrden.trim().isEmpty()) {
            this.numeroOrden = numeroOrden;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        }
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        if (producto != null) {
            this.producto = producto;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        }
    }

    public double getTotal() {
        return total;
    }
    
    /**
     * Calcula automaticamente el total de la compra.
     */
    public void calcularTotal() {
        total = producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "===== ORDEN DE COMPRA ====="
                + "\nNumero Orden: " + numeroOrden
                + "\n\nCLIENTE"
                + "\n-----------------------"
                + "\n" + cliente 
                + "\n\nPRODUCTO"
                + "\n-----------------------"
                + "\n" + producto
                + "\n\nCantidad: " + cantidad
                + "\nTotal: $" + total;
                               
    }
}    
    
    

