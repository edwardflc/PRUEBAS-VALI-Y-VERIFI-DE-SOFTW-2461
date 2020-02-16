/*
 * Controlador.java
 * version 1.3
 * 20/02/16
 * All rights reserved.
 * Copyright (c) 2020
 */
package modelo;

import javax.swing.JOptionPane;

/**
 * Esta clase permite realizar las operaciones.
 *
 * @version 1.3 20/02/16
 * @author Edward Felipe Leon Cotacio
 */
public class Modelo {

    private int n;
    private int x;
    private double sumatario;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getSumatario() {
        return sumatario;
    }

    public void setSumatario(double sumatario) {
        this.sumatario = sumatario;
    }

    /**
     * El metodo permitara realizar la funcion de la serie de taylor llamada al
     * metodo factorial.
     */
    public double operacion() {

        double radianes = Math.toRadians(x);
        int signo = 1;
        double termino;
        for (int i = 0; i < this.n; i++) {
            termino = signo / Factorial(2 * i + 1) * Math.pow(radianes, 2 * i + 1);
            this.sumatario += termino;
            signo *= -1;
        }
        return this.sumatario;
    }

    /**
     * El metodo permitara realizar la operacion de factorización.
     */
    public static double Factorial(int n) {

        double resultado = 1;

        for (int i = 1; i <= n; i++) {

            resultado *= i;

        }

        return (resultado);

    }
}
