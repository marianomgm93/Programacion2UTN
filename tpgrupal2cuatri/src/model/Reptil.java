package model;

import java.util.Objects;

public class Reptil extends Animal{
    private boolean esVenenoso;
    private boolean tienePatas;

    @Override
    public void comer() {
        System.out.println("grggl grggl");
    }

    @Override
    public void enfermarse() {
        System.out.println("Me enfermo en reptil :c");
    }

    @Override
    public void ensuciarse() {
        System.out.println("sucio y feliz :D");

    }

    public Reptil() {
    }

    public Reptil(String salud, String nombre, String especie, String higiene, boolean esVenenoso, boolean tienePatas) {
        super(salud, nombre, especie, higiene);
        this.esVenenoso = esVenenoso;
        this.tienePatas = tienePatas;
    }

    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public boolean isTienePatas() {
        return tienePatas;
    }

    public void setTienePatas(boolean tienePatas) {
        this.tienePatas = tienePatas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reptil reptil = (Reptil) o;
        return esVenenoso == reptil.esVenenoso && tienePatas == reptil.tienePatas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(esVenenoso, tienePatas);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reptil{");
        sb.append(super.toString());
        sb.append("esVenenoso=").append(esVenenoso);
        sb.append(", tienePatas=").append(tienePatas);
        sb.append('}');
        return sb.toString();
    }
}
