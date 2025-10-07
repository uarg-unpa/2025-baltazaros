public class ColaNombres { 
    private final int maxcola=50; //cantidad de elementos de la cola
    private String[] elementos; //arreglo que representa a la cola
    private int frente, ultimo; //índices para insertar y borrar
    
    // Constructor de la cola
    public ColaNombres() {
        elementos=new String[maxcola];
        frente=0;
        ultimo=0; 
    }

    // Verifica si la cola esta o no vacía
    public boolean estaVacia() {
        return (ultimo == frente);
    }

    //verifica si la cola esta o no llena
    public boolean estaLlena() {
        int sigultimo=siguiente(ultimo);
        return (sigultimo == frente);
    }

    //establece cuál es el siguiente elemento
    private int siguiente(int subind) {
        if(subind == maxcola - 1) {
            return 0;
        }
        else;    
            return ++subind;    
        }
    //inserta un elemento en la cola
    //precondición: cola no llena y elemento entero
    //postcondición: elemento entero insertado en cola si no está llena
    public void push(String nombre) {
    if(!estaLlena()) {
        ultimo=siguiente(ultimo);
        elementos[ultimo]=nombre;
        }
        return;
    }

    //borra un elemento de la cola
    //precondición: cola no vacía
    //postcondición: elemento entero borrado de la cola si no está vacía
    public String pop() {
        if(!estaVacia()) {
            frente=siguiente(frente);
            return elementos[frente];
        }
        else
            return " ";
    }

    public String peek() {
        String frente = this.pop();
        ColaNombres aux = new ColaNombres();
        while (!aux.estaLlena()) {
            aux.push(this.pop());
            }
        push(frente);
        while (!this.estaLlena()) {
        this.push(aux.pop());
                    }        
        return (frente);
    }
}
