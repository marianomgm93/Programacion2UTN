package Clases;

import Enums.TipoAuto;
import Interfaces.ITrabarPartes;

import java.util.Objects;

public class Auto extends Vehiculo implements ITrabarPartes {
    private TipoAuto tipoAuto;
    private boolean puertaTrabada;
    private boolean baulTrabado;
    private boolean ventanaTrabada;

    public Auto() {
        this.puertaTrabada=true;
        this.baulTrabado=true;
        this.ventanaTrabada=true;
    }

    public Auto(String marca, int modelo, String patente, TipoAuto tipoAuto) {
        super(marca, modelo, patente);
        this.puertaTrabada=true;
        this.baulTrabado=true;
        this.ventanaTrabada=true;
        this.tipoAuto = tipoAuto;
    }

    public TipoAuto getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(TipoAuto tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto auto = (Auto) o;
        return tipoAuto == auto.tipoAuto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoAuto);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Auto{");
        sb.append(super.toString());
        sb.append("tipoAuto=").append(tipoAuto);
        sb.append(", puertaTrabada=").append(puertaTrabada);
        sb.append(", baulTrabado=").append(baulTrabado);
        sb.append(", ventanaTrabada=").append(ventanaTrabada);
        sb.append('}');
        return sb.toString();
    }

    /**
     * 0=Puertas
     * 1=Baul
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
                this.baulTrabado=!baulTrabado;
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
