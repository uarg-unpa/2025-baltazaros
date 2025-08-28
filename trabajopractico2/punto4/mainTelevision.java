package trabajopractico2.punto4;

import java.util.Scanner;
public class mainTelevision {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Encender?");
        boolean encendido;
        int estado = Scanner.nextInt(){
                switch(estado) {
                    case '1':
                        encendido = true;
                }
                default:
                    encendido = 0;
                }
        }
        Television tv1 = new Television(81, 50, "gris", encendido);
        
        scanner.close();
    }
}