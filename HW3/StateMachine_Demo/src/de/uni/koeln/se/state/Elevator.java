package de.uni.koeln.se.state;


public class Elevator{
	
	public static int current_Floor=5;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor)
	{
		this.dest_Floor=dest_floor;
	System.out.println("*** Destination floor is: "+ dest_Floor);
	arrive_atFloor();


	}

	private void arrive_atFloor() {
		if (current_Floor < dest_Floor) {
			current_Floor ++;
			System.out.println(State.MovingUp);
			arrive_atFloor();
		} else if (current_Floor > dest_Floor ) {
			current_Floor --;
			System.out.println(State.MovingDown);
			arrive_atFloor();
		} else if(current_Floor == dest_Floor) {
			System.out.println(State.ArriveAtFloor + "" + current_Floor);
			System.out.println(State.Exit);
		}
	}	
}
