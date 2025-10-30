import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.Objects;

public class Vacuna extends Entrada{

    private String tipo;

    public Vacuna(String tipo) {
        super(LocalDateTime.now());
        this.tipo = tipo;
    }
    public Vacuna(JSONObject o){
        super(LocalDateTime.parse(o.getString("fecha")));
        this.tipo=o.getString("tipo");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject o = new JSONObject();
        o.put("fecha",super.getFecha());
        o.put("tipo", this.tipo);
        return o;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vacuna vacuna = (Vacuna) o;
        return Objects.equals(tipo, vacuna.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vacuna{");
        sb.append(super.toString());
        sb.append("tipo='").append(tipo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
