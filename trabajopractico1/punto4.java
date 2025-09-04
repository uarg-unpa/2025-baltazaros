package trabajopractico1;

import java.util.Scanner;

public class punto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NRO1, NRO2, NRO3;

       	System.out.println("Ingresa 3 números enteros:");
       	NRO1 = scanner.nextInt();
        NRO2 = scanner.nextInt();
        NRO3 = scanner.nextInt();

        if (NRO1 > NRO2 && NRO1 > NRO3) {
            System.out.println("El mayor es: " + NRO1);
        	} 
            else if (NRO2 > NRO1 && NRO2 > NRO3) {
            		System.out.println("El mayor es: " + NRO2);
        	} 

            else {
            		System.out.println("El mayor es: " + NRO3);
        	}

        	scanner.close();

    }
}
