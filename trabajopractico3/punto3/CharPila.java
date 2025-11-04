package punto3;

public class CharPila {
    private char[] pilachar;
    private int cima;
    final int maxpila = 30;

    public CharPila() {
        pilachar = new char[maxpila];
        cima = -1;
    }

    public boolean estaVacia() {
        return (cima == -1);
    }

    public boolean estaLlena() {
        return (cima == maxpila - 1);
    }

    public void meter(char ingreso) {
        cima++;
        pilachar[cima] = ingreso;
    }

    public char sacar() {
        char salida = pilachar[cima]; 
        cima--;
        return salida;
    }
}
