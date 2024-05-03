package EjercicioEntregable10;

public class Vivienda extends Inmueble {
    protected int numHabitaciones;
    protected int numBanos;

    public Vivienda(int identificadorInmobiliario, double area, String direccion, int numHabitaciones, int numBanos) {
        super(identificadorInmobiliario, area, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }

    // Getters y setters omitidos

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de habitaciones: " + numHabitaciones);
        System.out.println("Número de baños: " + numBanos);
    }
}
