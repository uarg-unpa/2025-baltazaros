package trabajopractico2.punto2;

import java.util.Scanner;

public class TestCancion {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String album;
        String artista;
        int duracion;
        int repActual = 0; //por defecto siempre va a empezar en 0, opino que es lo más sensato.
        int estado;
        boolean encendido;

        System.out.println("Ingrese datos de la Primer Canción: ");
        System.out.println("Nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Album: ");
        album = scanner.nextLine();
        System.out.println("Artista: ");
        artista = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Duración: ");
        duracion = scanner.nextInt();

        Cancion C1 = new Cancion(nombre, album, artista, duracion, repActual);

        System.out.println("Ingrese datos de la Segunda Canción: ");
        System.out.println("Nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Album: ");
        album = scanner.nextLine();
        System.out.println("Artista: ");
        artista = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Duración: ");
        duracion = scanner.nextInt();

        Cancion C2 = new Cancion(nombre, album, artista, duracion, repActual);
        
        encendido = true;
        do{
            System.out.println(C1.getNombre() + " " + C1.getArtista() + " " + C1.getAlbum() + " " + C1.getDuracion() + " " + C1.getRepActual() );
            System.out.println("¿Qué desea hacer? (1-Adelantar/2-Retroceder/3-Siguiente canción)");
            estado = scanner.nextInt();
            switch (estado) {
                case 1:
                    C1.adelantarCancion();
                    break;
                case 2:
                    C1.retrasarCancion();
                    break;
                case 3:
                    encendido = false;
                    break;
            }

            
        }   while(encendido);

        encendido = true;
        do{
            System.out.println(C2.getNombre() + " " + C2.getArtista() + " " + C2.getAlbum() + " " + C2.getDuracion() + " " + C2.getRepActual() );
            System.out.println("¿Qué desea hacer? (1-Adelantar/2-Retroceder/3-Fin)");
            estado = scanner.nextInt();
            switch (estado) {
                case 1:
                    C2.adelantarCancion();
                    break;
                case 2:
                    C2.retrasarCancion();
                    break;
                case 3:
                    encendido = false;
                    break;
            }

            
        }   while(encendido);
    
        scanner.close();
    }
}
