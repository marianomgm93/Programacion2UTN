package Ejercicio1;
/*
"vehiculo": {
        "modelo": "RB21",
        "motor": "Honda RBPTH001",
        "potencia_hp": 1050,
        "peso_kg": 798,
        "combustible": "ExxonMobil E10",
        "neumaticos": "Pirelli",
        "transmision": "8 velocidades semiautomática"
      },
 */
public class Vehiculo {
    private String modelo;
    private String motor;
    private int potencia_hp;
    private int peso_kg;
    private String combustible;
    private String neumaticos;
    private String transmision;

    /**
     *
     * @param modelo
     * @param motor
     * @param potencia_hp
     * @param peso_kg
     * @param combustible
     * @param neumaticos
     * @param transmision
     */
    public Vehiculo(String modelo, String motor, int potencia_hp, int peso_kg, String combustible, String neumaticos, String transmision) {
        this.modelo = modelo;
        this.motor = motor;
        this.potencia_hp = potencia_hp;
        this.peso_kg = peso_kg;
        this.combustible = combustible;
        this.neumaticos = neumaticos;
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehiculo{");
        sb.append("modelo='").append(modelo).append('\'');
        sb.append(", motor='").append(motor).append('\'');
        sb.append(", potencia_hp=").append(potencia_hp);
        sb.append(", peso_kg=").append(peso_kg);
        sb.append(", combustible='").append(combustible).append('\'');
        sb.append(", neumaticos='").append(neumaticos).append('\'');
        sb.append(", transmision='").append(transmision).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
