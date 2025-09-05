package models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Infantil infantil = (Infantil) o;
        return edadMax == infantil.edadMax && capFila == infantil.capFila && Double.compare(duracion, infantil.duracion) == 0 && Double.compare(maxEspera, infantil.maxEspera) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edadMax, capFila, duracion, maxEspera);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Infantil{");
        sb.append("edadMax=").append(edadMax);
        sb.append(", capFila=").append(capFila);
        sb.append(", duracion=").append(duracion);
        sb.append(", maxEspera=").append(maxEspera);
        sb.append('}');
        return sb.toString();
    }

    public int getEdadMax() {
        return edadMax;
    }

    public void setEdadMax(int edadMax) {
        this.edadMax = edadMax;
    }

    public int getCapFila() {
        return capFila;
    }

    public void setCapFila(int capFila) {
        this.capFila = capFila;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getMaxEspera() {
        return maxEspera;
    }

    public void setMaxEspera(double maxEspera) {
        this.maxEspera = maxEspera;
    }
}
