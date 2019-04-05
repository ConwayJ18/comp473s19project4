package com.online.facilitymanager.model.inspection;

public interface Visitor
{
	void visit(Inspection i);
	void visit(FireInspection f);
	void visit(SafetyInspection s);
}
