package tarea0411;

public class PilaEnteros {
    private final int MAXPILA = 20;
    private int[] elementos;
    private int frente, ultimo;

    public PilaEnteros() {
        frente = 0;
        ultimo = -1;
        elementos = new int[MAXPILA];
    }

    public boolean estaLlena() {
        return (ultimo == MAXPILA - 1);
    }

    public boolean estaVacia() {
        return (ultimo == -1);
    }

    public void push(int apilado) {
        elementos[++ultimo] = apilado;
    }

    public int pop() {
        return elementos[ultimo--];
    }

    public int contarRep(int repetido) {
        PilaEnteros auxPila = new PilaEnteros();
        int totalRep = 0;
        int auxInt = 0;
        while (!this.estaVacia()) {
            auxInt = this.pop();
            if (auxInt == repetido) ++totalRep;
            auxPila.push(auxInt);
        }
        return totalRep;
    }
}