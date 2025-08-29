package ejercicio2;

public class ej2 {
    public static void main(String[] args) {
        /**
         * a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”,
         * “joshua@email.com”, ’M’.
         */
        Autor autor=new Autor("joshua","bloch","joshua@gmail.com","M");
        System.out.println(autor);
        /**
         * Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta
         * 450 pesos con una cantidad de 150 copias.
         */
        Libro libro=new Libro(autor,150,450,"Effective java");
        System.out.println(libro);
        /**
         * e. Modifique el precio del libro “Effctive Java” a 500 pesos y aumente la
         * cantidad en 50 copias.
         */
        libro.setPrecio(500);
        libro.setStock(libro.getStock()+50);
        System.out.println(libro);
        /**
         * Imprima por pantalla los atributos del Autor Joshua, accediendo
         * desde el Libro “Effective Java”.
         */
        System.out.println(libro.getAutor());
        /**
         * g. Agregue un método a la clase Libro que posibilite imprimir en
         * pantalla el siguiente mensaje: “El libro, {título} de {nombre del autor}.
         * Se vende a {precio} pesos.
         */
        System.out.println(libro.mostrarautor());



    }
}
