package edu.sena.adsi.web.pruebas.clasepoo;

import edu.sena.adsi.web.pruebas.clasepoo.poo.Automovil;
import edu.sena.adsi.web.pruebas.clasepoo.poo.Avion;
import edu.sena.adsi.web.pruebas.clasepoo.poo.Camioneta;
import edu.sena.adsi.web.pruebas.clasepoo.poo.Carro;
import edu.sena.adsi.web.pruebas.clasepoo.poo.Vehiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ismael
 */
public class Main {
    public static void main(String[] args) {
        Avion av1 = new Avion();
        Automovil a1 = new Automovil();
        a1.setPlaca("SDF234");
        a1.setCantidadPasajeros(2);
        a1.setTipoCombustible("GASOLINA");
        Automovil.setNumeroRuedas(3);
        Automovil a2 = new Automovil();
        a2.setPlaca("ABC123");
        a2.setCantidadPasajeros(4);
        a2.setTipoCombustible("DISEL");
        Automovil.setNumeroRuedas(6);
        
        Camioneta c1 = new Camioneta();
        c1.setPlaca("ABC123");
        c1.setCantidadPasajeros(4);
        c1.setTipoCombustible("DISEL");
        Camioneta.setNumeroRuedas(4);
        
        imprimir(a1);
        imprimir(a2);
        imprimir(c1);
        
        desplazar(a1, 2500);
        desplazar(c1, 2500);
        desplazar(av1, 2500);
    }
    
    public static void imprimir(Carro c){
        System.out.println("PLACA: " + c.getPlaca());
        System.out.println("CANT. PASAJEROS: " + c.getCantidadPasajeros());
        System.out.println("TIPO COMB.: " + c.getTipoCombustible());
        System.out.println("RUEDAS: " + c.getNumeroRuedas());
        c.subirCuesta(25);
        System.out.println("=========================================");
    }

    private static void desplazar(Vehiculo v, int d) {
        v.andarAdelante(d);
    }
}
