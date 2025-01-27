package com.rays.pro4.Bean;

import java.util.Date;

public class ClientBean extends BaseBean{
	
	
	private String name;
	private Date appointmentDate;
	private String  phone;
	private String inlines;
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getInlines() {
		return inlines;
	}

	public void setInlines(String inlines) {
		this.inlines = inlines;
	}

	@Override
	public String getkey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
