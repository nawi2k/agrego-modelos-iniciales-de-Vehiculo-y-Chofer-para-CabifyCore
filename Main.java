import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Preparamos la flota del sistema
        Vehiculo auto1 = new Vehiculo("AF123JK", "Cronos 1.3", 2023);
        Chofer chofer1 = new Chofer("CH-001", "Nahuel Sandoval", auto1);
        Viaje viajeActual = null; // Guardará el viaje activo si existe

        int opcion = -1;

        System.out.println("====================================================");
        System.out.println("   SISTEMA DE DESPACHO INTERACTIVO - CABIFY CORE    ");
        System.out.println("====================================================");

        // Bucle principal del menú interactivo
        while (opcion != 0) {
            System.out.println("\n--- MENÚ DE OPERADOR ---");
            System.out.println("1. Despachar Nuevo Viaje");
            System.out.println("2. Finalizar Viaje Actual");
            System.out.println("3. Consultar Estado del Chofer");
            System.out.println("0. Salir del Sistema");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("\n--- NUEVO DESPACHO ---");
                        System.out.print("Ingrese Origen: ");
                        String origen = scanner.nextLine();

                        System.out.print("Ingrese Destino: ");
                        String destino = scanner.nextLine();

                        System.out.print("Ingrese Distancia aproximada en Km: ");
                        double distancia = Double.parseDouble(scanner.nextLine());

                        // Intentamos crear el viaje (Aca puede saltar la excepción)
                        viajeActual = new Viaje(origen, destino, distancia, chofer1);
                        
                        System.out.println("\n✅ VIAJE DESPACHADO CON ÉXITO");
                        System.out.println(viajeActual.obtenerResumenViaje());
                        break;

                    case 2:
                        if (viajeActual == null || chofer1.isDisponible()) {
                            System.out.println("\n⚠️ NO HAY NINGÚN VIAJE EN CURSO PARA FINALIZAR.");
                        } else {
                            viajeActual.finalizarViaje();
                            viajeActual = null; // Reseteamos la variable del viaje
                        }
                        break;

                    case 3:
                        System.out.println("\n--- ESTADO DE LA FLOTA ---");
                        System.out.println(chofer1.obtenerPerfil());
                        break;

                    case 0:
                        System.out.println("\n👋 Cerrando sesión en CabifyCore... ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("\n❌ Opción no válida. Intente con números del 0 al 3.");
                        break;
                }

            } catch (NumberFormatException e) {
                // Atrapa errores si el usuario ingresa texto en lugar de números en el menú/distancia
                System.out.println("\n❌ ERROR DE INGRESO: Debe introducir un valor numérico válido.");
            } catch (SinChoferDisponibleException e) {
                // Atrapa la excepción de negocio si intentan asignar un chofer ocupado
                System.out.println("\n------------------------------------------------");
                System.out.println(e.getMessage());
                System.out.println("------------------------------------------------");
            }
        }

        scanner.close(); // Cerramos el recurso Scanner
    }
}