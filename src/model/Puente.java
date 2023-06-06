package model;

import java.util.concurrent.Semaphore;

public class Puente {
	
	private Semaphore semaforo;
	
	public Puente() {
		semaforo = new Semaphore(1); //PARA QUE EL PUENTE SEA DE UN SOLO SENTIDO
	}
	
	public void Cruzar(Coche auto) {
		try {
			System.out.println(auto.getNombre()+" <--- Esta esperando para cruzar el puente! ");
			semaforo.acquire(); // DAMOS PERMISO PARA QUE PASE EL COCHE
			System.out.println(auto.getNombre()+" <--- Esta Cruzando el puente");
			Thread.sleep(2000);
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println(auto.getNombre()+" <--- Termino de cruzar el puente");
			//Y REINICIAMOS EL SEMAFORO PARA QUE PUEDA PASAR EL SIGUIENTE AUTO
			semaforo.release();
		}
	}
	

}
