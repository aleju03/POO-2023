package Clases;

import java.util.LinkedList;

public class Agenda{
    private LinkedList<Contacto> contactos;
    private LinkedList<Evento> eventos;

    public Agenda(){
        contactos = new LinkedList<>();
        eventos = new LinkedList<>();
    }

    public LinkedList<Contacto> getContactos() {
        return contactos;
    }

    public LinkedList<Evento> getEventos() {
        return eventos;
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

    public void agregarEvento(Evento e){
        eventos.add(e);
    }

    public void eliminarEvento(Evento e){
        eventos.remove(e);
    }

    public void listarEventos(){
        for (Evento e : eventos){
            System.out.println(e);
        }
    }
}