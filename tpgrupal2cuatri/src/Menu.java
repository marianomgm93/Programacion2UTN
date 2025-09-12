import model.Animal;
import model.Cuidador;
import model.Reptil;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void launchMenu(Scanner sc, ArrayList<Animal> animales, ArrayList<Cuidador> personas){
        int option;
        Servicios service = new Servicios();
       // Servicios service=new Servicio;
        boolean continuar=true;
        do{
            System.out.println("0\tSalir\n1\tNuevo cuidador\n2\tNuevo animal\n3\tmostrar animales\n4\tMostrar cuidadores");
            option=sc.nextInt();
            sc.nextLine();
            switch (option){
                case 0:
                    continuar=false;
                    break;
                case 1:
                    service.cargarCuidador(sc,animales,personas);
                    break;
                case 2:
                     service.cargarAnimal(animales,sc);
                    break;
                case 3:
                    for(Animal a:animales){
                        System.out.println(a);
                    }
                    break;
                case 4:
                    for(Cuidador c: personas){
                        System.out.println(c);
                    }
                    break;
                case 5:

                    break;
            }
        }while(continuar);
    }

    public Reptil nuevoReptil(Scanner sc){
        Reptil reptil=new Reptil();
        int option;
        System.out.println("Ingrese el estado de salud del animal");
        reptil.setSalud(sc.nextLine());
        System.out.println("Ingrese el nombre del animal");
        reptil.setNombre(sc.nextLine());
        System.out.println("Ingrese especie del animal");
        reptil.setEspecie(sc.nextLine());
        System.out.println("Ingrese higiene");
        reptil.setHigiene(sc.nextLine());
        System.out.println("es venenoso?\n1\tSi\n2\tNo");
        option=sc.nextInt();
        sc.nextLine();
        switch (option){
            case 1:
                reptil.setEsVenenoso(true);
                break;
            case 2:
                reptil.setEsVenenoso(false);
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        System.out.println("Tiene patas?\n1\tSi\n2\tNo");
        option=sc.nextInt();
        sc.nextLine();

        switch (option){
            case 1:
                reptil.setTienePatas(true);
                break;
            case 2:
                reptil.setTienePatas(false);
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        return reptil;
    }

}
