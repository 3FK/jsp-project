package customerBilling.Model;

import java.util.Date;

public class Room {
	protected int roomID;
	protected int price;
	protected int serviceChargePerDay;
	protected String checkInDate;
	
	
	public Room (int roomID, int price, int serviceChargePerDay, String checkInDate) {
		this(price, serviceChargePerDay, checkInDate);
		this.roomID = roomID;
	}
	public Room(int price, int serviceChargePerDay, String checkInDate) {
		this.price = price;
		this.serviceChargePerDay = serviceChargePerDay;
		this.checkInDate = checkInDate;
	}
	public int getRoomID() {
		return roomID;
	}
	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getServiceChargePerDay() {
		return serviceChargePerDay;
	}
	public void setServiceChargePerDay(int serviceChargePerDay) {
		this.serviceChargePerDay = serviceChargePerDay;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	

}
