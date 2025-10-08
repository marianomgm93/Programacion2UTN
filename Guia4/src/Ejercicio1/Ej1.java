public class Ej1 {
    
    public static void main(String[] args) {
        Libreria libreria=new Libreria();
        Libro l1=new Libro("El Silmarilion", 30, 1987);
        Libro l2=new Libro("El Hobbit", 15, 1990);
        Libro l3=new Libro("El Señor de los anillos", 50, 1989);
        libreria.agregarLibro(l1.getId(),l1);
        libreria.agregarLibro(l2.getId(),l2);
        libreria.agregarLibro(l3.getId(),l3);

        System.out.println(libreria.mostrarLibros());
        System.out.println("Precio total: "+ libreria.precioTotal());
    }

}
/*
 * 1.
Supongamos que estás desarrollando un programa para gestionar una
tienda de libros. Cada libro tiene un título, un autor, un precio, y el año de
publicación. El programa debe permitir realizar las siguientes operaciones:
● Agregar unnuevo libro al inventario.
● Eliminar un libro del inventario.
● Mostrar todos los libros en el inventario.
● Buscarunlibro por su título.
● Actualizar el precio de un libro.
● Calcular el precio total de todos los libros en el inventario.
● Contarel número total de libros en el inventario.
● Encontrar el libro más caro y el más barato en el inventario.
Pensar que estructuras de datos vista (ArrayList, LinkedList, Stack,
HashMap, etc.) nos conviene para implementar las operaciones anteriores.
Consideraciones adicionales:- Crea una clase Libro que tenga atributos para el título, autor, precio y año
de publicación.- Asegúrate de agregar validaciones de entrada para garantizar que los
datos ingresados por el usuario sean válidos
 */