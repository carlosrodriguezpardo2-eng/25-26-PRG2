import java.util.Scanner;

public class Edlin {
    private String[] lineas = new String[10];
    private int lineaActiva = 1;

    public Edlin() {
        for (int i = 0; i < 10; i++) {
            lineas[i] = "";
        }
    }

    public void mostrar() {
        for (int i = 0; i < 10; i++) {
            String marca = (i + 1 == lineaActiva) ? ">" : " ";
            System.out.println(marca + (i + 1) + ": " + lineas[i]);
        }
    }

    public void setLineaActiva(int n) {
        if (n >= 1 && n <= 10) {
            lineaActiva = n;
        }
    }

    public void editarLineaActiva(String texto) {
        lineas[lineaActiva - 1] = texto;
    }

    public void eliminarLinea(int n) {
        if (n >= 1 && n <= 10) {
            lineas[n - 1] = "";
        }
    }

    public static void main(String[] args) {
        Edlin e = new Edlin();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String cmd = sc.nextLine().trim();
            if (cmd.equals("q")) break;
            if (cmd.equals("p")) e.mostrar();
            else if (cmd.startsWith("g ")) e.setLineaActiva(Integer.parseInt(cmd.substring(2)));
            else if (cmd.startsWith("e ")) e.editarLineaActiva(cmd.substring(2));
            else if (cmd.startsWith("d ")) e.eliminarLinea(Integer.parseInt(cmd.substring(2)));
        }
    }
}