package Ejercicio5;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Empresa {
    private String nombreEmpresa;
    private ArrayList<Empleado> empleados;

    public Empresa(){
    }

    public Empresa(String nombreEmpresa, ArrayList<Empleado> empleados) {
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = empleados;
    }

    public Empresa(JSONObject o){
        this.nombreEmpresa=o.getString("nombreEmpresa");
        this.empleados=new ArrayList<>();
        JSONArray jarr=o.getJSONArray("empleados");
        for (int i = 0; i < jarr.length(); i++) {
            this.empleados.add(new Empleado((JSONObject) jarr.get(i)));
        }
    }
    public JSONObject toJSON(){
        JSONObject o = new JSONObject();
        o.put("nombreEmpresa",this.nombreEmpresa);
        JSONArray jarr=new JSONArray();
        for(Empleado e: this.empleados){
            jarr.put(e.toJSON());
        }
        o.put("empleados",jarr);
        return o;
    }
    public void eliminarEmpleado(int id){
        this.empleados.remove(id);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empresa{");
        sb.append("nombreEmpresa='").append(nombreEmpresa).append('\'');
        sb.append(", empleados=").append(empleados);
        sb.append('}');
        return sb.toString();
    }
}
