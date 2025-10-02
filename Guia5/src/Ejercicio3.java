import java.util.Scanner;

public class Ejercicio3 {

    public void launch(Scanner sc) {
        int numero = (int) (Math.random() * 500 + 1);
        int option, intentos = 0;
        do {
            try {
                intentos++;
                option = sc.nextInt();

                if (option > numero)
                    System.out.println("Mas abajo");
                else if (option < numero)
                    System.out.println("Mas arriba");
                else
                    System.out.println("Acertaste!");
            } catch (MyException e) {
                option=0;
                System.out.println(e.getMessage());
            }
        } while (numero != option);
    }
}
