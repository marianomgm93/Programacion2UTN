package model;

import java.util.Objects;

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
        final StringBuilder sb = new StringBuilder("Pelicula{");
        sb.append(super.toString());
        sb.append("duracion=").append(duracion);
        sb.append(", creditos=").append(creditos);
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", categoria=").append(categoria);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pelicula pelicula = (Pelicula) o;
        return Double.compare(duracion, pelicula.duracion) == 0 && Double.compare(creditos, pelicula.creditos) == 0 && Objects.equals(descripcion, pelicula.descripcion) && categoria == pelicula.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duracion, creditos, descripcion, categoria);
    }
}
