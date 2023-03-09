import java.util.ArrayList;
import java.util.List;

public class Exposicion {
    private String nombre;
    private String direccion;
    private List<Carro> carros;

    public Exposicion(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.carros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void addCarro(Carro carro) {
        carros.add(carro);
    }

    public void removeCarro(Carro carro) {
        carros.remove(carro);
    }

    public List<Carro> getCarros() {
        return carros;
    }
}
