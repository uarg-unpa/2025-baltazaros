package punto6;
import java.util.Scanner;

public class MainPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        Pila aux = new Pila();
        int opcion;
        int X = 0;

        // Cargamos algunos valores de ejemplo
        for (int i = 1; i <= 5; i++) {
            pila.meter(i);
        }

        do {
            System.out.println("\n=== MENÚ OPERACIONES CON PILA ===");
            System.out.println("1 - Segundo elemento desde la cima, quitarlo junto al primero");
            System.out.println("2 - Segundo elemento desde la cima, sin modificar pila");
            System.out.println("3 - N-ésimo elemento desde la cima, quitar N elementos");
            System.out.println("4 - N-ésimo elemento desde la cima, sin modificar pila");
            System.out.println("5 - Elemento del fondo, dejar pila vacía");
            System.out.println("6 - Elemento del fondo, sin modificar pila");
            System.out.println("7 - Mostrar pila actual");
            System.out.println("0 - Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    // a) Asignar a X el segundo elemento desde la parte superior de la pila, dejando la pila sin sus dos elementos de la parte superior.
                    if (pila.estaVacia()) {
                        System.out.println("No hay suficientes elementos.");
                    } else {
                        if (!pila.estaVacia()) pila.sacar(); // quita el primero
                        if (!pila.estaVacia()) X = pila.sacar(); // toma el segundo
                        System.out.println("X = " + X);
                    }
                    break;

                case 2:
                    // b) Asignar a X el segundo elemento desde la parte superior de la pila, sin modificarla.
                    if (pila.estaVacia()) {
                        System.out.println("No hay suficientes elementos.");
                    } else {
                        int primero = pila.sacar();
                        if (!pila.estaVacia()) {
                            X = pila.sacar();
                            aux.meter(X);
                        }
                        // devolvemos los elementos en orden original
                        if (!aux.estaVacia()) pila.meter(aux.sacar());
                        pila.meter(primero);
                        System.out.println("X = " + X);
                    }
                    break;

                case 3:
                    // c) Desde un entero positivo N, asignar a X el N-ésimo elemento desde la parte superior de la pila, dejando la pila sin sus N elementos de la parte superior.
                    System.out.print("Ingrese un entero positivo N: ");
                    int N = sc.nextInt();
                    if (N <= 0) {
                        System.out.println("N debe ser positivo.");
                    } else if (pila.estaVacia()) {
                        System.out.println("No hay suficientes elementos.");
                    } else {
                        for (int i = 1; i < N; i++) {
                            if (!pila.estaVacia()) pila.sacar();
                        }
                        if (!pila.estaVacia()) X = pila.sacar();
                        System.out.println("X = " + X);
                    }
                    break;

                case 4:
                    // d) Dado un entero positivo N, asignar a X el N-ésimo elemento desde la parte superior de pila, sin modificarla.
                    System.out.print("Ingrese un entero positivo N: ");
                    N = sc.nextInt();
                    if (N <= 0) {
                        System.out.println("N debe ser positivo.");
                    } else if (pila.estaVacia()) {
                        System.out.println("No hay suficientes elementos.");
                    } else {
                        int contador = 0;
                        while (!pila.estaVacia() && contador < N) {
                            X = pila.sacar();
                            aux.meter(X);
                            contador++;
                        }
                        System.out.println("X = " + X);
                        while (!aux.estaVacia()) {
                            pila.meter(aux.sacar());
                        }
                    }
                    break;

                case 5:
                    // e) Asignar a X el elemento fondo de la pila, dejando la pila vacía.
                    if (pila.estaVacia()) {
                        System.out.println("Pila vacía.");
                    } else {
                        while (!pila.estaVacia()) {
                            X = pila.sacar();
                        }
                        System.out.println("X = " + X);
                    }
                    break;

                case 6:
                    // f) Asignar a X el elemento fondo de la pila, sin modificarla.
                    if (pila.estaVacia()) {
                        System.out.println("Pila vacía.");
                    } else {
                        while (!pila.estaVacia()) {
                            aux.meter(pila.sacar());
                        }
                        // el último en salir de aux es el fondo original
                        while (!aux.estaVacia()) {
                            X = aux.sacar();
                            pila.meter(X);
                        }
                        System.out.println("X = " + X);
                    }
                    break;

                case 7:
                    System.out.print("Pila: ");
                    while (!pila.estaVacia()) {
                        X = pila.sacar();
                        System.out.print(X + " ");
                        aux.meter(X);
                    }
                    System.out.println();
                    while (!aux.estaVacia()) {
                        pila.meter(aux.sacar());
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
