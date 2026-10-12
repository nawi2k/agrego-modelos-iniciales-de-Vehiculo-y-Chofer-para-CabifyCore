public class Chofer {
    private String idChofer;
    private String nombre;
    private boolean disponible;
    private Vehiculo vehiculoAsignado; 


    public Chofer(String idChofer, String nombre, Vehiculo vehiculoAsignado) {
        this.idChofer = idChofer;
        this.nombre = nombre;
        this.vehiculoAsignado = vehiculoAsignado;
        this.disponible = true;
    }


    public String getIdChofer() {
        return idChofer;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public Vehiculo getVehiculoAsignado() {
        return vehiculoAsignado;
    }


    public void ocupar() {
        this.disponible = false;
    }

    public void liberar() {
        this.disponible = true;
    }


    public String obtenerPerfil() {
        String estado = disponible ? "DISPONIBLE" : "EN VIAJE";
        return "Chofer: " + nombre + " [ID: " + idChofer + "] - Estado: " + estado 
                + " | Auto: " + vehiculoAsignado.obtenerFichaTecnica();
    }
}