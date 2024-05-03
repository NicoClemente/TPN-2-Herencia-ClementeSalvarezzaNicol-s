package EjercicioEntregable10;

public class DepartamentoFamiliar extends Apartamento {
    public DepartamentoFamiliar(int identificadorInmobiliario, double area, String direccion, int numHabitaciones, int numBanos, double valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numHabitaciones, numBanos, valorAdministracion);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: Departamento Familiar");
    }
}
