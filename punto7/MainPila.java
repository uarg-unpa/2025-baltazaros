package punto7;

public class MainPila {
    public static void main(String[] args) {
        Pila original = new Pila(); // Se crea la pila y se la rellena
        original.push(1);
        original.push(2);
        original.push(3);

        Pila aux = new Pila(); // Se crea pila copia y auxiliar
        Pila copia = new Pila();

        while (!original.estaVacia()) { // Se guardan los elementos en la auxiliar, quedado ordenados al reves que la original
            aux.push(original.pop());
        }

        while (!aux.estaVacia()) { // Se guardan los elementos en la copia y en la original para comparar
            int dato = aux.pop();
            original.push(dato);
            copia.push(dato);
        }

        System.out.println("Original:");
        while (!original.estaVacia()) {
            System.out.println(original.pop());
        }

        System.out.println("Copia:");
        while (!copia.estaVacia()) {
            System.out.println(copia.pop());
        }
    }
}
