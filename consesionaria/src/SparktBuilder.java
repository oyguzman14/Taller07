
import creacional.Auto;
import creacional.Almacenamiento; 

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

