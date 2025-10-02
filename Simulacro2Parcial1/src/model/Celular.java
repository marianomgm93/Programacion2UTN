package model;

import java.util.Objects;

public abstract class Celular implements IPromocionable{
    private String modelo;
    private double precio;
    private int id;
    private static int totalCelulares;

    public Celular() {
        this.id = totalCelulares;
        totalCelulares++;
    }

    public Celular(String modelo, double precio) {
        this.id = totalCelulares;
        totalCelulares++;
        this.modelo = modelo;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public static int getTotalCelulares() {
        return totalCelulares;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Celular{");
        sb.append("modelo='").append(modelo).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Celular celular = (Celular) o;
        return Double.compare(precio, celular.precio) == 0 && id == celular.id && Objects.equals(modelo, celular.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, precio, id);
    }
    public abstract String generarTicketGarantia();
}
