package EjercicioEntregable8;

public class Posnet {
    public String efectuarPago(Tarjeta tarjeta, double monto, int cuotas) {
        double montoTotal = monto;
        if (cuotas > 1) {
            montoTotal += monto * 0.03 * (cuotas - 1);
            
        }
        if (tarjeta.getSaldoDisponible() >= montoTotal) {
            StringBuilder ticket = new StringBuilder();
        ticket.append("Nombre y apellido del cliente: ").append(tarjeta.getNombreTitular()).append(" ").append(tarjeta.getApellidoTitular()).append("\n");
        ticket.append("Monto total a pagar: $").append(montoTotal).append("\n");
        ticket.append("Monto de cada cuota: $").append(montoTotal / cuotas).append("\n");
        return ticket.toString();
    } else {
        return null;
    }
    }
}
