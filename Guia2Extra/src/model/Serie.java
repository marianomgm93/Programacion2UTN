package model;

public class Serie extends Contenido {
    private int episodios;
    private int temporadas;
    private boolean finalizada;
    private Categoria categoria;

    public Serie() {
    }

    public Serie(String titulo, int anno, Director director, int episodios, int temporadas, boolean finalizada) {
        super(titulo, anno, director);
        this.episodios = episodios;
        this.temporadas = temporadas;
        this.finalizada = finalizada;
        this.categorizar();
    }

    public void categorizar() {
        if (this.finalizada == true && this.temporadas < 2)
            this.categoria = Categoria.MINISERIE;
        else this.categoria = Categoria.SERIE;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    @Override
    public String toString() {
        return "Serie{" + super.toString() + " " +
                "episodios=" + episodios +
                ", temporadas=" + temporadas +
                ", finalizada=" + finalizada +
                ", categoria=" + categoria +
                '}';
    }
}
