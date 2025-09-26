package Clases;

import Enums.TipoMovimiento;

import java.time.LocalDateTime;
import java.util.Objects;

public class Movimiento {
    private int id;
    private static int totalMovimientos;
    private int posicionID;
    private LocalDateTime fechaYHora;
    private TipoMovimiento tipoMovimiento;

    public Movimiento() {
        this.id=totalMovimientos;
        totalMovimientos++;
    }

    public Movimiento(int posicionID, LocalDateTime fechaYHora, TipoMovimiento tipoMovimiento) {
        this.id=totalMovimientos;
        totalMovimientos++;
        this.posicionID = posicionID;
        this.fechaYHora = fechaYHora;
        this.tipoMovimiento = tipoMovimiento;
    }

    public int getId() {
        return id;
    }

    public static int getTotalMovimientos() {
        return totalMovimientos;
    }

    public int getPosicionID() {
        return posicionID;
    }

    public void setPosicionID(int posicionID) {
        this.posicionID = posicionID;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movimiento that = (Movimiento) o;
        return id == that.id && posicionID == that.posicionID && Objects.equals(fechaYHora, that.fechaYHora) && tipoMovimiento == that.tipoMovimiento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, posicionID, fechaYHora, tipoMovimiento);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movimiento{");
        sb.append("id=").append(id);
        sb.append(", posicionID=").append(posicionID);
        sb.append(", fechaYHora=").append(fechaYHora);
        sb.append(", tipoMovimiento=").append(tipoMovimiento);
        sb.append('}');
        return sb.toString();
    }
}
