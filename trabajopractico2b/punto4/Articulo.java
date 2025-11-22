package trabajopractico2b.punto4;

public class Articulo {
    private String nombre;
    private String descripcion;
    private Double precio;
    private int codigo; 
    private int stock;

    public Articulo(String nombre, String descripcion, Double precio, int codigo, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = codigo; 
        this.stock = stock;
    }

    public void incrementarStock() {
        stock++;
    }

    public void decrementarStock() {
        stock--;
    }

    public void incrementarStockx10() {
        stock = stock + 10;
    }

    public void decrementarStockx10() {
        stock = stock - 10;
    }

    public String ToString() {
        return nombre + descripcion + "Precio: " + precio + " Codigo: " + codigo + " Stock: " + stock;
    }

}
