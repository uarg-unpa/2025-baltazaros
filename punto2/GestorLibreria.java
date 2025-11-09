package punto2;

public class GestorLibreria {
    private Libro[] listadoLibros;
    private int indiceLista;
    private final int MAX = 25;

    public GestorLibreria() {
        listadoLibros = new Libro[MAX];
        indiceLista = -1;
    }

    public void agregarLibro(Libro agregado) {
        if(indiceLista < MAX - 1) {
            indiceLista++;
            listadoLibros[indiceLista] = agregado;
        }
        else {
            for (int i = 0; i < MAX; i++) {
                if (listadoLibros[i] == null) {
                    listadoLibros[i] = agregado;
                    return;
                }
            }
        }
    }

    public void borrarLibro(String isbn) {
        for (int i = 0; i < MAX; i++) {
            if (listadoLibros[i] != null && listadoLibros[i].getIsbn().equals(isbn)) {
                listadoLibros[i] = null;
                return;
            }
        }
    }

    public String librosDisponibles() {
        String librosDisp = "";
        
        for (int i = 0; i < MAX; i++) {
            if (listadoLibros[i] != null && !listadoLibros[i].estaPrestado()) { // Verificacion necesaria porque me daba error
                String aux = listadoLibros[i].mostrar();
                librosDisp = librosDisp.concat(aux).concat("\n"); // Agregar salto de línea, por lo que descrubrí, se concatena \n, más que nada por estética
            }
        }
        return librosDisp;
    }

    public void prestarLibro(String isbn) {
        for (int i = 0; i < MAX; i++) {
            if (listadoLibros[i] != null && listadoLibros[i].getIsbn().equals(isbn)) {
                listadoLibros[i].prestar();
                break;
            }
        }
    }

    public void devolverLibro(String isbn) {
        for (int i = 0; i < MAX; i++) {
            if (listadoLibros[i] != null && listadoLibros[i].getIsbn().equals(isbn)) {
                listadoLibros[i].devolver();
                break;
            }
        }
    }

    public boolean hayEspacio() {
        for (int i = 0; i < MAX; i++) {
            if (listadoLibros[i] == null) {
                return true;  
            }
        } 
        return false;  
    }

    public boolean existeLibro(String isbn) {
        for (int i = 0; i < MAX; i++) {
            if (listadoLibros[i] != null && listadoLibros[i].getIsbn().equals(isbn)) {
                return true;
            }
        }
        return false;
    }

    public boolean estaPrestado(String isbn) {
        for (int i = 0; i < MAX; i++) {
            if (listadoLibros[i] != null && listadoLibros[i].getIsbn().equals(isbn)) {
                return listadoLibros[i].estaPrestado();
            }
        }
        return false;
}
}
