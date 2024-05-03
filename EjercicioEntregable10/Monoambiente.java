package EjercicioEntregable10;

public class Monoambiente extends Apartamento {
    public Monoambiente(int identificadorInmobiliario, double area, String direccion, double valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, 0, 1, valorAdministracion);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: Monoambiente");
    }
}
