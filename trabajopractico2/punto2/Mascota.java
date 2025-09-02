package trabajopractico2.punto2;

public class Mascota {
    private String especie;
    private String nombre;
    private String dueño;
    private String domicilio;
    private int numdomicilio;

    public Mascota(String especie, String nombre, String dueño, String domicilio, int numdomicilio) {
        this.especie = especie;
        this.nombre = nombre;
        this.dueño = dueño;
        this.domicilio = domicilio;
        this.numdomicilio = numdomicilio;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getNumdomicilio() {
        return numdomicilio;
    }
    public void setNumdomicilio(int numdomicilio) {
        this.numdomicilio = numdomicilio;
    }
}
