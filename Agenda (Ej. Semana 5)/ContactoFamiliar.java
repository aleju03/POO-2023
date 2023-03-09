public class ContactoFamiliar extends Contacto{
    private String parentesco;

    public ContactoFamiliar(String nombre, String telefono, String parentesco) {
        super(nombre, telefono);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        return super.toString() + "\nParentesco: " + parentesco;
    }
}