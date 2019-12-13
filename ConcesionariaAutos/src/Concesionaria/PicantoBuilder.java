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

public class PicantoBuilder extends AutoBuilder{
	
	@Override
	public void definirAuto() {
            a = new Auto();
	    	a.setMarca("Kia");
            a.setModelo("Picanto");
            a.setMotor(1.3);
            
	}

	@Override
	public void definirAlmacenamiento() {
            a.setAlmacenamiento(new Almacenamiento(800,"lb"));
		
	}

	@Override
	public void definirCarroceria() {
            a.setCarroceria("1J23EWF8");
		
	}

	

}

