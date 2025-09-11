package trabajopractico2.punto6;

import java.util.Scanner;

public class MainFecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia, mes, año;

        System.out.println("Ingrese el día:");
        dia = scanner.nextInt();
        System.out.println("Ingrese el mes:");
        mes = scanner.nextInt();
        System.out.println("Ingrese el año:");
        año = scanner.nextInt();    

        Fecha F1;
        if(dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            F1 = new Fecha(1, 1, 2013);
        } else {
            F1 = new Fecha(dia, mes, año);
        }

        System.out.println(dia + " de " + F1.getNombreMes() + " de " + año);
        
        scanner.close();
    }
}
