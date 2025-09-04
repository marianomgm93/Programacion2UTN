import model.Contenido;
import model.Director;
import model.Pelicula;
import model.Serie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * Plataforma de streaming
 * Vamos a crear un sistema para gestionar el contenido de una plataforma de streaming. La plataforma,
 * contendrá series y películas.
 * Tanto las series como las películas, contendrán un título, un año de lanzamiento y un model.Director que a su vez
 * contiene un nombre, una nacionalidad.
 * Por otro lado, la Película contendrá los minutos que dura la película, los minutos de créditos que aparecen
 * en ella y una breve descripción. En cambio, la model.Serie incluirá la cantidad de episodios totales, la cantidad
 * de temporadas y si ya finalizó o no. No olviden implementar los métodos en que permitan mostrar toda la
 * información correspondiente.
 * Tanto en películas como en series se podrá mostrar su duración. En el caso de pelícu las será la cantidad
 * de minutos más la duración de los créditos y en series la cantidad de episodios por la cantidad de temporadas.
 * También se podrá conocer la categorización que contendrán. Si la película dura más de 120 minutos su categoría
 * será "Versión extendida". En caso contrario, "Versión estándar".
 * Si tiene una sola temporada y está finalizada, se considerará "Miniserie". De los contrario, solo “serie”.
 * Por último, vamos a crear en el main un arreglo que almacena tanto series como películas e implementaremos las
 * siguientes funcionalidades:
 * Mostrar una serie o película en base al título.
 * Mostrar solo aquellas que son miniseries.
 * Mostrar solo las películas que existan de un director en particular.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Contenido> arr=new ArrayList<>();
        Director nolan = new Director("Christopher Nolan", "Británico");
        Director miyazaki = new Director("Hayao Miyazaki", "Japonés");
        Director bigelow = new Director("Kathryn Bigelow", "Estadounidense");
        Director campanella = new Director("Juan José Campanella", "Argentino");
        Pelicula inception = new Pelicula(
                "Inception",
                2010,
                nolan,
                2.8*60,
                8,
                "Un ladrón que roba secretos corporativos a través de sueños debe realizar una inversión inversa."
        );
        arr.add(inception);
        Pelicula spiritedAway = new Pelicula(
                "Spirited Away",
                2001,
                miyazaki,
                2.1*60,
                6,
                "Una niña queda atrapada en un mundo mágico gobernado por dioses, brujas y espíritus."
        );
        arr.add(spiritedAway);

        Pelicula hurtLocker = new Pelicula(
                "The Hurt Locker",
                2008,
                bigelow,
                2.3*60,
                7,
                "Un equipo de desactivación de bombas en Irak enfrenta el peligro constante y la tensión psicológica."
        );
        arr.add(hurtLocker);
        Pelicula secretoOjos = new Pelicula(
                "El secreto de sus ojos",
                2009,
                campanella,
                2.2*60,
                5,
                "Un agente judicial investiga un caso de asesinato mientras revive una historia de amor no resuelta."
        );
        arr.add(secretoOjos);
        Serie dark = new Serie(
                "Dark",
                2017,
                nolan,
                26,
                3,
                true
        );
        arr.add(dark);
        Serie avatar = new Serie(
                "Avatar: La leyenda de Aang",
                2005,
                miyazaki,
                61,
                3,
                true
        );
        arr.add(avatar);
        Serie theWire = new Serie(
                "The Wire",
                2002,
                bigelow,
                60,
                5,
                true
        );
        arr.add(theWire);
        Serie entreCanibales = new Serie(
                "Entre Caníbales",
                2015,
                campanella,
                80,
                1,
                false
        );
        arr.add(entreCanibales);
        Menu menu=new Menu();
        Scanner sc=new Scanner(System.in);
        menu.inicio(arr,sc);

    }
}