import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicios {

    public void cargarAnimal(ArrayList<Animal> animales, Scanner leer) {


        System.out.println("Ingrese que clase de animal desea cargar 1:Mamifero, 2:Reptil, 3:Ave");
        int opcion = leer.nextInt();
        leer.nextLine();
        char continuar;


        do {
            switch (opcion) {
                case 1:
                    animales.add(cargarMamifero(leer));

                    break;
                case 2:
                    animales.add(cargarReptil(leer));

                    break;
                case 3:
                    animales.add(cargarAve(leer));
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    break;

            }
            System.out.println("pulse S para continuar");
            continuar = leer.nextLine().charAt(0);

        } while (continuar == 's' || continuar == 'S');


    }

    public Mamifero cargarMamifero(Scanner sc) {
        Mamifero nuevoMamifero = new Mamifero();
        int opcion;
        boolean validos = false;

        System.out.println("ingrese el Nombre de su animal:");
        nuevoMamifero.setNombre(sc.nextLine());
        System.out.println("ingrese la especie de su animal:");
        nuevoMamifero.setEspecie(sc.nextLine());
        System.out.println("imgrese el estado de salud de su animal");
        nuevoMamifero.setSalud(sc.nextLine());
        System.out.println("ingrese el tipo de higiene de su animal");
        nuevoMamifero.setHigiene(sc.nextLine());

        do {
            System.out.println("ingrese el tipo de pelaje de su animal 1,calvo, 2 peludo");///suich
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    nuevoMamifero.setTipoPelaje(TipoPelaje.CALVO);
                    validos = true;

                    break;

                case 2:
                    nuevoMamifero.setTipoPelaje(TipoPelaje.PELUDO);
                    validos = true;

                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    nuevoMamifero.setTipoPelaje(TipoPelaje.CALVO);


                    break;

            }

        } while (!validos);


        return nuevoMamifero;

    }

    public Reptil cargarReptil(Scanner sc) {
        Reptil reptil = new Reptil();
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
        option = sc.nextInt();
        sc.nextLine();
        switch (option) {
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
        option = sc.nextInt();
        sc.nextLine();

        switch (option) {
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

    public Ave cargarAve(Scanner sc) {
        Ave nuevaAve = new Ave();
        int opcion, opcion2;
        char continuar1, continuar2;
        boolean valido1 = false, valido2 = false;


        System.out.println("ingrese el Nombre de su animal:");
        nuevaAve.setNombre(sc.nextLine());

        System.out.println("ingrese la especie de su animal:");
        nuevaAve.setEspecie(sc.nextLine());

        System.out.println("imgrese el estado de salud de su animal");

        nuevaAve.setSalud(sc.nextLine());

        System.out.println("ingrese el tipo de higiene de su animal");
        nuevaAve.setHigiene(sc.nextLine());


        do {
            System.out.println("ingrese el estado de el plumaje 1 Malo,2 intermedio,3 bueno ");///suich
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    nuevaAve.setEstadoPlumaje(EstadoPlumaje.MALO);
                    valido1 = true;

                    break;

                case 2:
                    nuevaAve.setEstadoPlumaje(EstadoPlumaje.INTERMEDIO);
                    valido1 = true;

                    break;

                case 3:
                    nuevaAve.setEstadoPlumaje(EstadoPlumaje.BUENO);
                    valido1 = true;

                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    nuevaAve.setEstadoPlumaje(EstadoPlumaje.INTERMEDIO);
                    break;
            }

        } while (!valido1);

        do {

            System.out.println("ingrese su capacidad de vuelo 1 si, 2 no");///boolean
            opcion2 = sc.nextInt();
            sc.nextLine();
            switch (opcion2) {
                case 1:
                    nuevaAve.setCapacidadDeVuelo(true);
                    valido2 = true;

                    break;

                case 2:
                    nuevaAve.setCapacidadDeVuelo(false);
                    valido2 = true;


                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    nuevaAve.setCapacidadDeVuelo(false);

                    break;
            }
        } while (!valido2);


        return nuevaAve;
    }


    public void cargarCuidador(Scanner leer, ArrayList<Animal> animales, ArrayList<Cuidador> lista) {
        Cuidador nuevo = new Cuidador();
        System.out.println("Ingrese su salario:");
        nuevo.setSalario(leer.nextDouble());
        System.out.println("ingrese su dni");
        nuevo.setDni(leer.nextInt());
        leer.nextLine();
        System.out.println("ingrese su Nombre");
        nuevo.setNombre((leer.nextLine()));
        for (Animal a : animales) {
            System.out.println(a);
        }
        System.out.println("Ingrese el id del animal para asignar al cuidador");
        nuevo.setAnimal(buscarAnimal(animales, leer.nextInt()));

        lista.add(nuevo);

    }

    /*
        public void cargarCuidador(ArrayList<Cuidador> lista, Cuidador nuevo) {

            if (lista.contains(nuevo)) {
                System.out.println("Ya existe el cuidador");
            } else {
                lista.add(nuevo);
            }

        }
    */
    public Animal buscarAnimal(ArrayList<Animal> animales, int id) {
        for (Animal a : animales) {
            if (a.getId() == id)
                return a;
        }
        System.out.println("No existe el animal");
        return null;
    }

    public Cuidador buscarCuidador(ArrayList<Cuidador> cuidadores, int id) {
        for (Cuidador a : cuidadores) {
            if (a.getLegajo() == id)
                return a;
        }
        System.out.println("No existe el animal");
        return null;
    }


}
