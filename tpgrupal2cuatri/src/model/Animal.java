package model;

public abstract class Animal {
    private String nombre;
    private String especie;
    private String salud;
    private String higiene;
    private int id;
    private static int totalAnimales;

    public abstract void comer();

    public abstract void enfermarse();

    public abstract void ensuciarse();

    public Animal(String salud, String nombre, String especie, String higiene) {
        this.salud = salud;
        this.nombre = nombre;
        this.especie = especie;
        this.higiene = higiene;
        this.id = totalAnimales;
        totalAnimales++;
    }

    public Animal() {

        this.id = totalAnimales;
        totalAnimales++;
    }

    public int getId() {
        return id;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public String getHigiene() {
        return higiene;
    }

    public void setHigiene(String higiene) {
        this.higiene = higiene;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", especie='").append(especie).append('\'');
        sb.append(", salud='").append(salud).append('\'');
        sb.append(", higiene='").append(higiene).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
//Models.Animal (abstracta):a//tributos mínimos:  nombre, especie, hambre, salud, higiene, .
//Métodos mínimos: comer(), enfermarse(), ensuciarse().