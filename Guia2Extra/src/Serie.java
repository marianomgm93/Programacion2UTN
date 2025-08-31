public class Serie extends Contenido{
    private int episodios;
    private int temporadas;
    private boolean finalizada;

    public Serie() {
    }

    public Serie(String titulo, int anno, Director director, int episodios, int temporadas, boolean finalizada) {
        super(titulo, anno, director);
        this.episodios = episodios;
        this.temporadas = temporadas;
        this.finalizada = finalizada;
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
        final StringBuilder sb = new StringBuilder("Serie{");
        sb.append("episodios=").append(episodios);
        sb.append(", temporadas=").append(temporadas);
        sb.append(", finalizada=").append(finalizada);
        sb.append('}');
        return sb.toString();
    }
}
