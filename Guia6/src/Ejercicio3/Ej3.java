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
        System.out.println("Suma Enteros: " + operacionEnteros.sumar(a,b));
        System.out.println("Resta Enteros: " + operacionEnteros.restar(a,b));
        System.out.println("Multiplicación Enteros: " + operacionEnteros.multiplicar(a,b));
        System.out.println("División Enteros: " + operacionEnteros.dividir(a,b));

        OperacionMatematica<Double> operacionDecimales = new OperacionMatematica<>(10.5, 2.5);
        System.out.println("Suma Decimales: " + operacionDecimales.sumar());
        System.out.println("Resta Decimales: " + operacionDecimales.restar());
        System.out.println("Multiplicación Decimales: " + operacionDecimales.multiplicar());
        System.out.println("División Decimales: " + operacionDecimales.dividir());
    }
}
