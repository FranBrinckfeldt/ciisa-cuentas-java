package cuentas;

public class CuentaVista extends Cuentas {

    private String tipoCuenta = "Vista";

    public CuentaVista(String titular, int numero) {
        super(titular, numero);
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaVista(String titular, int numero, float saldo) {
        super(titular, numero, saldo);
        this.tipoCuenta = tipoCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "El titular de la cuenta es " + getTitular() + " el saldo es de " + getSaldo() + " y el número de cuenta es " + getNumero();
    }
}
