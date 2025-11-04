package punto7;

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

    public Pila copiar() {
        Pila aux = new Pila();
        Pila copia = new Pila();

        while (!this.estaVacia()) {
            aux.meter(this.sacar());
        }

        while (!aux.estaVacia()) {
            int valor = aux.sacar();
            this.meter(valor);
            copia.meter(valor);
        }

        return copia;
    }
}
