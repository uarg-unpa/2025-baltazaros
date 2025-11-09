package punto2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorLibreria gestor = new GestorLibreria();
        int opcion;

        do {
            System.out.println("\n--- GESTOR DE BIBLIOTECA ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Borrar libro");
            System.out.println("5. Listar libros disponibles");
            System.out.println("6. Salir");
            System.out.print("Ingrese opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (gestor.hayEspacio()) {
                        System.out.print("Ingrese titulo del libro: ");
                        String titulo = sc.nextLine();
                        System.out.print("Ingrese autor del libro: ");
                        String autor = sc.nextLine();
                        System.out.print("Ingrese ISBN del libro: ");
                        String isbn = sc.nextLine();
                        
                        Libro nuevoLibro = new Libro(titulo, autor, isbn);
                        gestor.agregarLibro(nuevoLibro);
                        System.out.println("Libro agregado correctamente.");
                    } else {
                        System.out.println("No hay espacio para más libros.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese ISBN del libro a prestar: ");
                    String isbnPrestar = sc.nextLine();
                    if (gestor.existeLibro(isbnPrestar)) {
                        if (!gestor.estaPrestado(isbnPrestar)) {
                            gestor.prestarLibro(isbnPrestar);
                            System.out.println("Libro prestado correctamente.");
                        } else {
                            System.out.println("El libro ya está prestado.");
                        }
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese ISBN del libro a devolver: ");
                    String isbnDevolver = sc.nextLine();
                    if (gestor.existeLibro(isbnDevolver)) {
                        if (gestor.estaPrestado(isbnDevolver)) {
                            gestor.devolverLibro(isbnDevolver);
                            System.out.println("Libro devuelto correctamente.");
                        } else {
                            System.out.println("El libro ya estaba disponible.");
                        }
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese ISBN del libro a borrar: ");
                    String isbnBorrar = sc.nextLine();
                    if (gestor.existeLibro(isbnBorrar)) {
                        gestor.borrarLibro(isbnBorrar);
                        System.out.println("Libro borrado correctamente.");
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 5:
                    String disponibles = gestor.librosDisponibles();
                    if (disponibles.isEmpty()) {
                        System.out.println("No hay libros disponibles en este momento.");
                    } else {
                        System.out.println("--- LIBROS DISPONIBLES ---");
                        System.out.println(disponibles);
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 6);

        sc.close();
    }
}