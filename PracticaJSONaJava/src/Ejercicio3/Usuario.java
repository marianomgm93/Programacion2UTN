package Ejercicio3;

import Ejercicio2.Direccion;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private boolean premium;
    private Direccion direccion;
    private MetodoPago metodo_pago;
}
/*
"usuario": {
    "id": 1205,
    "nombre": "María López",
    "email": "mlopez@example.com",
    "premium": true,
    "direccion": {
      "calle": "Av. Corrientes 3550",
      "ciudad": "Buenos Aires",
      "codigo_postal": "C1193"
    },
    "metodo_pago": {
      "tipo": "Tarjeta de crédito",
      "ultimos_digitos": "4421"
    }
  },
 */