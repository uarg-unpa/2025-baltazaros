package punto3u6;

import java.util.Scanner;

public class MainCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cola cola = new Cola(); 
        int opcion;

        do {
            System.out.println("\n=== MENÚ COLA DE TAREAS (Frente Fijo) ===");
            System.out.println("1. Encolar tarea (push)");
            System.out.println("2. Desencolar tarea (pop)");
            System.out.println("3. Ver tarea en frente (peek)");
            System.out.println("4. Mostrar estado (vacía, llena o cantidad)");
            System.out.println("5. Contar elementos (método contar)");
            System.out.println("6. Contar elementos (método contar2)");
            System.out.println("7. Borrar elementos repetidos");
            System.out.println("8. Comparar con otra cola");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de la tarea: ");
                    int tarea = sc.nextInt();
                    if (cola.estaLlena()) {
                        System.out.println("Error: La cola está llena (máximo 10 tareas). No se puede encolar " + tarea);
                    } else {
                        cola.push(tarea);
                        System.out.println("Tarea " + tarea + " encolada con éxito.");
                    }
                    break;

                case 2:
                    if (cola.estaVacia()) {
                        System.out.println("Error: La cola está vacía. No se puede desencolar.");
                    } else {
                        int desencolada = cola.pop();
                        System.out.println("Tarea desencolada: " + desencolada);
                    }
                    break;

                case 3:
                    if (cola.estaVacia()) {
                        System.out.println("Error: La cola está vacía. No hay tarea en el frente.");
                    } else {
                        System.out.println("Tarea en frente: " + cola.peek());
                    }
                    break;

                case 4:
                    if (cola.estaVacia()) {
                        System.out.println("Estado: La cola está vacía.");
                    } else if (cola.estaLlena()) {
                        System.out.println("Estado: La cola está llena.");
                        System.out.println("Cantidad de elementos: " + cola.contar());
                    } else {
                        System.out.println("Estado: La cola tiene " + cola.contar() + " tarea(s).");
                    }
                    break;

                case 5:
                    System.out.println("Cantidad de elementos (método contar): " + cola.contar());
                    break;

                case 6:
                    System.out.println("Cantidad de elementos (método contar2): " + cola.contar2());
                    break;

                case 7:
                    if (cola.estaVacia()) {
                        System.out.println("No hay elementos para borrar.");
                    } else {
                        cola.borrarRepetidos();
                        System.out.println("Elementos repetidos eliminados.");
                    }
                    break;

                case 8:
                    System.out.print("Ingrese la cantidad de elementos de la segunda cola: ");
                    int n = sc.nextInt();
                    Cola cola2 = new Cola();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        cola2.push(sc.nextInt());
                    }
                    boolean iguales = cola.compararCola(cola2);
                    if (iguales) {
                        System.out.println("Las colas son idénticas.");
                    } else {
                        System.out.println("Las colas son diferentes.");
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
