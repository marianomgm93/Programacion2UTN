/**
 * Por otro lado, diseñaremos una clase para guardar la información del
 * Estudiante, de quien precisamos el nombre, el legajo(comienza de 1 y se
 * debe asignar automáticamente) y su EstadoAcademico. Esta clase debe
 * tener métodos para:
 * - mostrar info de alumno
 * - mostrar info de notas
 * - saber si aprobó
 * - saber si promociono
 * - saber el promedio
 */
public class Estudiante {
    private String nombre;
     static int legajo=1;
    private EstadoAcademico estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstadoAcademico getEstado() {
        return estado;
    }

    public void setEstado(EstadoAcademico estado) {
        this.estado = estado;
    }

    public int getLegajo() {
        return legajo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                ", estado=" + estado +
                '}';
    }

    public Estudiante() {
        legajo++;

    }

    public Estudiante(String nombre, EstadoAcademico estado) {
        legajo++;
        this.nombre = nombre;
        this.estado = estado;
    }

    public boolean aprobo() {

        return estado.aprobado();
    }

    public boolean promociono() {

        return estado.promocion();
    }

    public void mostrarnotas() {
        System.out.println("Primera nota: " + this.estado.getPrimeranota() + "\nSegunda nota"
                + this.estado.getSegundanota() + "\n tp final" + this.estado.getNotatpfinal() + "\nPromedio: ");


    }



}
