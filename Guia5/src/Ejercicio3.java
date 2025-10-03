import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    public void launch(Scanner sc) {
        int numero = (int) (Math.random() * 500 + 1);
        int option, intentos = 0;
        do {
                intentos++;
                System.out.println("Ingresa un numero: ");
            try {
                option = sc.nextInt();
                sc.nextLine();

            } catch (InputMismatchException e) {
                sc.nextLine();
                option=0;
                System.out.println("Tendra un intento menos a pesar de haber ingresado un caracter invalido");
            }

                if (option > numero)
                    System.out.println("Mas abajo");
                else if (option < numero)
                    System.out.println("Mas arriba");
                else
                    System.out.println("Acertaste!");
        } while (numero != option);
        System.out.println("Cantidad de intentos: " + intentos);
    }
}
