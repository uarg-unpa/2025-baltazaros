package trabajopractico2.punto2;
import java.util.Scanner;

public class TestTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        int base = scanner.nextInt();

        System.out.print("Ingrese la altura del triángulo: ");
        int altura = scanner.nextInt();

        Triangulo T1 = new Triangulo(base, altura);

        System.out.println("Base: " + T1.getBase());
        System.out.println("Altura: " + T1.getAltura());
        System.out.println("Área: " + T1.areaTotal());

        scanner.close();
    }
}