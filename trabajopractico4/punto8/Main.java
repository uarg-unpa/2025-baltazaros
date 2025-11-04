package punto8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        Cola cola = new Cola();
        int opcion;

        do {
            System.out.println("\n=== MENÚ PILA Y COLA DE CARACTERES ===");
            System.out.println("1. Ingresar palabra");
            System.out.println("2. Vaciar pila y cola");
            System.out.println("3. Ver elemento en la cima de la pila");
            System.out.println("4. Mostrar estado de la pila");
            System.out.println("5. Verificar si la cadena es palíndromo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (pila.estaLlena()) {
                        System.out.println("Error: la pila está llena.");
                    } else if (cola.estaLlena()) {
                        System.out.println("Error: la cola está llena.");
                    } else {
                        System.out.print("Ingrese una palabra: ");
                        String cadena = sc.nextLine();
                        for (int i = 0; i < cadena.length(); i++) {
                            char c = cadena.charAt(i);
                            if (c != ' ') { // No sabia si usar un .trim().isEmpty() o esto, pero como es mas corto, me decante por este if 
                                char lower = Character.toLowerCase(c);
                                if (!pila.estaLlena()) pila.meter(lower);
                                if (!cola.estaLlena()) cola.insertar(lower);
                            }
                        }
                        System.out.println("Cadena cargada en pila y cola.");
                    }
                    break;

                case 2:
                    while (!pila.estaVacia()) pila.sacar();
                    while (!cola.estaVacia()) cola.borrar();
                    System.out.println("Pila y cola vaciadas correctamente."); // Supuse que lo optimo es vaciar toda la pila y cola, permitiendo asi entrar a la siguiente palabra
                    break;

                case 3:
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        char cima = pila.sacar();
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
                        System.out.println("La pila tiene caracteres almacenados.");
                    }
                    break;

                case 5:
                    if (pila.estaVacia() || cola.estaVacia()) {
                        System.out.println("No hay caracteres cargados.");
                    } else {
                        Pila auxPila = new Pila();
                        Cola auxCola = new Cola();
                        boolean esPalindromo = true;

                        while (!pila.estaVacia() && !cola.estaVacia()) {
                            char charPila = pila.sacar();
                            char charCola = cola.borrar();
                            auxPila.meter(charPila);
                            auxCola.insertar(charCola);
                            if (charPila != charCola) {
                                esPalindromo = false;
                            }
                        }

                        while (!auxPila.estaVacia()) pila.meter(auxPila.sacar());
                        while (!auxCola.estaVacia()) cola.insertar(auxCola.borrar());

                        if (esPalindromo)
                            System.out.println("La cadena es un palíndromo.");
                        else
                            System.out.println("La cadena no es un palíndromo.");
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
