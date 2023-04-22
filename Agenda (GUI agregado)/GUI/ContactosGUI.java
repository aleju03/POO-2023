package GUI;

import Clases.Agenda;
import Clases.ContactoFamiliar;
import Clases.ContactoPersonal;
import Clases.ContactoProfesional;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactosGUI extends JFrame {

    private Agenda agenda;
    private JPanel cards;
    private final static String FAMILIAR = "Familiar";
    private final static String PERSONAL = "Personal";
    private final static String PROFESIONAL = "Profesional";

    public ContactosGUI(Agenda agenda) {
        this.agenda = agenda;

        setTitle("Agregar Contacto");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(350, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // JComboBox para seleccionar el tipo de contacto
        String[] contactTypes = {FAMILIAR, PERSONAL, PROFESIONAL};
        JComboBox<String> contactTypeComboBox = new JComboBox<>(contactTypes);
        add(contactTypeComboBox, BorderLayout.PAGE_START);

        // Panel de tarjetas con los distintos tipos de contactos
        cards = new JPanel(new CardLayout());

        // Familiar
        JPanel familiarPanel = panelFamiliar();
        cards.add(familiarPanel, FAMILIAR);

        // Personal
        JPanel personalPanel = panelPersonal();
        cards.add(personalPanel, PERSONAL);

        // Profesional
        JPanel profesionalPanel = panelProfesional();
        cards.add(profesionalPanel, PROFESIONAL);

        add(cards, BorderLayout.CENTER);

        // ActionListener para cambiar el panel de entrada según el tipo de contacto seleccionado
        contactTypeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> combo = (JComboBox<String>) e.getSource();
                String selectedType = (String) combo.getSelectedItem();
                CardLayout cl = (CardLayout) cards.getLayout();
                cl.show(cards, selectedType);
                pack();
            }
        });
        pack();
    }

    private JPanel panelFamiliar() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
    
        JLabel nombreLabel = new JLabel("Nombre:");
        JTextField nombreTextField = new JTextField();
        panel.add(nombreLabel);
        panel.add(nombreTextField);
    
        JLabel telefonoLabel = new JLabel("Teléfono:");
        JTextField telefonoTextField = new JTextField();
        panel.add(telefonoLabel);
        panel.add(telefonoTextField);
    
        JLabel parentescoLabel = new JLabel("Parentesco:");
        JTextField parentescoTextField = new JTextField();
        panel.add(parentescoLabel);
        panel.add(parentescoTextField);
    
        JButton agregarButton = new JButton("Agregar");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreTextField.getText();
                String telefono = telefonoTextField.getText();
                String parentesco = parentescoTextField.getText();
    
                if (!nombre.isEmpty() && !telefono.isEmpty() && !parentesco.isEmpty()) {
                    ContactoFamiliar contactoFamiliar = new ContactoFamiliar(nombre, telefono, parentesco);
                    agenda.agregarContacto(contactoFamiliar);
                    JOptionPane.showMessageDialog(null, "Contacto familiar agregado exitosamente.");
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

    private JPanel panelPersonal() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel nombreLabel = new JLabel("Nombre:");
        JTextField nombreTextField = new JTextField();
        panel.add(nombreLabel);
        panel.add(nombreTextField);

        JLabel telefonoLabel = new JLabel("Teléfono:");
        JTextField telefonoTextField = new JTextField();
        panel.add(telefonoLabel);
        panel.add(telefonoTextField);

        JLabel direccionLabel = new JLabel("Dirección:");
        JTextField direccionTextField = new JTextField();
        panel.add(direccionLabel);
        panel.add(direccionTextField);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailTextField = new JTextField();
        panel.add(emailLabel);
        panel.add(emailTextField);

        JButton agregarButton = new JButton("Agregar");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreTextField.getText();
                String telefono = telefonoTextField.getText();
                String direccion = direccionTextField.getText();
                String email = emailTextField.getText();

                if (!nombre.isEmpty() && !telefono.isEmpty() && !direccion.isEmpty() && !email.isEmpty()) {
                    ContactoPersonal contactoPersonal = new ContactoPersonal(nombre, telefono, direccion, email);
                    agenda.agregarContacto(contactoPersonal);
                    JOptionPane.showMessageDialog(null, "Contacto personal agregado exitosamente.");
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

    private JPanel panelProfesional() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
    
        JLabel nombreLabel = new JLabel("Nombre:");
        JTextField nombreTextField = new JTextField();
        panel.add(nombreLabel);
        panel.add(nombreTextField);
    
        JLabel telefonoLabel = new JLabel("Teléfono:");
        JTextField telefonoTextField = new JTextField();
        panel.add(telefonoLabel);
        panel.add(telefonoTextField);
    
        JLabel empresaLabel = new JLabel("Nombre de la empresa:");
        JTextField empresaTextField = new JTextField();
        panel.add(empresaLabel);
        panel.add(empresaTextField);
    
        JLabel puestoLabel = new JLabel("Puesto:");
        JTextField puestoTextField = new JTextField();
        panel.add(puestoLabel);
        panel.add(puestoTextField);
    
        JButton agregarButton = new JButton("Agregar");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreTextField.getText();
                String telefono = telefonoTextField.getText();
                String nombreEmpresa = empresaTextField.getText();
                String puesto = puestoTextField.getText();
    
                if (!nombre.isEmpty() && !telefono.isEmpty() && !nombreEmpresa.isEmpty() && !puesto.isEmpty()) {
                    ContactoProfesional contactoProfesional = new ContactoProfesional(nombre, telefono, nombreEmpresa, puesto);
                    agenda.agregarContacto(contactoProfesional);
                    JOptionPane.showMessageDialog(null, "Contacto profesional agregado exitosamente.");
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
