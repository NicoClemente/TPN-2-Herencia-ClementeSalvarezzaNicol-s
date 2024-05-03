package EjercicioEntregable9;

public class Repartidor extends Empleado {
    private int repartosMensuales;

    public Repartidor(String nombre, String dni, String domicilio, int anioIngreso, int repartosMensuales) {
        super(nombre, dni, domicilio, anioIngreso);
        this.repartosMensuales = repartosMensuales;
    }

    //Getters y Setters

    @Override
    public void imprimirRecibo() {
    super.imprimirRecibo();
    double pagoExtra = repartosMensuales * 500;
    double sueldototal = sueldoBasico + pagoExtra;
    System.out.println("Categoría: Repartidor");
    System.out.println("Repartos mensuales: " + repartosMensuales);
    System.out.println("Pago extra por repartos: $" + pagoExtra);
    System.out.println("Total a cobrar: $" + sueldototal);
}
}

