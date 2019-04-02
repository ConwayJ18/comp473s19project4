package com.online.facilitymanager.model.use;

import java.util.HashMap;
import com.online.facilitymanager.model.slot.Slot;

public class UseScheduleImpl implements UseSchedule
{
	private HashMap<UseRequest, Slot> schedule;
	
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
}
