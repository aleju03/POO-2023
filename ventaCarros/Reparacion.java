import java.util.Date;

public class Reparacion {
    private String tipoReparacion;
    private Date fecha;

    public Reparacion(String tipoReparacion, Date fecha) {
        this.tipoReparacion = tipoReparacion;
        this.fecha = fecha;
    }

    public String getTipoReparacion() {
        return tipoReparacion;
    }

    public void setTipoReparacion(String tipoReparacion) {
        this.tipoReparacion = tipoReparacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}