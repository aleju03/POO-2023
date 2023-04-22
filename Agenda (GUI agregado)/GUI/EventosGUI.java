package GUI;

import Clases.Agenda;
import Clases.EventoProfesional;
import Clases.EventoSocial;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosGUI extends JFrame {

    private Agenda agenda;
    private JComboBox<String> tipoEventoComboBox;
    private CardLayout cardLayout;
    private JPanel cardsPanel;

    public EventosGUI(Agenda agenda) {
        this.agenda = agenda;
        setTitle("Agregar Evento");
        setSize(250, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        tipoEventoComboBox = new JComboBox<>(new String[]{"Seleccione tipo de evento", "Social", "Profesional"});
        tipoEventoComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardsPanel, (String) tipoEventoComboBox.getSelectedItem());
            }
        });
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
        JTextField nombreTextField = new JTextField();
        panel.add(nombreLabel);
        panel.add(nombreTextField);
    
        JLabel fechaLabel = new JLabel("Fecha:");
        JTextField fechaTextField = new JTextField();
        panel.add(fechaLabel);
        panel.add(fechaTextField);
    
        JLabel lugarLabel = new JLabel("Lugar:");
        JTextField lugarTextField = new JTextField();
        panel.add(lugarLabel);
        panel.add(lugarTextField);
    
        JLabel tipoLabel = new JLabel("Tipo:");
        JTextField tipoTextField = new JTextField();
        panel.add(tipoLabel);
        panel.add(tipoTextField);
    
        JButton agregarButton = new JButton("Agregar");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreTextField.getText();
                String fecha = fechaTextField.getText();
                String lugar = lugarTextField.getText();
                String tipo = tipoTextField.getText();
    
                if (!nombre.isEmpty() && !fecha.isEmpty() && !lugar.isEmpty() && !tipo.isEmpty()) {
                    EventoSocial eventoSocial = new EventoSocial(nombre, fecha, lugar, tipo);
                    agenda.agregarEvento(eventoSocial);
                    JOptionPane.showMessageDialog(null, "Evento social agregado exitosamente.");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
                }
            }
        });
    
        panel.add(new JLabel());
        panel.add(agregarButton);
    
        return panel;
    }
    
    private JPanel eventoProfesionalPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
    
        JLabel nombreLabel = new JLabel("Nombre:");
        JTextField nombreTextField = new JTextField();
        panel.add(nombreLabel);
        panel.add(nombreTextField);
    
        JLabel fechaLabel = new JLabel("Fecha:");
        JTextField fechaTextField = new JTextField();
        panel.add(fechaLabel);
        panel.add(fechaTextField);
    
        JLabel lugarLabel = new JLabel("Lugar:");
        JTextField lugarTextField = new JTextField();
        panel.add(lugarLabel);
        panel.add(lugarTextField);
    
        JLabel organizacionLabel = new JLabel("Organización:");
        JTextField organizacionTextField = new JTextField();
        panel.add(organizacionLabel);
        panel.add(organizacionTextField);
    
        JButton agregarButton = new JButton("Agregar");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreTextField.getText();
                String fecha = fechaTextField.getText();
                String lugar = lugarTextField.getText();
                String organizacion = organizacionTextField.getText();
    
                if (!nombre.isEmpty() && !fecha.isEmpty() && !lugar.isEmpty() && !organizacion.isEmpty()) {
                    EventoProfesional eventoProfesional = new EventoProfesional(nombre, fecha, lugar, organizacion);
                    agenda.agregarEvento(eventoProfesional);
                    JOptionPane.showMessageDialog(null, "Evento profesional agregado exitosamente.");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
                }
            }
        });
    
        panel.add(new JLabel());
        panel.add(agregarButton);
    
        return panel;
    }
}
