package com.online.facilitymanager.model.use;

import com.online.facilitymanager.model.slot.Slot;

public interface UseRequest
{
	public FacilityUser getUser();
	public void setUser(FacilityUser user);
	public Slot getTimeslot();
	public void setTimeslot(Slot timeslot);
}
