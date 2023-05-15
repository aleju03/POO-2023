package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Modelo.Agenda;

import java.awt.*;

public class DatosAgendaGUI extends JFrame {
    private JTable contactosTable;
    private JTable eventosTable;
    private DefaultTableModel contactosTableModel;
    private DefaultTableModel eventosTableModel;

    public DatosAgendaGUI(Agenda agenda) {
        setTitle("Datos de Agenda");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Crear pestaña de contactos
        JPanel contactosPanel = new JPanel();
        contactosPanel.setLayout(new BorderLayout());
        contactosTableModel = new DefaultTableModel(new String[]{"Tipo", "Nombre", "Teléfono", "Otros"}, 0);
        contactosTable = new JTable(contactosTableModel);
        JScrollPane contactosScrollPane = new JScrollPane(contactosTable);
        contactosPanel.add(contactosScrollPane, BorderLayout.CENTER);

        // Crear pestaña de eventos
        JPanel eventosPanel = new JPanel();
        eventosPanel.setLayout(new BorderLayout());
        eventosTableModel = new DefaultTableModel(new String[]{"Tipo", "Nombre", "Fecha", "Lugar", "Otros"}, 0);
        eventosTable = new JTable(eventosTableModel);
        JScrollPane eventosScrollPane = new JScrollPane(eventosTable);
        eventosPanel.add(eventosScrollPane, BorderLayout.CENTER);

        // Añadir pestañas al panel
        tabbedPane.addTab("Contactos", contactosPanel);
        tabbedPane.addTab("Eventos", eventosPanel);

        add(tabbedPane);
    }

    public DefaultTableModel getContactosTableModel() {
        return contactosTableModel;
    }

    public DefaultTableModel getEventosTableModel() {
        return eventosTableModel;
    }
}