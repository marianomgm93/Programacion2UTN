import java.util.ArrayList;

public class Paciente {
    private static int totalPacientes;
    private int id;
    private String animal;
    private String raza;
    private String fechaNacimiento;
    private String nombre;
    private Duenio duenio;
    private Historial<Vacuna> vacunas;
    private Historial<Visita> visitas;


}
/*
Realizaremos un sistema para que una veterinaria lleve un registro de sus pacientes.
Todas las mascotas tienen un id, animal, una raza, una fecha de nacimiento y un nombre.
Además tienen un dueño(que consta de un nombre, apellido, dni, email, y teléfono),
un historial clínico de vacunas, una vacuna tiene tipo y fecha.
Y por último tienen un historial clínico de visitas.
De cada visita se registra la fecha, el motivo (que puede ser: emergencia, chequeo o
particular) y una observación, que describe la visita.
 */
