public class Vehiculo {

    private String patente;
    private String modelo;
    private int anio;

    
    public Vehiculo(String patente, String modelo, int anio) {
        this.patente = patente; 
        this.modelo = modelo;   
        this.anio = anio;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String obtenerFichaTecnica() {
        return modelo + " (Patente: " + patente + " - Año: " + anio + ")";
    }
}