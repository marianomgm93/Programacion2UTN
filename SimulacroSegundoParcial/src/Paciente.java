import org.json.JSONArray;
import org.json.JSONObject;

import java.time.LocalDateTime;
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

    public Paciente(int id, String animal, String raza, String fechaNacimiento, String nombre, Duenio duenio, Historial<Vacuna> vacunas, Historial<Visita> visitas) {
        this.id = totalPacientes++;
        this.animal = animal;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.duenio = duenio;
        this.vacunas = vacunas;
        this.visitas = visitas;
    }

    public Paciente(JSONObject o) {

        this.id = o.getInt("id");
        this.animal = o.getString("animal");
        this.raza = o.getString("raza");
        this.fechaNacimiento = o.getString("fechaNacimiento");
        this.nombre = o.getString("nombre");
        JSONObject jduenio=o.getJSONObject("duenio");
        this.duenio = new Duenio(jduenio);
        JSONObject jhistorial1=o.getJSONObject("vacunas");
        ArrayList<Vacuna> historialVacunas=new ArrayList<>();
        this.vacunas=new Historial<>(jhistorial1,historialVacunas);
        JSONArray jvacunas=jhistorial1.getJSONArray("entradas");
        for (int i = 0; i < jvacunas.length(); i++) {
            this.vacunas.agregarEntrada(new Vacuna(jvacunas.getJSONObject(i)));
        }
        JSONObject jhistorial2=o.getJSONObject("visitas");
        ArrayList<Visita> historialVisitas=new ArrayList<>();
        JSONArray jvisitas=jhistorial2.getJSONArray("entradas");
        this.visitas = new Historial<>(jhistorial2,historialVisitas);
        for (int i = 0; i < jvisitas.length(); i++) {
            this.visitas.agregarEntrada(new Visita(jvisitas.getJSONObject(i)));
        }
        totalPacientes++;
    }
    public JSONObject toJSON(){
        JSONObject o = new JSONObject();
        o.put("id",this.id);
        o.put("animal",this.animal);
        o.put("raza", this.raza);
        o.put("fechaNacimiento", this.fechaNacimiento);
        o.put("nombre", this.nombre);
        o.put("duenio", this.duenio.toJSON());
        o.put("vacunas", this.vacunas.toJSON());
        o.put("visitas", this.visitas.toJSON());
        return o;
    }
    public void agregarVisita(Visita visita){
        try {
            this.visitas.agregarEntrada(visita);
        }catch (VisitaRepetidaException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Paciente{");
        sb.append("id=").append(id);
        sb.append(", animal='").append(animal).append('\'');
        sb.append(", raza='").append(raza).append('\'');
        sb.append(", fechaNacimiento='").append(fechaNacimiento).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", duenio=").append(duenio);
        sb.append(", vacunas=").append(vacunas);
        sb.append(", visitas=").append(visitas);
        sb.append('}');
        return sb.toString();
    }
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
