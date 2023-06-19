package model;

import java.util.Random;

public class Coche implements Runnable{
	
	private String nombre;
	private Puente puente;
	private int id;
	
	public Coche(Puente puente, String nombre) {
		this.puente = puente;
		this.nombre = nombre;
		this.id = generarID();
	} 
    private int generarID() {
        Random random = new Random();
        return random.nextInt(Integer.MAX_VALUE);
    }
	
	public void run() { //DEFINIMOS EL METODO RUN PARA UTILIZAR EN LA INTERFAZ RUNNEABLE
		while(true) {
			puente.Cruzar(this);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
