
public class MainColaChar {
    public static void main(String[] args) {
        ColaChar cola = new ColaChar();

        // Encolar 5 elementos char
        cola.push('A');
        cola.push('B');
        cola.push('C');
        cola.push('D');
        cola.push('E');
        System.out.println("Después de encolar 5 elementos:");
        for (int i = 0; i < 5; i++) { // No sé si esto es posible, se me ocurrio el sacar y guardar en una variable aux; luego imprimirla; y despues usar push con la variable auxiliar
            char x = cola.pop();
            System.out.print(x + " ");
            cola.push(x);
        }
        System.out.println();

        // Desencolar 2 elementos
        cola.pop();
        cola.pop();
        System.out.println("Después de desencolar 2 elementos:");
        for (int i = 0; i < 3; i++) {
            char x = cola.pop();
            System.out.print(x + " ");
            cola.push(x);
        }
        System.out.println();

        while (!cola.estaVacia()) {
            cola.pop();
        }

        // Probar el método peek
        System.out.println("Peek: " + cola.peek());

        // Vaciar la estructura
        while (!cola.estaVacia()) {
            cola.pop();
        }

        // Llenar la estructura
        cola.push('F');
        cola.push('G');
        cola.push('H');
        cola.push('I');
        cola.push('J');
        cola.push('K');
        cola.push('L');
        cola.push('M');
        cola.push('N');
        cola.push('O');
        System.out.println("Después de encolar hasta llenar:");
        for (int i = 0; i < 10; i++) {
            char x = cola.pop();
            System.out.print(x + " ");
            cola.push(x);
        }
        System.out.println();
    }
}

