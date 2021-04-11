/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.adsi.web.pruebas.clasepoo.poo;

/**
 *
 * @author Ismael
 */
public abstract class Carro {
    
    public static final String CONSTANTE_AUTO = "valor";
    private static int numeroRuedas;

    protected String placa;
    protected int cantidadPasajeros;
    protected String tipoCombustible;
    
    public abstract void subirCuesta(double gradoInclinacion);
    
    public static int getNumeroRuedas() {
        return numeroRuedas;
    }

    public static void setNumeroRuedas(int numeroRuedas) {
        Carro.numeroRuedas = numeroRuedas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public void andarAdelante(int distanciaEnKilomentros) {
        System.out.println("Soy un carro y ando " + distanciaEnKilomentros + " kms");
    }
}
