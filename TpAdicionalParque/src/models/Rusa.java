package models;

import java.util.Objects;

public class Rusa extends Atraccion{
    private int loopings;
    private double longitud;
    private double velocidadMax;
    private double tiempoMax;

    public Rusa() {

    }

    public Rusa(String nombre, Intensidad intensidad, Estado estado, int loopings, double longitud, double velocidadMax) {
        super(nombre, intensidad, estado);
        this.loopings = loopings;
        this.longitud = longitud;
        this.velocidadMax = velocidadMax;
        this.tiempoMax = loopings*velocidadMax*longitud;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rusa rusa = (Rusa) o;
        return loopings == rusa.loopings && Double.compare(longitud, rusa.longitud) == 0 && Double.compare(velocidadMax, rusa.velocidadMax) == 0 && Double.compare(tiempoMax, rusa.tiempoMax) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(loopings, longitud, velocidadMax, tiempoMax);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rusa{");
        sb.append("loopings=").append(loopings);
        sb.append(", longitud=").append(longitud);
        sb.append(", velocidadMax=").append(velocidadMax);
        sb.append(", tiempoMax=").append(tiempoMax);
        sb.append('}');
        return sb.toString();
    }
}
