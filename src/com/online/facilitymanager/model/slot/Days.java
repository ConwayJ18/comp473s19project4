package com.online.facilitymanager.model.slot;

public interface Days
{
	public boolean isM();
	public void setM(boolean m);
	public boolean isT();
	public void setT(boolean t);
	public boolean isW();
	public void setW(boolean w);
	public boolean isR();
	public void setR(boolean r);
	public boolean isF();
	public void setF(boolean f);
	public boolean isA();
	public void setA(boolean a);
	public boolean isU();
	public void setU(boolean u);
	public boolean overlaps(Days d);
	public int totalDaysInUse();
}
