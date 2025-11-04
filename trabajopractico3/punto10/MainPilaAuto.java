package punto10;

import java.util.Scanner;

public class MainPilaAuto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaAuto pila = new PilaAuto();
        char opcion;

        do {
            System.out.println("\n=== MENÚ PILA DE AUTOS ===");
            System.out.println("1. Ingresar auto");
            System.out.println("2. Buscar y sacar auto por patente");
            System.out.println("3. Mostrar cantidad actual de autos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.next().charAt(0);
            sc.nextLine(); 

            switch (opcion) {
                case '1':
                    if (pila.estaLlena()) {
                        System.out.println(" La pila está llena. No se puede ingresar más autos");
                    } else {
                        System.out.print("Ingrese la patente del auto: ");
                        String patente = sc.nextLine();
                        Auto nuevo = new Auto(patente);
                        pila.meter(nuevo);
                        System.out.println("Auto con patente " + patente + " ingresado cprrectamente");
                    }
                    break;

                case '2':
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía. No hay autos para buscar");
                    } else {
                        System.out.print("Ingrese la patente del auto a buscar: ");
                        String buscar = sc.nextLine();

                        PilaAuto aux = new PilaAuto();
                        Auto encontrado = null; // Me daba error, así que le puse null
                        boolean hallado = false;

                        // Sacar autos hasta encontrar el deseado
                        while (!pila.estaVacia() && !hallado) {
                            Auto a = pila.sacar();
                            if (a.getPatente().equalsIgnoreCase(buscar)) {
                                encontrado = a;
                                hallado = true;
                            } else {
                                aux.meter(a);
                            }
                        }

                        // Volver a meter los autos
                        while (!aux.estaVacia()) {
                            pila.meter(aux.sacar());
                        }

                        if (hallado) {
                            System.out.println("Auto encontrado y retirado del estacionamiento.");
                            System.out.println("Patente: " + encontrado.getPatente());
                            System.out.println("Veces movido: " + encontrado.getCont());
                        } else {
                            System.out.println("No se encontró ningún auto con la patente " + buscar + ".");
                        }
                    }
                    break;

                case '3':
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía");
                    } else {
                        System.out.println("Actualmente hay autos en la pila");
                    }
                    break;

                case '0':
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, intente de nuevo");
            }

        } while (opcion != '0');

        sc.close();
    }
}
