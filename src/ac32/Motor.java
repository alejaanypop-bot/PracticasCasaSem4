package ac32;

public class Motor {
    private int id;
    private String nombre;
    private double potencia;
    private boolean encendido;
    private static int totalMotores = 0;
    private static int motoresEncendidos = 0;

    public Motor(String nombre, double potencia) {
        totalMotores++;
        this.id = totalMotores;
        this.nombre = nombre;
        this.potencia = potencia;
        this.encendido = false;       // todos comienzan apagados
        // motoresEncendidos NO se modifica aquí
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            motoresEncendidos++;
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            motoresEncendidos--;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Motor " + id + ": " + nombre
                + " | Potencia: " + potencia + " kW | Encendido: " + encendido);
    }

    public static int getTotalMotores() {
        return totalMotores;
    }

    public static int getMotoresEncendidos() {
        return motoresEncendidos;
    }
}