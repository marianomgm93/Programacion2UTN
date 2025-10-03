package Ejercicio1;

public class Ej1 {
    public static void main(String[] args) {
        Almacenamiento<Integer> enteros=new Almacenamiento<>();
        enteros.almacenar(10);
        enteros.almacenar(30);
        enteros.almacenar(25);
        System.out.println(enteros.mostrarAlmacen());
        enteros.eliminar(enteros.buscar(1));
        System.out.println(enteros.mostrarAlmacen());
    }
}
