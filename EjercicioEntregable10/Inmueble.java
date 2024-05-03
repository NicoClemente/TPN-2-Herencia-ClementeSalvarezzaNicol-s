package EjercicioEntregable10;

public class Inmueble {
    protected int identificadorInmobiliario;
    protected double area;
    protected String direccion;

    public Inmueble(int identificadorInmobiliario, double area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
}
 // Getters y setters omitidos

 public void imprimir() {
    System.out.println("Identificador inmobiliario: " + identificadorInmobiliario);
    System.out.println("Área: " + area + " m2");
    System.out.println("Dirección: " + direccion);
}
}
