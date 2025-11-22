package punto9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estacionamiento estacionamiento = new Estacionamiento("La esquina");
        PilaAuto espera = new PilaAuto(); 
        PilaAuto aux = new PilaAuto();    
        String ingresado;
        char op;
        do {
            System.out.println("\n=== MENU ESTACIONAMIENTO ===");
            System.out.println("e - Ingresar auto");
            System.out.println("s - Retirar auto");
            System.out.println("m - Mostrar estado");
            System.out.println("x - Salir");
            System.out.print("Opcion: ");
            ingresado = sc.nextLine().trim();
            op = ingresado.charAt(0);
            switch (op) {
                case 'e': {
                    System.out.print("Ingrese patente: ");
                    String patente = sc.nextLine().trim();
                    if (patente.isEmpty()) {
                        System.out.println("Patente vacía, operación cancelada");
                        break;
                    }

                    Auto nuevo = new Auto(patente);
                    boolean ingreso = estacionamiento.ingresar(nuevo);

                    if (ingreso) {
                        System.out.println("Auto " + patente + " ingresó al estacionamiento.");
                    } else {
                        // Si el estacionamiento está lleno, lo agregamos a la lista de espera
                        if (!espera.estaLlena()) {
                            espera.meter(nuevo);
                            System.out.println("Auto " + patente + " ingresó a la cola de espera.");
                        }
                    }
                    break;
                }

                case 's': {
                    System.out.print("Ingrese patente a retirar: ");
                    String patente = sc.nextLine().trim();
                    if (patente.isEmpty()) {
                        System.out.println("Patente vacía. Operación cancelada.");
                        break;
                    }

                    boolean encontradoEnEspera = false;
                    PilaAuto temporal = new PilaAuto();

                    // Buscar en la pila de espers
                    while (!espera.estaVacia()) {
                        Auto a = espera.sacar();
                        if (a.getPatente().equalsIgnoreCase(patente)) {
                            encontradoEnEspera = true;
                            System.out.println("El auto " + patente + " fue retirado de la lista de espera.");
                        } else {
                            temporal.meter(a);
                        }
                    }
                    // Devolver todo a la pila original
                    while (!temporal.estaVacia()) {
                        espera.meter(temporal.sacar());
                    }

                    if (encontradoEnEspera) {
                        break; // listo, no estaba adentro, solo en espera
                    }

                    // Si no estaba en espera, intentar retirarlo del estacionamiento
                    Auto egresado = estacionamiento.egresar(patente);
                    if (egresado != null) {
                        System.out.println("Auto retirado: " + egresado.getPatente());
                        System.out.println("Veces movido: " + egresado.getCont());

                        // Luego de liberar un lugar, pasar el primer auto en espera
                        if (!espera.estaVacia()) {
                            // Sacar el auto del fondo (primero en entrar)
                            while (!espera.estaVacia()) {
                                aux.meter(espera.sacar());
                            }
                            Auto siguiente = aux.sacar(); // fondo
                            boolean ingreso = estacionamiento.ingresar(siguiente);
                            if (ingreso) {
                                System.out.println("Auto " + siguiente.getPatente() + " ingresó desde la lista de espera.");
                            }
                            // Devolver el resto a la pila espera
                            while (!aux.estaVacia()) {
                                espera.meter(aux.sacar());
                            }
                        }
                    } else {
                        System.out.println("No se encuentra el auto con patente " + patente + " en el estacionamiento.");
                    }
                    break;
                }

                case 'm': {
                    // Mostrar el contenido de la lista de espera
                    System.out.println("\n--- Estado actual ---");
                    if (espera.estaVacia()) {
                        System.out.println("No hay autos en espera.");
                    } else {
                        System.out.print("Autos en espera (de primero a último): ");
                        while (!espera.estaVacia()) {
                            Auto a = espera.sacar();
                            System.out.print(a.getPatente() + " ");
                            aux.meter(a);
                        }
                        System.out.println();
                        // Devolver los autos a la pila de espera
                        while (!aux.estaVacia()) {
                            espera.meter(aux.sacar());
                        }
                    }
                    break;
                }

                case 'x':
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (op != 'x');

        sc.close();
    }
}
