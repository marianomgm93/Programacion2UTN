package Ejercicio1;

public class Corredor {
    private Piloto piloto;
    private Escuderia escuderia;
    private Vehiculo vehiculo;
    private Temporada temporada;

    public Corredor(Piloto piloto, Escuderia escuderia, Vehiculo vehiculo, Temporada temporada) {
        this.piloto = piloto;
        this.escuderia = escuderia;
        this.vehiculo = vehiculo;
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Corredor{");
        sb.append("piloto=").append(piloto);
        sb.append(", escuderia=").append(escuderia);
        sb.append(", vehiculo=").append(vehiculo);
        sb.append(", temporada=").append(temporada);
        sb.append('}');
        return sb.toString();
    }
}
