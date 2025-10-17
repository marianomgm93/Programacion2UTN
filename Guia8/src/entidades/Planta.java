package entidades;

/**
 *  * Las plantas contienen un nombre, un código, un precio, stock, cuidado y clasificación
 *  * (interior, exterior, híbrido).
 */
public class Planta {
    private static int totalPlantas;
    private String nombre;
    private int codigo;
    private double precio;
    private int stock;
    private String cuidado;
    private Clasificacion clasificacion;

    public Planta() {
        this.codigo = totalPlantas++;
    }

    public Planta(String nombre, double precio, int stock, String cuidado, Clasificacion clasificacion) {
        this.nombre = nombre;
        this.codigo = totalPlantas++;
        this.precio = precio;
        this.stock = stock;
        this.cuidado = cuidado;
        this.clasificacion = clasificacion;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCuidado(String cuidado) {
        this.cuidado = cuidado;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public static int getTotalPlantas() {
        return totalPlantas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getCuidado() {
        return cuidado;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }
}
