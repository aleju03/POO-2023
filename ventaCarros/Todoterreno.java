public class Todoterreno extends Carro {
    private String traccion;

    public Todoterreno(String marca, String modelo, String matricula, float precioCompra, float precioVenta, Proveedor proveedor, String traccion) {
        super(marca, modelo, matricula, precioCompra, precioVenta, proveedor);
        this.traccion = traccion;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
}
