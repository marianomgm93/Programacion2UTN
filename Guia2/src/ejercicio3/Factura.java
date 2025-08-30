package ejercicio3;

import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private UUID id;
    private double montoTotal;
    private LocalDateTime fecha;
    private Cliente cliente;

    public Factura() {
        this.id = UUID.randomUUID();
        this.fecha = LocalDateTime.now();
    }

    /**
     *
     * @param montoTotal
     * @param cliente
     */
    public Factura(double montoTotal, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
        this.montoTotal = montoTotal * (1 - (double) cliente.getDescuento() / 100);
    }

    public UUID getId() {
        return id;
    }

    public double getMontoTotal() {
        return montoTotal;
    }


    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", montoTotal=" + montoTotal +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                '}';
    }
}
