import models.Atraccion;
import models.Estado;
import models.Intensidad;
import models.Rusa;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfazUsuario {
    public void menu(ArrayList<Atraccion> arr, Scanner sc){
        int option;
        boolean continuar=true;
        do {
            System.out.println("0\tSalir\n1\tCrear nueva atraccion");
            option=sc.nextInt();
            sc.nextLine();
            switch(option){
                case 0:
                    continuar=false;
                    break;
                case 1:

                    break;
                default:
                    break;
            }
        }while(continuar);
    }
    public void crearAtraccion(Scanner sc){
        int option=sc.nextInt();
        boolean continuar=true;
        sc.nextLine();
        do {
            System.out.println("0\tAtras\n1\tMontanna Rusa\n2\tAcuatica\n3\tInfantil");
            switch (option){
                case 0:
                    continuar=false;
                    break;
                case 1:

            }
        }while(continuar);

    }


    public void crearMontannaRusa(ArrayList<Atraccion> arr, Scanner sc){

        System.out.println("Ingrese nombre");
        String nombre=sc.nextLine();
        System.out.println("intensidad:\n1\tBAJO\n2\tMEDIO\n3\tAlto");
        int option=sc.nextInt();
        sc.nextLine();
        Intensidad intensidad;

        switch (option){
            case 1:
                intensidad=Intensidad.BAJO;
                break;
            case 2:
                intensidad=Intensidad.MEDIO;

                break;
            case 3:
                intensidad=Intensidad.ALTO;
                break;
            default:
                intensidad=Intensidad.BAJO;
                break;
        }

        System.out.println("Estado:\n1\tABIERTO\n2\tCERRADO");
        option=sc.nextInt();
        sc.nextLine();
        Estado estado;
        switch (option){
            case 1:
                estado=Estado.ABIERTO;
                break;
            case 2:
                estado=Estado.CERRADO;
                break;
            default:
                estado=Estado.CERRADO;
                break;
        }

        System.out.println("Ingrese cantidad de vueltas");
        int vueltas=sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese Longitud");
        double longitud=sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese Velocidad Maxima");
        double velocidad=sc.nextDouble();
        sc.nextLine();
        Rusa rusa=new Rusa(nombre,intensidad,estado,vueltas,longitud,velocidad);
        if (Service.disponible(rusa,arr)){
            arr.add(rusa);
        }else{
            System.out.println("La atraccion que intenta crear ya no esta disponible");
        }
        }
}

