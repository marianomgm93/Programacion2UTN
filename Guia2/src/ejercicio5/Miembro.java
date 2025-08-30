package ejercicio5;

public class Miembro extends Persona{
    private double sueldo;
    private Turno turno;

    public Miembro() {
    }

    public Miembro(long dni, String nombre, String apellido, String email, String direccion, double sueldo, Turno turno) {
        super(dni, nombre, apellido, email, direccion);
        this.sueldo = sueldo;
        this.turno = turno;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
