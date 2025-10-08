import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaChar cola = new ColaChar();
        int opcion;

        do {
            System.out.println("\n=== MENÚ COLA DE TAREAS (Frente Fijo) ===");
            System.out.println("1. Encolar tarea (agregar letra)");
            System.out.println("2. Desencolar tarea (sacar letra)");
            System.out.println("3. Ver tarea en frente (peek)");
            System.out.println("4. Mostrar estado (vacía, llena o cantidad)");
            System.out.println("5. Prueba");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (cola.estaLlena()) {
                        System.out.println("Error: La cola está llena (máximo 10 tareas).");
                    } else {
                        System.out.print("Ingrese la letra de la tarea: ");
                        char tarea = sc.nextLine().charAt(0); // Como no existe el "nextChar" segun lo que investigue, debo usar esto. tengo que consultarlo a los docentes igualmente 
                        cola.push(tarea);
                        System.out.println("Tarea '" + tarea + "' encolada con éxito.");
                    }
                    break;

                case 2:
                    if (cola.estaVacia()) {
                        System.out.println("Error: La cola está vacía. No se puede desencolar.");
                    } else {
                        char desencolada = cola.pop();
                        System.out.println("Tarea desencolada: " + desencolada);
                    }
                    break;

                case 3:
                    if (cola.estaVacia()) {
                        System.out.println("Error: La cola está vacía. No hay tarea en el frente.");
                    } else {
                        char frente = cola.peek();
                        System.out.println("Tarea en frente: " + frente);
                    }
                    break;

                case 4:
                    if (cola.estaVacia()) {
                        System.out.println("Estado: La cola está vacía.");
                    } else if (cola.estaLlena()) {
                        System.out.println("Estado: La cola está llena.");
                    } else {
                        System.out.println("Estado: La cola tiene " + 1 + " tarea(s).");
                    }
                    break;
                
                case 5:
                    System.out.println("Ingrese 5 letras: "); // Ingresa 5 letras
                    for (int i = 0; i < 5; i++) {
                        char letra = sc.nextLine().charAt(0);
                        cola.push(letra);  
                    }
                    System.out.println("Letras ingresadas: "); // Muestra las 5 letras ingresadas
                    ColaChar colaAux = new ColaChar();
                    while (!cola.estaVacia()) {
                        char elementos = cola.pop();
                        System.out.println(elementos);
                        colaAux.push(elementos);
                    }
                    while (!colaAux.estaVacia()) {
                        cola.push(colaAux.pop());
                    }

                    cola.pop(); // Sacamos dos elementos
                    cola.pop();
                    System.out.println("Letras ingresadas luego de sacar 2 con el metodo Pop: ");
                    while (!cola.estaVacia()) {
                        char aux2 = cola.pop();
                        System.out.println(aux2); // Decidi hacer pop a los elementos asi directamente me ahorro el borrarlos para cargarle los 10 elementos para llenarla
                    }

                    System.out.println("Ingrese 10 letras más: "); // Carga los 10 elementos
                    while (!cola.estaLlena()) {
                        char letra = sc.nextLine().charAt(0);
                        cola.push(letra);  
                    }
                    while (!cola.estaVacia()) { //Los imprime eliminandolos en el proceso
                        char aux2 = cola.pop();
                        System.out.println(aux2);
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