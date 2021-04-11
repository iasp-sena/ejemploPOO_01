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
public class Avion implements Vehiculo{

    @Override
    public void andarAdelante(int distanciaEnKilomentros) {
        System.out.println("Avión volando " + distanciaEnKilomentros + " kms");
    }
    
}
