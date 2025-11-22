package punto7;

public class Pila {
    private int[] elementos;
    private int cima;
    private final int MAX = 20;

    public Pila() {
        elementos = new int[MAX];
        cima = 0;
    }

    public boolean estaVacia() {
        return cima == 0;
    }

    public boolean estaLlena() {
        return cima == MAX;
    }

    public void meter(int elem) {
        elementos[cima] = elem;
        cima++;
    }

    public int sacar() {
        cima--;
        return elementos[cima];
    }
}
