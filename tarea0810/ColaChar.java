public class ColaChar { 
    private final int maxcola=10; 
    private char[] elementos; 
    private int ultimo;

    public ColaChar() {
        elementos=new char[maxcola];
        ultimo=0; 
    }

    public boolean estaVacia() {
        return (ultimo == 0);
    }

    public boolean estaLlena() {
        return (ultimo == maxcola - 1);
    }

    public void push(char elem) {
        elementos[ultimo]=elem;
        ultimo++;
    }

    public char pop() {
        char aux = elementos[0];
        for (int i = 0; i < ultimo - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        ultimo--;
        return aux; 
        } 

    public char peek() {
        char frente = this.pop();
        ColaChar aux = new ColaChar();
        aux.push(frente);
        while (!aux.estaLlena()) {
            aux.push(this.pop());
            }
        while (!estaLlena()) {
            this.push(aux.pop());
                    }        
        return (frente);
    }

}

