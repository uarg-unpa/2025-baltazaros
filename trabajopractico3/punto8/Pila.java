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
        if (!estaVacia()) {
            char c = elementos[cima];
            cima--;
            return c;
        }
        return ' ';
    }

    public char verCima() {
        if (!estaVacia()) {
            return elementos[cima];
        }
        return ' ';
    }

    public boolean esPalindromo() {
        if (this.estaVacia()) {
            return true;
        }
        
        Pila invertida = new Pila();
        Pila temporal = new Pila();
        Pila copiaOriginal = new Pila();
        
        while (!this.estaVacia()) {
            char c = this.sacar();
            temporal.meter(c);
            copiaOriginal.meter(c);
        }
        
        while (!temporal.estaVacia()) {
            this.meter(temporal.sacar());
        }
        
        while (!copiaOriginal.estaVacia()) {
            invertida.meter(copiaOriginal.sacar());
        }
        
        boolean esPalindromo = true;
        
        while (!this.estaVacia() && !invertida.estaVacia()) {
            char original = this.sacar();
            char inverso = invertida.sacar();
            
            if (original != inverso) {
                esPalindromo = false;
            }
            temporal.meter(original);
        }
        
        while (!temporal.estaVacia()) {
            this.meter(temporal.sacar());
        }
        
        return esPalindromo;
    }
}