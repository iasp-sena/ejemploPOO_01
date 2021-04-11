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
public class Camioneta extends Carro implements Vehiculo{

    private double pacidadCarga;

    public double getPacidadCarga() {
        return pacidadCarga;
    }

    public void setPacidadCarga(double pacidadCarga) {
        this.pacidadCarga = pacidadCarga;
    }

    @Override
    public void subirCuesta(double gradoInclinacion) {
        if(gradoInclinacion < 30){
            System.out.println("Camonioneta subiendo cuesta");
        } else{
            System.out.println("Camioneta no puede subir");
        }
    }

    
}
