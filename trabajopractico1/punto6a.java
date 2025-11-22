package trabajopractico1;

import java.util.Scanner;

public class punto6a {
        public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int NUM1, NUM2, NUM3, SUMA, PRODUCTO;

        System.out.println("Ingrese tres números enteros");
        NUM1 = scanner.nextInt();
        NUM2 = scanner.nextInt();
        NUM3 = scanner.nextInt();

        SUMA = NUM1 + NUM2 + NUM3;
        PRODUCTO = NUM1 * NUM2 * NUM3;
        System.out.println("Suma = " + SUMA + " Producto =" + PRODUCTO);

    scanner.close();
    }

}
