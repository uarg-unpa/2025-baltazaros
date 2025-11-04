package punto7;

import java.util.Scanner; // Lo rehice recientemente porque no me convencia la forma en la que hice el Main

public class MainPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pilaOriginal = new Pila();
        Pila pilaCopia = new Pila();
        Pila aux = new Pila();

        int opcion;
        do {
            System.out.println("\n=== MENÚ DE PILA ===");
            System.out.println("1  Cargar pila");
            System.out.println("2  Crear copia de la pila");
            System.out.println("3  Mostrar pila original");
            System.out.println("4  Mostrar pila copia");
            System.out.println("0  Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n=== CARGA DE PILA ===");
                    while (!pilaOriginal.estaLlena()) {
                        System.out.print("Ingrese un número o -1 para detener: ");
                        int num = sc.nextInt();
                        if (num == -1) break; 
                        pilaOriginal.meter(num);
                    }
                    break;

                case 2:
                    if (pilaOriginal.estaVacia()) {
                        System.out.println("No hay elementos en la pila para copiar.");
                    } else {
                        Pila auxCopia = new Pila();

                        while (!pilaOriginal.estaVacia()) {
                            auxCopia.meter(pilaOriginal.sacar());
                        }

                        while (!auxCopia.estaVacia()) {
                            int valor = auxCopia.sacar();
                            pilaOriginal.meter(valor);
                            pilaCopia.meter(valor);
                        }

                        System.out.println("Se ha creado una copia de la pila.");
                    }
                    break;

                case 3:
                    if (pilaOriginal.estaVacia()) {
                        System.out.println("La pila original está vacía.");
                    } else {
                        System.out.println("Contenido de la pila original:");
                        while (!pilaOriginal.estaVacia()) {
                            int dato = pilaOriginal.sacar();
                            System.out.print(dato + " ");
                            aux.meter(dato);
                        }
                        while (!aux.estaVacia()) {
                            pilaOriginal.meter(aux.sacar());
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    if (pilaCopia.estaVacia()) {
                        System.out.println("La pila copia está vacía.");
                    } else {
                        System.out.println("Contenido de la pila copia:");
                        while (!pilaCopia.estaVacia()) {
                            int dato = pilaCopia.sacar();
                            System.out.print(dato + " ");
                            aux.meter(dato);
                        }
                        while (!aux.estaVacia()) {
                            pilaCopia.meter(aux.sacar());
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
