package tareaaulica1009;

public class Mascota {
    private String nombre;
    private String especie;
    private Dueño dueño;
    private int edad;

    public Mascota(String nombre, String especie, Dueño dueño, int edad) {
        if(!nombre.trim().isEmpty() && nombre != null) {
            this.nombre = nombre;
        }
        if(!nombre.trim().isEmpty() && nombre != null)  {
            this.especie = especie;
        }
        this.dueño = dueño;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public String getEspecie(){
        return especie;
    }
    public void setDueño(Dueño dueño){
        this.dueño = dueño;
    }
    public Dueño getDueño(){
        return dueño;
    }

    public boolean dueñoMayor(){
        if(dueño.getEdad()>17) { //return dueño.getEdad()>17;
            return true;
        }
        else{
            return false;
        }

    }
    public void cambiarDueño(Dueño dueño){
      this.dueño = dueño;
    }
    public int estimarEdadHumana(){
        int edadCanina = edad;
        switch(edad){
            case 1:
                edadCanina = 15;
                break;
            case 2: 
                edadCanina = 21;
                break;
            default:
               edadCanina = 13 + edadCanina * 4;
                break;
        }
        return edadCanina;
    }

    public String toString() {
            return "Mascota [nombre: " + nombre + ", especie" + especie + ", edad" + edad + ", Dueño" + dueño.getNombre() +   dueño.getEdad() + dueño.getNumeroTelefono();
        }
} 
