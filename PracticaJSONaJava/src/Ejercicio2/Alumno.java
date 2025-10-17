package Ejercicio2;

import java.util.ArrayList;

/*
    {
      "nombre": "Lucía Fernández",
      "edad": 20,
      "matricula": "A1023",
      "carrera": "Ingeniería Informática",
      "semestre": 3,
      "promedio_general": 9.2,
      "materias": [
        { "nombre": "Programación I", "nota": 9.0, "creditos": 6 },
        { "nombre": "Matemática I", "nota": 8.5, "creditos": 8 },
        { "nombre": "Bases de Datos", "nota": 10, "creditos": 6 }
      ],
      "direccion": {
        "calle": "Av. San Martín 1245",
        "ciudad": "Rosario",
        "provincia": "Santa Fe"
      },
      "activo": true
    },
 */
public class Alumno {
    private String nombre;
    private int edad;
    private String matricula;
    private String carrera;
    private int semestre;
    private double promedio_general;
    private ArrayList<Materia> materias;
    private Direccion direccion;
    private boolean activo;

}
