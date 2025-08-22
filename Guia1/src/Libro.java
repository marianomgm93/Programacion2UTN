import java.security.PublicKey;

/**
 * 3. Modela un objeto Libro que tenga las siguientes características: id (único y
 * autoincremental), título, autor, precio y cantidad de copias disponibles.
 * En dicha clase implementa los siguientes métodos:
 * ● Un constructor que inicialice el Libro con su título, autor, precio y
 * cantidad de copias. El id debe ser asignado automáticamente.
 * ● Métodos getters y setters para cada atributo, excepto el id, que solo
 * tendrá un getter.
 * ● Un método que permita vender una cierta cantidad de copias de un
 * libro, disminuyendo la cantidad disponible. Si no hay suficientes
 * copias, debe mostrar un mensaje indicando que la operación no es
 * posible.
 * ● Un método que permita incrementar la cantidad de copias disponibles
 * en el inventario.
 * ● Un método que imprima por pantalla los detalles del libro en el
 * siguiente formato: Libro[id=?, título=?, autor=?, precio=?, copias
 * disponibles=?]
 */
public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private Double precio;
    private int cantCopias;

    public int getId() {
        return id;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantCopias() {
        return cantCopias;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }

    public Libro() {
        this.id++;

    }
    public Libro(int cantCopias, Double precio, String autor, String titulo) {
        this.id++;
        this.cantCopias = cantCopias;
        this.precio = precio;
        this.autor = autor;
        this.titulo = titulo;
    }



    public boolean vender(int cantidad) {
        boolean vendido;

        if (cantidad > this.cantCopias) {
            System.out.println("No papi, no tengo suficiente stock");
            vendido = false;
        } else {
            this.cantCopias = this.cantCopias - cantidad;
            System.out.println("Si papi, vendiste " + cantidad
                    +  "Libros.\n Cantidad restante: " + this.cantCopias);
            vendido = true;


        }
        return vendido;
    }

    public void incrementarCant(int cantidad)
    {
        this.cantCopias=this.cantCopias+cantidad;


    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", cantCopias=" + cantCopias +
                '}';
    }
}

