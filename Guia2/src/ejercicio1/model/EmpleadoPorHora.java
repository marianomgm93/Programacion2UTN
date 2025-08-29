package ejercicio1.model;

public class EmpleadoPorHora extends Empleado{
    private int horasTrabajadas=0;

    public EmpleadoPorHora() {
    }

    public EmpleadoPorHora(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public EmpleadoPorHora(String nombre, double salario, int horasTrabajadas) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularPago(){
        return super.getSalario()*this.horasTrabajadas;
    }

    @Override
    public String toString() {
        return super.toString()+"EmpleadoPorHora{" +
                "horasTrabajadas=" + horasTrabajadas +
                '}';
    }
}
