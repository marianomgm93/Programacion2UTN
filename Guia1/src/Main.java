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
                    /**
                     *  En el main, realice las siguientes operaciones:
                     *  1. Inicialice una cuenta con un monto inicial de 15000.
                     *  2. Realice una operación de crédito de 2500
                     */
                    CuentaBanco cuenta=new CuentaBanco("juan",15000);
                    cuenta.mostrarCuenta();
                    cuenta.credito(2500);
                    System.out.println("Operacion credito");
                    cuenta.mostrarCuenta();
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