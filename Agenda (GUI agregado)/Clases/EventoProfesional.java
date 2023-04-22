package Clases;

public class EventoProfesional extends Evento {
    private String organizacion;

    public EventoProfesional(String nombre, String fecha, String lugar, String organizacion) {
        super(nombre, fecha, lugar);
        this.organizacion = organizacion;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOrganizacion: " + organizacion;
    }
}
