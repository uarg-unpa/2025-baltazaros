package trabajopractico2.punto2;

import java.util.Scanner;

public class TestLibro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Ingrese el nombre del libro: ");
        String nombre = scanner.nextLine(); //creo que así es más fácil para leer variables.

        System.out.print("Ingrese el autor: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese el género: ");
        String genero = scanner.nextLine();

        System.out.print("Ingrese la fecha de emisión: ");
        int fechaemision = scanner.nextInt();

        System.out.print("Ingrese el número de páginas: ");
        int nPagina = scanner.nextInt();

        System.out.print("Ingrese la página actual: ");
        int paginaActual = scanner.nextInt();

        Libro L1 = new Libro(nombre, autor, genero, fechaemision, nPagina, paginaActual);

        System.out.println("Nombre: " + L1.getNombre());
        System.out.println("Autor: " + L1.getAutor());
        System.out.println("Género: " + L1.getGenero());
        System.out.println("Fecha de emisión: " + L1.getFechaemision());
        System.out.println("Número de páginas: " + L1.getNPagina());
        System.out.println("Página actual: " + L1.getPaginaActual());

        scanner.close();
    }
}