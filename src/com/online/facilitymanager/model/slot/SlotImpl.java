package com.online.facilitymanager.model.slot;

public class SlotImpl implements Slot
{
	private Days days;
	private Time startTime;
	private Time endTime;
	private Duration duration;
	private Date date;
	
	public SlotImpl() {}
	
	/**
	 * @param days
	 * @param startTime
	 * @param endTime
	 */
	public SlotImpl(Days days, Time startTime, Time endTime)
	{
		this.days = days;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = new DurationImpl(startTime, endTime);
	}
	
	/**
	 * @param days
	 * @param startTime
	 * @param duration
	 */
	public SlotImpl(Days days, Time startTime, Duration duration)
	{
		this.days = days;
		this.startTime = startTime;
		this.duration = duration;
		this.endTime = new TimeImpl(duration.getDurationInMinutes()/60, duration.getDurationInMinutes()%60);
	}
	
	/**
	 * @param date
	 * @param startTime
	 * @param endTime
	 */
	public SlotImpl(Date date, Time startTime, Time endTime)
	{
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = new DurationImpl(startTime, endTime);
	}
	
	/**
	 * @param date
	 * @param startTime
	 * @param duration
	 */
	public SlotImpl(Date date, Time startTime, Duration duration)
	{
		this.date = date;
		this.startTime = startTime;
		this.duration = duration;
		this.endTime = new TimeImpl(duration.getDurationInMinutes()/60, duration.getDurationInMinutes()%60);
	}
	
	/**
	 * @return the days
	 */
	public Days getDays()
	{
		return days;
	}

	/**
	 * @param days the days to set
	 */
	public void setDays(Days days)
	{
		this.days = days;
	}

	/**
	 * @return the startTime
	 */
	public Time getStartTime()
	{
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Time startTime)
	{
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public Time getEndTime()
	{
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Time endTime)
	{
		this.endTime = endTime;
	}

	/**
	 * @return the duration
	 */
	public Duration getDuration()
	{
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Duration duration)
	{
		this.duration = duration;
	}
	
	/**
	 * @return the date
	 */
	public Date getDate()
	{
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date)
	{
		this.date = date;
	}

	//Recalculate the duration based on startTime and endTime
	public void calculateDuration()
	{
		this.duration = new DurationImpl(startTime, endTime);
	}
	
	//Recalculate the endTime based on the startTime and duration
	public void calculateEndTime()
	{
		this.endTime = new TimeImpl(duration.getDurationInMinutes()/60, duration.getDurationInMinutes()%60);
	}
	
	public boolean overlaps(Slot s)
	{
		if(this.getDate().equals(s.getDate()) || this.getDays().overlaps(s.getDays()))
		{
			if((this.getStartTime().getFourDigitTime() <= s.getStartTime().getFourDigitTime()
					&& this.getEndTime().getFourDigitTime() >= s.getStartTime().getFourDigitTime())
				|| (this.getStartTime().getFourDigitTime() <= s.getEndTime().getFourDigitTime()
					&& this.getEndTime().getFourDigitTime() >= s.getEndTime().getFourDigitTime())
				|| (this.getStartTime().getFourDigitTime() <= s.getStartTime().getFourDigitTime()
					&& this.getEndTime().getFourDigitTime() >= s.getEndTime().getFourDigitTime()))
				{
					return true;
				}
		}
		return false;
	}
}
