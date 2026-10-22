package sw33;

public class Servidor {
    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;
    private static int totalServidores = 0;
    private static int servidoresActivos = 0;

    public Servidor(String nombre, String direccionIP) {
        totalServidores++;
        this.id = totalServidores;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = false;          // comienza apagado
        // servidoresActivos NO se incrementa aquí
    }

    public void activar() {
        if (!activo) {                // solo si estaba apagado
            activo = true;
            servidoresActivos++;
        }
    }

    public void desactivar() {
        if (activo) {                 // solo si estaba activo
            activo = false;
            servidoresActivos--;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Servidor " + id + ": " + nombre
                + " | IP: " + direccionIP + " | Activo: " + activo);
    }

    public static int getTotalServidores() {
        return totalServidores;
    }

    public static int getServidoresActivos() {
        return servidoresActivos;
    }
}