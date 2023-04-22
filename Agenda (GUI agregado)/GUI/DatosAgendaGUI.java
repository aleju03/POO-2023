package GUI;

import Clases.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DatosAgendaGUI extends JFrame {
    private Agenda agenda;

    public DatosAgendaGUI(Agenda agenda) {
        this.agenda = agenda;
        setTitle("Datos de Agenda");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Crear pestaña de contactos
        JPanel contactosPanel = new JPanel();
        contactosPanel.setLayout(new BorderLayout());
        DefaultTableModel contactosTableModel = new DefaultTableModel(new String[]{"Tipo", "Nombre", "Teléfono", "Otros"}, 0);
        JTable contactosTable = new JTable(contactosTableModel);
        JScrollPane contactosScrollPane = new JScrollPane(contactosTable);
        contactosPanel.add(contactosScrollPane, BorderLayout.CENTER);

        // Crear pestaña de eventos
        JPanel eventosPanel = new JPanel();
        eventosPanel.setLayout(new BorderLayout());
        DefaultTableModel eventosTableModel = new DefaultTableModel(new String[]{"Tipo", "Nombre", "Fecha", "Lugar", "Otros"}, 0);
        JTable eventosTable = new JTable(eventosTableModel);
        JScrollPane eventosScrollPane = new JScrollPane(eventosTable);
        eventosPanel.add(eventosScrollPane, BorderLayout.CENTER);

        // Rellenar datos de contactos y eventos
        llenarDatosContactos(contactosTableModel);
        llenarDatosEventos(eventosTableModel);

        // Añadir pestañas al panel
        tabbedPane.addTab("Contactos", contactosPanel);
        tabbedPane.addTab("Eventos", eventosPanel);

        add(tabbedPane);
    }

    private void llenarDatosContactos(DefaultTableModel model) {
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

    private void llenarDatosEventos(DefaultTableModel model) {
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
