package Clases;

public class ContactoProfesional extends Contacto{
    private String nombreEmpresa;
    private String puesto;

    public ContactoProfesional(String nombre, String telefono, String nombreEmpresa, String puesto) {
        super(nombre, telefono);
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNombre de la empresa: " + nombreEmpresa + "\nPuesto: " + puesto;
    }
}