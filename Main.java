public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTION DE VIAJES - CABIFY CORE ===");

        Vehiculo auto1 = new Vehiculo("AF123JK", "Cronos 1.3", 2023);
        Chofer chofer1 = new Chofer("CH-001", "Nahuel Sandoval", auto1);

        try {
            System.out.println("\n🚖 Pedido 1: Cliente A solicita viaje de Almagro a Obelisco...");
            Viaje viaje1 = new Viaje("Almagro", "Obelisco", 5.5, chofer1);
            System.out.println(viaje1.obtenerResumenViaje());

            System.out.println("\n🚖 Pedido 2: Cliente B intenta pedir un viaje con el mismo chofer...");
            Viaje viaje2 = new Viaje("Palermo", "Recoleta", 3.0, chofer1); // ¡Aca debería saltar el error!
            System.out.println(viaje2.obtenerResumenViaje());

        } catch (SinChoferDisponibleException e) {
            System.out.println("\n------------------------------------------------");
            System.out.println("LOG DE ERROR CAPTURADO EN SISTEMA:");
            System.out.println(e.getMessage());
            System.out.println("------------------------------------------------");
        }

        System.out.println("\n✅ El sistema continuo ejecutandose normalmente sin colapsar.");
    }
}