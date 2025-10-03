package Ejercicio3;

public class OperacionMatematica <T>{
    
    public T suma(T num1,T num2){
        T t = (T) ((double) num1 + (double) num2);
        return t;

    }
    public T resta(T num1, T num2){
        T t = (T) ((double) num1 - (double) num2);
        return t;
    }
}
