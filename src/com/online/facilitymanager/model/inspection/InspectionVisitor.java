package com.online.facilitymanager.model.inspection;

public class InspectionVisitor implements Visitor {

	@Override
	public void visit(Inspection i) 
	{
		System.out.println("Visited inspection of type: " + i.getInspectionType());

	}

	@Override
	public void visit(FireInspection f) 
	{
		System.out.println("Visited inspection of type: " + f.getInspectionType());
	}

	@Override
	public void visit(SafetyInspection s) 
	{
		System.out.println("Visited inspection of type: " + s.getInspectionType());
	}

}
