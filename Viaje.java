public class Viaje {
    private String origen;
    private String destino;
    private double distanciaKm;
    private Chofer choferAsignado;
    private double tarifaTotal;

    private static final double TARIFA_BASE = 500.0; 
    private static final double COSTO_POR_KM = 350.0; 


    public Viaje(String origen, String destino, double distanciaKm, Chofer choferAsignado) {
        this.origen = origen;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
        this.choferAsignado = choferAsignado;
        

        this.tarifaTotal = calcularTarifa();
        this.choferAsignado.ocupar(); 
    }

    private double calcularTarifa() {
        return TARIFA_BASE + (distanciaKm * COSTO_POR_KM);
    }


    public void finalizarViaje() {
        this.choferAsignado.liberar(); 
        System.out.println("✅ Viaje finalizado con éxito. El chofer " + choferAsignado.getNombre() + " ya está libre.");
    }


    public double getTarifaTotal() {
        return tarifaTotal;
    }

    public Chofer getChoferAsignado() {
        return choferAsignado;
    }

    // REPORTE DEL VIAJE
    public String obtenerResumenViaje() {
        return "--- COMPROBANTE DE VIAJE ---\n" +
               "Origen: " + origen + "\n" +
               "Destino: " + destino + "\n" +
               "Distancia: " + distanciaKm + " km\n" +
               "Chofer: " + choferAsignado.getNombre() + " (" + choferAsignado.getVehiculoAsignado().getModelo() + ")\n" +
               "Tarifa Total: $" + tarifaTotal + "\n" +
               "---------------------------";
    }
}