package com.online.facilitymanager.model.slot;

public class DateImpl implements Date
{
	private int month;
	private int day;
	private int year;
	
	public DateImpl() {}
	
	/**
	 * @param month
	 * @param day
	 * @param year
	 */
	public DateImpl(int month, int day, int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	/**
	 * @return the month
	 */
	public int getMonth()
	{
		return month;
	}
	
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	/**
	 * @return the day
	 */
	public int getDay()
	{
		return day;
	}
	
	/**
	 * @param day the day to set
	 */
	public void setDay(int day)
	{
		this.day = day;
	}
	
	/**
	 * @return the year
	 */
	public int getYear() 
	{
		return year;
	}
	
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public boolean isOlderThan(Date d)
	{
		if(this.getYear() < d.getYear())
		{
			return true;
		}
		else if(this.getYear() > d.getYear())
		{
			return false;
		}
		else
		{
			if(this.getMonth() < d.getMonth())
			{
				return true;
			}
			else if(this.getMonth() > d.getMonth())
			{
				return false;
			}
			else
			{
				if(this.getDay() < d.getDay())
				{
					return true;
				}
				else if(this.getDay() > d.getDay())
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	@Override
	public String toString()
	{
		return this.getMonth() + "/" + this.getDay() + "/" + this.getYear();
	}
}
