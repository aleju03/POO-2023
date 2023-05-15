package Controlador;

import javax.swing.table.DefaultTableModel;

import Modelo.Agenda;
import Modelo.Contacto;
import Modelo.ContactoFamiliar;
import Modelo.ContactoPersonal;
import Modelo.ContactoProfesional;
import Modelo.Evento;
import Modelo.EventoProfesional;
import Modelo.EventoSocial;
import Vista.DatosAgendaGUI;

public class ControladorDatos {
    private Agenda agenda;
    private DatosAgendaGUI datosAgendaGUI;

    public ControladorDatos(Agenda agenda, DatosAgendaGUI datosAgendaGUI) {
        this.agenda = agenda;
        this.datosAgendaGUI = datosAgendaGUI;
        llenarDatosContactos();
        llenarDatosEventos();
    }

    public void mostrarVista() {
        this.datosAgendaGUI.setVisible(true);
    }

    private void llenarDatosContactos() {
        DefaultTableModel model = datosAgendaGUI.getContactosTableModel();
        for (Contacto contacto : agenda.getContactos()) {
            String tipo;
            String otros;

            if (contacto instanceof ContactoPersonal) {
                tipo = "Personal";
                otros = ((ContactoPersonal) contacto).getDireccion() + ", " + ((ContactoPersonal) contacto).getEmail();
            } else if (contacto instanceof ContactoProfesional) {
                tipo = "Profesional";
                otros = ((ContactoProfesional) contacto).getNombreEmpresa() + ", " + ((ContactoProfesional) contacto).getPuesto();
            } else {
                tipo = "Familiar";
                otros = ((ContactoFamiliar) contacto).getParentesco();
            }

            model.addRow(new Object[]{tipo, contacto.getNombre(), contacto.getTelefono(), otros});
        }
    }

    private void llenarDatosEventos() {
        DefaultTableModel model = datosAgendaGUI.getEventosTableModel();
        for (Evento evento : agenda.getEventos()) {
            String tipo;
            String otros;

            if (evento instanceof EventoSocial) {
                tipo = "Social";
                otros = ((EventoSocial) evento).getTipo();
                } else {
                tipo = "Profesional";
                otros = ((EventoProfesional) evento).getOrganizacion();
            }
            model.addRow(new Object[]{tipo, evento.getNombre(), evento.getFecha(), evento.getLugar(), otros});
        }
    }
}