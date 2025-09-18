package Ejercicio2.model;

public class Pez extends Criatura implements INadar{
    private double profundidad;
    @Override
    public void nadar(double profundidad) {
        this.profundidad=profundidad;
    }
}
