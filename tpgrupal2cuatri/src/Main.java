import model.Animal;
import model.Cuidador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animales = new ArrayList<>();
        ArrayList<Cuidador> cuidadores = new ArrayList<>();
        menu.launchMenu(sc, animales, cuidadores);

    }
}