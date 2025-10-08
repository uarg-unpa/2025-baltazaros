package trabajopractico2.punto2;

import java.util.Scanner;

public class TestMascota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos de la primera mascota:");
        System.out.print("Especie: ");
        String especie1 = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Dueño: ");
        String dueño1 = scanner.nextLine();
        System.out.print("Domicilio: ");
        String domicilio1 = scanner.nextLine();
        System.out.print("Número de domicilio: ");
        int numdomicilio1 = scanner.nextInt();
        scanner.nextLine(); // para limpiar el buffer

        Mascota m1 = new Mascota(especie1, nombre1, dueño1, domicilio1, numdomicilio1);

        System.out.println("\nIngrese los datos de la segunda mascota:");
        System.out.print("Especie: ");
        String especie2 = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Dueño: ");
        String dueño2 = scanner.nextLine();
        System.out.print("Domicilio: ");
        String domicilio2 = scanner.nextLine();
        System.out.print("Número de domicilio: ");
        int numdomicilio2 = scanner.nextInt();

        Mascota m2 = new Mascota(especie2, nombre2, dueño2, domicilio2, numdomicilio2);

        System.out.println("\nMascota 1: " + m1.getNombre() + " (" + m1.getEspecie() + "), dueño: " + m1.getDueño());
        System.out.println("Mascota 2: " + m2.getNombre() + " (" + m2.getEspecie() + "), dueño: " + m2.getDueño());

        scanner.close();
    }
}