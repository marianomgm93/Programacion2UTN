package Entidades;

/**
 * una clase Mascota que tenga como atributos un nombre, una especie
 * (por ejemplo perro, gato, loro), una edad y un dueño (de tipo Dueño).
 */
public class Mascota {
    static int idMascota = 0;
    private String nombre;
    private String especie;
    private int edad;
    private Duenno duenno;
    private int id;

    public Mascota() {
        this.id = idMascota;
        idMascota++;
    }

    public Mascota(String nombre, String especie, int edad, Duenno duenno) {
        this.id = idMascota;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.duenno = duenno;
        idMascota++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Duenno getDuenno() {
        return duenno;
    }

    public void setDuenno(Duenno duenno) {
        this.duenno = duenno;
    }

    public boolean esAdulto(){
        return (edad>=5);
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", duenno=" + duenno +
                ", id=" + id +
                '}';
    }
}
