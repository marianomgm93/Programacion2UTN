package model;

import java.util.Objects;

public class Iphone extends Celular{
    private String accesorios;

    public Iphone() {
    }

    public Iphone(String modelo, double precio, String accesorios) {
        super(modelo, precio);
        this.accesorios = accesorios;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Iphone iphone = (Iphone) o;
        return Objects.equals(accesorios, iphone.accesorios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), accesorios);
    }

    @Override
    public String generarTicketGarantia() {
        return this.toString()+"\nLa garantia corre a cargo de la compañia Apple";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Iphone{");
        sb.append("accesorios='").append(accesorios).append('\'');
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double aplicarDescuento(double descuento) {
        return super.getPrecio()-descuento;
    }

    @Override
    public int obtenerCodigoPromo() {
        return (int) (Math.random()*1000+1);
    }
}
