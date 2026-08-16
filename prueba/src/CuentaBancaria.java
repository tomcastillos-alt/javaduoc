public class CuentaBancaria {
    String identificacion;
    String nombre;
    String password;
    String tipoCuenta;
    int balance;
    int montoRetiro;

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public int getBalance() {
        return balance;
    }

    public CuentaBancaria(String identificacion, String nombre, String password, String tipoCuenta, int balance, int montoRetiro) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.password = password;
        this.tipoCuenta = tipoCuenta;
        this.balance = balance;
        this.montoRetiro = montoRetiro;
    }
}

// Cosas que no coloqué:
// id de sesión: preferí llamar identificación al atributo encargado de manejar la id de usuario
// fuera de eso, no me imagino qué otros atributos podría llevar una cuenta bancaria. Quizás podrían sumarse algunos que hagan referencia a distintos créditos, tipos de tarjeta, o divisas.
