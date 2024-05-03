package EjercicioEntregable9;

public class Vendedor extends Empleado {
    private double ventasMensuales;

    public Vendedor(String nombre, String dni, String domicilio, int anioIngreso, double ventasMensuales) {
        super(nombre, dni, domicilio, anioIngreso);
        this.ventasMensuales = ventasMensuales;
    }

    @Override
    public void imprimirRecibo() {
        super.imprimirRecibo();
        double comision = ventasMensuales * 0.005;
        double sueldoTotal = sueldoBasico + comision;
        System.out.println("Categoría: vendedor");
        System.out.println("Ventas mensuales: $" + ventasMensuales);
        System.out.println("Comisión por ventas: $" + comision);
        System.out.println("Total a cobrar: $" + sueldoTotal);
    }
}
