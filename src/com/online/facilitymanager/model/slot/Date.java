package com.online.facilitymanager.model.slot;

public interface Date 
{
	public int getMonth();
	public void setMonth(int month);
	public int getDay();
	public void setDay(int day);
	public int getYear();
	public void setYear(int year);
	public boolean isOlderThan(Date d);
	public String toString();
}
