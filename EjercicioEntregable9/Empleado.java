package EjercicioEntregable9;

public class Empleado {
    protected String nombre;
    protected String dni;
    protected String domicilio;
    protected int anioIngreso;
    protected double sueldoBasico = 650000;

    public Empleado(String nombre, String dni, String domicilio, int anioIngreso) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.anioIngreso = anioIngreso;
    }
    
    // Getters y Setters

    public void imprimirRecibo() {
        System.out.println("-----------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Fecha de ingreso: " + anioIngreso);
        System.out.println("Sueldo básico: $" + sueldoBasico);
    }
}
