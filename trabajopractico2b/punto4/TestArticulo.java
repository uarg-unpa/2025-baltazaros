package trabajopractico2b.punto4;

public class TestArticulo {
    public static void main(String[] args) {
        Articulo articulo = new Articulo("Jabon liquido, ", "jabon para el hogar, destinado al lavado de ropa, ", 55.55, 82727, 50);    
        System.out.println("Articulo: " + articulo.ToString());
    }
}
