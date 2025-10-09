public class Libro implements Comparable<Libro> {
    private static Integer contadorId = 0;
    private Integer id;
    private String nombre;
    private double precio;
    private int año;

    public Libro(String nombre, double precio, int año) {
        this.id = contadorId;
        contadorId++;
        this.nombre = nombre;
        this.precio = precio;
        this.año = año;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", año=" + año +
                '}';
    }

    public static Integer getContadorId() {
        return contadorId;
    }

    public static void setContadorId(Integer contadorId) {
        Libro.contadorId = contadorId;
    }


    public int compareTo(Libro o) {
        return ((this.precio-o.precio)>=0)? 1:-1;
    }
}