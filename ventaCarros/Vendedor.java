import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vendedor extends Persona {

    private String tipoContrato;
    private List<Carro> carrosVendidos;

    public Vendedor(String nombre, String cedula, String telefono, String correoElectronico, String direccionFisica, String tipoContrato) {
        super(nombre, cedula, telefono, correoElectronico, direccionFisica);
        this.tipoContrato = tipoContrato;
        this.carrosVendidos = new ArrayList<>();
    }

    public void venderCarro(Carro carro, Cliente cliente, float precioVenta, Date fechaVenta) {
        if (carrosVendidos.contains(carro)) {
            System.out.println("Este vendedor ya ha vendido este carro anteriormente");
        } else {
            Venta venta = new Venta(fechaVenta, precioVenta, cliente);
            carro.setVenta(venta);
            carrosVendidos.add(carro);
        }
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public List<Carro> getCarrosVendidos() {
        return carrosVendidos;
    }

    public void setCarrosVendidos(List<Carro> carrosVendidos) {
        this.carrosVendidos = carrosVendidos;
    }
}
