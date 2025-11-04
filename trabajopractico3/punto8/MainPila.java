package punto8;

import java.util.Scanner;

public class MainPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        String cadena = "";
        char opcion;

        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1 - Ingresar cadena");
            System.out.println("2 - Verificar si es palíndromo");
            System.out.println("0 - Salir");
            System.out.print("Opción: ");
            opcion = sc.next().charAt(0);
            sc.nextLine();

            switch (opcion) {
                case '1':
                    System.out.print("Ingrese la cadena: ");
                    cadena = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

                    while (!pila.estaVacia()) pila.sacar();

                    for (int i = 0; i < cadena.length(); i++) {
                        pila.meter(cadena.charAt(i));
                    }

                    System.out.println("Cadena cargada en la pila.");
                    break;

                case '2':
                    if (cadena.isEmpty()) {
                        System.out.println("No hay ninguna cadena ingresada.");
                    } else {
                        if (pila.esPalindromo()) { // Me da error a pesar de varios intentos, y formas distintas de realizarlo. Actualmente está codificado la "versión larga" de mis intentos
                            System.out.println("La cadena es un palíndromo.");
                        } else {
                            System.out.println("La cadena no es un palíndromo.");
                        }
                    }
                    break;

                case '0':
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != '0');

        sc.close();
    }
}
