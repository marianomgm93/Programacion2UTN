package Servicios;

import java.util.Scanner;

public class Menu {
    public void iniciarMenu(Scanner sc){
        DuennoService duennoService=new DuennoService();
        MascotaService mascotaService=new MascotaService();
        boolean continuar=true;
        int option;
        do{
            System.out.println("0\tSalir\n1\tNuevo dueño\n2\tNueva Mascota\n3\tMostrar Dueños\n4\tBuscar Mascota");
            option=sc.nextInt();
            switch (option){
                case 0:
                    continuar=false;
                    break;
                case 1:
                    duennoService.crearDuenno(sc);
                    break;
                case 2:
                    mascotaService.crearMascota(sc);
                    break;
                case 3:
                    duennoService.mostrarDuennos();
                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la mascota");
                    System.out.println((mascotaService.buscarPorNombre(sc.nextLine()).toString()));
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }
        }while(continuar);
    }
}
