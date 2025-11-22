package punto9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expresion = "";
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ingresar expresion aritmetica");
            System.out.println("2. Verificar agrupadores");
            System.out.println("3. Salir");
            System.out.print("Ingrese opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese una expresion: ");
                    expresion = sc.nextLine();
                    System.out.println("Expresion guardada correctamente.");
                    break;

                case 2:
                    if (expresion.equals("")) {
                        System.out.println("No hay expresion cargada. Use la opcion 1 primero.");
                    } else {
                        Pila pila = new Pila(expresion.length());
                        boolean correcta = true;

                        for (int i = 0; i < expresion.length(); i++) {
                            char c = expresion.charAt(i);

                            if (c == '(' || c == '[' || c == '{') {
                                pila.push(c);
                            } else if (c == ')' || c == ']' || c == '}') {
                                if (pila.vacia()) {
                                    correcta = false;
                                    break;
                                }

                                char abierto = pila.pop();

                                if ((c == ')' && abierto != '(') ||
                                    (c == ']' && abierto != '[') ||
                                    (c == '}' && abierto != '{')) {
                                    correcta = false;
                                    break;
                                }
                            }
                        }

                        if (!pila.vacia()) correcta = false;

                        if (correcta)
                            System.out.println("La expresion tiene los separadores correctamente colocados.");
                        else
                            System.out.println("La expresion tiene errores en los separadores.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 3);

        sc.close();
    }
}
