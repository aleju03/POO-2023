public class Evento {
    private String nombre;
    private String fecha;
    private String lugar;

    public Evento(String nombre, String fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "-----------------------\nNombre: " + nombre + "\nFecha: " + fecha + "\nLugar: " + lugar;
    }

}
