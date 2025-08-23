import Servicios.Menu;

import java.util.Scanner;

/**
 * Tienda de Mascotas Virtual
 * Queremos gestionar una tienda de mascotas donde se puedan almacenar varias
 * mascotas, mostrar su información y realizar búsquedas según determinados
 * criterios. Para esto, crear una clase Dueño que tenga como atributos un nombre y
 * un teléfono, y una clase Mascota que tenga como atributos un nombre, una especie
 * (por ejemplo perro, gato, loro), una edad y un dueño (de tipo Dueño). A su vez, se
 * requiere un método que permita determinar si una mascota es adulta o no
 * considerando si su edad es mayor o igual a un valor determinado. Considere crear
 * también los métodos que faciliten imprimir por pantalla las características de los
 * objetos.
 * En el main, crear un arreglo de Mascota con capacidad para diez elementos y
 * cargarlo completo con sus respectivos dueños.
 * El programa debe permitir:
 * a. Mostrar todas las mascotas con su respectiva información.
 * b. Buscar y mostrar mascotas por tipo (ej: “Perro”, “Gato”).
 * c. Buscar y mostrar mascotas por nombre del dueño.
 * d. Mostrar las mascotas cuyos nombres comiencen con una letra determinada,
 * sin distinguir entre mayúsculas y minúsculas.
 * e. Mostrar todas las mascotas cuya edad sea mayor o igual a un valor indicado.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Menu menu= new Menu();
        menu.iniciarMenu(sc);


    }
}