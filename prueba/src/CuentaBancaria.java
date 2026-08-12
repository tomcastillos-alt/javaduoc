public class CuentaBancaria {
    String identificacion;
    String nombre;
    String password;
    String tipoCuenta;
    int balance;

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public int getBalance() {
        return balance;
    }

    public CuentaBancaria(String identificacion, String password, String nombre, String tipoCuenta, int balance) {
        this.identificacion = identificacion;
        this.password = password;
        this.nombre = nombre;
        this.tipoCuenta = tipoCuenta;
        this.balance = balance;
    }
}
