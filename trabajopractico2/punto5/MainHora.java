package trabajopractico2.punto5;
import java.util.Scanner;

public class MainHora {
    public static void main(String []args) {    
        Scanner scanner = new Scanner(System.in);
        int hora, minutos, segundos;
        String minutosTotales;

        Hora H1 = new Hora(0, 0, 0);
        Hora H2 = new Hora(0, 0, 0);

        System.out.println("Primer hora");

        System.out.println("Ingrese la hora:");
        hora = scanner.nextInt();

        System.out.println("Ingrese los minutos:");
        minutos = scanner.nextInt();

        System.out.println("Ingrese los segundos:");
        segundos = scanner.nextInt();

        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) { 
            System.out.println("Horario inválido");
            hora = 0;
            minutos = 0;
            segundos = 0;
        }
        H1 = new Hora(hora, minutos, segundos);


        System.out.println("Segunda hora");
        System.out.println("Ingrese la hora:");
        hora = scanner.nextInt();
        
        System.out.println("Ingrese los minutos:");
        minutos = scanner.nextInt();

        System.out.println("Ingrese los segundos:");
        segundos = scanner.nextInt();

        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) { 
            System.out.println("Horario inválido");
            hora = 0;
            minutos = 0;
            segundos = 0;
        }
        H2 = new Hora(hora, minutos, segundos);

        System.out.println("¿Quiere los minutos totales? (si/no)");
        scanner.nextLine();
        minutosTotales = scanner.nextLine();
        switch (minutosTotales) {
            case "si":
                System.out.println("Hora N°1: " + H1.getHora() + ":" + H1.getMinutos() + ":" + H1.getSegundos() );
                System.out.println("Hora N°2: " + H2.getHora() + ":" + H2.getMinutos() + ":" + H2.getSegundos() );
                System.out.println("Minutos totales Hora N°1: " + H1.getTotalminutos());
                System.out.println("Minutos totales Hora N°2: " + H2.getTotalminutos());
                break;
            default:
                System.out.println("Hora N°1: " + H1.getHora() + ":" + H1.getMinutos() + ":" + H1.getSegundos() );
                System.out.println("Hora N°2: " + H2.getHora() + ":" + H2.getMinutos() + ":" + H2.getSegundos() );
                break;
        }

        scanner.close();
    }
}