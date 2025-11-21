package es.upm.dit.aled.lab5;

public class Doctor implements Runnable{

	
	AreaQueue area;
	String name;
	
	public Doctor(Area area, String name) {
		this.area = area;
		this.name = name;
	}
	
	@Override
	public void run() {
		Patient patient=null;
		try {
			while(true) {
				System.out.println("el doctor "+ name+ " va a atender al siguiente ");
				patient =area.obtenerSigPaciente();
			}
		}catch(InterruptedException e ) {
			Thread.currentThread().interrupt();
		}
	}
	
}
