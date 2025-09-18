package Ejercicio2.model;

public class Pato extends Criatura implements IVolar,INadar{
    private double profundidadMaxima=3.0;

    @Override
    public void nadar(double profundidad) {
        if(profundidad>profundidadMaxima){
            System.out.println("No puedo ir tan profundo");
        }
    }

    @Override
    public void volar() {
        System.out.println("Volando a 150 metros");
    }
}
