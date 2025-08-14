import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Ejercicios ejercicios = new Ejercicios();
        int opcion;
        char continuar = 's';
        System.out.println("Dame la opcion,papi\n");
        Scanner leer = new Scanner(System.in);
        opcion = leer.nextInt();


        do {

            switch (opcion) {
                case 1:
                    ejercicios.ej1();
                    break;
                case 2:
                    ejercicios.ej2();
                    break;
                case 3:
                    ejercicios.ej3();
                    break;
                case 4:
                    ejercicios.ej4();
                    break;
                case 5:
                    ejercicios.ej5();
                    break;
                case 6:
                    ejercicios.ej6();
                    break;
                case 7:
                    ejercicios.ej7();
                    break;
                case 8:
                        ejercicios.ej8();
                    break;
                case 9:
                        ejercicios.ej9();
                    break;
                case 10:
                    ejercicios.ej10();
                    break;
                default:
                    System.out.println("Te gustan los machos");
                    break;
            }
            System.out.println("Si desea continuar,pulse s\n");
            continuar = leer.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');
    }


}

