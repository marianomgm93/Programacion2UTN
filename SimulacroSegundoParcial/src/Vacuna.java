import java.time.LocalDateTime;
import java.util.Objects;

public class Vacuna {
    private String tipo;
    private LocalDateTime fecha;

    public Vacuna(String tipo, LocalDateTime fecha) {
        this.tipo = tipo;
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vacuna vacuna = (Vacuna) o;
        return Objects.equals(tipo, vacuna.tipo) && Objects.equals(fecha, vacuna.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, fecha);
    }
}
