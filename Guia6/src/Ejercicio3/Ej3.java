package Ejercicio3;

/**
 * 3. Crear una clase genérica llamada "OperacionMatematica" que pueda realizar
 * operaciones matemáticas simples (suma, resta, multiplicación, división) con
 * cualquier tipo de número (enteros, decimales, etc.). Debe tener métodos para
 * cada operación y para establecer los números de entrada. Haz pruebas de
 * tu clase con diferentes tipos de números.
 */
public class Ej3 {
    public static void main(String[] args) {
        OperacionMatematica<Integer> operacionEnteros = new OperacionMatematica<>();
        Integer a=10;
        Integer b=5;
        System.out.println("Suma Enteros: " + operacionEnteros.suma(a,b));
        System.out.println("Resta Enteros: " + operacionEnteros.resta(a,b));
        System.out.println("Multiplicación Enteros: " + operacionEnteros.multiplicacion(a,b));
        System.out.println("División Enteros: " + operacionEnteros.division(a,b));
        OperacionMatematica<Double> operacionDecimales = new OperacionMatematica<>();
        Double c=5.5,d=3.4;
        System.out.println("Suma Decimales: " + operacionDecimales.suma(c,d));
        System.out.println("Resta Decimales: " + operacionDecimales.resta(c,d));
        System.out.println("Multiplicación Decimales: " + operacionDecimales.multiplicacion(c,d));
        System.out.println("División Decimales: " + operacionDecimales.division(c,d));


    }
}
