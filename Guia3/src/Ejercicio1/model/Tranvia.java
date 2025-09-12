package Ejercicio1.model;

public class Tranvia extends Vehiculo{
    private String ruta;

    public Tranvia() {
    }

    public Tranvia(int capacidad, String ruta) {
        super(capacidad, TipoTransporte.TRANVIA);
        this.ruta = ruta;
    }

    @Override
    public void arrancar() {
        System.out.println("...Arrancandooo...");
    }

    @Override
    public void detener() {
        System.out.println("...Llegando a la estacion...");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tranvia{");
        sb.append(super.toString());
        sb.append("ruta='").append(ruta).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
