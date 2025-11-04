package punto8;

public class Pila {
    private char[] elementos;
    private int cima;
    private final int MAX = 50;

    public Pila() {
        elementos = new char[MAX];
        cima = -1;
    }

    public boolean estaVacia() {
        return (cima == -1);
    }

    public boolean estaLlena() {
        return (cima == MAX - 1);
    }

    public void meter(char c) {
        if (!estaLlena()) {
            cima++;
            elementos[cima] = c;
        }
    }

    public char sacar() {
        char c = elementos[cima];
        cima--;
        return c;
    }

    public boolean esPalindromo() {
        Pila invertida = new Pila();
        Pila restauradora = new Pila();
        boolean esIgual = true;

        while (!this.estaVacia()) {
            char c = sacar();
            invertida.meter(c);
            restauradora.meter(c);
        }
        while (!restauradora.estaVacia()) this.meter(restauradora.sacar());

        while (!invertida.estaVacia()) {
            char inversa = invertida.sacar();
            char original = this.sacar();
            if (original != inversa & esIgual == true) esIgual = false;
            restauradora.meter(original); 
        }
        while (!restauradora.estaVacia()) this.meter(restauradora.sacar());
        return esIgual;
    }
}
