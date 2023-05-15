package Vista;

import Modelo.Agenda;

import javax.swing.*;
import java.awt.*;

public class AgendaGUI {

    private JFrame frame;
    private JPanel mainPanel;
    private JButton botonAgregarContacto;
    private JButton botonAgregarEvento;
    private JButton botonMostrarAgenda;

    public AgendaGUI(Agenda agenda) {
        initComponents();
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }

    public void initComponents() {
        frame = new JFrame("Agenda de Contactos y Eventos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);

        mainPanel = new JPanel(new GridBagLayout()); // Usando GridBagLayout
        frame.getContentPane().add(mainPanel);

        JLabel titulo = new JLabel("Mi Agenda");
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setHorizontalAlignment(JLabel.CENTER);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(20, 0, 20, 0);
        mainPanel.add(titulo, gbc);

        botonAgregarContacto = new JButton("Agregar Contacto");
        botonAgregarContacto.setFont(new Font("Arial", Font.BOLD, 20));
        botonAgregarContacto.setPreferredSize(new Dimension(200, 50)); // Tamaño personalizado
        gbc.insets = new Insets(0, 0, 20, 0); // Espaciado personalizado
        mainPanel.add(botonAgregarContacto, gbc);

        botonAgregarEvento = new JButton("Agregar Evento");
        botonAgregarEvento.setFont(new Font("Arial", Font.BOLD, 20));
        botonAgregarEvento.setPreferredSize(new Dimension(200, 50)); // Tamaño personalizado
        mainPanel.add(botonAgregarEvento, gbc);

        botonMostrarAgenda = new JButton("Mostrar Agenda");
        botonMostrarAgenda.setFont(new Font("Arial", Font.BOLD, 20));
        botonMostrarAgenda.setPreferredSize(new Dimension(200, 50)); // Tamaño personalizado
        mainPanel.add(botonMostrarAgenda, gbc);
    }

    public JButton getBotonAgregarContacto() {
        return botonAgregarContacto;
    }

    public JButton getBotonAgregarEvento() {
        return botonAgregarEvento;
    }

    public JButton getBotonMostrarAgenda() {
        return botonMostrarAgenda;
    }
}