package trabajopractico2b.punto1;
                                //return tambien resuelve condicionales ej: return edad > 18
public class Domicilio {
    private String calle;
    private int numero;

    public Domicilio(String calle, int numero) {
        if(calle != null && !calle.trim().isEmpty()) {
            this.calle = calle;
        }

        if (numero > 0) {
            this.numero = numero;
        } 
    }

    public boolean esCompleto() {
        if(!calle.isEmpty() && numero > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public String ToString() {
        return calle + " " + numero;
    }
}
