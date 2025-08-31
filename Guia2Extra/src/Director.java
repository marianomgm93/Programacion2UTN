public class Director {
    private String nombre;
    private String nacionalidad;

    public Director() {
    }

    public Director(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Director{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nacionalidad='").append(nacionalidad).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
