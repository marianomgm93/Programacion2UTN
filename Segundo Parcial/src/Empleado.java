import org.json.JSONObject;

import java.util.Objects;

public class Empleado extends  Disponible{
    private String dni;
    private String nombre;
    private String puesto;
    private int antiguedad;

    public Empleado() {
    }

    public Empleado(String dni, String nombre, String puesto, int antiguedad) {
        this.dni = dni;
        this.nombre = nombre;
        this.puesto = puesto;
        this.antiguedad = antiguedad;
    }
    public Empleado(JSONObject o){
        this.dni=o.getString("dni");
        this.nombre=o.getString("nombre");
        this.puesto=o.getString("puesto");
        this.antiguedad=o.getInt("antiguedad");
    }
    /*
{
            "dni": "30111222",
            "nombre": "Carlos López",
            "puesto": "Chofer",
            "antiguedad": 5
        },
 */

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(dni, empleado.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("dni='").append(dni).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", puesto='").append(puesto).append('\'');
        sb.append(", antiguedad=").append(antiguedad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public JSONObject toJSON() {
        return null;
    }
}
