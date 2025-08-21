import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        System.out.println("Hello,daddy");

        char continuar;
        int opcion;


        do {
            System.out.println("Ingrese su opcion,daddy");
            opcion=leer.nextInt();

            switch (opcion)
            {
                case 1:
                    Empleado carlos=new Empleado("23456345","Carlos","Gutierrez",25000.0);
                    Empleado ana=new Empleado("34234123","Ana ","Sánchez",27500.0);

                    System.out.println(carlos.toString());
                    System.out.println(ana.toString());

                    carlos.aumentarSalario(15);
                    System.out.println("Nuevo salario de carlos: "+carlos.getSalario());

                    break;
                case 2:

                    break;


                default:
                    System.out.println("Dale, mete una opcion valida,boludito");
                    break;

            }



            System.out.println("Si desea continuar, pulse S");
            continuar=leer.next().charAt(0);
        }while (continuar=='s'||continuar=='S');



    }
}