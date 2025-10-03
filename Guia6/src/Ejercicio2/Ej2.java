package Ejercicio2;

/**
 * 2. Crear una clase genérica llamada "Pila" que funcione como una pila de
 * objetos. Debe tener métodos para agregar y quitar elementos de la pila, así
 * como para verificar si está vacía y para obtener el número de elementos en
 * la pila. Haz pruebas de tu clase con diferentes tipos de objetos.
 */
public class Ej2 {
    public static void main(String[] args) {
        Pila<Integer> enteros=new Pila<>();
        enteros.agregar(10);
        enteros.agregar(20);
        enteros.agregar(30);
        enteros.agregar(50);
        System.out.println(enteros.mostrarPila());
        System.out.println("Sacando: "+enteros.sacar());
        System.out.println("Sacando: "+enteros.sacar());
        System.out.println(enteros.mostrarPila());

    }
}
