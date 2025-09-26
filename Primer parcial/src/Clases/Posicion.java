package Clases;

import Enums.Tamanno;

import java.util.ArrayList;
import java.util.Objects;

public class Posicion {
    private int id;
    private static int totalLugares;
    private Vehiculo vehiculo;
    private boolean enPosicion;
    private ArrayList<Integer> permitidos;
    private Propietario propietario;
    private Tamanno tamanno;

    public Posicion() {
        this.id = totalLugares;
        totalLugares++;
    }

    public Posicion(Vehiculo vehiculo, ArrayList<Integer> permitidos, Propietario propietario, Tamanno tamanno) {
        this.id = totalLugares;
        totalLugares++;
        this.vehiculo = vehiculo;
        this.enPosicion = true;
        this.permitidos = permitidos;
        this.propietario = propietario;
        this.tamanno = tamanno;
    }

    public Tamanno getTamanno() {
        return tamanno;
    }

    public void setTamanno(Tamanno tamanno) {
        this.tamanno = tamanno;
    }

    public int getId() {
        return id;
    }

    public static int getTotalLugares() {
        return totalLugares;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public boolean isEnPosicion() {
        return enPosicion;
    }

    public void setEnPosicion(boolean enPosicion) {
        this.enPosicion = enPosicion;
    }

    public ArrayList<Integer> getPermitidos() {
        return permitidos;
    }

    public void setPermitidos(ArrayList<Integer> permitidos) {
        this.permitidos = permitidos;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return id == posicion.id && enPosicion == posicion.enPosicion && Objects.equals(vehiculo, posicion.vehiculo) && Objects.equals(permitidos, posicion.permitidos) && Objects.equals(propietario, posicion.propietario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vehiculo, enPosicion, permitidos, propietario);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Posicion{");
        sb.append("id=").append(id);
        sb.append(", vehiculo=").append(vehiculo);
        sb.append(", enPosicion=").append(enPosicion);
        sb.append(", permitidos=").append(permitidos);
        sb.append(", propietario=").append(propietario);
        sb.append(", tamaño=").append(tamanno);
        sb.append('}');
        return sb.toString();
    }
}
