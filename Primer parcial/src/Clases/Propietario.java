package Clases;

import java.util.Objects;

public class Propietario {
    private int id;
    private static int totalPropietarios;
    private String nombre;
    private int dni;
    private int telefono;

    public Propietario() {
        this.id=totalPropietarios;
        totalPropietarios++;
    }

    public Propietario(String nombre, int dni, int telefono) {
        this.id=totalPropietarios;
        totalPropietarios++;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public static int getTotalPropietarios() {
        return totalPropietarios;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Propietario that = (Propietario) o;
        return id == that.id && dni == that.dni && telefono == that.telefono && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, dni, telefono);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Propietario{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", dni=").append(dni);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
}
