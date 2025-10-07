package extras.Persona;

import java.net.URL;

public class Historial {
    private URL[] paginas;
    private int cima;
    private final int MAX = 5;

    public Historial() {
        paginas = new URL[MAX];
        cima = -1;
    }

    public boolean estaVacia() { 
        if (cima == -1)
            return true;
        else
            return false;
     }

    public boolean estaLlena() { 
    return cima == MAX - 1; 
    }
    
    public void meter(URL pagina) {
        cima++;
        paginas[cima] = pagina;
    }

    
}