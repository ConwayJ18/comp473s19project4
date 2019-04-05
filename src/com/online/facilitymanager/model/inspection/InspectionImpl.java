package com.online.facilitymanager.model.inspection;

import java.util.ArrayList;

import com.online.facilitymanager.model.slot.Slot;

public class InspectionImpl extends Inspection
{
	ArrayList<Inspection> inspections = new ArrayList<>();
	
      public InspectionImpl() {
        super();
      }

      /**
    	 * @param inspectionType
    	 * @param slot
    	 */
    	public InspectionImpl(String inspectionType, Slot slot)
    	{
    		super(inspectionType, slot);
    	}

      /**
       * @return the inspectionType
       */
      public String getInspectionType()
      {
        return "Fire";
      }

      /**
       * @param inspectionType the inspectionType to set
       */
      public void inspectionType(String inspectionType)
      {
        this.inspectionType = inspectionType;
      }

      /**
       * @return the slot
       */
      public Slot getSlot()
      {
        return slot;
      }

      /**
       * @param slot the slot to set
       */
      @Override
      public void setSlot(Slot slot)
      {
        this.slot = slot;
      }

	@Override
	public void acceptVisitor(Visitor v) {
		v.visit(this);
	}
	
	public void add(Inspection i)
	{
		inspections.add(i);
	}
	
	public void remove(Inspection i)
	{
		inspections.remove(i);
	}
}