package punto5;

public class Pila {
    private int[] elementos; 
    private int cima;
    private final int MAX = 10;

    public Pila() {
        elementos = new int[MAX];
        cima = -1;
    }

    public boolean estaVacia() {
        return (cima == -1);
    }

    public boolean estaLlena() {
        return (cima == MAX - 1);
    }

    public void meter(int ingreso) {
        cima++;
        elementos[cima] = ingreso;
    }

    public int sacar() {
        int salida = elementos[cima]; 
        cima--;
        return salida;
    }

    public int elementoCima() { // Agregar a la clase Pila el método elementoCima() que retorne el elemento cima sin cambiar la pila
        int aux = -1;
        if (!estaVacia()) {    
            aux = sacar();
            this.meter(aux);
        }
        return aux;
    }
}