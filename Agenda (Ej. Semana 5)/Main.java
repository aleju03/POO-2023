public class Main {
    public static void main(String[] args) {
        //contactos
        ContactoPersonal c1= new ContactoPersonal("Yo", "87875050", "Calle 3", "yoho@gmail.com");
        ContactoProfesional c2 = new ContactoProfesional("Profesional2", "47470101", "Yo&Yo's", "Gerente");
        ContactoFamiliar c3 = new ContactoFamiliar("Familia3", "84700547", "Padre");

        Agenda agenda1 = new Agenda();
        agenda1.agregarContacto(c1);
        agenda1.agregarContacto(c2);
        agenda1.agregarContacto(c3);

        agenda1.listarContactos();

        //Eliminar contacto 3
        System.out.println("\nImpresión otra vez pero eliminando contacto 3...");
        agenda1.eliminarContacto(c3);
        agenda1.listarContactos();
        System.out.println("-----------------------");
    }
}
