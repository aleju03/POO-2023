import java.util.ArrayList;
import java.util.List;

public class Proveedor {
    private String nombre;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private List<Carro> carrosSuministrados;

    public Proveedor(String nombre, String direccion, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.carrosSuministrados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void suministrarCarro(Carro carro) {
        carrosSuministrados.add(carro);
    }

    public List<Carro> getCarrosSuministrados() {
        return carrosSuministrados;
    }
}
