package EjercicioEntregable10;

public class CasaConjuntoCerrado extends Casa {
    private double valorAdministracion;
    private boolean areasComunes;

    public CasaConjuntoCerrado(int identificadorInmobiliario, double area, String direccion, int numHabitaciones, int numBanos, double valorAdministracion, boolean areasComunes) {
        super(identificadorInmobiliario, area, direccion, numHabitaciones, numBanos);
        this.valorAdministracion = valorAdministracion;
        this.areasComunes = areasComunes;
    }

    // Getters y setters omitidos

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de administración: $" + valorAdministracion);
        System.out.println("Áreas comunes: " + (areasComunes ? "Sí" : "No"));
    }
}
