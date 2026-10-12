public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTION DE VIAJES - CABIFY CORE ===");
    
        Vehiculo auto1 = new Vehiculo("AF123JK", "Cronos 1.3", 2023);

        Chofer chofer1 = new Chofer("CH-001", "Nahuel Sandoval", auto1);

        System.out.println("\n--- Estado Inicial ---");
        System.out.println(chofer1.obtenerPerfil());


        chofer1.ocupar();
        System.out.println("\n--- Chofer asignado a viaje ---");
        System.out.println(chofer1.obtenerPerfil());
    }
}