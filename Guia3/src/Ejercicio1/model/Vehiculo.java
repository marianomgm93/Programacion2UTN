package Ejercicio1.model;

import java.util.Comparator;

public abstract class Vehiculo implements ITransporte, Comparable<Vehiculo> {
    private int capacidad;
    private TipoTransporte tipo;
    private int id;
    private static int total;

    public Vehiculo() {
    }

    public Vehiculo(int capacidad, TipoTransporte tipo) {
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.id=total;
        total++;

    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehiculo{");
        sb.append("capacidad=").append(capacidad);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Vehiculo v) {
        return this.id-v.id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }
}
