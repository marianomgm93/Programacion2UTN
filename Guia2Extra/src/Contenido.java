public abstract class Contenido {
    private static int total;
    private String Titulo;
    private int anno;
    private Director director;
    private int id;

    public Contenido(String titulo, int anno, Director director) {
        Titulo = titulo;
        this.anno = anno;
        this.director = director;
        this.id = total;
        total++;
    }

    public Contenido() {
        this.id = total;
        total++;
    }

    public static int getTotal() {
        return total;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contenido{");
        sb.append("Titulo='").append(Titulo).append('\'');
        sb.append(", anno=").append(anno);
        sb.append(", director=").append(director);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
