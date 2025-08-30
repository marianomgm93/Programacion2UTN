package ejercicio4;

public class Cilindro extends Circulo{
    private double altura;


    public Cilindro() {
        this.altura=1;
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }
    //////////////////////////////////////////////
    public double calcularVolumen(){
        return Math.PI*Math.pow(super.getRadio(),2)*this.altura;
    }
    @Override
    public double calcularArea(){
        return 2*Math.PI*super.getRadio()*this.altura+2*super.calcularArea();
    }
    //////////////////////////////////////////////
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
