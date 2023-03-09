public class CarroIndustrial extends Carro {
    private float tonelaje;
    private float capacidadCarga;

    public CarroIndustrial(String marca, String modelo, String matricula, float precioCompra, float precioVenta,
                           Proveedor proveedor, float tonelaje, float capacidadCarga) {
        super(marca, modelo, matricula, precioCompra, precioVenta, proveedor);
        this.tonelaje = tonelaje;
        this.capacidadCarga = capacidadCarga;
    }

    public float getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(float tonelaje) {
        this.tonelaje = tonelaje;
    }

    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}
