public class RentaCar extends Carro {
    private int capacidadPasajeros;

    public RentaCar(String marca, String modelo, String matricula, float precioCompra, float precioVenta, Proveedor proveedor, int capacidadPasajeros) {
        super(marca, modelo, matricula, precioCompra, precioVenta, proveedor);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
}
