/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MIPC
 */
package Concesionaria;

import Concesionaria.creacional.Auto;
import Concesionaria.creacional.Almacenamiento; 

public class SparktBuilder extends AutoBuilder{
	
	@Override
	public void definirAuto() {
            a = new Auto();
	    	a.setMarca("Chevrolet");
            a.setModelo("Sparkt");
            a.setMotor(1.2);
            
	}

	@Override
	public void definirAlmacenamiento() {
            a.setAlmacenamiento(new Almacenamiento(500,"lb"));
		
	}

	@Override
	public void definirCarroceria() {
            a.setCarroceria("JWE9EWF8");
		
	}

	

}

