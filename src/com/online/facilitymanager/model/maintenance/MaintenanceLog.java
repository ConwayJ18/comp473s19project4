package com.online.facilitymanager.model.maintenance;

import java.util.HashMap;

import com.online.facilitymanager.model.slot.Slot;

public interface MaintenanceLog
{
	public HashMap<MaintenanceOrder, Slot> getLog();
	public void setLog(HashMap<MaintenanceOrder, Slot> log);
}
