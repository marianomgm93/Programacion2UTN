package Clases;

import Enums.TipoCamioneta;
import Interfaces.ITrabarPartes;

import java.util.Objects;

public class Camioneta extends Vehiculo implements ITrabarPartes {
    private TipoCamioneta tipoCamioneta;
    private boolean puertaTrabada;
    private boolean cajaTrabada;
    private boolean ventanaTrabada;

    public Camioneta() {
        this.puertaTrabada=true;
        this.cajaTrabada=true;
        this.ventanaTrabada=true;
    }

    public Camioneta(String marca, int modelo, String patente, TipoCamioneta tipoCamioneta) {
        super(marca, modelo, patente);
        this.puertaTrabada=true;
        this.cajaTrabada=true;
        this.ventanaTrabada=true;
        this.tipoCamioneta = tipoCamioneta;
    }

    public TipoCamioneta getTipoCamioneta() {
        return tipoCamioneta;
    }

    public void setTipoCamioneta(TipoCamioneta tipoCamioneta) {
        this.tipoCamioneta = tipoCamioneta;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Camioneta camioneta = (Camioneta) o;
        return tipoCamioneta == camioneta.tipoCamioneta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoCamioneta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Camioneta{");
        sb.append(super.toString());
        sb.append("tipoCamioneta=").append(tipoCamioneta);
        sb.append('}');
        return sb.toString();
    }
    /**
     * 0=Puertas
     * 1=Caja
     * 2=Ventanas
     * @param num
     */
    @Override
    public void trabarODestrabar(int num) {
        switch (num){
            case 0:
                this.puertaTrabada=!puertaTrabada;
                break;
            case 1:
                this.cajaTrabada=!cajaTrabada;
                break;
            case 2:
                this.ventanaTrabada=!ventanaTrabada;
                break;
            default:
                System.out.println("Error al intentar trabar o destrabar");
                break;
        }
    }
}
