package ejercicio3;

import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private String email;
    private int descuento;

    public Cliente() {
        this.id= UUID.randomUUID();
    }

    public Cliente(String nombre, String email, int descuento) {
        this.id=UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", descuento=" + descuento +
                '}';
    }
}
