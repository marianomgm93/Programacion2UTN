package Ejercicio1;
/*
"temporada": {
        "anio": 2025,
        "puntos": 320,
        "posicion_campeonato": 1,
        "carreras_disputadas": 18,
        "victorias": 9,
        "podios": 14
      }
 */
public class Temporada {
    private int anio;
    private int puntos;
    private int posicion_campeonato;
    private int carreras_disputadas;
    private int victorias;
    private int podios;

    public Temporada(int anio, int puntos, int posicion_campeonato, int carreras_disputadas, int victorias, int podios) {
        this.anio = anio;
        this.puntos = puntos;
        this.posicion_campeonato = posicion_campeonato;
        this.carreras_disputadas = carreras_disputadas;
        this.victorias = victorias;
        this.podios = podios;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Temporada{");
        sb.append("anio=").append(anio);
        sb.append(", puntos=").append(puntos);
        sb.append(", posicion_campeonato=").append(posicion_campeonato);
        sb.append(", carreras_disputadas=").append(carreras_disputadas);
        sb.append(", victorias=").append(victorias);
        sb.append(", podios=").append(podios);
        sb.append('}');
        return sb.toString();
    }
}
