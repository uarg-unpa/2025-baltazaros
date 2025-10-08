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

    // Verifica si la cola esta o no llena
    public boolean estaLlena() {
        int sigultimo=siguiente(ultimo);
        return (sigultimo == frente);
    }

    // Establece cuál es el siguiente elemento
    private int siguiente(int subind) {
        if(subind == maxcola - 1) {
            return 0;
        }
        else;    
            return ++subind;    
        }
        
    public void push(String nombre) {
        ultimo=siguiente(ultimo);
        elementos[ultimo]=nombre;
    } 

    public String pop() {
        frente = siguiente(frente); // o frente = (frente + 1) % MAXCOLA
        return elementos[frente];
    }

    public String peek() {
        return elementos[frente];
    }
}
