import java.util.Random;

public class Carrera {

    private final int META = 40;
    private Caballo caballo1;
    private Caballo caballo2;
    private Random random;

    public Carrera() {
        caballo1 = new Caballo();
        caballo2 = new Caballo();
        random = new Random();
    }

    public void jugar() {
        int turno = random.nextInt(2) + 1;

        while (!caballo1.haLlegado(META) && !caballo2.haLlegado(META)) {
            mostrarPista();

            int avance = random.nextInt(3);

            if (turno == 1) {
                caballo1.avanzar(avance);
                turno = 2;
            } else {
                caballo2.avanzar(avance);
                turno = 1;
            }
        }

        mostrarPista();
        mostrarResultado();
    }

    private void mostrarPista() {
        System.out.println("----------------------------------------------");
        caballo1.mostrar();
        caballo2.mostrar();
        System.out.println("----------------------------------------------");
        System.out.println();
    }

    private void mostrarResultado() {
        if (caballo1.haLlegado(META) && caballo2.haLlegado(META)) {
            System.out.println("Empate");
        } else if (caballo1.haLlegado(META)) {
            System.out.println("Ganó el caballo 1");
        } else {
            System.out.println("Ganó el caballo 2");
        }
    }
}