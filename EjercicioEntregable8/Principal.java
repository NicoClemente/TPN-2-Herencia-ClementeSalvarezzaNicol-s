package EjercicioEntregable8;

public class Principal {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta("Visa", "Banco Santander", "1234-5678-9012-3456", 15000, "12345678", "Juan", "Perez", "1234567890", "juan.Perez@gmail.com");
        Posnet posnet = new Posnet();

        String ticket = posnet.efectuarPago(tarjeta, 10000, 5);

        if (ticket != null) {
            System.out.println(ticket);
        } else {
            System.out.println("Operación fallida.");
        }
    }
}
