package com.online.facilitymanager.data;

import java.util.Collection;
import com.online.facilitymanager.model.facility.Facility;
import com.online.facilitymanager.model.facility.FacilityDetail;
import com.online.facilitymanager.model.inspection.Inspection;

public class FacilityDAO
{
	public FacilityDAO() {}
	
	public static Collection<Facility> listFacilities()
	{
		return Database.db.values();
	}
	
	public static FacilityDetail getFacilityInformation(Facility f)
	{
		return Database.db.get(f).getFacilityDetail();
	}
	
	public static int requestAvailableCapacity(Facility f)
	{
		return Database.db.get(f).getFacilityDetail().getCapacity();
	}
	
	public static Facility addNewFacility(Facility f)
	{
		Database.db.put(f, f);
		return Database.db.get(f);
	}
	
	public static void addFacilityDetail(Facility f, FacilityDetail fd)
	{
		Database.db.get(f).setFacilityDetail(fd);
	}
	
	public static void removeFacility(Facility f)
	{
		Database.db.remove(f);
	}
	
	public static void addInspection(Facility f, Inspection i)
	{
		Database.db.get(f).scheduleInspection(i);
	}
}
