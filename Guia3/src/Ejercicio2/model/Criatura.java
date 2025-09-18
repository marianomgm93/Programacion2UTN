package Ejercicio2.model;

public abstract class Criatura {
    private int id;
    private static int contador;
    private EstadoVida vida;
    private int hambre;
    private int energia;


    public Criatura() {
    }

    public Criatura(EstadoVida vida, int hambre) {
        this.vida = EstadoVida.HIGH_HEALTH;
        this.hambre = hambre;
        this.energia=100;
        this.id=contador;
        contador++;

    }

    public void comer(int calorias){
        this.hambre-=calorias;
        this.energia-=10;
    }
    public void dormir(int horas){
        this.energia+=10*horas;
        if(energia>100)
           this.energia=100;
    }



}
