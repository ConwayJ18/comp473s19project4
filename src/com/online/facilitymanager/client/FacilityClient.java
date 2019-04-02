package com.online.facilitymanager.client;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.facilitymanager.model.facility.Location;
import com.online.facilitymanager.model.inspection.Inspection;
import com.online.facilitymanager.model.maintenance.Maintenance;
import com.online.facilitymanager.model.maintenance.MaintenanceLog;
import com.online.facilitymanager.model.maintenance.MaintenanceOrder;
import com.online.facilitymanager.model.maintenance.MaintenanceRequest;
import com.online.facilitymanager.model.maintenance.MaintenanceSchedule;
import com.online.facilitymanager.model.slot.Date;
import com.online.facilitymanager.model.slot.Days;
import com.online.facilitymanager.model.slot.Duration;
import com.online.facilitymanager.model.slot.Slot;
import com.online.facilitymanager.model.slot.Time;
import com.online.facilitymanager.model.facility.Facility;
import com.online.facilitymanager.model.facility.FacilityDetail;
import com.online.facilitymanager.model.use.UseSchedule;
import com.online.facilitymanager.model.use.FacilityUser;
import com.online.facilitymanager.model.use.Use;
import com.online.facilitymanager.model.use.UseRequest;

public class FacilityClient
{
	public static void main(String args[])
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
		System.out.println("***************** Application Context instantiated! ******************");
		
		//Begin creation of primary test objects
		Facility f1 = (Facility) context.getBean("facility");
		
		Location fl1 = f1.getLocation();
		fl1.setAddressNumber(1032);
		fl1.setDirectional("W");
		fl1.setStreetName("Sheridan");
		fl1.setCity("Chicago");
		fl1.setState("IL");
		fl1.setZip(60660);
		fl1.setCountry("United States");
		
		FacilityDetail fd1 = f1.getFacilityDetail();
		fd1.setId(1);
		fd1.setName("Information Commons");
		fd1.setCapacity(5574);
		fd1.setSquareFeet(67000);
		
		Use u1 = f1.getUse();
		UseRequest ur1 = u1.getRequests().get(0);
		FacilityUser fu1 = ur1.getUser();
		fu1.setUserID("jaconway");
		fu1.setUserName("Jess Conway");
		fu1.setUserPhone(7864938008l);
		fu1.setUserEmail("jconway6@luc.edu");
		fu1.setUserRole("Admin");
		Slot s1 = ur1.getTimeslot();
		Days dy1 = s1.getDays();
		dy1.setM(true);
		dy1.setT(false);
		dy1.setW(false);
		dy1.setR(false);
		dy1.setF(false);
		dy1.setA(false);
		dy1.setU(false);
		Time st1 = s1.getStartTime();
		st1.setHour(7);
		st1.setMinute(0);
		Time et1 = s1.getEndTime();
		et1.setHour(9);
		et1.setMinute(30);
		Duration dr1 = s1.getDuration();
		dr1.setDurationInMinutes(150);
		Date dt1 = s1.getDate();
		dt1.setDay(17);
		dt1.setMonth(3);
		dt1.setYear(2019);
		UseSchedule us1 = u1.getSchedule();
		
		Maintenance m1 = f1.getMaintenance();
		MaintenanceSchedule ms1 = m1.getMaintSchedule();
		MaintenanceOrder mo1 = m1.getMaintenanceOrders().get(0);
		Date dt2 = mo1.getRequestDate();
		dt2.setDay(30);
		dt2.setMonth(3);
		dt2.setYear(2019);
		Date dt3 = mo1.getOrderDate();
		dt3.setDay(5);
		dt3.setMonth(4);
		dt3.setYear(2019);
		MaintenanceLog ml1 = m1.getMaintenanceLog();
		MaintenanceRequest mr1 = m1.getMaintenanceReqs().get(0);
		mr1.setDetail("Flooding on 1st Floor");
		mr1.setUrgency(5);
		Date dt4 = mr1.getRequestDate();
		dt4.setDay(30);
		dt4.setMonth(3);
		dt4.setYear(2019);
		
		Inspection i1 = f1.getInspections().get(0);
		i1.setInspectionType("Fire");
		Slot s2 = i1.getSlot();
		Time st2 = s2.getStartTime();
		st2.setHour(15);
		st2.setMinute(29);
		Time et2 = s2.getEndTime();
		et2.setHour(19);
		et2.setMinute(17);
		Date dt5 = s2.getDate();
		dt5.setDay(21);
		dt5.setMonth(12);
		dt5.setYear(2025);
		
		//Begin Facility tests
		f1.addNewFacility();
		f1.addFacilityDetail(fd1);
		f1.listFacilities();
		f1.requestAvailableCapacity();
		f1.addInspection(i1);
		f1.removeFacility();
		//End FacilityDAL tests
		
		//Begin UseDAL tests
		f1.addNewFacility();
		f1.isInUseDuringInterval(dt1, st1, et1);
		f1.assignFacilityToUse(ur1);
		f1.vacateFacility();
		f1.listInspections();
		f1.listActualUsage();
		f1.calcUsageRate();
		//End UseDAL tests
		
		//Begin MaintenanceDAL tests
		f1.makeFacilityMaintRequest(mr1);
		f1.scheduleMaintenance(mo1, s1);
		f1.calcMaintenanceCostForFacility();
		f1.calcProblemRateForFacility();
		f1.calcDownTimeForFacility();
		f1.listMaintRequests();
		f1.listMaintenance();
		f1.listFacilityProblems();
		//End MaintenanceDAL tests
		
		System.out.println("***************** End of program reached! ******************");
	}
}