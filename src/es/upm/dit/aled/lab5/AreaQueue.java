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
	
	public AreaQueue (String name, int capacity, Position2D position) {
		this.name = name;
		this.capacity = capacity;
		this.position=position;
	}
	
	private LinkedList<Patient> Queue = new LinkedList<>();
	
}
