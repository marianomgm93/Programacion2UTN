package Ejercicio3;

public class OperacionMatematica <T extends Number>{


    public  double suma(T numero1 , T numero2){
        return numero1.doubleValue() + numero2.doubleValue();
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
