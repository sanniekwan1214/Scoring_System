package Scoring_System;

public class Application {
	//this class is for applicants to fill their info to submit
	
	//fill PartA -- Living Condition
	private double flat_size= 0;
	private String living_district = null;
	private int family_no = 0;
	
	//fill PartB -- Extra Curricular
	private String leadership_position =null;
	private String academic_achievement = null;
	private String contributionToHall= null;
	
	public Application(double size, String district, int familyNum, String leadership, String academic, String contribution)
	{
		flat_size = size;
		living_district = district;
		family_no = familyNum;
		leadership_position = leadership;
		academic_achievement = academic;
		contributionToHall = contribution;
	}
	
	public double getFlatSize()
	{
		return flat_size;
	}
	
	public String getLivingDistrict()
	{
		return living_district;
	}
	
	public int getFamilyNo()
	{
		return family_no;
	}
	
	public String getLeadershipPosition()
	{
		return leadership_position;
	}
	
	public String getAcademicAchievement()
	{
		return academic_achievement;
	}
	
	public String getContributionToHall()
	{
		return contributionToHall;
	}
}
