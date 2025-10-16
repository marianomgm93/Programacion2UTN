public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
/**
 * VIVERO
 * Un vivero necesita un sistema para administrar su catálogo de plantas y el registro de
 * ventas. La misma ofrece plantas, decoración de exteriores y accesorios.
 * Las plantas contienen un nombre, un código, un precio, stock, cuidado y clasificación
 * (interior, exterior, híbrido). Las decoraciones tienen un código, un nombre, un precio, stock y
 * proporciones. Por último, los accesorios tienen una nombre, una marca, una descripción, un
 * precio, stock y un código de producto.
 * Debemos poder agregar, eliminar, buscar y modificar los distintos productos y brindar tickets
 * a la hora de realizar una venta. Estos deben tener, un id, una fecha de emisión, un precio
 * total y detalle de los productos vendidos, exclusivamente su nombre y precio.
 * Necesitamos una clase que permita registrar alguno de los productos en particular y que
 * tenga el comportamiento requerido (agregar, quitar, vender, etc).
 * Funcionalidades del sistema:
 * - Agregar plantas.
 * - Agregar decoraciones.
 * - Agregar accesorios.
 * - Agregar Tickets.
 * - Calcular la recaudación total de las ventas realizadas.
 * - Ver la información de cualquier producto en base a su nombre.
 * - Modificar precio de un código en específico.
 * - Sumar stock de un producto en base a su código.
 * - Se debe realizar una venta. Si el usuario intenta vender un producto que no contiene
 * stock, se debe lanzar una excepción indicando el error.
 * - Se debe poder visualizar todos los datos de un producto y también solo su nombre y
 * precio.
 * - Persistir la información de los tickets realizados.
 * - Leer y mostrar el registro de venta.
 */