package Controlador;

import Modelo.Agenda;
import Modelo.ContactoFamiliar;
import Modelo.ContactoPersonal;
import Modelo.ContactoProfesional;
import Vista.ContactosGUI;
import java.awt.*;
import javax.swing.JOptionPane;

public class ControladorContactos {
    private Agenda agenda;
    private ContactosGUI contactosGUI;

    public ControladorContactos(Agenda agenda, ContactosGUI contactosGUI) {
        this.agenda = agenda;
        this.contactosGUI = contactosGUI;
        initController();
    }

    private void initController() {
        contactosGUI.getContactTypeComboBox().addActionListener(e -> cambiarPanelContacto());
        contactosGUI.getAgregarButtonFamiliar().addActionListener(e -> agregarContactoFamiliar());
        contactosGUI.getAgregarButtonPersonal().addActionListener(e -> agregarContactoPersonal());
        contactosGUI.getAgregarButtonProfesional().addActionListener(e -> agregarContactoProfesional());
    }

    public void mostrarVista(){
        this.contactosGUI.setVisible(true);
    }

    private void cambiarPanelContacto() {
        String selectedType = (String) contactosGUI.getContactTypeComboBox().getSelectedItem();
        CardLayout cl = (CardLayout) contactosGUI.getCards().getLayout();
        cl.show(contactosGUI.getCards(), selectedType);
        contactosGUI.pack();
    }

    private void agregarContactoFamiliar() {
        String nombre = contactosGUI.getNombreTextFieldFamiliar().getText();
        String telefono = contactosGUI.getTelefonoTextFieldFamiliar().getText();
        String parentesco = contactosGUI.getParentescoTextField().getText();

        if (!nombre.isEmpty() && !telefono.isEmpty() && !parentesco.isEmpty()) {
            ContactoFamiliar contactoFamiliar = new ContactoFamiliar(nombre, telefono, parentesco);
            agenda.agregarContacto(contactoFamiliar);
            JOptionPane.showMessageDialog(null, "Contacto familiar agregado exitosamente.");
            contactosGUI.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        }
    }

    private void agregarContactoPersonal() {
        String nombre = contactosGUI.getNombreTextFieldPersonal().getText();
        String telefono = contactosGUI.getTelefonoTextFieldPersonal().getText();
        String direccion = contactosGUI.getDireccionTextField().getText();
        String email = contactosGUI.getEmailTextField().getText();

        if (!nombre.isEmpty() && !telefono.isEmpty() && !direccion.isEmpty() && !email.isEmpty()) {
            ContactoPersonal contactoPersonal = new ContactoPersonal(nombre, telefono, direccion, email);
            agenda.agregarContacto(contactoPersonal);
            JOptionPane.showMessageDialog(null, "Contacto personal agregado exitosamente.");
            contactosGUI.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        }
    }

    private void agregarContactoProfesional() {
        String nombre = contactosGUI.getNombreTextFieldProfesional().getText();
        String telefono = contactosGUI.getTelefonoTextFieldProfesional().getText();
        String nombreEmpresa = contactosGUI.getEmpresaTextField().getText();
        String puesto = contactosGUI.getPuestoTextField().getText();

        if (!nombre.isEmpty() && !telefono.isEmpty() && !nombreEmpresa.isEmpty() && !puesto.isEmpty()) {
            ContactoProfesional contactoProfesional = new ContactoProfesional(nombre, telefono, nombreEmpresa, puesto);
            agenda.agregarContacto(contactoProfesional);
            JOptionPane.showMessageDialog(null, "Contacto profesional agregado exitosamente.");
            contactosGUI.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        }
    }
}