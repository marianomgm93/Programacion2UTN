package model;

import java.util.Objects;

public class Chofer {
    private String nombre;
    private String apellido;
    private int dni;
    private double salarioPorKm;

    public Chofer() {
    }

    public Chofer(String nombre, String apellido, int dni, double salarioPorKm) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salarioPorKm = salarioPorKm;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSalarioPorKm() {
        return salarioPorKm;
    }

    public void setSalarioPorKm(double salarioPorKm) {
        this.salarioPorKm = salarioPorKm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chofer chofer)) return false;
        return dni == chofer.dni && Double.compare(salarioPorKm, chofer.salarioPorKm) == 0 && Objects.equals(nombre, chofer.nombre) && Objects.equals(apellido, chofer.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, dni, salarioPorKm);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Chofer{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", dni=").append(dni);
        sb.append(", salarioPorKm=").append(salarioPorKm);
        sb.append('}');
        return sb.toString();
    }
}
