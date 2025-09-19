package model;

import java.util.Objects;

public abstract class Vehiculo {
    private int id;
    private static int vehiculosTotales;
    private int modelo;
    private Marca marca;
    private String patente;
    private int velocidadRecomendada;
    private int kilometraje;

    public Vehiculo() {
        this.id = vehiculosTotales;
        vehiculosTotales++;
    }

    public Vehiculo(int modelo, Marca marca, String patente, int velocidadRecomendada, int kilometraje) {
        this.modelo = modelo;
        this.marca = marca;
        this.patente = patente;
        this.velocidadRecomendada = velocidadRecomendada;
        this.kilometraje = kilometraje;
        this.id=vehiculosTotales;
        vehiculosTotales++;
    }

    public int getId() {
        return id;
    }

    public static int getVehiculosTotales() {
        return vehiculosTotales;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getVelocidadRecomendada() {
        return velocidadRecomendada;
    }

    public void setVelocidadRecomendada(int velocidadRecomendada) {
        this.velocidadRecomendada = velocidadRecomendada;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo vehiculo)) return false;
        return id == vehiculo.id && modelo == vehiculo.modelo && velocidadRecomendada == vehiculo.velocidadRecomendada && kilometraje == vehiculo.kilometraje && marca == vehiculo.marca && Objects.equals(patente, vehiculo.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modelo, marca, patente, velocidadRecomendada, kilometraje);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehiculo{");
        sb.append("id=").append(id);
        sb.append(", modelo=").append(modelo);
        sb.append(", marca=").append(marca);
        sb.append(", patente='").append(patente).append('\'');
        sb.append(", velocidadRecomendada=").append(velocidadRecomendada);
        sb.append(", kilometraje=").append(kilometraje);
        sb.append('}');
        return sb.toString();
    }
}
