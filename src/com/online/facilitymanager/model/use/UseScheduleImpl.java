package com.online.facilitymanager.model.use;

import java.util.ArrayList;
import java.util.HashMap;
import com.online.facilitymanager.model.slot.Slot;

public class UseScheduleImpl implements UseSchedule
{
	private HashMap<UseRequest, Slot> schedule;
	public ArrayList<FacilityUser> scheduleObservers = new ArrayList<FacilityUser>();

	UseScheduleImpl()
	{
		schedule = new HashMap<UseRequest, Slot>();
	}

	/**
	 * @return the schedule
	 */
	public HashMap<UseRequest, Slot> getSchedule()
	{
		return schedule;
	}

	/**
	 * @param schedule the schedule to set
	 */
	public void setSchedule(HashMap<UseRequest, Slot> schedule)
	{
		this.schedule = schedule;
	}

	/**
	 * @param user the user to add
	 */
	public void addObserver(FacilityUser user)
	{
		this.scheduleObservers.add(user);
	}

	/**
	 * @param user the user to remove
	 */
	public void removeObserver(FacilityUser user)
	{
		this.scheduleObservers.remove(user);
	}

	public void notifyObservers()
	{
		for(FacilityUser u : scheduleObservers)
		{
			u.setSchedule(this.schedule);
		}
	}
}
