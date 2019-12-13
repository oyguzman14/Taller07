package creacional;

public class Auto {
	
	private String marca;
	private String modelo;
	private double motor;
	private String carroceria;
	private Almacenamiento almacenamiento;

 
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public double getMotor() {
			return motor;
		}
		public void setMotor(double motor) {
			this.motor = motor;
		}
		public Almacenamiento getAlmacenamiento() {
			return almacenamiento;
		}
		public void setAlmacenamiento(Almacenamiento almacenamiento) {
			this.almacenamiento = almacenamiento;
		}
		public String getCarroceria() {
			return carroceria;
		}
		public void setCarroceria(String carroceria) {
			this.carroceria = carroceria;
		}
		@Override
		public String toString() {
			return "Marca: "+marca+"\n"
					+"Modelo: "+modelo+"\n"
					+"Motor: "+motor+"\n"
					+"Almacenamiento: "+almacenamiento+"\n"
					+"Carroceria: "+carroceria;
		}
		

	}



