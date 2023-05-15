package Controlador;

import Modelo.Agenda;
import Vista.AgendaGUI;
import Vista.ContactosGUI;
import Vista.DatosAgendaGUI;
import Vista.EventosGUI;

public class ControladorAgenda {
    private Agenda agenda;
    private AgendaGUI agendaGUI;

    public ControladorAgenda(Agenda agenda, AgendaGUI agendaGUI) {
        this.agenda = agenda;
        this.agendaGUI = agendaGUI;
        initController();
    }

    public void initController() {
        agendaGUI.getBotonAgregarContacto().addActionListener(e -> mostrarContactosGUI());
        agendaGUI.getBotonAgregarEvento().addActionListener(e -> mostrarEventosGUI());
        agendaGUI.getBotonMostrarAgenda().addActionListener(e -> mostrarDatosAgendaGUI());
    }

    public void mostrarVista(){
        this.agendaGUI.setVisible(true);
    }

    private void mostrarContactosGUI() {
        ContactosGUI contactosGUI = new ContactosGUI(agenda);
        ControladorContactos controladorContactos = new ControladorContactos(agenda, contactosGUI);
        controladorContactos.mostrarVista();
    }

    private void mostrarEventosGUI() {
        EventosGUI eventosGUI = new EventosGUI(agenda);
        ControladorEventos controladorEventos = new ControladorEventos(agenda, eventosGUI);
        controladorEventos.mostrarVista();
    }

    private void mostrarDatosAgendaGUI() {
        DatosAgendaGUI datosAgendaGUI = new DatosAgendaGUI(agenda);
        ControladorDatos controladorDatosAgenda = new ControladorDatos(agenda, datosAgendaGUI);
        controladorDatosAgenda.mostrarVista();
    }
}