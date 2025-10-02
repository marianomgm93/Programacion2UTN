import java.util.Scanner;

/**
 * 1. ¿Qué está mal en el siguiente bloque de código?
 * try
 * {
 * Persona p = baseDeDatos.buscar(datos);
 * System.out.println(“Los datos pertenecen a: ” + p);
 * }
 * catch(Exception e) {
 * // Maneja cualquiera de las excepciones comprobadas
 * }
 * catch(RuntimeException e) {
 * // Maneja cualquiera de las excepciones no comprobadas
 * }
 * El orden debe ser al reves,
 * ya que RuntimeException nunca se ejecutará ya que es hija de Exception
 *
 * 2. Explique lo que sucede en el siguiente código y por qué.
 * public static class EjemploExcepciones{
 * public static int devuelveNumero(int num) {
 * try {
 * if (num % 2 == 0) {
 * throw new Exception("Lanzando excepcion");
 * }
 * return 1;
 * } catch (Exception ex) {
 * ex.getMessage().concat("Rompi todo y pase por Catch");
 * return 2;
 * } finally {
 * return 3;
 * }
 * }
 * }
 *3. Escribe un programa que juegue con el usuario a adivinar un número.
 * El ordenador debe generar un número entre 1 y 500, y el usuario tiene que
 * intentar adivinarlo.
 * Para ello, cada vez que el usuario introduce un valor, el ordenador debe
 * decirle al usuario si el número que tiene que adivinar es mayor o menor que el
 * que ha introducido el usuario. Cuando consiga adivinarlo, debe indicarlo e
 * imprimir en pantalla el número de veces que el usuario ha intentado adivinar
 * el número.
 * Si el usuario introduce algo que no es un número, debe indicarlo en pantalla,
 * lanzar una excepción y contarlo como un intento. Investigar qué
 * excepción controla el tipo de datos ingresados.
 */

public class Main {
    public static void main(String[] args) {
        ///System.out.println(devuelveNumero(4));
        Scanner sc=new Scanner(System.in);
        System.out.println(sc.nextInt());

    }
    //  2. Explique lo que sucede en el siguiente código y por qué.
    public static int devuelveNumero(int num) {
        try {
            if (num % 2 == 0) {
                throw new Exception("Lanzando excepcion");
            }
            return 1;
        } catch (Exception ex) {
            ex.getMessage().concat("Rompi todo y pase por Catch");
            return 2;
            /// NUNCA DEVUELVE ESTA LINEA DE CODIGO YA QUE SIEMPRE SE EJECUTA EL FINALLY
            /// PISANDO EL RETORNO 2
        } finally {
            return 3;
        }
    }
}