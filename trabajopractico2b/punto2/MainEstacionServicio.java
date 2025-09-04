package trabajopractico2b.punto2;

import java.util.Scanner;

public class MainEstacionServicio {
    public static void main(String[] args) { //en este ejercicio decidí experimentar más con el main, en caso de que este ejercicio se aleje del enfoque dado por la cátedra, no dude en avisarme
        Scanner S = new Scanner(System.in);

        boolean seguir = true;

        EstacionServicio ES1 = new EstacionServicio(0);

        do { 
            System.out.println("¿Continuar operando? (si/no)");
            String sino = S.nextLine();
            
            if (sino.equalsIgnoreCase("no")) { //investigué como comparar strings, y encontré que se realiza de dicha forma (https://www.geeksforgeeks.org/java/java-string-equalsignorecase-method-with-examples/?utm_source=chatgpt.com)
                seguir = false;
            }

            if (seguir) {
                System.out.println("Agregar:");
                ES1.aumentarCombustible(S.nextInt());
                S.nextLine(); 
                System.out.println("Restar:");
                ES1.reducirCombustible(S.nextInt());
                S.nextLine(); 
            }

        } while (seguir);

        System.out.println("Combustible final: " + ES1.getCombustible());
        S.close();
    }
}