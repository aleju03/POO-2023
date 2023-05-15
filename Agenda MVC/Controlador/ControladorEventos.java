package Controlador;

import java.awt.CardLayout;

import javax.swing.JOptionPane;

import Modelo.Agenda;
import Modelo.EventoProfesional;
import Modelo.EventoSocial;
import Vista.EventosGUI;

public class ControladorEventos {
    private Agenda agenda;
    private EventosGUI eventosGUI;

    public ControladorEventos(Agenda agenda, EventosGUI eventosGUI) {
        this.agenda = agenda;
        this.eventosGUI = eventosGUI;
        initController();
    }

    public void mostrarVista() {
        this.eventosGUI.setVisible(true);
    }

    public void initController() {
        // Asignamos el ActionListener al JComboBox
        eventosGUI.getTipoEventoComboBox().addActionListener(e -> cambiarPanelEvento());

        // Asignamos el ActionListener a los botones de agregar
        eventosGUI.getAgregarButtonSocial().addActionListener(e -> agregarEventoSocial());
        eventosGUI.getAgregarButtonProfesional().addActionListener(e -> agregarEventoProfesional());
    }

    private void cambiarPanelEvento() {
        CardLayout cardLayout = (CardLayout) (eventosGUI.getCardsPanel().getLayout());
        cardLayout.show(eventosGUI.getCardsPanel(), (String) eventosGUI.getTipoEventoComboBox().getSelectedItem());
    }

    private void agregarEventoSocial() {
        String nombre = eventosGUI.getNombreTextFieldSocial().getText();
        String fecha = eventosGUI.getFechaTextFieldSocial().getText();
        String lugar = eventosGUI.getLugarTextFieldSocial().getText();
        String tipo = eventosGUI.getTipoTextFieldSocial().getText();

        if (!nombre.isEmpty() && !fecha.isEmpty() && !lugar.isEmpty() && !tipo.isEmpty()) {
            EventoSocial eventoSocial = new EventoSocial(nombre, fecha, lugar, tipo);
            agenda.agregarEvento(eventoSocial);
            JOptionPane.showMessageDialog(null, "Evento social agregado exitosamente.");
            eventosGUI.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        }
    }

    private void agregarEventoProfesional() {
        String nombre = eventosGUI.getNombreTextFieldProfesional().getText();
        String fecha = eventosGUI.getFechaTextFieldProfesional().getText();
        String lugar = eventosGUI.getLugarTextFieldProfesional().getText();
        String organizacion = eventosGUI.getOrganizacionTextFieldProfesional().getText();

        if (!nombre.isEmpty() && !fecha.isEmpty() && !lugar.isEmpty() && !organizacion.isEmpty()) {
            EventoProfesional eventoProfesional = new EventoProfesional(nombre, fecha, lugar, organizacion);
            agenda.agregarEvento(eventoProfesional);
            JOptionPane.showMessageDialog(null, "Evento profesional agregado exitosamente.");
            eventosGUI.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        }
    }
}
