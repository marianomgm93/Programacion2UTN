package models;

import java.util.Objects;

public class Agua extends Atraccion{
    private double profundidad;
    private double pesoMax;
    private int numMaxP;
    private double PesoMaxTotal;

    public Agua() {
    }

    public Agua(double profundidad, double pesoMax, int numMaxP, double pesoMaxTotal) {
        this.profundidad = profundidad;
        this.pesoMax = pesoMax;
        this.numMaxP = numMaxP;
        PesoMaxTotal = pesoMaxTotal;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }

    public int getNumMaxP() {
        return numMaxP;
    }

    public void setNumMaxP(int numMaxP) {
        this.numMaxP = numMaxP;
    }

    public double getPesoMaxTotal() {
        return PesoMaxTotal;
    }

    public void setPesoMaxTotal(double pesoMaxTotal) {
        PesoMaxTotal = pesoMaxTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Agua agua = (Agua) o;
        return Double.compare(profundidad, agua.profundidad) == 0 && Double.compare(pesoMax, agua.pesoMax) == 0 && numMaxP == agua.numMaxP && Double.compare(PesoMaxTotal, agua.PesoMaxTotal) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profundidad, pesoMax, numMaxP, PesoMaxTotal);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agua{");
        sb.append("profundidad=").append(profundidad);
        sb.append(", pesoMax=").append(pesoMax);
        sb.append(", numMaxP=").append(numMaxP);
        sb.append(", PesoMaxTotal=").append(PesoMaxTotal);
        sb.append('}');
        return sb.toString();
    }
}
