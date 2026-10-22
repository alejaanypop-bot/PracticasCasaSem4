package ac32;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Motor principal", 15.5);
        Motor motor2 = new Motor("Motor bomba", 7.5);
        Motor motor3 = new Motor("Motor ventilador", 3.0);

        System.out.println("Encendidos al inicio: " + Motor.getMotoresEncendidos());

        motor1.encender();
        motor3.encender();
        System.out.println("Encendidos tras encender dos: " + Motor.getMotoresEncendidos());

        motor1.apagar();
        System.out.println("Encendidos tras apagar uno: " + Motor.getMotoresEncendidos());

        motor1.mostrarInformacion();
        motor2.mostrarInformacion();
        motor3.mostrarInformacion();
        System.out.println("Total de motores: " + Motor.getTotalMotores());
    }
}
