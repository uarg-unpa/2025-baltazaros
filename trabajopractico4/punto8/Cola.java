package punto8;

public class Cola {
    private final int MAX = 100;
    private char[] elementos;
    private int ultimo; 

    public Cola() {
        elementos = new char[MAX];
        ultimo = 0;
    }

    public boolean estaVacia() {
        return (ultimo == 0);
    }

    public boolean estaLlena() {
        return (ultimo == MAX);
    }

    public void insertar(char elem) {
        elementos[ultimo] = elem;
        ultimo++;
    }

    public char borrar() {
        char eliminado = elementos[0];
        for (int i = 0; i < ultimo - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        ultimo--;
        return eliminado;
    }

    public int contar() {
        return ultimo;
    }
}
