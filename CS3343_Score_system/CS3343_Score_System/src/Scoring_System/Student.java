package Scoring_System;

public class Student {
	private String Stud_EID = null;
	private String Stud_ID = null;
	
	public Student(String EID, String ID)
	{
		Stud_EID = EID;
		Stud_ID = ID;
	}
	
	public String getEID()
	{
		return Stud_EID;
	}
	
	public String getID()
	{
		return Stud_ID;
	}
}
