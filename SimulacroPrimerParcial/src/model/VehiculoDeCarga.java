package model;

public class VehiculoDeCarga extends Vehiculo implements IViajeComercial{
    private double capacidadMaxima;
    private Unidad unidad;

    public VehiculoDeCarga() {
    }

    public VehiculoDeCarga(int modelo, Marca marca, String patente, int velocidadRecomendada, int kilometraje, double capacidadMaxima, Unidad unidad) {
        super(modelo, marca, patente, velocidadRecomendada, kilometraje);
        this.capacidadMaxima = capacidadMaxima;
        this.unidad = unidad;
    }

    @Override
    public void mantenimientoEspecial(int nuevaVelocidad,int kilometraje, double cargaOpasaejeros) {
        this.setVelocidadRecomendada(nuevaVelocidad);
        this.setKilometraje(kilometraje);
        this.capacidadMaxima=cargaOpasaejeros;
    }
}
