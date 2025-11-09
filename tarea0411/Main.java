package tarea0411;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ColaTemas cola = new ColaTemas();
        ColaTemas aux = new ColaTemas();

        int opcion;

        do {
            System.out.println("\n=== MENÚ REPRODUCTOR MUSICAL ===");
            System.out.println("1 - Agregar nuevo tema");
            System.out.println("2 - Reproducir lista completa");
            System.out.println("0 - Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    if (cola.estaLlena()) {
                        System.out.println("La lista está llena. No se pueden agregar más temas.");
                    } else {
                        System.out.print("Ingrese intérprete: ");
                        String interprete = sc.nextLine();

                        System.out.print("Ingrese género: ");
                        String genero = sc.nextLine();

                        System.out.print("Ingrese año de lanzamiento: ");
                        int anio = sc.nextInt();
                        sc.nextLine();

                        TemaMusical t = new TemaMusical(genero, interprete, anio);
                        cola.encolar(t);

                        System.out.println("Tema agregado exitosamente.");
                    }
                    break;

                case 2:
                    if (cola.estaVacia()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.println("=== REPRODUCIENDO LISTA ===");
                        while (!cola.estaVacia()) {
                            TemaMusical t = cola.desencolar();
                            System.out.println(t.toString());
                            aux.encolar(t);
                        }
                        while (!aux.estaVacia()) {
                            cola.encolar(aux.desencolar());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
