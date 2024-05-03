package EjercicioEntregable10;

public class Apartamento extends Vivienda {
    private double valorAdministracion;

    public Apartamento(int identificadorInmobiliario, double area, String direccion, int numHabitaciones, int numBanos, double valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numHabitaciones, numBanos);
        this.valorAdministracion = valorAdministracion;
    }

    // Getters y setters omitidos

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de administración: $" + valorAdministracion);
    }
}
