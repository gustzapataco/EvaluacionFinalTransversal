package model;

/**
 * NUEVA CLASE
 * Representa la reserva de un servicio turistico realizada por un cliente.
 * Una reserva relaciona un cliente con un servicio turistico,
 * indicando la fecha, cantidad de persona y el estado de la reserva.
 * Aplica composicion utilizando objetos Cliente y ServicioTuristico.
 * @author gzapa
 */
public class Reserva {
    private String codigoReserva; // Codigo identificador de la reserva.
    private Cliente cliente; // Cliente que realiza la reserva.
    private ServicioTuristico servicio; // Servicio turistico reservado.
    private String fechaReserva; // Fecha de la reserva.
    private int cantidadPersonas; // Cantidad de personas.
    private String estado; // Estado de la reserva.

    public Reserva(String codigoReserva, Cliente cliente, ServicioTuristico servicio, String fechaReserva, int cantidadPersonas, String estado) {
        setCodigoReserva(codigoReserva);
        setCliente(cliente);
        setServicio(servicio);
        setFechaReserva(fechaReserva);
        setCantidadPersonas(cantidadPersonas);
        setEstado(estado);
    }
    
    // Getters y Setters
    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        if (codigoReserva != null && !codigoReserva.trim().isEmpty()) {
            this.codigoReserva = codigoReserva;
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

    public ServicioTuristico getServicio() {
        return servicio;
    }

    public void setServicio(ServicioTuristico servicio) {
        if (servicio != null) {
            this.servicio = servicio;
        }
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        if (fechaReserva != null && !fechaReserva.trim().isEmpty()) {
            this.fechaReserva = fechaReserva;
        }
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        if (cantidadPersonas > 0) {
            this.cantidadPersonas = cantidadPersonas;
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado != null && !estado.trim().isEmpty()) {
            this.estado = estado;
        }
    }
    
    @Override
    public String toString() {
        return "===== RESERVA ====="
                + "\nCodigo Reserva: " + codigoReserva
                + "\n\nCLIENTE"
                + "\n-------------------------"
                + "\n" + cliente
                + "\n\nSERVICIO TURISTICO"
                + "\n-------------------------"
                + "\n" + servicio
                + "\n\nFecha Reserva: " + fechaReserva
                + "\nCantidad de Personas: " + cantidadPersonas
                + "\nEstado: " + estado;
    }
    
}
