package trabajopractico2b.punto5;

public class MainEmpleado {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(1001, 50000, 300, 10, true, 2);

        emp1.mostrarInformacion();

        System.out.println("\nOtro ejemplo:\n");

        Empleado emp2 = new Empleado(1002, 40000, 250, 5, false, 0);
        emp2.mostrarInformacion();
    }
}