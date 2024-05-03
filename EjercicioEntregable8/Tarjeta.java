package EjercicioEntregable8;

public class Tarjeta {
    // Atributos
    private String entidadFinanciera;
    private String entidadBancaria;
    private String numeroTarjeta;
    private double saldoDisponible;
    private String dniTitular;
    private String nombreTitular;
    private String apellidoTitular;
    private String telefonoTitular;
    private String mailTitular;

    public Tarjeta(String entidadFinanciera, String entidadBancaria, String numeroTarjeta, double saldoDisponible,
            String dniTitular, String nombreTitular, String apellidoTitular, String telefonoTitular,
            String mailTitular) {
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.dniTitular = dniTitular;
        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.telefonoTitular = telefonoTitular;
        this.mailTitular = mailTitular;
    }

    public String tostring() {
        return "Tarjeta [entidadFinanciera=" + entidadFinanciera + ", entidadBancaria=" + entidadBancaria
                + ", numeroTarjeta=" + numeroTarjeta + ", saldoDisponible=" + saldoDisponible + ", dniTitular="
                + dniTitular + ", nombreTitular=" + nombreTitular + ", apellidoTitular=" + apellidoTitular
                + ", telefonoTitular=" + telefonoTitular + ", mailTitular=" + mailTitular + "]";
    }

    // Getter para el saldoDisponible
    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    // Getter para el nombreTitular 
    public String getNombreTitular() {
        return nombreTitular;
    }
    // Getter para el apellidoTitular 
    public String getApellidoTitular() {
        return apellidoTitular;

    }}
