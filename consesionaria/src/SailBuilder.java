
import creacional.Auto;
import creacional.Almacenamiento; 

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

