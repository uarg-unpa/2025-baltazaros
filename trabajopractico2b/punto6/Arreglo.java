public class Arreglo {
    private int[] datos;     
    private int contador;    

    public Arreglo(int tamaño) {
        datos = new int[tamaño];
        contador = 0;
    }

    public boolean ingresarNumero(int numero) {
        if (contador < datos.length) {
            datos[contador] = numero;
            contador++;
            return true;
        } else {
            return  false;
        }
    }

    public void mostrarNumeros() {
        if (contador == 0) {
            System.out.println("El arreglo está vacío.");
        } else {
            System.out.print("Números en el arreglo: ");
            for (int i = 0; i < contador; i++) {
                System.out.print(datos[i] + " ");
            }
            System.out.println();
        }
    }

    public void vaciarArreglo() {
        contador = 0; 
        System.out.println("El arreglo ha sido vaciado.");
    }
}
