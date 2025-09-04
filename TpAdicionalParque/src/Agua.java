public class Agua extends Atraccion{
    private double profundidad;
    private double pesoMax;
    private int numMaxP;
    private double PesoMaxTotal;

    
    public Agua(double profundidad, double pesoMax, int numMaxP, double pesoMaxTotal) {
        this.profundidad = profundidad;
        this.pesoMax = pesoMax;
        this.numMaxP = numMaxP;
        PesoMaxTotal = pesoMaxTotal;
    }
}
