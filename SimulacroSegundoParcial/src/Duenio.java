import org.json.JSONObject;

public class Duenio {
    private String nombre;
    private String apellido;
    private int dni;
    private String email;
    private String telefono;

    public Duenio(String nombre, String apellido, int dni, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
    }

    public Duenio(JSONObject o) {
        this.nombre = o.getString("nombre");
        this.apellido = o.getString("apellido");
        this.dni = o.getInt("dni");
        this.email = o.getString("email");
        this.telefono = o.getString("telefono");
    }

    public JSONObject toJSON() {
        JSONObject o = new JSONObject();
        o.put("nombre", this.nombre);
        o.put("apellido", this.apellido);
        o.put("dni", this.dni);
        o.put("email", this.email);
        o.put("telefono", this.telefono);
        return o;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Duenio{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", dni=").append(dni);
        sb.append(", email='").append(email).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
/*Además tienen un dueño(que consta de un nombre, apellido, dni, email, y teléfono),*/