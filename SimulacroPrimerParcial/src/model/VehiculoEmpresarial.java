package model;

public class VehiculoEmpresarial extends Vehiculo{
    private int agno;
    private int cantidadButacas;

    public VehiculoEmpresarial() {
    }

    public VehiculoEmpresarial(int modelo, Marca marca, String patente, int velocidadRecomendada, int kilometraje, int agno, int cantidadButacas) {
        super(modelo, marca, patente, velocidadRecomendada, kilometraje);
        this.agno = agno;
        this.cantidadButacas = cantidadButacas;
    }

    public int getAgno() {
        return agno;
    }

    public void setAgno(int agno) {
        this.agno = agno;
    }

    public int getCantidadButacas() {
        return cantidadButacas;
    }

    public void setCantidadButacas(int cantidadButacas) {
        this.cantidadButacas = cantidadButacas;
    }

}
