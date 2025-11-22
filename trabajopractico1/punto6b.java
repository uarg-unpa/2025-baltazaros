package trabajopractico1;

import java.util.Scanner;

public class punto6b {
    public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);

    int PRODUCTO, SUMATORIA, CONTADOR, NUM;
    PRODUCTO = 1;
    SUMATORIA = 0;
    CONTADOR = 1;
    System.out.println("Ingrese tres números entero");

    while (CONTADOR <= 3) {

        NUM = scanner.nextInt();
        PRODUCTO = PRODUCTO * NUM;
        SUMATORIA = SUMATORIA + NUM;
        CONTADOR++; 
        }
    scanner.close();
    System.out.println("El producto entre los tres números ingresados es = " + PRODUCTO);
    System.out.println("La sumatoria entre los tres números ingresados es = " + SUMATORIA);
    }
}