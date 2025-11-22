package punto7;

public class Cola {
    private final int maxcola = 50;
    private int[] elementos;
    private int ultimo;

    public Cola() {
        elementos = new int[maxcola];
        ultimo = 0;
    }

    public boolean estaVacia() {
        return (ultimo == 0);
    }

    public boolean estaLlena() {
        return (ultimo == maxcola);
    }

    public void insertar(int elem) {
        elementos[ultimo] = elem;
        ultimo++;
    }

    public int borrar() {
        int elem = elementos[0];
        for (int i = 0; i < ultimo - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        ultimo--;
        return elem;
    }

}
