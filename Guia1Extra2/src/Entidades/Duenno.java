package Entidades;

/**
 * Dueño que tenga como atributos un nombre y
 * un teléfono
 */
public class Duenno {
    static int idDuenno = 0;
    private String nombre;
    private String telefono;
    private int id;

    public Duenno() {
        this.id = idDuenno;
        idDuenno++;
    }

    public Duenno(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.id = idDuenno;
        idDuenno++;
    }

    public int getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Duenno{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", id=" + id +
                '}';
    }
}
