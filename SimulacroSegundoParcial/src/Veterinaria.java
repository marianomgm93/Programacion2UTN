import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Veterinaria {
    ArrayList<Paciente> pacientes;

    public Veterinaria() {
        this.pacientes = new ArrayList<>();
    }
    public Veterinaria(JSONObject o){
        this.pacientes = new ArrayList<>();
        JSONArray jarr=o.getJSONArray("pacientes");
        for (int i = 0; i < jarr.length(); i++) {
            this.pacientes.add(new Paciente(jarr.getJSONObject(i)));
        }
    }
    public JSONObject toJSON(){
        JSONObject o = new JSONObject();
        JSONArray jarr=new JSONArray();
        for(Paciente p:this.pacientes){
            jarr.put(p.toJSON());
        }
        o.put("pacientes",jarr);
        return o;
    }
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void agregarPaciente(Paciente paciente){
        this.pacientes.add(paciente);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Veterinaria{");
        sb.append("pacientes=").append(pacientes);
        sb.append('}');
        return sb.toString();
    }
}
