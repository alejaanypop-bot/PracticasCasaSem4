package nd32;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana Pérez", "ana@correo.com");
        Cliente cliente2 = new Cliente("Luis Mora", "luis@correo.com");
        Cliente cliente3 = new Cliente("Sofía Vera", "sofia@correo.com");

        cliente2.desactivar();

        cliente1.mostrarInformacion();
        cliente2.mostrarInformacion();
        cliente3.mostrarInformacion();

        cliente2.activar();
        System.out.println("Cliente 2 reactivado: " + cliente2.isActivo());
        System.out.println("Total de clientes: " + Cliente.getTotalClientes());
    }
}
