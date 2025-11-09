package punto2;

public class Libro {
    String nombre;
    String autor;
    String isbn;
    boolean prestado;

    public Libro(String nombre, String autor, String isbn) {
        this.nombre = nombre;
        this.autor = autor;
        this.isbn = isbn;
        prestado = false;
    }

    public String getNombre() { 
        return nombre; 
    }
    
    public String getAutor() { 
        return autor; 
    }
    
    public String getIsbn() { 
        return isbn; 
    }

    public void prestar() {
        prestado = true;
    }

    public void devolver() {
        prestado = false;
    }

    public boolean estaPrestado() {
        return prestado;
    }

    public String mostrar() {
        String estado;
        if (prestado) {
            estado = "PRESTADO";
        } else {
            estado = "DISPONIBLE";
        }
        return "'" + nombre + "' por " + autor + " (ISBN: " + isbn + ") - " + estado;
    }
}