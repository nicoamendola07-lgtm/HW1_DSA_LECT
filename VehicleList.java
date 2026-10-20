package edu.monmouth.hw1;
import edu.monmouth.vehicle.*;

public class VehicleList {
	VehicleNode head;
	
	public VehicleList() {}
	
	
	public void insert(Vehicle v) {
		VehicleNode newNode = new VehicleNode(v);
		newNode.setNext(head);
		head=newNode;
	}
	
	public Vehicle first() {
		if (head==null) { return null; }
		return head.getVehicle();
	}
	
	public Vehicle last() {
		if (head==null) { return null; }

		VehicleNode curr=head;
		while(curr.getNext()!=null) {
			curr=curr.getNext();
		}
		return curr.getVehicle();
	}
	
	public Vehicle removeFirst() {
		if (head==null) { return null; }
		VehicleNode temp = head;
		head = head.getNext();
		temp.setNext(null);
		return temp.getVehicle();
	}
	
	public void insertLast(Vehicle v) {
		VehicleNode newNode = new VehicleNode(v);
		if (head==null) { 
			head=newNode; 
			return;
		}

		VehicleNode curr=head;
		while(curr.getNext()!=null) {
			curr=curr.getNext();
		}
		curr.setNext(new VehicleNode(v));
	}
	
	public boolean isEmpty() {
		if (head==null) {
			return true;
		} else {
			return false;
		}
	}
	
	public short size() {
		if (head==null) { return 0; }
		short count=0;
		for (VehicleNode curr=head; curr != null; curr=curr.getNext()) { count++; }
		return count;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String sep = "";
		for (VehicleNode curr=head; curr != null; curr=curr.getNext()) {
			sb.append(sep).append(curr);
			sep = ", ";
		}
		return sb.toString();
	}
	
}
