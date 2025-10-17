package entidades;

/**
 * Por último, los accesorios tienen una nombre, una marca, una descripción, un
 * precio, stock y un código de producto.
 */
public class Accesorio {
    private static int totalAccesorios;
    private int codigo;
    private String nombre;
    private String marca;
    private String descripcion;
    private double precio;
    private int stock;

    public Accesorio() {
        this.codigo = totalAccesorios++;
    }

    public Accesorio(String nombre, String marca, String descripcion, double precio, int stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.codigo = totalAccesorios++;
    }

    public static int getTotalAccesorios() {
        return totalAccesorios;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Accesorio [codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", descripcion="
                + descripcion + ", precio=" + precio + ", stock=" + stock + "]";
    }
    

}
