package Ejercicio2.model;

public class Murcielago extends Criatura implements IVolar{
    private boolean colgado;

    public Murcielago(EstadoVida vida, int hambre, boolean colgado) {
        super(vida, hambre);
        this.colgado = colgado;
    }

    @Override
    public void volar() {
        if(colgado)
            this.colgado=false;
        System.out.println("Vuela en la oscuridad");
    }
    @Override
    public void dormir(int horas){
        super.dormir(horas);
        this.colgado=true;
    }
}
