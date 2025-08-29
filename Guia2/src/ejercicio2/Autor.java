package ejercicio2;

public class Autor {
    private String nombre ;
    private String apellido;
    private String gmail;
    private String genero;

    public Autor() {
    }

    public Autor(String nombre, String apellido, String gmail, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.gmail = gmail;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", gmail='" + gmail + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
