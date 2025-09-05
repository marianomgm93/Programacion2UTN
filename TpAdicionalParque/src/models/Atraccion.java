package models;

public abstract class Atraccion {

    private String nombre;
    private Intensidad intensidad;
    private Estado estado;
    private static int total=0;
    private int id;

    public Atraccion() {
    }

    public Atraccion(String nombre, Intensidad intensidad, Estado estado) {
        this.nombre = nombre;
        this.intensidad = intensidad;
        this.estado = estado;
        this.id = total;
        total++;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Intensidad getIntensidad() {
        return intensidad;
    }


    public Estado getEstado() {
        return estado;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atraccion{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", intensidad=").append(intensidad);
        sb.append(", estado=").append(estado);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
