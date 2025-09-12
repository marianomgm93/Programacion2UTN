package model;

public abstract class Persona {
    private String nombre;
    private int dni;
    private int legajo;
    private double salario;
    private static int totalPersonas;

    public Persona() {
    }

    public Persona(double salario, int dni, String nombre) {
        this.salario = salario;
        this.legajo = totalPersonas++;
        this.dni = dni;
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", dni=").append(dni);
        sb.append(", legajo=").append(legajo);
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }
}
