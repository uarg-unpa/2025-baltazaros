package trabajopractico2b.punto3;

public class TestTeatro {
    public static void main(String[] args) {
    Obra obra1 = new Obra("Maria y Julieta", 13, 99.99);
    Obra obra2 = new Obra("Maria y Julieta", 13, 99.99);
    Obra obra3 = new Obra("Maria y Julieta", 13, 99.99);
    Teatro teatro1 = new Teatro("Roca", "Avellaneda", 788, obra1, obra2, obra3);
    System.out.println(teatro1.ToString());
    }
}
