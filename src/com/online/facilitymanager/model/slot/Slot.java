package com.online.facilitymanager.model.slot;

public interface Slot
{
	public Days getDays();
	public void setDays(Days days);
	public Time getStartTime();
	public void setStartTime(Time startTime);
	public Time getEndTime();
	public void setEndTime(Time endTime);
	public Duration getDuration();
	public void setDuration(Duration duration);
	public Date getDate();
	public void setDate(Date date);
	public void calculateDuration();
	public void calculateEndTime();
	public boolean overlaps(Slot s);
}
