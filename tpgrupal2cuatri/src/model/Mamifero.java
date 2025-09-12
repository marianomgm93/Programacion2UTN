package model;

import java.util.Objects;

public class Mamifero extends Animal{
    private TipoPelaje tipoPelaje;

    @Override
    public void comer() {
        System.out.println("niam niam");
    }

    @Override
    public void enfermarse() {
        System.out.println("achiss");
    }

    @Override
    public void ensuciarse() {
        System.out.println("oink oink");
    }

    public Mamifero() {
    }

    public Mamifero(String salud, String nombre, String especie, String higiene, TipoPelaje tipoPelaje) {
        super(salud, nombre, especie, higiene);
        this.tipoPelaje = tipoPelaje;

    }

    public TipoPelaje getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(TipoPelaje tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mamifero mamifero = (Mamifero) o;
        return tipoPelaje == mamifero.tipoPelaje;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipoPelaje);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mamifero{");
        sb.append(super.toString());
        sb.append("tipoPelaje=").append(tipoPelaje);
        sb.append('}');
        return sb.toString();
    }
}
