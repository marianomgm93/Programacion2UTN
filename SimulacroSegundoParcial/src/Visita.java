import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.Objects;

public class Visita extends Entrada{
    private Motivo motivo;
    private String observacion;

    public Visita(Motivo motivo, String observacion) {
        super(LocalDateTime.now());
        this.motivo = motivo;
        this.observacion = observacion;

    }
    public Visita(JSONObject o){
        super(LocalDateTime.parse(o.getString("fecha")));
        this.motivo=Motivo.valueOf(o.getString("motivo"));
        this.observacion=o.getString("observacion");
    }

    public JSONObject toJSON(){
        JSONObject o = new JSONObject();
        o.put("fecha", super.getFecha());
        o.put("motivo", this.motivo);
        o.put("observacion", this.observacion);
        return o;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Visita visita = (Visita) o;
        return motivo == visita.motivo && Objects.equals(observacion, visita.observacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), motivo, observacion);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Visita{");
        sb.append(super.toString());
        sb.append("motivo=").append(motivo);
        sb.append(", observacion='").append(observacion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

/*
De cada visita se registra la fecha, el motivo (que puede ser: emergencia, chequeo o
particular) y una observación, que describe la visita.
 */
