package es.upm.dit.aled.lab5;

import java.util.LinkedList;
import java.util.Queue;

import es.upm.dit.aled.lab5.gui.Position2D;

/**
 * Extension of Area that maintains a strict queue of the Patients waiting to
 * enter in it. After a Patient exits, the first one in the queue will be
 * allowed to enter.
 * 
 * @author rgarciacarmona
 */
public class AreaQueue extends Area {
//	public AreaQueue (String name, int capacity, Position2D position) {
//		this.name = name;
//		this.capacity = capacity;
//		this.position=position;
//	}
//	2 métodos y 1 atributo
	//he puesto el horno a y 10
	
	public AreaQueue(String name, int time, int capacity, Position2D position) {
		super(name, time, capacity, position);
		
	}
	private LinkedList<Patient> Queue = new LinkedList<>();
	@Override
	public synchronized void enter(Patient p) {
		System.out.println("Patient " + p.getNumber() + " trying to enter " + this.name);

		try {
			Queue.add(p);
			waiting++;//se me había olvidado
		
		while(this.numPatients>=this.capacity||this.Queue.peek() != p) {
			System.out.println(" el paciente" + p.getNumber()+ " se pone a la cola ");
			
			wait();
			
		}

		this.numPatients++;
		this.waiting--;
		System.out.println(" el paciente" + Queue.peek()+ "por fín entra en "+ this.name);
		Queue.remove(p);

		
		}catch(InterruptedException e ) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
}
}
