package model;

import java.util.concurrent.Semaphore;

public class Puente {
	
	private Semaphore semaforo;
	
	public Puente() {
		semaforo = new Semaphore(1); 
	}
	
	public void Cruzar(Coche auto, int id) {
		try {
			System.out.println(auto.getNombre()+" "+id+" <--- Esta esperando para cruzar el puente! ");
			semaforo.acquire(); // DAMOS PERMISO PARA QUE PASE EL COCHE
			System.out.println(auto.getNombre()+" "+id+" <--- Esta Cruzando el puente");
			Thread.sleep(2000);
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println(auto.getNombre()+" "+id+" <--- Termino de cruzar el puente");
			//Y REINICIAMOS EL SEMAFORO PARA QUE PUEDA PASAR EL SIGUIENTE AUTO
			semaforo.release();
		}
	}
	

}
