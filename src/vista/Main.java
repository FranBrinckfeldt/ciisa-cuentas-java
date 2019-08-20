/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import cuentas.CuentaCorriente;
import movimientos.Movimientos;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Francisca
 */
public class Main {
    public static void main(String[] args) {

        //Instancias de clase CuentaCorriente.
        CuentaCorriente cuenta33 = new CuentaCorriente("Francisca", 33);
        CuentaCorriente cuenta67 = new CuentaCorriente("Melanie", 67, 80000);
        CuentaCorriente cuenta80 = new CuentaCorriente("Camila", 80, 100000);

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        //formatter.format(date)

        System.out.println(" ");
        System.out.println(":::::: MOVIMIENTOS ::::::");
        System.out.println(" ");

        Movimientos movimiento1 = new Movimientos(1, "01/08/2019", 200000, cuenta67);
        Movimientos movimiento2 = new Movimientos(1, "02/08/2019", 130000, cuenta80);
        Movimientos movimiento3 = new Movimientos(2, "03/08/2019", 300000, cuenta80);
        Movimientos movimiento4 = new Movimientos(1, "04/08/2019", 70000, cuenta67);
        Movimientos movimiento5 = new Movimientos(2, "05/08/2019", 100000, cuenta67);
        Movimientos movimiento6 = new Movimientos(1, "06/08/2019", 80000, cuenta67);
        Movimientos movimiento7 = new Movimientos(1, "07/08/2019", 900000, cuenta67);
        Movimientos movimiento8 = new Movimientos(2, "08/08/2019", 300000, cuenta67);
        Movimientos movimiento9 = new Movimientos(1, "09/08/2019", 100000, cuenta80);
        Movimientos movimiento10 = new Movimientos(1, "10/08/2019", 400000, cuenta80);
        Movimientos movimiento11 = new Movimientos(2, "11/08/2019", 60000, cuenta67);
        Movimientos movimiento12 = new Movimientos(1, "12/08/2019", 70000, cuenta67);
        Movimientos movimiento13 = new Movimientos(2, "13/08/2019", 100000, cuenta80);
        Movimientos movimiento14 = new Movimientos(1, "14/08/2019", 300000, cuenta80);
        Movimientos movimiento15 = new Movimientos(2, "15/08/2019", 200000, cuenta80);
        Movimientos movimiento16 = new Movimientos(2, "16/08/2019", 90000, cuenta67);
        Movimientos movimiento17 = new Movimientos(1, "16/08/2019", 88000, cuenta67);
        Movimientos movimiento18 = new Movimientos(1, "16/08/2019", 400000, cuenta80);
        Movimientos movimiento19 = new Movimientos(2, "16/08/2019", 350000, cuenta67);
        Movimientos movimiento20 = new Movimientos(1, "16/08/2019", 100000, cuenta80);

        System.out.println(" ");
        System.out.println(":::::: DATOS CUENTA " + cuenta33.getNumero() + " ::::::");

        System.out.println(" ");
        System.out.println(cuenta33.toString());
        System.out.println(" ");
        System.out.println("--- MOVIMIENTOS CUENTA " + cuenta33.getNumero() + " ---");
        if (cuenta33.getMovimientos().size() > 10) {
            cuenta33.obtener10Movimientos();
        } else {
            cuenta33.obtenerMovimientos();
        }

        System.out.println(" ");
        System.out.println(":::::: DATOS CUENTA " + cuenta67.getNumero() + " ::::::");

        System.out.println(" ");
        System.out.println(cuenta67.toString());
        System.out.println(" ");
        System.out.println("--- MOVIMIENTOS CUENTA " + cuenta67.getNumero() + " ---");
        if (cuenta67.getMovimientos().size() > 10) {
            cuenta67.obtener10Movimientos();
        } else {
            cuenta67.obtenerMovimientos();
        }

        System.out.println(" ");
        System.out.println(":::::: DATOS CUENTA " + cuenta80.getNumero() + " ::::::");

        System.out.println(" ");
        System.out.println(cuenta80.toString());
        System.out.println(" ");
        System.out.println("--- MOVIMIENTOS CUENTA " + cuenta80.getNumero() + " ---");
        if (cuenta80.getMovimientos().size() > 10) {
            cuenta80.obtener10Movimientos();
        } else {
            cuenta80.obtenerMovimientos();
        }
    }
}
