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
public class Automovil extends Carro implements Vehiculo{

    @Override
    public void subirCuesta(double gradoInclinacion) {
        if(gradoInclinacion < 10){
            System.out.println("Autormovil subiendo cuesta");
        } else{
            System.out.println("Automovil no puede subir");
        }
    }
    
}
