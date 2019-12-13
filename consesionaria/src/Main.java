import creacional.Auto;
import creacional.Almacenamiento;
public class Main {

	public static void main(String[] args) {
		//Sail
		System.out.println("Auto 1: ");
		AutoDirector sail= new AutoDirector(new SailBuilder());
		sail.construirAuto();
		Auto a1=sail.getAuto();
		System.out.println(a1+"\n");
		//picanto
		
		System.out.println("Auto 2: ");
		AutoDirector picanto= new AutoDirector(new PicantoBuilder());
		picanto.construirAuto();
		Auto a2=picanto.getAuto();
		System.out.println(a2+"\n");
		
		// Sparkt	
		
		System.out.println("Auto 3: ");
		AutoDirector spart= new AutoDirector(new SparktBuilder());
		spart.construirAuto();
		Auto a3=spart.getAuto();
		System.out.println(a3+"\n");
		
	}
	
}
