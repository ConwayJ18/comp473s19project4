package com.online.facilitymanager.model.use;

import java.util.HashMap;

import com.online.facilitymanager.model.slot.Slot;

public interface FacilityUser
{
	public String getUserID();
	public void setUserID(String userID);
	public String getUserName();
	public void setUserName(String userName);
	public long getUserPhone();
	public void setUserPhone(long userPhone);
	public String getUserEmail();
	public void setUserEmail(String userEmail);
	public String getUserRole();
	public void setUserRole(String userRole);
	public HashMap<UseRequest, Slot> getSchedule();
	public void setSchedule(HashMap<UseRequest, Slot> schedule);
}
