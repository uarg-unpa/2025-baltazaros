package punto3;

public class MainCharPila {
    public static void main(String[] args) {
        CharPila pila1 = new CharPila();
        pila1.meter('h');
        pila1.meter('o');
        pila1.meter('l');
        pila1.meter('A');
        
        for (int j = 0; j<5; j++) {
            System.out.println(pila1.sacar());
        }
    }
}
