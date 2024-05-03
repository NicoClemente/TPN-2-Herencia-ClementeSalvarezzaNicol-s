package EjercicioEntregable10;

public class Principal {
    public static void main(String[] args) {
        // Crear instancias de inmuebles
        CasaConjuntoCerrado casa = new CasaConjuntoCerrado(12345, 150.0, "Calle Falsa 123", 3, 2, 20000, true);
        Monoambiente mono = new Monoambiente(67890, 40.0, "Av. Alem 456", 10000);
        LocalComercial local = new LocalComercial(24680, 80.0, "Calle Principal 789", false, "Centro Comercial XYZ");
        
        // Calcular precios de venta
        double precioCasa = casa.area * 2500000;
        double precioMono = mono.area * 1000000;
        double precioLocal = local.area * 3000000;
        
        // Imprimir datos de los inmuebles
        System.out.println("=== Casa en Conjunto Cerrado ===");
        casa.imprimir();
        System.out.println("Precio de venta: $" + precioCasa);
        System.out.println();
        
        System.out.println("=== Monoambiente ===");
        mono.imprimir();
        System.out.println("Precio de venta: $" + precioMono);
        System.out.println();
        
        System.out.println("=== Local Comercial ===");
        local.imprimir();
        System.out.println("Precio de venta: $" + precioLocal);
            }
        }

