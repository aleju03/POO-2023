public class EventoSocial extends Evento {
    private String tipo;

    public EventoSocial(String nombre, String fecha, String lugar, String tipo) {
        super(nombre, fecha, lugar);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: " + tipo;
    }
}
