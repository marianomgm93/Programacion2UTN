import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Entrada {
    private LocalDateTime fecha;

    public Entrada(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public abstract JSONObject toJSON();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Entrada entrada = (Entrada) o;
        return Objects.equals(fecha, entrada.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fecha);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Entrada{");
        sb.append("fecha=").append(fecha);
        sb.append('}');
        return sb.toString();
    }
}
