package trabajopractico2b.punto6;

public class Arreglo {
    int[] array;
    int contador;
}

public Arreglo(int array) {
    array[0] = array;
    contador = 1;
}

public void sgteEntero(int array) {
    array[contador] = array;
    contador++;
}
