import java.util.LinkedList;

public class Agenda{
    private LinkedList<Contacto> contactos;

    public Agenda(){
        contactos = new LinkedList<>();
    }

    public void agregarContacto(Contacto c){
        contactos.add(c);
    }
    
    public void eliminarContacto(Contacto c){
        contactos.remove(c);
    }

    public void listarContactos(){
        for (Contacto c : contactos){
            System.out.println(c);
        }
    }

}
