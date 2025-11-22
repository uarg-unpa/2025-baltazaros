package punto7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        Cola cola = new Cola();
        int opcion;

        do {
            System.out.println("\n=== MENÚ PILA DE ENTEROS ===");
            System.out.println("1. Apilar número (push)");
            System.out.println("2. Desapilar número (pop)");
            System.out.println("3. Ver elemento en la cima");
            System.out.println("4. Mostrar estado de la pila");
            System.out.println("5. Pasar pares de la pila a la cola e imprimirlos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (pila.estaLlena()) {
                        System.out.println("Error: la pila está llena.");
                    } else {
                        System.out.print("Ingrese número positivo: ");
                        int num = sc.nextInt();
                        pila.meter(num);
                        System.out.println("Número " + num + " apilado.");
                    }
                    break;

                case 2:
                    if (pila.estaVacia()) {
                        System.out.println("Error: la pila está vacía.");
                    } else {
                        int desapilado = pila.sacar();
                        System.out.println("Número desapilado: " + desapilado);
                    }
                    break;

                case 3:
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        int cima = pila.sacar();
                        System.out.println("Elemento en la cima: " + cima);
                        pila.meter(cima);
                    }
                    break;

                case 4:
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else if (pila.estaLlena()) {
                        System.out.println("La pila está llena.");
                    } else {
                        System.out.println("La pila tiene elementos.");
                    }
                    break;

                case 5:
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía, no hay elementos para pasar.");
                    } else {
                        Pila aux = new Pila();

                        while (!pila.estaVacia()) {
                            int elem = pila.sacar();
                            if (elem % 2 == 0 && !cola.estaLlena()) {
                                cola.insertar(elem);
                            }
                            aux.meter(elem);
                        }

                        while (!aux.estaVacia()) {
                            pila.meter(aux.sacar());
                        }

                        if (cola.estaVacia()) {
                            System.out.println("No hay elementos pares para mostrar.");
                        } else {
                            System.out.println("Elementos pares en la cola:");
                            Cola auxCola = new Cola();
                            while (!cola.estaVacia()) {
                                int valor = cola.borrar();
                                System.out.println(valor);
                                if (!auxCola.estaLlena()) {
                                    auxCola.insertar(valor); 
                                }
                            }

                            while (!auxCola.estaVacia()) {
                                cola.insertar(auxCola.borrar());
                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}

