package Ejercicio4;

import org.json.JSONObject;

import java.util.Objects;

public class Libro {
    private static int total;
    private int id;
    private String nombre;
    private String autor;

    public Libro(String nombre, String autor) {
        this.id = total++;
        this.nombre = nombre;
        this.autor = autor;
    }

    public Libro(JSONObject jl) {
        this.id = total++;
        this.nombre = jl.getString("nombre");
        this.autor = jl.getString("autor");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return id == libro.id && Objects.equals(nombre, libro.nombre) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, autor);
    }

    public JSONObject toJSON() {
        JSONObject l = new JSONObject();
        l.put("nombre", this.nombre);
        l.put("autor", this.autor);
        return l;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Libro{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
