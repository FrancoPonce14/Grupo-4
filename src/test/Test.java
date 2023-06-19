package test;


import model.Coche;
import model.Puente;

public class Test {

	public static void main(String[] args) {
		
		Puente puente = new Puente();
		/*Thread Sur = new Thread(new Runnable() // CREAMOS EL THREAD SUR
		{
			@SuppressWarnings("deprecation")
			@Override
			public void run()// METODO DONDE SE IMPLEMENTA RUNNEABLE PARA QUE PUEDA SER EJECUTADO COMO UN HILO
			{
				while (true) {
					Coche coche = new Coche(puente); // CREAMOS UN COCHE Y LE MANDAMOS EL PUENTE COMO PARAMETRO
					Thread hilo = new Thread(coche); // EL OBJETO VEHICULO LO CONVERTIMOS EN UN HILO
					coche.setNombre("Coche Sur: " + hilo.getId()); // COMO EL VEHICULO ES UN HILO, PODEMOS TRAER SU ID
					hilo.start(); // INICIAMOS EL HILO
					try {
						Thread.sleep(2000);// LE DAMOS UN TIEMPO PARA QUE SE MUESTRE MEJOR POR CONSOLA
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				}
			}
		});
		Thread Norte = new Thread(new Runnable() // CREAMOS EL THREAD NORTE
		{
			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				while (true) {
					Coche coche = new Coche(puente);
					Thread hilo = new Thread(coche);
					coche.setNombre("Coche Norte:  " + hilo.getId());
					hilo.start();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException  e) {
						System.out.println(e);
					}
				}
			}
		});*/
		Thread Sur = new Thread(new Coche(puente, "coche sur"));
		Thread Norte = new Thread(new Coche(puente, "coche norte"));

		// HACEMOS QUE AMBOS HILOS EMPIEZEN A EJECUTARSE CONCURRENTEMENTE
		Sur.start();
		Norte.start();
	}
}
