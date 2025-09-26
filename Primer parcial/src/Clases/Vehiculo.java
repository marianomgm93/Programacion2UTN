package Clases;

import java.util.Objects;

public abstract class Vehiculo {
    private int id;
    private static int totalVehiculos;
    private String marca;
    private int modelo;
    private String patente;

    public Vehiculo() {
        this.id = totalVehiculos;
        totalVehiculos++;
    }

    public Vehiculo(String marca, int modelo, String patente) {
        this.id = totalVehiculos;
        totalVehiculos++;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    public int getId() {
        return id;
    }

    public static int getTotalVehiculos() {
        return totalVehiculos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehiculo{");
        sb.append("id=").append(id);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo=").append(modelo);
        sb.append(", patente='").append(patente).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return id == vehiculo.id && modelo == vehiculo.modelo && Objects.equals(marca, vehiculo.marca) && Objects.equals(patente, vehiculo.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, marca, modelo, patente);
    }
}
