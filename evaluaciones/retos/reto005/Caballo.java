public class Caballo {

    private int posicion;

    public Caballo() {
        posicion = 0;
    }

    public void avanzar(int casillas) {
        posicion += casillas;
    }

    public boolean haLlegado(int meta) {
        return posicion >= meta;
    }

    public void mostrar() {
        for (int i = 0; i < posicion; i++) {
            System.out.print(" ");
        }
        System.out.println(";-;'");
    }
}