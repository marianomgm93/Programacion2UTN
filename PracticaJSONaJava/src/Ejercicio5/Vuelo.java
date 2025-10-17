package Ejercicio5;

import java.util.ArrayList;

public class Vuelo {
    private String codigo;
    private String origen;
    private String destino;
    private String fecha;
    private double duracion_horas;
    private double precio_usd;
    private ArrayList<Pasajero> pasajero;
    private Piloto piloto;
    private Aerolinea aerolinea;
}
/*
{
      "codigo": "AR1234",
      "origen": "Buenos Aires",
      "destino": "Madrid",
      "fecha": "2025-11-01",
      "duracion_horas": 12.5,
      "precio_usd": 950.00,
      "pasajeros": [
        { "nombre": "Juan Pérez", "dni": "40333111", "asiento": "14A" },
        { "nombre": "Ana Ruiz", "dni": "39455990", "asiento": "14B" }
      ],
      "piloto": {
        "nombre": "Carlos Díaz",
        "licencia": "F-7789"
      },
      "aerolinea": {
        "nombre": "Aerolíneas Argentinas",
        "pais": "Argentina"
      }
    },
 */