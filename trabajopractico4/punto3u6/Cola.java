package punto3u6;

public class Cola {
    private int[] datos;
    private int frente;
    private int fin;
    private final int tamaño = 10;

    public Cola() {
        datos = new int[tamaño];
        frente = 0;
        fin = -1;
    }

    public void push(int x) {
        fin++;
        datos[fin] = x;
    }

    public int pop() {
        int valor = datos[frente];
        for (int i = 0; i < fin; i++) {
            datos[i] = datos[i + 1];
        }
        fin--;
        return valor;
    }

    public int peek() {
        return datos[frente];
    }

    public boolean estaVacia() {
        return fin == -1;
    }

    public boolean estaLlena() {
        return fin == tamaño - 1;
    }

    public int getTamaño() {
        return tamaño;
    }

    public int contar() { //Punto 4. En base a la implementación Frente y Final movible, escribir un método contar que devuelva la cantidad de elementos en la cola
            return fin + 1;
    }

    public int contar2() { // Versión alternativa del Punto 4
        Cola aux = new Cola();
        int contador = 0;
        while (!estaVacia()) {
            aux.push(this.pop());
            contador++;
        }
        while (!aux.estaVacia()) {
            this.push(aux.pop());
        }
        return contador;
    }

    public void borrarRepetidos() { //Punto 5. Agregar un método en la clase Cola que elimine los elementos repetidos de la cola.
        Cola aux = new Cola();

        while (!estaVacia()) {
            int elem = pop();
            boolean yaExiste = false;
            int n = aux.contar();

            for (int i = 0; i < n; i++) {
                int val = aux.pop();
                if (val == elem) yaExiste = true;
                aux.push(val);
            }

            if (!yaExiste) aux.push(elem);
        }

        while (!aux.estaVacia()) {
            push(aux.pop());
        }
}
    
    public boolean compararCola(Cola otra) { //Punto 6. Escribir un método en la clase cola que tenga como argumento una cola del mismo tipo y devuelva verdadero o falso si las dos colas son o no idénticas (tienen el mismo tamaño y poseen los mismos elementos), respectivamente
        Cola aux1 = new Cola();
        Cola aux2 = new Cola();
        boolean iguales = true;

        while (!estaVacia() && !otra.estaVacia()) {
            int a = pop();
            int b = otra.pop();
            if (a != b) iguales = false;
            aux1.push(a);
            aux2.push(b);
        }

        if (!estaVacia() || !otra.estaVacia()) iguales = false;

        while (!aux1.estaVacia()) push(aux1.pop());
        while (!aux2.estaVacia()) otra.push(aux2.pop());

        return iguales;
        }    
}

