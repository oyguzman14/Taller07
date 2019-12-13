
public class Main {

	public static void main(String[] args) {
		//Sail
		System.out.println("Auto 1: ");
		VehiculoDirector sail= new VehiculoDirector(new SailBuilder());
		sail.VehiculoBuider();
		Auto v1=picanto.getAuto();
		System.out.println(v1+"\n");
		//picanto
		VehiculoDirector picanto= new VehiculoDirector(new PicantoBuilder());
		picanto.VehiculoBuider();
		Auto v2=picanto.getAuto();
		System.out.println(v2+"\n");
		System.out.println("Auto 1: ");
		// Sparkt	
		VehiculoDirector dmax= new VehiculoDirector(new ChevroletDmax());
		dmax.getAuto();
		Auto v3=dmax.getVehiculo();
		System.out.println(v3+"\n");
		System.out.println("Auto 1: ");
	}
	
}
