package com.online.facilitymanager.model.maintenance;

import java.util.HashMap;
import com.online.facilitymanager.model.slot.Slot;

public class MaintenanceLogImpl implements MaintenanceLog
{
	private HashMap<MaintenanceOrder, Slot> log;
	
	MaintenanceLogImpl()
	{
		log = new HashMap<MaintenanceOrder, Slot>();
	}

	/**
	 * @return the schedule
	 */
	public HashMap<MaintenanceOrder, Slot> getLog() {
		return log;
	}

	/**
	 * @param schedule the schedule to set
	 */
	public void setLog(HashMap<MaintenanceOrder, Slot> log) {
		this.log = log;
	}
}
