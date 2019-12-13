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

public class SailBuilder extends AutoBuilder{
	
	@Override
	public void definirAuto() {
            a = new Auto();
	    	a.setMarca("Chevrolet");
            a.setModelo("Sail");
            a.setMotor(1.4);
            
	}

	@Override
	public void definirAlmacenamiento() {
            a.setAlmacenamiento(new Almacenamiento(1000,"lb"));
		
	}

	@Override
	public void definirCarroceria() {
            a.setCarroceria("1J23KO23");
		
	}

	

}

