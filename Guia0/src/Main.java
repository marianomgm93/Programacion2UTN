import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Ejercicios ejercicios = new Ejercicios();
        int opcion;
        char continuar = 's';
        Scanner leer = new Scanner(System.in);


        do {

        System.out.println("Dame la opcion,papi\n");
        opcion = leer.nextInt();
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
                case 11:
                    ejercicios.ej11();
                    break;
                case 12:
                    ejercicios.ej12();
                    break;
                case 13:
                    ejercicios.ej13();
                    break;
                case 14:
                    ejercicios.ej14();
                    break;
                case 15:
                    ejercicios.ej15();
                    break;
                case 16:
                    ejercicios.ej16();
                    break;
                case 17:
                    ejercicios.ej17();
                    break;
                case 18:
                    ejercicios.ej18();
                    break;
                case 19:
                    ejercicios.ej19();
                    break;
                case 20:
                    ejercicios.ej20();
                    break;
                case 21:
                    ejercicios.ej21();
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

