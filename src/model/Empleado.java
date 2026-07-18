package model;

/**
 * NUEVA CLASE
 * Representa un empleado de la empresa Llanquihue Tour.
 * Hereda la informacion general desde PERSONA e incorpora
 * informacion propia del trabajador.
 * 
 * Implementa la interfaz Registrable para permitir mostrar
 * un resumen de sus datos.
 * @author gzapa
 */
public class Empleado extends Persona implements Registrable {
    private String cargo; // Cargo que desempeña el empleado.
    private double sueldo; // Sueldo del empleado.
    
    /**
     * Constructor con parametros.
     * 
     * @param nombre Nombre del empleado.
     * @param rut RUT.
     * @param telefono Telefono.
     * @param email Correo electonico.
     * @param direccion Direccion.
     * @param tarjeta Tarjeta asociada.
     * @param cargo Cargo del empleado.
     * @param sueldo Sueldo mensual.
     */
    public Empleado(
            String nombre,
            Rut rut,
            String telefono,
            String email,
            Direccion direccion,
            Tarjeta tarjeta,
            String cargo,
            double sueldo) {
        
        super(
                nombre,
                rut,
                telefono,
                email,
                direccion,
                tarjeta);
        
        setCargo(cargo);
        setSueldo(sueldo);
    }
    
    // Getters y Setters

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo != null && !cargo.trim().isEmpty()) {
            this.cargo = cargo;
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo > 0) {
            this.sueldo = sueldo;
        }
    }
    
    /**
     * Implementa el metodo definido por la interaz Registrable.
     */
    @Override
    public void mostrarResumen() {
        System.out.println(this);
    }
    
    /**
     * Devuelve toda la informacion del empleado.
     * @return Informacion completa del empleado.
     */
    @Override
    public String toString() {
        return "===== EMPLEADO ====="
                + "\nCargo: " + cargo
                + "\nSueldo: $" + sueldo
                + "\n"
                + super.toString();
    }
    
}
