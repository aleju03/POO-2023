public class VendedorAsalariado extends Vendedor {
    private float salario;

    public VendedorAsalariado(String nombre, String cedula, String telefono, String correoElectronico, String direccionFisica, String tipoContrato, float salario) {
        super(nombre, cedula, telefono, correoElectronico, direccionFisica, tipoContrato);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
