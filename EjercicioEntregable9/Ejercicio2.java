package EjercicioEntregable9;

public class Ejercicio2 {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Juan Pérez", "12345678", "Av. Siempreviva 123", 2018, 1000000);
        Cajero cajero = new Cajero("María Gómez", "87654321", "Calle Falsa 456", 2020);
        Administrativo administrativo = new Administrativo("Pedro Rodríguez", "45678912", "Pasaje Peatonal 789", 2019,
                true);
        Repartidor repartidor = new Repartidor("Ana Torres", "23456789", "Av. Principal 234", 2021, 25);

        vendedor.imprimirRecibo();
        System.out.println("\n");
        cajero.imprimirRecibo();
        System.out.println("\n");
        administrativo.imprimirRecibo();
        System.out.println("\n");
        repartidor.imprimirRecibo();
    }

}
