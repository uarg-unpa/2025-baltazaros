package tarea0211;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaEnteros pila = new PilaEnteros();
        PilaEnteros aux = new PilaEnteros();
        int opcion;
        int valor, cima = 0;

        do {
            System.out.println("\n=== MENÚ PILA DE NIVELES DE ENERGÍA ===");
            System.out.println("1 - Agregar nuevo nivel");
            System.out.println("2 - Mostrar nivel en la cima");
            System.out.println("3 - Contar cuántas veces aparece un valor X");
            System.out.println("4 - Mostrar todos los niveles");
            System.out.println("0 - Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (pila.estaLlena()) {
                        System.out.println("La pila está llena, no se pueden agregar más niveles.");
                    } else {
                        System.out.print("Ingrese el nivel de energía a apilar: ");
                        valor = sc.nextInt();
                        pila.push(valor);
                        System.out.println("Nivel agregado correctamente.");
                    }
                    break;

                case 2:
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        cima = pila.pop();
                        System.out.println("El nivel en la cima es: " + cima);
                        pila.push(cima);
                    }
                    break;

                case 3:
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía, no hay elementos para contar.");
                    } else {
                        System.out.print("Ingrese el valor X a buscar: ");
                        valor = sc.nextInt();
                        int repeticiones = pila.contarRep(valor);
                        System.out.println("El valor " + valor + " aparece " + repeticiones + " veces en la pila.");
                    }
                    break;

                case 4:
                    // Mostrar todos los niveles sin perderlos
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        System.out.print("Niveles en la pila (de cima a fondo): ");
                        while (!pila.estaVacia()) {
                            valor = pila.pop();
                            System.out.print(valor + " ");
                            aux.push(valor);
                        }
                        System.out.println();
                        // Restaurar la pila original
                        while (!aux.estaVacia()) {
                            pila.push(aux.pop());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
