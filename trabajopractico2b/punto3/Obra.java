package trabajopractico2b.punto3;

public class Obra {
    private String nombre;
    private int hora;
    private double precio;

    public Obra(String nombre, int hora, double precio) {
        if(nombre != null && !nombre.trim().isEmpty() ) {
            this.nombre = nombre;
        }

        if(hora >= 0 && hora <= 23) {
            this.hora = hora;
        }

        if(precio <= 1.00) {
            this.precio = precio;
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) { //isEmpty da true si esta vacio
            this.nombre = nombre;
        }
    }

    public void setHora(int hora) {
        if (hora <= 0 && hora <= 23) {
            this.hora = hora;
        }
    }

    public void setPrecio(double precio) {
        if (precio <= 1.00) {
            this.precio = precio;
        }
    }

    public String ToString() {
        return "Obra: " + nombre + " Hora: " + hora + " Precio: " + precio; 
    }

}
