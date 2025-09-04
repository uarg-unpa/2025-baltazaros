package trabajopractico2.punto2;

    public class Cancion {
    String nombre;
    String album;
    String artista;
    int duracion;
    int repActual;
    

    public Cancion(String nombre, String album, String artista, int duracion, int repActual) {
    this.nombre = nombre;
    this.album = album;
    this.artista = artista;
    this.duracion = duracion;
    this.repActual = repActual; 
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getRepActual() {
        return repActual;
    }
    public void setRepActual(int repActual) {
        this.repActual = repActual;
    }

    public void adelantarCancion() {
        repActual = repActual + 10;
        if (repActual > duracion) {
            repActual = 0;
        }
    }
    public void retrasarCancion() {
        repActual = repActual - 10;
        if (repActual < 0) {
            repActual = 0;
        }
    }
}