public class ColaChar { 
    private final int maxcola=10; //cantidad de elementos de la cola
    private char[] elementos; //arreglo que representa a la cola
    private int ultimo; //índices para insertar y borrar
    
    // Constructor de la cola
    public ColaChar() {
        elementos=new char[maxcola];
        ultimo=0; 
    }

    // Verifica si la cola esta o no vacía
    public boolean estaVacia() {
        return (ultimo == 0);
    }

    //verifica si la cola esta o no llena
    public boolean estaLlena() {
        return (ultimo == maxcola - 1);
    }

    //inserta un elemento en la cola
    //precondición: cola no llena y elemento entero
    //postcondición: elemento entero insertado en cola si no está llena
    public void push(char elem) {
    if(!estaLlena()) {
        elementos[ultimo]=elem;
        ultimo++;
        }
        return;
    }

    //borra un elemento de la cola
    //precondición: cola no vacía
    //postcondición: elemento entero borrado de la cola si no está vacía
    public char pop() {
        if (!estaVacia()) {
            char aux = elementos[0];
            for (int i = 0; i < ultimo - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            ultimo--;
            return aux;
        } 
        else {
            return ' ';
        }
    }

    public char peek() {
        char frente = pop();
        ColaChar aux = new ColaChar();
        aux.push(frente);
        while (!aux.estaLlena()) {
            aux.push(pop());
            }
        while (!estaLlena()) {
            push(aux.pop());
                    }        
        return (frente);
    }

}

