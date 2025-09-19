package model;

public class VehiculoDePasajeros extends Vehiculo implements IViajeComercial{
    private int cantidadPasajeros;
    private Categoria categoria;

    public VehiculoDePasajeros() {
    }

    public VehiculoDePasajeros(int modelo, Marca marca, String patente, int velocidadRecomendada, int kilometraje, int cantidadPasajeros, Categoria categoria) {
        super(modelo, marca, patente, velocidadRecomendada, kilometraje);
        this.cantidadPasajeros = cantidadPasajeros;
        this.categoria = categoria;
    }

    @Override
    public void mantenimientoEspecial(int nuevaVelocidad,int kilometraje, double cargaOpasaejeros) {
        this.setVelocidadRecomendada(nuevaVelocidad);
        this.setKilometraje(kilometraje);
        this.cantidadPasajeros=(int) cargaOpasaejeros;
    }
}
