package GUI;

import Clases.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaGUI {

    private Agenda agenda;
    private JFrame frame;
    private JPanel mainPanel;

    public AgendaGUI(Agenda agenda) {
        this.agenda = agenda;
        initComponents();
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }

    public void initComponents() {
        frame = new JFrame("Agenda de Contactos y Eventos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        frame.getContentPane().add(mainPanel);

        JLabel titulo = new JLabel("Mi Agenda");
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setBounds(125, 20, 200, 50);
        mainPanel.add(titulo);


        //BOTONES
        JButton botonAgregarContacto = new JButton("Agregar Contacto");
        botonAgregarContacto.setFont(new Font("Arial", Font.BOLD, 20));
        botonAgregarContacto.setBounds(90, 100, 220, 50);
        mainPanel.add(botonAgregarContacto);

        //ActionListener de botonAgregarContacto
        botonAgregarContacto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ContactosGUI contactosGUI = new ContactosGUI(agenda);
                contactosGUI.setVisible(true);
            }
        });

        JButton botonAgregarEvento = new JButton("Agregar Evento");
        botonAgregarEvento.setFont(new Font("Arial", Font.BOLD, 20));
        botonAgregarEvento.setBounds(100, 170, 200, 50);
        mainPanel.add(botonAgregarEvento);

        //ActionListener de botonAgregarEvento
        botonAgregarEvento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EventosGUI eventosGUI = new EventosGUI(agenda);
                eventosGUI.setVisible(true);
            }
        });

        JButton botonMostrarAgenda = new JButton("Mostrar Agenda");
        botonMostrarAgenda.setFont(new Font("Arial", Font.BOLD, 20));
        botonMostrarAgenda.setBounds(100, 240, 200, 50);
        mainPanel.add(botonMostrarAgenda);

        //ActionListener de botonMostrarAgenda
        botonMostrarAgenda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatosAgendaGUI mostrarAgenda = new DatosAgendaGUI(agenda);
                mostrarAgenda.setVisible(true);
            }
        });
        //FIN BOTONES

        frame.setLocationRelativeTo(null);
    }
}
