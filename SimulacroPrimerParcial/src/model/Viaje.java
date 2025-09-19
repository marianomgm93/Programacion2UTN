package model;

public abstract class Viaje {
    private int id;
    private static int totalViajes;
    private String patenteVehiculo;
    private int dniChofer;
    private String destino;
    private int distancia;
    private double tarifa;

    public Viaje() {
        this.id=totalViajes;
        totalViajes++;
    }

    public Viaje(String patenteVehiculo, int dniChofer, String destino, int distancia, double tarifa) {
        this.patenteVehiculo = patenteVehiculo;
        this.dniChofer = dniChofer;
        this.destino = destino;
        this.distancia = distancia;
        this.tarifa = tarifa;
        this.id=totalViajes;
        totalViajes++;
    }

    public int getId() {
        return id;
    }

    public static int getTotalViajes() {
        return totalViajes;
    }

    public String getPatenteVehiculo() {
        return patenteVehiculo;
    }

    public void setPatenteVehiculo(String patenteVehiculo) {
        this.patenteVehiculo = patenteVehiculo;
    }

    public int getDniChofer() {
        return dniChofer;
    }

    public void setDniChofer(int dniChofer) {
        this.dniChofer = dniChofer;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
