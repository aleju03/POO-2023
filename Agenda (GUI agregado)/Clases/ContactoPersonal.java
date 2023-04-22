package Clases;

public class ContactoPersonal extends Contacto{
    private String direccion;
    private String email;

    public ContactoPersonal(String nombre, String telefono, String direccion, String email) {
        super(nombre, telefono);
        this.direccion = direccion;
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDireccion: " + direccion + "\nEmail: " + email;
    }
}