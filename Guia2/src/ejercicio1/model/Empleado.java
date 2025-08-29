package ejercicio1.model;


public abstract class Empleado {
    private static int totalEmpleados=0;
    private String nombre;
    private double salario;
    private int id;

    public Empleado() {
        this.id=totalEmpleados;
        totalEmpleados++;
    }

    public Empleado(String nombre, double salario) {
        this.id=totalEmpleados;
        totalEmpleados++;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public double calcularPago(){
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", id=" + id +
                '}';
    }
}
