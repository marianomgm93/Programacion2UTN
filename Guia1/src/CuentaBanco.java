public class CuentaBanco {
    static int id;
    private  String nombre;
    private  double balance;



    public CuentaBanco()
    {
        id++;
    }

    public CuentaBanco(String nombre, double balance) {
        id++;
        this.nombre = nombre;
        this.balance = balance;
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

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        CuentaBanco.id = id;
    }




}

