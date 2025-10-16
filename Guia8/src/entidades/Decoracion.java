package entidades;

/**
 * Las decoraciones tienen un código, un nombre, un precio, stock y
 *  * proporciones.
 */
public class Decoracion {
    private static int totalDecoraciones;
    private int codigo;
    private String nombre;
    private String propociones;
    private double precio;

    public Decoracion() {
    }

    public Decoracion(String nombre, String propociones, Double precio) {
        this.codigo=totalDecoraciones++;
        this.nombre = nombre;
        this.propociones = propociones;
        this.precio=precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getTotalDecoraciones() {
        return totalDecoraciones;
    }

    public int getId() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPropociones() {
        return propociones;
    }

    public void setPropociones(String propociones) {
        this.propociones = propociones;
    }
}
