package trabajopractico1;

import java.util.Scanner;

public class punto5 {
    public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);

    char DIA;

    System.out.println("Ingrese un día (L, M, I, J, V, S, D): ");
    DIA = scanner.next().charAt(0);

    switch(DIA){

        case 'M':
        case 'I':
        case 'J':
            System.out.println("HOY TENGO RESOLUCION");
            break;

        case 'L':
        case 'V':
        case 'S':
        case 'D':
            System.out.println("Hoy no hay resolución");
            break;

        default:
            System.out.println("Día inválido, ingrese una letra correcta.");
        break;
        }

scanner.close();
    }
}

