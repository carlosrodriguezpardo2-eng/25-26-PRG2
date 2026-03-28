import java.util.Scanner;

class Equipos {
    String nombre;
    String color;
    int numeroJugadores;
    int puntos;

    public Equipos(String n, String c, int j) {
        nombre = n;
        color = c;
        numeroJugadores = j;
        puntos = 0;
    }

    public void sumarPuntos(int p) {
        puntos += p;
    }
}

class Partidos {
    static Scanner programarLiga = new Scanner(System.in);

    public static void partidosPendientes(int jornada) {
        System.out.println("Jornadas pendientes a partir de la jornada " + jornada + ":");
        for (int i = jornada; i < 6; i++) {
            System.out.println("Jornada " + i + " pendiente.");
        }
    }
}

class Resultados {
    public static void resultadosPrevios(int jornada) {
        if (jornada == 0) {
            System.out.println("No hay resultados previos.");
            return;
        }

        System.out.println("Resultados hasta la jornada " + (jornada - 1) + ":");

        for (int i = 0; i < jornada; i++) {
            System.out.println("Jornada " + i + ": " + resultadoSimulado(i));
        }
    }

    public static String resultadoSimulado(int j) {
        if (j == 0) return "Los Cracks 1 - 0 ByteFC";
        if (j == 1) return "Compiladores 2 - 2 Pachangueros";
        if (j == 2) return "Los Cracks 3 - 1 Compiladores";
        if (j == 3) return "ByteFC 0 - 1 Pachangueros";
        if (j == 4) return "Los Cracks 2 - 2 Pachangueros";
        if (j == 5) return "Compiladores 1 - 0 ByteFC";
        return "Partido no disponible";
    }

    public static void randomizarResultados() {
        System.out.println("Resultados simulados para esta jornada.");
    }

    public static void sumarPuntos(Equipos a, Equipos b, Equipos c, Equipos d, int jornada) {
        if (jornada == 0) {
            // Los Cracks 1 - 0 ByteFC
            a.sumarPuntos(3);
        } else if (jornada == 1) {
            // Compiladores 2 - 2 Pachangueros
            c.sumarPuntos(1);
            d.sumarPuntos(1);
        } else if (jornada == 2) {
            // Los Cracks 3 - 1 Compiladores
            a.sumarPuntos(3);
        } else if (jornada == 3) {
            // ByteFC 0 - 1 Pachangueros
            d.sumarPuntos(3);
        } else if (jornada == 4) {
            // Los Cracks 2 - 2 Pachangueros
            a.sumarPuntos(1);
            d.sumarPuntos(1);
        } else if (jornada == 5) {
            // Compiladores 1 - 0 ByteFC
            c.sumarPuntos(3);
        }
    }
}

class Jornada {
    public static int jornadaActual(int j) {
        return j;
    }

    public static int avanzarJornada(int j) {
        return j + 1;
    }
}

public class examenParcialCarlosRodríguezPRG2 {
    static Equipos e1 = new Equipos("Los Cracks", "Rojo", 11);
    static Equipos e2 = new Equipos("ByteFC", "Azul", 11);
    static Equipos e3 = new Equipos("Compiladores", "Verde", 11);
    static Equipos e4 = new Equipos("Pachangueros", "Amarillo", 11);

    static int jornada = 0;

    public static void main(String[] args) {

        boolean salir = false;

        while (!salir) {
            System.out.println("1. Ver la lista de equipos");
            System.out.println("2. Ver los resultados");
            System.out.println("3. Ver las jornadas pendientes");
            System.out.println("4. Ver la clasificación");
            System.out.println("5. Avanzar jornada");
            System.out.println("0. Salir");
            System.out.println();
            System.out.println("Jornada actual: " + Jornada.jornadaActual(jornada));
            System.out.print("Opción: ");

            String op = Partidos.programarLiga.nextLine();

            if (op.equals("1")) listaEquipos();
            else if (op.equals("2")) verResultados();
            else if (op.equals("3")) jornadasPendientes();
            else if (op.equals("4")) verClasificacion();
            else if (op.equals("5")) avanzarJornada();
            else if (op.equals("0")) salir = true;

            System.out.println();
        }
    }

    public static void listaEquipos() {
        System.out.println(e1.nombre + " - " + e1.puntos + " pts");
        System.out.println(e2.nombre + " - " + e2.puntos + " pts");
        System.out.println(e3.nombre + " - " + e3.puntos + " pts");
        System.out.println(e4.nombre + " - " + e4.puntos + " pts");
    }

    public static void verResultados() {
        Resultados.resultadosPrevios(jornada);
    }

    public static void jornadasPendientes() {
        Partidos.partidosPendientes(jornada);
    }

    public static void verClasificacion() {
        System.out.println("Clasificación:");
        System.out.println(e1.nombre + ": " + e1.puntos);
        System.out.println(e2.nombre + ": " + e2.puntos);
        System.out.println(e3.nombre + ": " + e3.puntos);
        System.out.println(e4.nombre + ": " + e4.puntos);
    }

    public static void avanzarJornada() {
        Resultados.randomizarResultados();
        Resultados.sumarPuntos(e1, e2, e3, e4, jornada);
        jornada = Jornada.avanzarJornada(jornada);
    }
}
