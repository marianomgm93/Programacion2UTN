public class Main {
    public static void main(String[] args) {

    }
}
/*
Programación 2 2025
Realizaremos un sistema para que una veterinaria lleve un registro de sus pacientes.
Todas las mascotas tienen un id, animal, una raza, una fecha de nacimiento y un nombre.
Además tienen un dueño(que consta de un nombre, apellido, dni, email, y teléfono),
un historial clínico de vacunas, una vacuna tiene tipo y fecha.
Y por último tienen un historial clínico de visitas.
De cada visita se registra la fecha, el motivo (que puede ser: emergencia, chequeo o
particular) y una observación, que describe la visita.
Programar un sistema que permita:
● agregar mascota
● agregar vacuna a mascota
● agregar visita a historial de una mascota
● ver mascota (con dueño, vacunas e historial)
El historial debe ser una clase genérica, para aplicar tanto al de vacunas, como al de
visitas(creando una clase hija). Este historial además debe tener un n° de legajo y una
fecha de última actualización.
Cuando se intente guardar una visita que tenga el mismo día y motivo que otra del listado
de un historial, se debe lanzar una excepción “VisitaRepetidaException”.
Por último crear un método que guarde en un archivo con formato JSON la información de
la última ejecución del programa.
 */