package ejercicio2;

/**
 * Es necesario modelar el objeto de tipo Libro con las siguientes
 * caracteristicas: titulo, precio, stock y Autor, este último posee las
 * características de: nombre, apellido, email y genero ( ‘M’ o ‘F’ ). Para este
 * ejercicio vamos a asumir que un libro tiene un único autor.
 */
public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    public Libro() {
    }

    public Libro(Autor autor, int stock, double precio, String titulo) {
        this.autor = autor;
        this.stock = stock;
        this.precio = precio;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor +
                '}';
    }
    /**
     * “El libro, {título} de {nombre del autor}.
     *          * Se vende a {precio} pesos.
     */
    public String mostrarautor()
    {
        return "el libro "+titulo+",de "+autor.getNombre()+" "+ autor.getApellido()+",se vende a "+precio+" pesos";
    }
}
