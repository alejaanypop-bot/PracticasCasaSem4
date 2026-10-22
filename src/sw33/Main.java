package sw33;

public class Main {
    public static void main(String[] args) {
        Servidor servidor1 = new Servidor("ServidorWeb", "192.168.1.20");
        Servidor servidor2 = new Servidor("ServidorBD", "192.168.1.21");
        Servidor servidor3 = new Servidor("ServidorCorreo", "192.168.1.22");

        System.out.println("Activos al inicio: " + Servidor.getServidoresActivos());

        servidor1.activar();
        servidor2.activar();
        servidor2.activar();   // prueba: no debe contar dos veces
        System.out.println("Activos tras activar: " + Servidor.getServidoresActivos());

        servidor1.desactivar();
        servidor3.desactivar();   // prueba: ya estaba apagado, no resta
        System.out.println("Activos tras desactivar: " + Servidor.getServidoresActivos());

        servidor1.mostrarInformacion();
        servidor2.mostrarInformacion();
        servidor3.mostrarInformacion();
        System.out.println("Total de servidores: " + Servidor.getTotalServidores());
    }
}
