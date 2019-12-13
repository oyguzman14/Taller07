 
import  creacional.Auto;

public abstract class AutoBuilder {

protected Auto a;
	
	public Auto getAuto(){
		return a;
	}
	
	public abstract void definirAuto();
	public abstract void definirAlmacenamiento();
	public abstract void definirCarroceria();
}
