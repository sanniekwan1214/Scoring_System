package Scoring_System;
import java.util.*;

public class CalculateScore {
	private ArrayList<String> District_Score120 = new ArrayList<String>();
	private ArrayList<String> District_Score100 = new ArrayList<String>();
	private ArrayList<String> District_Score80 = new ArrayList<String>();
	private ArrayList<String> District_Score60 = new ArrayList<String>();
	private ArrayList<String> District_Score40 = new ArrayList<String>();
	private ArrayList<String> District_Score20 = new ArrayList<String>();
	
	public CalculateScore()
	{
		
	}
	
	public void defineDistrictList()
	{
		District_Score120.add("Cheung Chau");
		District_Score120.add("Lamma Island");
		District_Score120.add("Lantau");
		District_Score120.add("Mui Wo");
		District_Score120.add("Peng Chau");
		District_Score120.add("Shenzhen");
		
		District_Score100.add("Deep Bay");
		District_Score100.add("Stanley");
		District_Score100.add("Wah Fu");
		District_Score100.add("Wong Chuk Hang");
		District_Score100.add("Hung Shui Kiu");
		District_Score100.add("Kam Tin");
		District_Score100.add("Ma Wan");
		District_Score100.add("Sha Tau Kok");
		
		District_Score80.add("Aberdeen");
		District_Score80.add("Ap Lei Chau");
		District_Score80.add("Chai Wan");
		District_Score80.add("Kennedy Town");
		District_Score80.add("Mid Level");
		District_Score80.add("Pok Fu Lam");
		District_Score80.add("Sai Ying Pun");
		District_Score80.add("Siu Sai Wan");
		District_Score80.add("South Horizons");
		District_Score80.add("Western District");
		
		District_Score60.add("Causeway Bay");
		District_Score60.add("Central");
		District_Score60.add("Fortress Hill");
		District_Score60.add("Happy Valley");
		District_Score60.add("North Point");
		District_Score60.add("Quarry Bay");
		District_Score60.add("Sai Wan Ho");
		District_Score60.add("Shau Kei Wan");
		District_Score60.add("Sheung Wan");
		District_Score60.add("Tai Hang");
		District_Score60.add("Tai Koo Shing");
		District_Score60.add("Tin Hau");
		District_Score60.add("Wan Chai");
		District_Score60.add("Ho Man Tin");
		District_Score60.add("Kwun Tong");
		District_Score60.add("Tin Hau");
		District_Score60.add("Laguna City");
		District_Score60.add("Lai Chi Kok");
		District_Score60.add("Lam Tin");
		District_Score60.add("Lok Wah");
		District_Score60.add("Ngau Chi Wan");
		District_Score60.add("Sau Mau Ping");
		District_Score60.add("Whampoa");
		District_Score60.add("Yau Tong");
		District_Score60.add("Fo Tan");
		District_Score60.add("Hang Hau");
		District_Score60.add("Kwai Chung");
		District_Score60.add("Kwai Fong");
		District_Score60.add("Kwai Shing");
		District_Score60.add("Lai King");
		District_Score60.add("Ma On Shan");
		District_Score60.add("Po Lam");
		District_Score60.add("Shatin");
		District_Score60.add("Tai Po");
		District_Score60.add("Tai Wai");
		District_Score60.add("Tai Wo Hau");
		District_Score60.add("Tseung Kwan O");
		District_Score60.add("Tsing Yi");
		District_Score60.add("Tsuen Wan");
		
		District_Score40.add("Cheung Sha Wan");
		District_Score40.add("Chuk Yuen");
		District_Score40.add("Choi Hung");
		District_Score40.add("Diamond Hill");
		District_Score40.add("Hung Hom");
		District_Score40.add("Jordan");
		District_Score40.add("Kowloon Bay");
		District_Score40.add("Kowloon City");
		District_Score40.add("Lok Fu");
		District_Score40.add("Ma Tau Wai");
		District_Score40.add("Mei Foo");
		District_Score40.add("Ngau Tau Kok");
		District_Score40.add("Mongkok");
		District_Score40.add("Ping Shek");
		District_Score40.add("San Po Kong");
		District_Score40.add("Sham Shui Po");
		District_Score40.add("Shek Kip Mei");
		District_Score40.add("Tai Kok Tsui");
		District_Score40.add("To Kwa Wan");
		District_Score40.add("Tsz Wan Shan");
		District_Score40.add("Wang Tau Hom");
		District_Score40.add("Wong Tai Sin");
		District_Score40.add("Yau Ma Tei");
			
		District_Score20.add("Kowloon Tong");
	}
}
