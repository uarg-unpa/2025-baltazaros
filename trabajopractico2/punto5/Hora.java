package trabajopractico2.punto5;
public class Hora {
    private int hora, minutos, segundos;

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void setHora(int hora) {
        this.hora = hora; 
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;

    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }
    
    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public int getTotalminutos() {
        return (hora * 60) + minutos;
    }

}
