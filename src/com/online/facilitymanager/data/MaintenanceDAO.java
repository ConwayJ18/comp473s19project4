package com.online.facilitymanager.data;

import java.util.ArrayList;
import com.online.facilitymanager.model.facility.Facility;
import com.online.facilitymanager.model.maintenance.MaintenanceOrder;
import com.online.facilitymanager.model.maintenance.MaintenanceRequest;
import com.online.facilitymanager.model.maintenance.MaintenanceSchedule;
import com.online.facilitymanager.model.slot.Date;
import com.online.facilitymanager.model.slot.DateImpl;
import com.online.facilitymanager.model.slot.Slot;

public class MaintenanceDAO
{
	public MaintenanceDAO() {}
	
	public static void makeFacilityMaintRequest(Facility f, MaintenanceRequest mr)
	{
		Database.db.get(f).getMaintenance().addMaintenanceRequest(mr);
	}
	
	public static void scheduleMaintenance(Facility f, MaintenanceOrder mo, Slot s)
	{
		Database.db.get(f).getMaintenance().addOrderToSchedule(mo, s);
	}

	public static int calcMaintenanceCostForFacility(Facility f)
	{
		int totalCost = 0;
		
		for(MaintenanceOrder o : Database.db.get(f).getMaintenance().getMaintenanceOrders())
		{
			totalCost += o.getCost();
		}
		
		for(MaintenanceOrder o : Database.db.get(f).getMaintenance().getMaintSchedule().getSchedule().keySet())
		{
			totalCost += o.getCost();
		}
		
		for(MaintenanceOrder o : Database.db.get(f).getMaintenance().getMaintenanceLog().getLog().keySet())
		{
			totalCost += o.getCost();
		}
		
		return totalCost;
	}
	
	public static String calcProblemRateForFacility(Facility f)
	{
		int totalProblems = 0;
		Date oldestDate = new DateImpl(Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE);
		
		for(MaintenanceOrder o : Database.db.get(f).getMaintenance().getMaintenanceOrders())
		{
			if(o.getRequestDate().isOlderThan(oldestDate))
			{
				oldestDate = o.getRequestDate();
			}
			totalProblems++;
		}
		
		for(MaintenanceOrder o : Database.db.get(f).getMaintenance().getMaintSchedule().getSchedule().keySet())
		{
			if(o.getRequestDate().isOlderThan(oldestDate))
			{
				oldestDate = o.getRequestDate();
			}
			totalProblems++;
		}
		
		for(MaintenanceOrder o : Database.db.get(f).getMaintenance().getMaintenanceLog().getLog().keySet())
		{
			if(o.getRequestDate().isOlderThan(oldestDate))
			{
				oldestDate = o.getRequestDate();
			}
			totalProblems++;
		}
		
		return totalProblems + " since " + oldestDate.toString();
	}
	
	public static int calcDownTimeForFacility(Facility f)
	{
		int downtime = 0;
		for(Slot s : Database.db.get(f).getMaintenance().getMaintSchedule().getSchedule().values())
		{
			downtime += s.getDuration().getDurationInMinutes();
		}
		
		for(Slot s : Database.db.get(f).getMaintenance().getMaintenanceLog().getLog().values())
		{
			downtime += s.getDuration().getDurationInMinutes();
		}
		
		return downtime;
	}
	
	public static ArrayList<MaintenanceRequest> listMaintRequests(Facility f)
	{
		return Database.db.get(f).getMaintenance().getMaintenanceReqs();
	}
	
	public static ArrayList<MaintenanceOrder> listMaintenance(Facility f)
	{
		return Database.db.get(f).getMaintenance().getMaintenanceOrders();
	}
	
	public static MaintenanceSchedule listFacilityProblems(Facility f)
	{
		return Database.db.get(f).getMaintenance().getMaintSchedule();
	}
}
