package trabajopractico2b.punto3;

public class Teatro {
    private String nombre;
    private String direccion;
    private int nDireccion;
    private Obra obra1;
    private Obra obra2;
    private Obra obra3;

   public Teatro(String nombre, String direccion, int nDireccion, Obra obra1, Obra obra2, Obra obra3) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Sin nombre";
        }

        if (direccion != null && !direccion.trim().isEmpty()) {
            this.direccion = direccion;
        } 
        else {
            this.direccion = "Sin dirección";
        }
        this.nDireccion = nDireccion;

        this.obra1 = obra1;
        this.obra2 = obra2;
        this.obra3 = obra3;
        }
        
        public Teatro(String nombre, String direccion, int nDireccion, Obra obra1, Obra obra2) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Sin nombre";
        }

        if (direccion != null && !direccion.trim().isEmpty()) {
            this.direccion = direccion;
        } 
        else {
            this.direccion = "Sin dirección";
        }
        this.nDireccion = nDireccion;

        this.obra1 = obra1;
        this.obra2 = obra2;
        }

        public Teatro(String nombre, String direccion, int nDireccion, Obra obra1) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Sin nombre";
        }

        if (direccion != null && !direccion.trim().isEmpty()) {
            this.direccion = direccion;
        } 
        else {
            this.direccion = "Sin dirección";
        }
        this.nDireccion = nDireccion;

        this.obra1 = obra1;
        }
    
    public String ToString() {
        return "Teatro: " + nombre + " Direccion: " + direccion + " " + nDireccion + " Obras: " + obra1.ToString() + obra2.ToString() + obra3.ToString();
    }

}
