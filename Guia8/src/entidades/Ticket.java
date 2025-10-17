package entidades;
/**Estos deben tener, un id, una fecha de emisión, un precio 
*total y detalle de los productos vendidos, exclusivamente su nombre y precio.
*/

import java.time.LocalDateTime;

public class Ticket {
    private static int totalTickets;
    private int id;
    private LocalDateTime fecha;
    private double precio;
    private String detalle;
    
    public Ticket() {
        this.id=totalTickets++;

    }

    public Ticket(LocalDateTime fecha, double precio, String detalle) {
        this.id=totalTickets++;
        this.fecha = fecha;
        this.precio = precio;
        this.detalle = detalle;
    }

    public static int getTotalTickets() {
        return totalTickets;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Ticket [id=" + id + ", fecha=" + fecha + ", precio=" + precio + ", detalle=" + detalle + "]";
    }
}
