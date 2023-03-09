import java.util.List;

public class VendedorComision extends Vendedor {
    
    public VendedorComision(String nombre, String cedula, String telefono, String correoElectronico,
            String direccionFisica, String tipoContrato, List<Carro> carrosVendidos) {
        super(nombre, cedula, telefono, correoElectronico, direccionFisica, tipoContrato);
    }
}