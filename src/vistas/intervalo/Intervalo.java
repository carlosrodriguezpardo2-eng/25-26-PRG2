package vistas.intervalo;

class Intervalo {

    public Intervalo (double inferior, double superior)
    public Intervalo (double superior)
    public Intervalo ()
    public Intervalo (Intervalo intervalo)

    public Intervalo clone()
    public double longitud()
    public void desplazar(double desplazamiento)
    public Intervalo desplazado(double desplazamiento)

    public boolean incluye(double punto)
    public boolean incluye(Intervalo intervalo)

    public boolean equals(Intervalo intervalo)
    public Intervalo interseccion(Intervalo intervalo)
    public boolean intersecta(Intervalo intervalo)   
    
    public void oponer()
    public void doblar()
    public void mostrar()
    public void recoger()

    public Intervalo[] trocear(int numeroTrozos)
    public Intervalo union(Intervalo intervalo)
    public double puntoMedio();

}
