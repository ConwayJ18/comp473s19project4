package com.online.facilitymanager.data;

import java.util.ArrayList;

import com.online.facilitymanager.model.facility.Facility;
import com.online.facilitymanager.model.inspection.Inspection;
import com.online.facilitymanager.model.slot.Date;
import com.online.facilitymanager.model.slot.Days;
import com.online.facilitymanager.model.slot.Slot;
import com.online.facilitymanager.model.slot.SlotImpl;
import com.online.facilitymanager.model.slot.Time;
import com.online.facilitymanager.model.use.UseRequest;
import com.online.facilitymanager.model.use.UseSchedule;

public class UseDAO
{
	public UseDAO() {}
	
	public static boolean isInUseDuringInterval(Facility f, Date d, Time start, Time end)
	{
		Slot comp = new SlotImpl(d, start, end);
		for(Slot s : Database.db.get(f).getUse().getSchedule().getSchedule().values())
		{
			if(s.overlaps(comp))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean isInUseDuringInterval(Facility f, Days d, Time start, Time end)
	{
		Slot comp = new SlotImpl(d, start, end);
		for(Slot s : Database.db.get(f).getUse().getSchedule().getSchedule().values())
		{
			if(s.overlaps(comp))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static void assignFacilityToUse(Facility f, UseRequest ur)
	{
		Database.db.get(f).getUse().getSchedule().getSchedule().put(ur, ur.getTimeslot());
	}
	
	public static void vacateFacility(Facility f)
	{
		Database.db.get(f).getUse().getSchedule().getSchedule().clear();
	}
	
	public static ArrayList<Inspection> listInspections(Facility f)
	{
		return Database.db.get(f).getInspections();
	}
	
	public static UseSchedule listActualUsage(Facility f)
	{
		return Database.db.get(f).getUse().getSchedule();
	}
	
	public static double calcUsageRate(Facility f)
	{
		int totalMinutesInUse = 0;
		double usageRate;
		for(Slot s : Database.db.get(f).getUse().getSchedule().getSchedule().values())
		{
			if(s.getDays().equals(null))
			{
				totalMinutesInUse += s.getDuration().getDurationInMinutes()*s.getDays().totalDaysInUse();
			}
			else
			{
				totalMinutesInUse += s.getDuration().getDurationInMinutes();
			}
		}
		usageRate = totalMinutesInUse/10080;
		
		return usageRate;
	}
}
