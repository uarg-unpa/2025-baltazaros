package punto6;

public class MainPila {
    public static void main(String[] args) {
        Pila pilaint = new Pila();
        Pila auxpila = new Pila();
        int x;
        pilaint.meter(3);
        pilaint.meter(1);
        pilaint.meter(2);
        pilaint.meter(9);
        pilaint.meter(7);
        pilaint.meter(4);
        pilaint.meter(3);

        // (A)-Asignar a X el segundo elemento desde la parte superior de la pila, dejando la pila sin sus dos elementos de la parte superior
        if (!pilaint.estaVacia()) {
            pilaint.pop();  
            if (!pilaint.estaVacia()) {
                x = pilaint.pop(); 
                }
        System.out.println(x);
        // Elemento de la cima actual: 7 (solo lo hago para recordar) 

        // (B)-Asignar a X el segundo elemento desde la parte superior de la pila, sin modificarla
        if (!pilaint.estaVacia()) {
            auxpila.meter(pilaint.sacar());
            if (!pilaint.estaVacia()) {
                x = pilaint.sacar(); 
            }
        }
        pilaint.meter(auxpila.sacar());
        pilaint.meter(x);
        
        System.out.println(x);

        // (C)-Desde un entero positivo N, asignar a X el N-ésimo elemento desde la parte superior de la pila, dejando la pila sin sus N elementos de la parte superior
        int n = 3;
        for (int i = 0; i < n-1; i++) {
            pilaint.sacar();
        }
        x = pilaint.sacar();
        System.out.println(x);

        // Rellenar la pila
        pilaint.meter(2);
        pilaint.meter(9);
        pilaint.meter(7);
        pilaint.meter(4);
        pilaint.meter(3);
    
        // (D)-Dado un entero positivo N, asignar a X el N-ésimo elemento desde la parte superior de pila, sin modificarla
      
        }
    
    }
