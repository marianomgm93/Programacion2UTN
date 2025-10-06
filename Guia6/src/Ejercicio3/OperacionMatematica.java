package Ejercicio3;

public class OperacionMatematica <T extends Number>{
    private T numero1;
    private T numero2;

    public OperacionMatematica(T numero1, T numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public T getNumero1() {
        return numero1;
    }
    public void setNumero1(T numero1) {
        this.numero1 = numero1;
    }
    public T getNumero2() {
        return numero2;
    }
    public void setNumero2(T numero2) {
        this.numero2 = numero2;
    }
    
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public OperacionMatematica() {

    }
    
    public Double suma(T num1, T num2){
        return num1.doubleValue() + num2.doubleValue();
    }
    public Double resta(T num1, T num2){
        return num1.doubleValue() - num2.doubleValue();
    }
    public Double multiplicacion(T num1, T num2){
        return num1.doubleValue() * num2.doubleValue();
    }
    public Double division(T num1, T num2){
        if(num2.doubleValue() == 0){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
}
