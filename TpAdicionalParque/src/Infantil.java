public class Infantil extends Atraccion {
    private int edadMax;
    private int capFila;
    private double duracion;
    private double maxEspera;


    public Infantil() {
    }

    public Infantil(int edadMax, int capFila, double duracion, double maxEspera) {
        this.edadMax = edadMax;
        this.capFila = capFila;
        this.duracion = duracion;
        this.maxEspera = maxEspera;
    }
}
