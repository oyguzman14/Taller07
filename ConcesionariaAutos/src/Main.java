
public class Main {

	public static void main(String[] args) {
		//Sail
		System.out.println("Auto 1: ");
		VehiculoDirector sail= new VehiculoDirector(new SailBuilder());
		sail.VehiculoBuider();
		
		Auto a1=picanto.getAuto();
		System.out.println(v1+"\n");
		//picanto
		VehiculoDirector picanto= new VehiculoDirector(new PicantoBuilder());
		picanto.VehiculoBuider();
		Auto a2=picanto.getAuto();
		System.out.println(v2+"\n");
		System.out.println("Auto 1: ");
		// Sparkt	
		VehiculoDirector spart= new VehiculoDirector(new SparktBuilder());
		spart.getAuto();
		Auto a3=dmax.getVehiculo();
		System.out.println(v3+"\n");
		System.out.println("Auto 1: ");
	}
	
}
