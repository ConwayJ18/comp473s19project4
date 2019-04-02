package com.online.facilitymanager.model.maintenance;

import java.util.HashMap;
import com.online.facilitymanager.model.slot.Slot;

public class MaintenanceScheduleImpl implements MaintenanceSchedule
{
	private HashMap<MaintenanceOrder, Slot> schedule;
	
	MaintenanceScheduleImpl()
	{
		schedule = new HashMap<MaintenanceOrder, Slot>();
	}

	/**
	 * @return the schedule
	 */
	public HashMap<MaintenanceOrder, Slot> getSchedule()
	{
		return schedule;
	}

	/**
	 * @param schedule the schedule to set
	 */
	public void setSchedule(HashMap<MaintenanceOrder, Slot> schedule)
	{
		this.schedule = schedule;
	}
}
