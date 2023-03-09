import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private List<Carro> carrosComprados;
    private List<Carro> reservas;

    public Cliente(String nombre, String cedula, String telefono, String correoElectronico, String direccionFisica) {
        super(nombre, cedula, telefono, correoElectronico, direccionFisica);
        this.carrosComprados = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public List<Carro> getCarrosComprados() {
        return carrosComprados;
    }

    public List<Carro> getReservas() {
        return reservas;
    }

    public void comprarCarro(Carro carro) {
        carrosComprados.add(carro);
    }

    public void hacerReserva(Carro carro) {
        reservas.add(carro);
    }
}
