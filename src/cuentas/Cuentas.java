package cuentas;

import movimientos.Movimientos;
import java.util.ArrayList;

public class Cuentas {

    private String titular;
    private float saldo;
    private int numero;
    protected ArrayList<Movimientos> movimientos = new ArrayList<>();

    //Contructor con sólo titular y número.
    public Cuentas(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    //Contructor con titular, número y saldo.
    public Cuentas(String titular, int numero, float saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    //Métodos Getters y Setters

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Movimientos> getMovimientos() {
        return movimientos;
    }

    //Método para añadir los movimientos al ArrayList movimientos.
    public void agregarMovimiento(Movimientos movimiento) {
        this.movimientos.add(movimiento);
    }

    //Método toString que muestra los atributos de la clase en un String con formato.
    public String toString() {
        return "El titular de la cuenta es " + this.titular + " el saldo es de " + this.saldo + " y el número de cuenta es " + this.numero;
    }

    //Método para obtener todos los movimientos realizados.
    public void obtenerMovimientos() {
        if (this.movimientos.size() == 0) {
            System.out.println(" ");
            System.out.println("NO HAY MOVIMIENTOS EN LA CUENTA NÚMERO " + this.numero);
        } else {
            System.out.println(" ");
            System.out.println("TODOS LOS MOVIMIENTOS DE LA CUENTA NÚMERO " + this.numero + " SON LOS SIGUIENTES: ");
            int enumerar = 1;
            for (int i = 0; i < this.movimientos.size(); i++) {
                System.out.println(enumerar + ". " + this.movimientos.get(i).toString());
                enumerar++;
            }
        }
    }

    //Método para obtener los últimos 10 movimientos.
    public void obtener10Movimientos() {
        int enumerar = 1;
        System.out.println(" ");
        System.out.println("LOS ÚLTIMOS 10 MOVIMIENTOS DE LA CUENTA NÚMERO " + this.numero + " SON LOS SIGUIENTES: ");
        int resta = (this.movimientos.size()) - 10;
        for (int i = resta; i < this.movimientos.size(); i++) {
            System.out.println(enumerar + ". " + this.movimientos.get(i).toString());
            enumerar++;
        }
    }
}
