package model;

public class Pelicula extends Contenido {
    private double duracion;
    private double creditos;
    private String descripcion;
    private Categoria categoria;

    public Pelicula() {
    }

    public Pelicula(String titulo, int anno, Director director, double duracion, double creditos, String descripcion) {
        super(titulo, anno, director);
        this.duracion = duracion;
        this.creditos = creditos;
        this.descripcion = descripcion;
        this.categorizar();
    }

    public void categorizar() {
        if (this.duracion > 120)
            this.categoria = Categoria.VERSION_EXTENDIDA;
        else this.categoria = Categoria.VERSION_ESTANDAR;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getCreditos() {
        return creditos;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + super.toString() + " " +
                "duracion=" + duracion +
                ", duracion total=" + (duracion+creditos) +
                ", creditos=" + creditos +
                ", descripcion='" + descripcion + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
