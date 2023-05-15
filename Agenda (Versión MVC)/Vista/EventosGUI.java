package Vista;

import javax.swing.*;

import Modelo.Agenda;

import java.awt.*;

public class EventosGUI extends JFrame {
    private JComboBox<String> tipoEventoComboBox;
    private CardLayout cardLayout;
    private JPanel cardsPanel;

    // Componentes para el evento social
    private JTextField nombreTextFieldSocial;
    private JTextField fechaTextFieldSocial;
    private JTextField lugarTextFieldSocial;
    private JTextField tipoTextFieldSocial;
    private JButton agregarButtonSocial;

    // Componentes para el evento profesional
    private JTextField nombreTextFieldProfesional;
    private JTextField fechaTextFieldProfesional;
    private JTextField lugarTextFieldProfesional;
    private JTextField organizacionTextFieldProfesional;
    private JButton agregarButtonProfesional;

    public EventosGUI(Agenda agenda) {
        setTitle("Agregar Evento");
        setSize(250, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        tipoEventoComboBox = new JComboBox<>(new String[]{"Seleccione tipo de evento", "Social", "Profesional"});
        add(tipoEventoComboBox, BorderLayout.NORTH);

        cardLayout = new CardLayout();
        cardsPanel = new JPanel(cardLayout);
        cardsPanel.add(eventoSocialPanel(), "Social");
        cardsPanel.add(eventoProfesionalPanel(), "Profesional");
        add(cardsPanel, BorderLayout.CENTER);
    }

    private JPanel eventoSocialPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreTextFieldSocial = new JTextField();
        panel.add(nombreLabel);
        panel.add(nombreTextFieldSocial);

        JLabel fechaLabel = new JLabel("Fecha:");
        fechaTextFieldSocial = new JTextField();
        panel.add(fechaLabel);
        panel.add(fechaTextFieldSocial);

        JLabel lugarLabel = new JLabel("Lugar:");
        lugarTextFieldSocial = new JTextField();
        panel.add(lugarLabel);
        panel.add(lugarTextFieldSocial);

        JLabel tipoLabel = new JLabel("Tipo:");
        tipoTextFieldSocial = new JTextField();
        panel.add(tipoLabel);
        panel.add(tipoTextFieldSocial);

        agregarButtonSocial = new JButton("Agregar");
        panel.add(new JLabel());
        panel.add(agregarButtonSocial);

        return panel;
    }

    private JPanel eventoProfesionalPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreTextFieldProfesional = new JTextField();
        panel.add(nombreLabel);
        panel.add(nombreTextFieldProfesional);

        JLabel fechaLabel = new JLabel("Fecha:");
        fechaTextFieldProfesional = new JTextField();
        panel.add(fechaLabel);
        panel.add(fechaTextFieldProfesional);

        JLabel lugarLabel = new JLabel("Lugar:");
        lugarTextFieldProfesional = new JTextField();
        panel.add(lugarLabel);
        panel.add(lugarTextFieldProfesional);

        JLabel organizacionLabel = new JLabel("Organización:");
        organizacionTextFieldProfesional = new JTextField();
        panel.add(organizacionLabel);
        panel.add(organizacionTextFieldProfesional);

        agregarButtonProfesional = new JButton("Agregar");
        panel.add(new JLabel());
        panel.add(agregarButtonProfesional);

        return panel;
    }
    
    // Método getters para los componentes de la interfaz
    public JComboBox<String> getTipoEventoComboBox() {
        return tipoEventoComboBox;
    }

    public JPanel getCardsPanel() {
        return cardsPanel;
    }

    public JTextField getNombreTextFieldSocial() {
        return nombreTextFieldSocial;
    }

    public JTextField getFechaTextFieldSocial() {
        return fechaTextFieldSocial;
    }

    public JTextField getLugarTextFieldSocial() {
        return lugarTextFieldSocial;
    }

    public JTextField getTipoTextFieldSocial() {
        return tipoTextFieldSocial;
    }

    public JButton getAgregarButtonSocial() {
        return agregarButtonSocial;
    }

    public JTextField getNombreTextFieldProfesional() {
        return nombreTextFieldProfesional;
    }

    public JTextField getFechaTextFieldProfesional() {
        return fechaTextFieldProfesional;
    }

    public JTextField getLugarTextFieldProfesional() {
        return lugarTextFieldProfesional;
    }

    public JTextField getOrganizacionTextFieldProfesional() {
        return organizacionTextFieldProfesional;
    }

    public JButton getAgregarButtonProfesional() {
        return agregarButtonProfesional;
    }
}