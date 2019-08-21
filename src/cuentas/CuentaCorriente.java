/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author Francisca
 */
public class CuentaCorriente extends Cuentas {

    public CuentaCorriente(String titular, int numero) {
        super(titular, numero);
        setTipoCuenta("Corriente");
    }

    public CuentaCorriente(String titular, int numero, float saldo) {
        super(titular, numero, saldo);
        setTipoCuenta("Corriente");
    }

    @Override
    public String toString() {
        return "El titular de la cuenta es " + getTitular() + " el saldo es de " + getSaldo() + " y el número de cuenta es " + getNumero();
    }

}
