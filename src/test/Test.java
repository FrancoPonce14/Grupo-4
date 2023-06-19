package test;


import model.Coche;
import model.Puente;

public class Test {

	public static void main(String[] args) {
		
		Puente puente = new Puente();

		Thread Sur = new Thread(new Coche(puente, "coche sur"));
		Thread Norte = new Thread(new Coche(puente, "coche norte"));

		Sur.start();
		Norte.start();
	}
}
