package model;

public class Coche implements Runnable{
	
	private String nombre;
	private Puente puente;
	
	public Coche(Puente puente) {
		this.puente = puente;
	} 
	
	public void run() { //DEFINIMOS EL METODO RUN PARA UTILIZAR EN LA INTERFAZ RUNNEABLE
		puente.Cruzar(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Puente getPuente() {
		return puente;
	}

	public void setPuente(Puente puente) {
		this.puente = puente;
	}
	
}
