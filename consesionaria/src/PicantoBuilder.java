

import creacional.Auto;
import creacional.Almacenamiento; 

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

