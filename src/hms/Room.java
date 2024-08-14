package hms;

public class Room {
	
	private int roomNumber;
	private boolean isBooked;

	public Room(int roomNumber, boolean check) {
		this.roomNumber = roomNumber;
		this.isBooked = check;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public boolean getBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	
}
