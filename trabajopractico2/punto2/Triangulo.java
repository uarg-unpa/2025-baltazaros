package trabajopractico2.punto2;

public class Triangulo {
    int base, altura;
    
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int areaTotal() {
        return (base * altura) / 2;
    }
}
