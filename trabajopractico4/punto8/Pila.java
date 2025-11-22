package punto8;

public class Pila {
    private char[] elementos;
    private int cima;
    private final int MAX = 20;

    public Pila() {
        elementos = new char[MAX];
        cima = 0;
    }

    public boolean estaVacia() {
        return cima == 0;
    }

    public boolean estaLlena() {
        return cima == MAX;
    }

    public void meter(char elem) {
        elementos[cima] = elem;
        cima++;
    }

    public char sacar() {
        cima--;
        return elementos[cima];
    }
}
