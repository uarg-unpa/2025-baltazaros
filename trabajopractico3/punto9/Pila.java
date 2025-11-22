package punto9;

public class Pila {
    private char[] elementos;
    private int cima;

    public Pila(int capacidad) {
        elementos = new char[capacidad];
        cima = -1;
    }

    public void push(char c) {
        if (cima < elementos.length - 1) {
            cima++;
            elementos[cima] = c;
        }
    }

    public char pop() {
        if (cima >= 0) {
            char c = elementos[cima];
            cima--;
            return c;
        }
        return ' ';
    }

    public char peek() {
        if (cima >= 0)
            return elementos[cima];
        return ' ';
    }

    public boolean vacia() {
        return cima == -1;
    }
}
