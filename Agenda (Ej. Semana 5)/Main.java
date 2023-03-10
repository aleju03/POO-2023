public class Main {
    public static void main(String[] args) {
        //contactos
        ContactoPersonal c1= new ContactoPersonal("Yo", "87875050", "Calle 3", "yoho@gmail.com");
        ContactoProfesional c2 = new ContactoProfesional("Profesional2", "47470101", "Yo&Yo's", "Gerente");
        ContactoFamiliar c3 = new ContactoFamiliar("Familia3", "84700547", "Padre");

        EventoSocial e1 = new EventoSocial("Cumpleaños", "15/03/2021", "Casa de tia", "Cumpleaños");
        EventoProfesional e2 = new EventoProfesional("Reunión", "15/03/2021", "Oficina", "Yo&Yo's");

        Agenda agenda1 = new Agenda();
        agenda1.agregarContacto(c1);
        agenda1.agregarContacto(c2);
        agenda1.agregarContacto(c3);

        agenda1.agregarEvento(e1);
        agenda1.agregarEvento(e2);

        //Imprimir contactos
        System.out.println("\nCONTACTOS:");
        agenda1.listarContactos();

        //Eliminar contacto 3
        System.out.println("\nImpresión otra vez pero eliminando contacto 3...");
        agenda1.eliminarContacto(c3);
        agenda1.listarContactos();

        //Imprimir eventos
        System.out.println("\nEVENTOS:");
        agenda1.listarEventos();
    }
}
