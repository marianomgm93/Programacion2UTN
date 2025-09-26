package Clases;

import java.util.Objects;

public class Moto extends Vehiculo{
    private boolean tieneArranqueElectrico;

    public Moto() {
    }

    public Moto(String marca, int modelo, String patente, boolean tieneArranqueElectrico) {
        super(marca, modelo, patente);
        this.tieneArranqueElectrico = tieneArranqueElectrico;
    }

    public boolean isTieneArranqueElectrico() {
        return tieneArranqueElectrico;
    }

    public void setTieneArranqueElectrico(boolean tieneArranqueElectrico) {
        this.tieneArranqueElectrico = tieneArranqueElectrico;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Moto{");
        sb.append(super.toString());
        sb.append("tieneArranqueElectrico=").append(tieneArranqueElectrico);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moto moto = (Moto) o;
        return tieneArranqueElectrico == moto.tieneArranqueElectrico;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tieneArranqueElectrico);
    }
}
