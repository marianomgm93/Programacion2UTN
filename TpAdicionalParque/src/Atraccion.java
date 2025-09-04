public abstract class Atraccion {

    private String nombre;
    private Intensidad intensidad;
    private Estado estado;





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
        sb.append('}');
        return sb.toString();
    }
}
