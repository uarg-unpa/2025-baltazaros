package tarea0411;

public class TemaMusical {
    private String genero, interprete;
    private int anioLan;

    public TemaMusical(String genero, String interprete, int anioLan) {
        this.genero = genero;
        this.interprete = interprete;
        this.anioLan = anioLan;
    }

    public String getGenero() {
        return genero;
    }

    public String getInterprete() {
        return interprete;
    }

    public int getAnioLan() {
        return anioLan;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public void setAnioLan(int anioLan) {
        this.anioLan = anioLan;
    }

    public String toString() {
        return interprete + " - " + genero + " - " + anioLan;
    }
}
