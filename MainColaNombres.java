public class MainColaNombres {
    public static void main(String[] args) {
        ColaNombres cola = new ColaNombres();

        // Encolar 8 nombres
        cola.push("Ana");
        cola.push("Luis");
        cola.push("Maria");
        cola.push("Carlos");
        cola.push("Sofia");
        cola.push("Pedro");
        cola.push("Laura");
        cola.push("Diego");
        
        System.out.println("Después de encolar 8 elementos:");
        for (int i = 0; i < 8; i++) {
            String x = cola.pop();
            System.out.print(x + " ");
            cola.push(x);
        }
        System.out.println();

        // Desencolar 3 elementos
        cola.pop();
        cola.pop();
        cola.pop();
        System.out.println("Después de desencolar 3 elementos:");
        for (int i = 0; i < 5; i++) {
            String x = cola.pop();
            System.out.print(x + " ");
            cola.push(x);
        }
        System.out.println();

        // Probar el método peek
        System.out.println("Probando peek - Frente actual: " + cola.peek());
        
        // Vaciar la estructura
        while (!cola.estaVacia()) {
            cola.pop();
        }

        // Volver a llenar la estructura 
        cola.push("Elena");
        cola.push("Javier");
        cola.push("Marta");
        cola.push("Pablo");
        cola.push("Raquel");
        cola.push("Sergio");
        cola.push("Teresa");
        cola.push("Victor");
        
        System.out.println("Después de volver a encolar 8 elementos:");
        for (int i = 0; i < 8; i++) {
            String x = cola.pop();
            System.out.print(x + " ");
            cola.push(x);
        }
        System.out.println();

        // Verificar estado final
        System.out.println("Estado final - Vacía: " + cola.estaVacia() + ", Llena: " + cola.estaLlena());
    }
}