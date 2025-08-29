package ejercicio1.model;

public class EmpleadoTiempoCompleto extends Empleado{

    public EmpleadoTiempoCompleto() {
    }

    public EmpleadoTiempoCompleto(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularPago(){
        return super.getSalario()*8*22;
    }

}
