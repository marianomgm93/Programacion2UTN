package model;

import java.util.Objects;

public class Director {
    private String nombre;
    private String nacionalidad;

    public Director() {
    }

    public Director(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Director{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nacionalidad='").append(nacionalidad).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Director director = (Director) o;
        return Objects.equals(nombre, director.nombre) && Objects.equals(nacionalidad, director.nacionalidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nacionalidad);
    }
}
