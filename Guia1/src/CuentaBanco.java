/**
 *  2. Modele el objeto que representa la cuenta de un banco, con identificador,
 *  nombre y balance. Considere los getters, setters y constructores necesarios.
 *  Luego, realizar los siguientes métodos:
 *  a. El método crédito que representa un depósito de dinero en la
 *  cuenta. Este método debe devolver el balance luego de la operación.
 *  b. El método débito que representa una sustracción de dinero de la
 *  cuenta. Este método debe devolver el balance luego de la operación. Si
 *  el dinero en la cuenta no es suficiente para cubrir la sustracción, se
 *  debe imprimir por pantalla un aviso sin permitir dicha sustracción.
 *  c. Un método que imprima por pantalla las características del objeto.
 */

public class CuentaBanco {
    static int totalCuentas;
    private int id;
    private  String nombre;
    private  double balance;



    public CuentaBanco()
    {
        this.id=totalCuentas;
        totalCuentas++;
    }

    public CuentaBanco(String nombre, double balance) {
        this.id=totalCuentas;
        this.nombre = nombre;
        this.balance = balance;
        totalCuentas++;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * a. El método crédito que representa un depósito de dinero en la
     * cuenta. Este método debe devolver el balance luego de la operación.
     * @param cantidad double
     * @return
     */
    public double credito(double cantidad){
        this.balance+=cantidad;
        return this.balance;
    }
    /**
     * b. El método débito que representa una sustracción de dinero de la
     * cuenta. Este método debe devolver el balance luego de la operación. Si
     * el dinero en la cuenta no es suficiente para cubrir la sustracción, se
     * debe imprimir por pantalla un aviso sin permitir dicha sustracción.
     */
    public double debito(double cantidad){
        double resultado;
        if(cantidad<this.balance) {
            this.balance -= cantidad;
            resultado=this.balance;
        }else {
            System.out.println("Saldo insuficiente para realizar la operación");
            resultado = -1;
        }
        return resultado;
    }
    /**
     * c. Un método que imprima por pantalla las características del objeto.
     */
    public void mostrarCuenta(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "CuentaBanco{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }
}

