public class EstadoAcademico {
    /**
     * Precisamos guardar el EstadoAcademico del alumno, que contendrá la nota
     * del 1er parcial, del 2do parcial y del TP final. Además de esto también
     * precisamos que la clase pueda devolver el promedio de las notas, si aprueba
     * o no(promedio mayor a 6), y por último si promociona o no(promedio mayor a
     * 8).
     */
    private double primeranota;
    private double segundanota;
    private double notatpfinal;

    public double getPrimeranota() {
        return primeranota;
    }

    public void setPrimeranota(double primeranota) {
        this.primeranota = primeranota;
    }

    public double getSegundanota() {
        return segundanota;
    }

    public void setSegundanota(double segundanota) {
        this.segundanota = segundanota;
    }

    public double getNotatpfinal() {
        return notatpfinal;
    }

    public void setNotatpfinal(double notatpfinal) {
        this.notatpfinal = notatpfinal;
    }

    public EstadoAcademico() {

    }

    public EstadoAcademico(double notatpfinal, double segundanota, double primeranota) {
        this.notatpfinal = notatpfinal;
        this.segundanota = segundanota;
        this.primeranota = primeranota;
    }


    public double promedio() {
        return (this.primeranota + this.segundanota + this.notatpfinal) / 3;

    }

    public boolean aprobado() {
        boolean aprobo;

        if (promedio() >= 6) {
            System.out.println("Aprobaste papa!");
            aprobo = true;
        } else {
            System.out.println("Mal ahi, recursaste");
            aprobo = false;
        }

        return aprobo;
    }

    public boolean promocion() {
        boolean promociono;

        if (promedio() >= 8) {
            System.out.println("Bien ahi loquito,promocionaste");
            promociono = true;
        } else {
            System.out.println("no llegaste pa a promocionar");
            promociono = false;
        }


        return promociono;
    }



}
