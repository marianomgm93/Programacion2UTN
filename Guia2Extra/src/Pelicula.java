public class Pelicula extends Contenido{
    private double duracion;
    private double creditos;
    private String descripcion;

    public Pelicula() {
    }

    public Pelicula(String titulo, int anno, Director director, double duracion, double creditos, String descripcion) {
        super(titulo, anno, director);
        this.duracion = duracion;
        this.creditos = creditos;
        this.descripcion = descripcion;
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
        sb.append("duracion=").append(duracion);
        sb.append(", creditos=").append(creditos);
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
