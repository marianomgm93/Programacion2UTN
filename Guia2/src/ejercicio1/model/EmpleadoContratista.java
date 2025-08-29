package ejercicio1.model;

public class EmpleadoContratista extends Empleado {
    private int horas=0;
    private double valorProyecto;

    public EmpleadoContratista() {
    }


    public EmpleadoContratista(String nombre, double salario, int horas, double valorProyecto) {
        super(nombre, salario);
        this.horas = horas;
        this.valorProyecto = valorProyecto;
    }

    public double calcularPago(){
        return super.getSalario()*this.horas+this.valorProyecto;
    }

    @Override
    public String toString() {
        return super.toString()+"EmpleadoContratista{" +
                "horas=" + horas +
                ", valorProyecto=" + valorProyecto +
                '}';
    }
}
