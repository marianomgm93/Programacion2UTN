package Ejercicio1.model;

public class Bicicleta extends Vehiculo {
    private String numeroserie;
    private int alturaAsiento=1;
    public Bicicleta() {
    }

    /**
     *
     * @param numeroserie
     */
    public Bicicleta(String numeroserie) {
        super(1, TipoTransporte.BICICLETA);
        this.numeroserie = numeroserie;
    }

    @Override
    public void arrancar() {
        System.out.println("ring ring");
    }

    @Override
    public void detener() {
        System.out.println("FIUUUMBA");
    }


    @Override
    public int obtenerCapacidad() {
        return 1;
    }

    public void ajustarAsiento(int altura) {
        if(altura<alturaAsiento){
            System.out.println("...Bajando asiento...");
            this.alturaAsiento=altura;
        } else if (altura>alturaAsiento) {
            System.out.println("...Subiendo asiento...");
            this.alturaAsiento=altura;
        }else {
            System.out.println("...Asiento listo...");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bicicleta{");
        sb.append(super.toString());
        sb.append("numeroserie='").append(numeroserie).append('\'');
        sb.append(", alturaAsiento=").append(alturaAsiento);
        sb.append('}');
        return sb.toString();
    }
}
