package Concesionaria.creacional;

public class Almacenamiento {

	private int capacidad;
	private String unidMedida;
	
	public Almacenamiento(int capacidad, String unidMedida) {
        this.capacidad = capacidad;
        this.unidMedida = unidMedida;
    }

    public Almacenamiento() {
    }
    
    

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUnidMedida() {
        return unidMedida;
    }

    public void setUnidMedida(String unidMedida) {
        this.unidMedida = unidMedida;
    }
	@Override
	public String toString() {
		
		return capacidad +" "+unidMedida;
	}
}

