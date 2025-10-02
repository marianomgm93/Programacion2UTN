package model;

import java.util.Objects;

public class Android extends Celular{
    private Marca marca;

    public Android() {
    }

    public Android(String modelo, double precio, Marca marca) {
        super(modelo, precio);
        this.marca = marca;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Android android = (Android) o;
        return marca == android.marca;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), marca);
    }

    @Override
    public String generarTicketGarantia() {
        return toString()+"\nAparte de la garantia de fabrica, la tienda le otorga garantia por 6 meses";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Android{");
        sb.append("marca=").append(marca);
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
