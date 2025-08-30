package ejercicio5;

public class Estudiante extends Persona{
    private int agnoIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(long dni, String nombre, String apellido, String email, String direccion, int agnoIngreso, double cuotaMensual, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.agnoIngreso = agnoIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public int getAgnoIngreso() {
        return agnoIngreso;
    }

    public void setAgnoIngreso(int agnoIngreso) {
        this.agnoIngreso = agnoIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "agnoIngreso=" + agnoIngreso +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
