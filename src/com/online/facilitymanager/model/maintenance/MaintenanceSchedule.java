package com.online.facilitymanager.model.maintenance;

import java.util.HashMap;

import com.online.facilitymanager.model.slot.Slot;

public interface MaintenanceSchedule
{
	public HashMap<MaintenanceOrder, Slot> getSchedule();
	public void setSchedule(HashMap<MaintenanceOrder, Slot> schedule);
}
