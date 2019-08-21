package cuentas;

public class CuentaVista extends Cuentas {

    public CuentaVista(String titular, int numero) {
        super(titular, numero);
        setTipoCuenta("Vista");
    }

    public CuentaVista(String titular, int numero, float saldo) {
        super(titular, numero, saldo);
        setTipoCuenta("Vista");
    }

    @Override
    public String toString() {
        return "El titular de la cuenta es " + getTitular() + " el saldo es de " + getSaldo() + " y el número de cuenta es " + getNumero();
    }
}
