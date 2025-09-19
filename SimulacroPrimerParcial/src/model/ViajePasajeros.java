package model;

public class ViajePasajeros extends Viaje{
    private int cantidadPasajeros;

    public ViajePasajeros() {
    }

    public ViajePasajeros(String patenteVehiculo, int dniChofer, String destino, int distancia, double tarifa, int cantidadPasajeros) {
        super(patenteVehiculo, dniChofer, destino, distancia, tarifa);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
}
