import org.json.JSONObject;

import java.util.Objects;

public class Pasajero {
    private String dni;
    private String nombre;
    private int asiento;

    public Pasajero(String dni, String nombre, int asiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.asiento = asiento;
    }
    public JSONObject toJSON(){
        JSONObject o = new JSONObject();
        o.put("dni",this.dni);
        o.put("nombre",this.nombre);
        o.put("asiento",this.asiento);
        return o;
    }

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

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pasajero pasajero = (Pasajero) o;
        return asiento == pasajero.asiento || Objects.equals(dni, pasajero.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, asiento);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pasajero{");
        sb.append("dni='").append(dni).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", asiento=").append(asiento);
        sb.append('}');
        return sb.toString();
    }
}
