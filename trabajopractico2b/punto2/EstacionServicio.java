package trabajopractico2b.punto2;

public class EstacionServicio {
    int combustible;
    int maxCombustible;

    public EstacionServicio(int combustible) {    
        this.combustible = combustible;
        this.maxCombustible = 10000;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public String aumentarCombustible(int combustible) {
        if (this.combustible + combustible <= maxCombustible) {
            this.combustible = this.combustible + combustible;
            return "Hecho";
        }
        else    
            return "Error, supera la capacidad máxima";
        }
    public String reducirCombustible(int combustible) {
        if (this.combustible - combustible >= 0) {
            this.combustible = this.combustible - combustible;
            return "Hecho";
        }
        else 
            return "Error, tanque vacío";
    }
    public int getCombustible() {
        return combustible;
    }
} 

