package trabajopractico2.punto2;

public class Libro {
    
    private String nombre;
    private String autor;
    private String genero;
    private int fechaemision;
    private int nPagina;
    private int paginaActual;

    public Libro(String nombre, String autor, String genero, int fechaemision, int nPagina, int paginaActual) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.fechaemision = fechaemision;
        this.nPagina = nPagina;
        this.paginaActual = paginaActual;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getFechaemision() {
        return fechaemision;
    }
    public void setFechaemision(int fechaemision) {
        this.fechaemision = fechaemision;
    }

    public int getNPagina() {
        return nPagina;
    }
    public void setNPagina(int nPagina) {
        this.nPagina = nPagina;
    }

    public int getPaginaActual() {
        return paginaActual;
    }
    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }

    public void sgtePag() {
        paginaActual++;
    }

    public void antPag() {
        paginaActual--;
    }
}