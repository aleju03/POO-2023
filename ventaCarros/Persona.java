public class Persona {
    private String nombre;
    private String cedula;
    private String telefono;
    private String correoElectronico;
    private String direccionFisica;

    public Persona(String nombre, String cedula, String telefono, String correoElectronico, String direccionFisica) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direccionFisica = direccionFisica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getDireccionFisica() {
        return direccionFisica;
    }

    public void setDireccionFisica(String direccionFisica) {
        this.direccionFisica = direccionFisica;
    }
}
