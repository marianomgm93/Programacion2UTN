package model;

public class ViajeCarga extends Viaje{
    private double Carga;

    public ViajeCarga() {
    }

    public ViajeCarga(String patenteVehiculo, int dniChofer, String destino, int distancia, double tarifa, double carga) {
        super(patenteVehiculo, dniChofer, destino, distancia, tarifa);
        Carga = carga;
    }

    public double getCarga() {
        return Carga;
    }

    public void setCarga(double carga) {
        Carga = carga;
    }
}
