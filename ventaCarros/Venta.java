import java.util.Date;

public class Venta {
    private Date fechaVenta;
    private float precioVenta;
    private Cliente cliente;

    public Venta(Date fechaVenta, float precioVenta, Cliente cliente) {
        this.fechaVenta = fechaVenta;
        this.precioVenta = precioVenta;
        this.cliente = cliente;
    }

    // getters y setters

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
