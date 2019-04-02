package com.online.facilitymanager.model.slot;

public class DurationImpl implements Duration
{
	private int durationInMinutes;
	
	public DurationImpl() {}

	/**
	 * @param durationInMinutes
	 */
	public DurationImpl(int durationInMinutes)
	{
		this.durationInMinutes = durationInMinutes;
	}
	
	/**
	 * @param startTime
	 * @param endTime
	 */
	public DurationImpl(Time startTime, Time endTime)
	{
		this.durationInMinutes = (endTime.getHour()-startTime.getHour())*60 + (endTime.getMinute()-startTime.getMinute());
	}

	/**
	 * @return the durationInMinutes
	 */
	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	/**
	 * @param durationInMinutes the durationInMinutes to set
	 */
	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	
}
