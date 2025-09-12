package model;

import java.util.UUID;

public class Cuidador extends Persona {
    private Animal animal;

    public Cuidador() {
    }

    public Cuidador(Animal animal) {
        this.animal = animal;
    }

    public Cuidador(double salario, int dni, String nombre, Animal animal) {
        super(salario, dni, nombre);
        this.animal = animal;
    }

    public void alimentar() {

    }

    public void vacunar() {

    }

    public void limpiar() {

    }


    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuidador{");
        sb.append(super.toString());
        sb.append("animal=").append(animal);
        sb.append('}');
        return sb.toString();
    }
}
