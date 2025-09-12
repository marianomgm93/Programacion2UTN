package Ejercicio1.model;

public class Autobus extends Vehiculo{
    private int numeroLinea;

    public Autobus() {
    }

    public Autobus(int capacidad, int numeroLinea) {
        super(capacidad, TipoTransporte.AUTOBUS);
        this.numeroLinea = numeroLinea;
    }

    @Override
    public void arrancar() {
        System.out.println("rrummruuum");
    }

    @Override
    public void detener() {
        System.out.println("....Frenando....");

    }

    @Override
    public int obtenerCapacidad() {
         return super.obtenerCapacidad();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobus{");
        sb.append(super.toString());
        sb.append("numeroLinea=").append(numeroLinea);
        sb.append('}');
        return sb.toString();
    }
}
