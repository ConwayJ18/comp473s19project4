package com.online.facilitymanager.model.use;

import java.util.HashMap;

import com.online.facilitymanager.model.slot.Slot;

public interface UseSchedule 
{
	public HashMap<UseRequest, Slot> getSchedule();
	public void setSchedule(HashMap<UseRequest, Slot> schedule);
}
