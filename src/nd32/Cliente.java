package nd32;

public class Cliente {
    private int id;
    private String nombre;
    private String correo;
    private boolean activo;
    private static int contadorClientes = 0;

    public Cliente(String nombre, String correo) {
        contadorClientes++;
        this.id = contadorClientes;
        this.nombre = nombre;
        this.correo = correo;
        this.activo = true;
    }

    public void activar() {
        activo = true;
    }

    public void desactivar() {
        activo = false;
    }

    public static int getTotalClientes() {
        return contadorClientes;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id + " | " + nombre
                + " | " + correo + " | Activo: " + activo);
    }
}
