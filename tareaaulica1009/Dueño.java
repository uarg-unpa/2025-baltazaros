package tareaaulica1009;

public class Dueño {
    private String nombre;
    private int edad;
    private int numeroTelefono;

    public Dueño(String nombre, int edad, int numeroTelefono) {
        if(!nombre.trim().isEmpty() && nombre != null) {
            this.nombre = nombre;
        }
        if(edad < 0) {
            this.edad = edad;
        }
        if (numeroTelefono != 0) {
            this.numeroTelefono = numeroTelefono;
        }
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setNumeroTelefono(int numeroTelefono){
        this.numeroTelefono = numeroTelefono;
    }
    public int getNumeroTelefono(){
        return numeroTelefono;
    }
} 
