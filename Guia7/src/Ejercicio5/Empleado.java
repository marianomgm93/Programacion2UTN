package Ejercicio5;

import org.json.JSONObject;

import java.util.Objects;

/*5. Crea una clase Empleado con los atributos id, nombre, salario, y
 departamento.

 */
public class Empleado {
    private static int total;
    private int id;
    private String nombre;
    private double salario;
    private String departamento;

    public Empleado(){
        this.id=total++;
    }
    public Empleado(String nombre, double salario, String departamento){
        this.nombre=nombre;
        this.salario=salario;
        this.departamento=departamento;
        this.id=total++;
    }
    public Empleado(JSONObject o){
        this.nombre=o.getString("nombre");
        this.salario=o.getDouble("salario");
        this.departamento=o.getString("departamento");
        this.id=total++;
    }
    public JSONObject toJSON(){
        JSONObject o = new JSONObject();
        o.put("nombre",this.nombre);
        o.put("salario", this.salario);
        o.put("departamento", this.departamento);
        return o;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return id == empleado.id && Double.compare(salario, empleado.salario) == 0 && Objects.equals(nombre, empleado.nombre) && departamento == empleado.departamento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, salario, departamento);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", salario=").append(salario);
        sb.append(", departamento=").append(departamento);
        sb.append('}');
        return sb.toString();
    }
}
