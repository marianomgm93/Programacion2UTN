package ejercicio5;

import java.util.ArrayList;

/**
 * 5. Vamos adiseñar un programa que nos permita gestionar el personal que
 *  concurre a una universidad. Para no hacerlo muy extenso vamos a
 *  limitarnos a estudiantes y miembros de sta que a diferencia de los
 *  estudiantes, estos perciben una remuneración. Ambos tipos comparten la
 *  característica de Persona que posee los atributos de dni, nombre, apellido,
 *  email y dirección.
 *  Por otro lado tenemos al Estudiante que posee las características de
 *  Persona y las de un estudiante, que en este caso son, año de ingreso,
 *  cuota mensual y carrera. Y finalmente tenemos al miembro de Sta que
 *  también es una Persona pero con características propias de alguien que
 *  trabaja para una institución, por ejemplo salario y turno, este puede ser
 *  mañana onoche.
 *  Diagramar el UML identificando superclase y subclases, crear los
 *  constructores necesarios, los getters y setters, y los métodos de ayuda que
 *  consideres necesarios. Luego, en el main:
 *  ● Inicializar 4 estudiantes diferentes.
 *  ● Inicializar 4 miembros de sta con características diferentes.
 *  ● Crearunarray que permita almacenar juntos los tipos
 *  anteriores y almacenar las 8 instancias creadas anteriormente.
 *  ● Investigar el uso de la palabra reservada instanceof.
 *  ● Recorrer el array y mostrar por pantalla la cantidad de
 *  estudiantes y la cantidad de miembros de sta .
 *  ● Recorrer el array y sumar el total de ingresos que percibe la
 *  institución por parte de la cuota de estudiantes
 */
public class ej5 {
    public static void main(String[] args) {
        ArrayList<Persona> facultad = new ArrayList<>();
        // Estudiantes
        Estudiante e1 = new Estudiante(12345678L, "Lucía", "Gómez", "lucia.gomez@email.com", "Calle Falsa 123", 2023, 15000.0, "Ingeniería en Sistemas");
        Estudiante e2 = new Estudiante(23456789L, "Martín", "Pérez", "martin.perez@email.com", "Av. Siempreviva 742", 2022, 14000.0, "Licenciatura en Matemática");
        Estudiante e3 = new Estudiante(34567890L, "Sofía", "Rodríguez", "sofia.rod@email.com", "Diagonal Norte 456", 2024, 16000.0, "Ingeniería Electrónica");
        Estudiante e4 = new Estudiante(45678901L, "Tomás", "Fernández", "tomas.fernandez@email.com", "Ruta 2 km 50", 2021, 13000.0, "Tecnicatura en Programación");

        // Miembros
        Miembro m1 = new Miembro(56789012L, "Ana", "López", "ana.lopez@email.com", "Calle 8 Nº 100", 85000.0, Turno.MANNANA);
        Miembro m2 = new Miembro(67890123L, "Carlos", "Molina", "carlos.molina@email.com", "Av. Colón 300", 90000.0, Turno.TARDE);
        Miembro m3 = new Miembro(78901234L, "Valeria", "Suárez", "valeria.suarez@email.com", "Calle Mitre 200", 87000.0, Turno.NOCHE);
        Miembro m4 = new Miembro(89012345L, "Julián", "Ramírez", "julian.ramirez@email.com", "Calle Belgrano 150", 88000.0, Turno.MANNANA);
        facultad.add(e1);
        facultad.add(e2);
        facultad.add(e3);
        facultad.add(e4);
        facultad.add(m1);
        facultad.add(m2);
        facultad.add(m3);
        facultad.add(m4);
        int cantidadEstudiantes=0,cantidadMiembros=0;
        for(Persona p:facultad){
            if (p instanceof Estudiante) {
                cantidadEstudiantes++;
            } else {
                cantidadMiembros++;
            }
        }
        System.out.println("Cantidad de estudiantes: "+cantidadEstudiantes);
        System.out.println("Cantidad de miembros: "+cantidadMiembros);
        double ingresosTotal=0;
        for(Persona p:facultad) {
            if (p instanceof Estudiante)
                ingresosTotal=+((Estudiante) p).getCuotaMensual();
        }
        System.out.println("El ingreso total es de: "+ingresosTotal);
    }
}
