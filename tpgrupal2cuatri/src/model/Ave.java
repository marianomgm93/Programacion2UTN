package model;

public class Ave extends Animal{
    private EstadoPlumaje estadoPlumaje;
    private boolean capacidadDeVuelo;

    public Ave() {
    }

    public Ave(String salud, String nombre, String especie, String higiene, EstadoPlumaje estadoPlumaje, boolean capacidadDeVuelo) {
        super(salud, nombre, especie, higiene);
        this.estadoPlumaje = estadoPlumaje;
        this.capacidadDeVuelo = capacidadDeVuelo;
    }

    @Override
    public void comer() {
        System.out.println("pio pio ");
    }

    @Override
    public void enfermarse() {
        System.out.println("aaaahchuuz");
    }

    @Override
    public void ensuciarse() {
        System.out.println("Iniciando protocolo de limpieza paloma espia");

    }

    public EstadoPlumaje getEstadoPlumaje() {
        return estadoPlumaje;
    }

    public void setEstadoPlumaje(EstadoPlumaje estadoPlumaje) {
        this.estadoPlumaje = estadoPlumaje;
    }

    public boolean isCapacidadDeVuelo() {
        return capacidadDeVuelo;
    }

    public void setCapacidadDeVuelo(boolean capacidadDeVuelo) {
        this.capacidadDeVuelo = capacidadDeVuelo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ave{");
        sb.append(super.toString());
        sb.append("estadoPlumaje=").append(estadoPlumaje);
        sb.append(", capacidadDeVuelo=").append(capacidadDeVuelo);
        sb.append('}');
        return sb.toString();
    }
}
