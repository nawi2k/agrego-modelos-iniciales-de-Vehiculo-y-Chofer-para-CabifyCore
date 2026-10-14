public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTION DE VIAJES - CABIFY CORE ===");

        Vehiculo auto1 = new Vehiculo("AF123JK", "Cronos 1.3", 2023);
        Chofer chofer1 = new Chofer("CH-001", "Nahuel Sandoval", auto1);

        System.out.println("\n--- Estado Inicial del Chofer ---");
        System.out.println(chofer1.obtenerPerfil());


        System.out.println("\n🚖 Iniciando un nuevo viaje...");
        Viaje viaje1 = new Viaje("Almagro", "Obelisco", 5.5, chofer1);

        System.out.println(viaje1.obtenerResumenViaje());
        System.out.println("Estado del chofer durante el viaje: " + chofer1.obtenerPerfil());

        System.out.println("\n🏁 LLegando al destino...");
        viaje1.finalizarViaje();
        System.out.println("Estado del chofer post-viaje: " + chofer1.obtenerPerfil());
    }
}