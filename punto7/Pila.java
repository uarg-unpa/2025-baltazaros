package punto7;

class Pila {
    private int[] elementos;
    private int cima;
    private final int capacidad = 10;

    public Pila() {
        elementos = new int[capacidad];
        cima = -1;
    }

    public boolean estaVacia() {
        return (cima == -1);
    }

    public boolean estaLlena() {
        return (cima == capacidad - 1);
    }

    public void push(int ingreso) {
        cima++;
        elementos[cima] = ingreso;
    }

    public int pop() {
        int salida = elementos[cima]; 
        cima--;
        return salida;
    }
}
