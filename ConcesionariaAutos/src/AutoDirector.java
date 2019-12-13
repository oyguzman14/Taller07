package Concesionaria;

import Concesionaria.creacional.Auto;

public class AutoDirector {
	
	protected AutoBuilder builder;
	
	public AutoDirector(AutoBuilder builder) {
		this.builder = builder;
	}
	
	public void construirAuto() {
		builder.definirAuto();
		builder.definirAlmacenamiento();
		builder.definirCarroceria();
	}
	
	public Auto getAuto() {
		return builder.getAuto();
	}

}


