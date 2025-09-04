public class Rusa extends Atraccion{
    private int loopings;
    private double longitud;
    private double velocidadMax;
    private double tiempoMax;

    public Rusa() {

    }

    public Rusa(int loopings, double longitud, double velocidadMax, double tiempoMax) {

        this.loopings = loopings;
        this.longitud = longitud;
        this.velocidadMax = velocidadMax;
        this.tiempoMax = tiempoMax;
    }

    public int getLoopings() {
        return loopings;
    }

    public void setLoopings(int loopings) {
        this.loopings = loopings;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public double getTiempoMax() {
        return tiempoMax;
    }

    public void setTiempoMax(double tiempoMax) {
        this.tiempoMax = tiempoMax;
    }
}
