package Ejercicio4;

import java.util.Objects;

public class Alumno {
    private static int totalAlumnos;
    private int id;
    private String nombre;
    private String nacionalidad;

    public Alumno() {
    }

    public Alumno(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return id == alumno.id && Objects.equals(nombre, alumno.nombre) && Objects.equals(nacionalidad, alumno.nacionalidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, nacionalidad);
    }

    public static int getTotalAlumnos() {
        return totalAlumnos;
    }

    public int getId() {
        return id;
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
        final StringBuilder sb = new StringBuilder("Alumno{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", nacionalidad='").append(nacionalidad).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
