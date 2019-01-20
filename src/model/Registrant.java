package model;

import java.util.Date;

public class Registrant {
	// fields
	private String name;
	private String memberID;
	private Date CheckinTime;
	
	
	public Registrant(String name, String memberID) {
		super();
		this.name = name;
		this.memberID = memberID;
	}

	public Registrant(String name, String memberID, Date checkinTime) {
		super();
		this.name = name;
		this.memberID = memberID;
		CheckinTime = checkinTime;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}
	
	public String getMemberID() {
		return memberID;
	}
	
	public Date getCheckinTime() {
		return CheckinTime;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCheckinTime(Date checkinTime) {
		CheckinTime = checkinTime;
	}
	
	// Helper methods
	public boolean isCheckedIn() {
		return getCheckinTime() == null;
	}
}
