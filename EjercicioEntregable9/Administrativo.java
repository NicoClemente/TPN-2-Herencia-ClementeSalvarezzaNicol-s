package EjercicioEntregable9;

public class Administrativo extends Empleado {
    private boolean jornadaCompleta;

    public Administrativo(String nombre, String dni, String domicilio, int anioIngreso, boolean jornadaCompleta) {
        super(nombre, dni, domicilio, anioIngreso);
        this.jornadaCompleta = jornadaCompleta;
    }

    //Getters y Setters

    @Override
    public void imprimirRecibo() {
        super.imprimirRecibo();
        System.out.println("Categoría: Administrativo");
        System.out.println("Jornada: " + (jornadaCompleta ? "Completa" : "Media jornada"));
    }
    
}
