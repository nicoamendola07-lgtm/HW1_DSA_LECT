package edu.monmouth.hw1;
import edu.monmouth.vehicle.*;


public class VehicleNode {
	Vehicle vehicle;
	VehicleNode next;
	
	public VehicleNode(Vehicle vehicle) {
		setVehicle(vehicle);
		next = null;
	}
	
	//VEHICLE -set & get
	public void setVehicle(Vehicle vehicle) {
		this.vehicle=vehicle;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	//NEXT -set & get
	public void setNext(VehicleNode next) {
		this.next=next;
	}
	public VehicleNode getNext() {
		return next;
	}
	
	@Override
	public String toString() {
		if (vehicle==null) { return "null"; }
		else { return vehicle.toString(); }
	}
}
