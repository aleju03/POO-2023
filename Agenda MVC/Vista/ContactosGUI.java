package Vista;

import javax.swing.*;
import java.awt.*;
import Modelo.Agenda;

public class ContactosGUI extends JFrame {
    private JPanel cards;
    private JComboBox<String> contactTypeComboBox;
    private JButton agregarButtonFamiliar;
    private JButton agregarButtonPersonal;
    private JButton agregarButtonProfesional;

    private final static String FAMILIAR = "Familiar";
    private final static String PERSONAL = "Personal";
    private final static String PROFESIONAL = "Profesional";

    // Campos de Familiar
    private JTextField nombreTextFieldFamiliar;
    private JTextField telefonoTextFieldFamiliar;
    private JTextField parentescoTextField;

    // Campos Personal
    private JTextField nombreTextFieldPersonal;
    private JTextField telefonoTextFieldPersonal;
    private JTextField direccionTextField;
    private JTextField emailTextField;

    // Campos para Profesional
    private JTextField nombreTextFieldProfesional;
    private JTextField telefonoTextFieldProfesional;
    private JTextField empresaTextField;
    private JTextField puestoTextField;

    public ContactosGUI(Agenda agenda) {
        setTitle("Agregar Contacto");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(350, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // JComboBox para seleccionar el tipo de contacto
        String[] contactTypes = {FAMILIAR, PERSONAL, PROFESIONAL};
        contactTypeComboBox = new JComboBox<>(contactTypes);
        add(contactTypeComboBox, BorderLayout.PAGE_START);

        // Inicializar botones
        agregarButtonFamiliar = new JButton("Agregar");
        agregarButtonPersonal = new JButton("Agregar");
        agregarButtonProfesional = new JButton("Agregar");

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

        pack();
    }

    private JPanel panelFamiliar() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreTextFieldFamiliar = new JTextField();
        panel.add(nombreLabel);
        panel.add(nombreTextFieldFamiliar);

        JLabel telefonoLabel = new JLabel("Teléfono:");
        telefonoTextFieldFamiliar = new JTextField();
        panel.add(telefonoLabel);
        panel.add(telefonoTextFieldFamiliar);

        JLabel parentescoLabel = new JLabel("Parentesco:");
        parentescoTextField = new JTextField();
        panel.add(parentescoLabel);
        panel.add(parentescoTextField);

        panel.add(new JLabel());
        panel.add(agregarButtonFamiliar);

        return panel;
    }

    private JPanel panelPersonal() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreTextFieldPersonal = new JTextField();
        panel.add(nombreLabel);
        panel.add(nombreTextFieldPersonal);

        JLabel telefonoLabel = new JLabel("Teléfono:");
        telefonoTextFieldPersonal = new JTextField();
        panel.add(telefonoLabel);
        panel.add(telefonoTextFieldPersonal);

        JLabel direccionLabel = new JLabel("Dirección:");
        direccionTextField = new JTextField();
        panel.add(direccionLabel);
        panel.add(direccionTextField);

        JLabel emailLabel = new JLabel("Email:");
        emailTextField = new JTextField();
        panel.add(emailLabel);
        panel.add(emailTextField);

        panel.add(new JLabel());
        panel.add(agregarButtonPersonal);

        return panel;
    }

    private JPanel panelProfesional() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreTextFieldProfesional = new JTextField();
        panel.add(nombreLabel);
        panel.add(nombreTextFieldProfesional);

        JLabel telefonoLabel = new JLabel("Teléfono:");
        telefonoTextFieldProfesional = new JTextField();
        panel.add(telefonoLabel);
        panel.add(telefonoTextFieldProfesional);

        JLabel empresaLabel = new JLabel("Nombre de la empresa:");
        empresaTextField = new JTextField();
        panel.add(empresaLabel);
        panel.add(empresaTextField);

        JLabel puestoLabel = new JLabel("Puesto:");
        puestoTextField = new JTextField();
        panel.add(puestoLabel);
        panel.add(puestoTextField);

        panel.add(new JLabel());
        panel.add(agregarButtonProfesional);

        return panel;
    }

    // Getters
    public JComboBox<String> getContactTypeComboBox() {
        return contactTypeComboBox;
    }

    public JTextField getNombreTextFieldFamiliar() {
        return nombreTextFieldFamiliar;
    }

    public JTextField getTelefonoTextFieldFamiliar() {
        return telefonoTextFieldFamiliar;
    }

    public JTextField getParentescoTextField() {
        return parentescoTextField;
    }

    public JTextField getNombreTextFieldPersonal() {
        return nombreTextFieldPersonal;
    }

    public JTextField getTelefonoTextFieldPersonal() {
        return telefonoTextFieldPersonal;
    }

    public JTextField getDireccionTextField() {
        return direccionTextField;
    }

    public JTextField getEmailTextField() {
        return emailTextField;
    }

    public JTextField getNombreTextFieldProfesional() {
        return nombreTextFieldProfesional;
    }

    public JTextField getTelefonoTextFieldProfesional() {
        return telefonoTextFieldProfesional;
    }

    public JTextField getEmpresaTextField() {
        return empresaTextField;
    }

    public JTextField getPuestoTextField() {
        return puestoTextField;
    }

    public JButton getAgregarButtonFamiliar() {
        return agregarButtonFamiliar;
    }

    public JButton getAgregarButtonPersonal() {
        return agregarButtonPersonal;
    }

    public JButton getAgregarButtonProfesional() {
        return agregarButtonProfesional;
    }

    public JPanel getCards() {
        return cards;
    }
}