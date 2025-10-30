import org.json.JSONArray;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Historial <T extends Entrada>{
    private int numeroLegajo;
    private LocalDateTime ultimaActualizacion;
    private ArrayList<T> entradas;

    public Historial(int numeroLegajo, LocalDateTime ultimaActualizacion, ArrayList<T> entradas) {
        this.numeroLegajo = numeroLegajo;
        this.ultimaActualizacion = ultimaActualizacion;
        this.entradas = entradas;
    }


    public Historial(JSONObject o,ArrayList<T> entradas){
        this.numeroLegajo=o.getInt("numeroLegajo");
        this.ultimaActualizacion=LocalDateTime.parse(o.getString("ultimaActualizacion"));
        this.entradas=entradas;

    }

    /**
     *
     * @param entrada
     */
    public void agregarEntrada(T entrada) throws VisitaRepetidaException{
        if(this.entradas.contains(entrada)) throw new VisitaRepetidaException("La visita se encuentra en el arreglo");
        else {
            this.entradas.add(entrada);
            this.ultimaActualizacion=LocalDateTime.now();
        }
    }
    public JSONObject toJSON(){
        JSONObject o= new JSONObject();
        o.put("numeroLegajo",this.numeroLegajo);
        o.put("ultimaActualizacion", this.ultimaActualizacion);
        JSONArray jarr=new JSONArray();
        for(T e:entradas){
            jarr.put(e.toJSON());
        }
        o.put("entradas",jarr);
        return o;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Historial{");
        sb.append("numeroLegajo=").append(numeroLegajo);
        sb.append(", ultimaActualizacion=").append(ultimaActualizacion);
        sb.append(", entradas=").append(entradas);
        sb.append('}');
        return sb.toString();
    }
}
