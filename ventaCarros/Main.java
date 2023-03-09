import java.util.ArrayList;
import java.util.Date;

public class Main { //ejemplo testeo solo para practicar
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente1 = new Cliente("Juan", "113948502", "81970011", "juan@gmail.com", "Ciudad Quesada");
        //Crear un proveedor
        Proveedor nippon = new Proveedor("Nippon", "Calle 1", "2222-2222", "proveedor1@example.com");
        Proveedor proveedor2 = new Proveedor("Proveedor 2", "Calle 2", "3333-3333", "proveedor2@example.com");

        // Crear una lista de carros
        ArrayList<Carro> carros = new ArrayList<Carro>();
        carros.add(new Carro("Toyota", "Corolla", "ABC019", 121000, 130000, nippon));
        carros.add(new Carro("Nissan", "Sentra","ABC123" ,147000, 147000, proveedor2));

        // Crear un vendedor asalariado
        VendedorAsalariado vendedorAsalariado = new VendedorAsalariado("Pedro Ramirez", "987654321", "3333-3333", "pedro.ramirez@example.com", "Calle 1, Ciudad", "Tiempo completo", 2000);

        // Crear un vendedor de comisiones
        VendedorComision vendedorComision = new VendedorComision("Maria Gonzalez", "111111111", "4444-4444", "maria.gonzalez@example.com", "Calle 2, Ciudad", "Por comision", carros);

        // Crear una venta
        Venta venta = new Venta(new Date(), 22000, cliente1);

        for (Carro carro : carros) {
            System.out.println(carro.toString());
        }
    }
}
