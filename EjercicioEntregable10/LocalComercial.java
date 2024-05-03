package EjercicioEntregable10;

public class LocalComercial extends InmuebleComercial {
    private boolean esInterno;
    private String centroComercial;

    public LocalComercial(int identificadorInmobiliario, double area, String direccion, boolean esInterno, String centroComercial) {
        super(identificadorInmobiliario, area, direccion);
        this.esInterno = esInterno;
        this.centroComercial = centroComercial;
    }

    // Getters y setters omitidos

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Localización: " + (esInterno ? "Interno" : "Da a la calle"));
        System.out.println("Centro comercial: " + centroComercial);
    }
}
