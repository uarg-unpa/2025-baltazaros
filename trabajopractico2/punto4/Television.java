package trabajopractico2.punto4;

public class Television {
    private int canal;
    private int volumen;
    private String color;
    private boolean encendido;

    public Television(int cn, int vol, String col, boolean on) {
        canal = cn;
        volumen = vol;
        color = col;
        encendido = on;
    }
    
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    public int getCanal() {
        return canal;
    }
    public int getVolumen() {
        return volumen;
    }
    public String getColor() {
        return color;
    }
    public boolean getEncendido() {
        return encendido;
    }
}
