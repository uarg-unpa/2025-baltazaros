package trabajopractico2.punto4;

import java.util.Scanner;

public class MainTelevision {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        boolean encendido = false;
        int contador = 1;
        int volumen = 0, canal = 0;
        String color = "sin color";

        System.out.println("¿Encender? (0 = encendido, 1 = apagado)");

        while (contador == 1) {
            int estado = scanner.nextInt();

            if (estado == 0) {
                encendido = true;
                contador--;
            } 
            else { 
                if (estado == 1) {
                encendido = false;
                contador--;
                } 
                else {
                System.out.println("Error, ingrese 0 o 1");
                }
            }
        }

        if (encendido) {
            System.out.println("Ingrese el volumen");
            volumen = scanner.nextInt();

            System.out.println("Ingrese el canal");
            canal = scanner.nextInt();

            scanner.nextLine(); //me daba error así que por lo que investigué tengo que limpiar el scanner, no sé si habrá alguna forma mejor.

            System.out.println("Ingrese el color");
            color = scanner.nextLine();
        }

        Television tv1 = new Television(volumen, canal, color, encendido);

        System.out.println("Volumen: " + tv1.getVolumen());
        System.out.println("Canal: " + tv1.getCanal());
        System.out.println("Color: " + tv1.getColor());

        scanner.close();
    }
}