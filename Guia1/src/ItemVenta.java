/**
 * Modela un objeto ItemVenta que representa un ítem de venta en una tienda.
 * Debe permitir realizar varias operaciones relacionadas con la gestión de
 * ítems. La clase ItemVenta deberá tener como atributos: identificador (int),
 * descripcion (String), cantidad (int) y precioUnitario (double). Los métodos a
 * realizar son:
 * ● getters y setters para cada atributo.
 * ● Un método calcularPrecioTotal() que devuelve el precio total (precio
 * unitario * cantidad).
 * ● Un método que devuelva una representación en cadena del ítem de
 * venta en el formato: ItemVenta[id=?, descripcion=?, cantidad=?,
 * pUnitario=?, pTotal=?].
 */

public class ItemVenta {
private int id;
private String descripcion;
private int cantidad;
private double precioUnitario;

    public ItemVenta()
    {
        this.id++;

    }
    public ItemVenta(double precioUnitario, int cantidad, String descripcion) {
        this.id++;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }


    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public double calcular_precio_total()
    {
        double total=0;

        total=this.precioUnitario*this.cantidad;

        return total;
    }

    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                '}';
    }
}
