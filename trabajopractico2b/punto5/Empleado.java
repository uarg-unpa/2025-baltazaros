package trabajopractico2b.punto5;

public class Empleado {
    private int legajo;
    private double sueldoBase;
    private double pagoHoraExtra;
    private int horasExtras;
    private boolean casado;
    private int numHijos;

    public Empleado(int legajo, double sueldoBase, double pagoHoraExtra, int horasExtras, boolean casado, int numHijos) {
        this.legajo = legajo;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.horasExtras = horasExtras;
        this.casado = casado;
        this.numHijos = numHijos;
    }

    public double calcularComplementoHorasExtras() {
        return pagoHoraExtra * horasExtras;
    }

    public double calcularSueldoBruto() {
        return sueldoBase + calcularComplementoHorasExtras();
    }

    public double calcularRetenciones() {
        double porcentaje = 0.0;
        if (casado) {
            porcentaje += 0.10; 
        }
        porcentaje += (0.01 * numHijos);
        return sueldoBase * porcentaje; 
    }

    public void mostrarInformacion() {
        System.out.println("Legajo: " + legajo);
        System.out.println("Sueldo Base: $" + sueldoBase);
        System.out.println("Pago por hora extra: $" + pagoHoraExtra);
        System.out.println("Horas extras trabajadas: " + horasExtras);
        System.out.println("Casado: " + (casado ? "Sí" : "No"));
        System.out.println("Número de hijos: " + numHijos);
        System.out.println("Complemento horas extra: $" + calcularComplementoHorasExtras());
        System.out.println("Sueldo bruto: $" + calcularSueldoBruto());
        System.out.println("Retenciones: $" + calcularRetenciones());
        System.out.println("Sueldo neto: $" + (calcularSueldoBruto() - calcularRetenciones()));
    }
}
