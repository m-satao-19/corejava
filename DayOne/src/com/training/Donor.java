package com.training;

public class Donor {
	private String donorName;
	private String donorBloodGroup;
	private int donorAge;
	private int donorWeight;
	
	public Donor(String donorName, String donorBloodGroup, int donorAge, int donorWeight) {
		super();
		this.donorName = donorName;
		this.donorBloodGroup = donorBloodGroup;
		this.donorAge = donorAge;
		this.donorWeight = donorWeight;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getDonorBloodGroup() {
		return donorBloodGroup;
	}
	public void setDonorBloodGroup(String donorBloodGroup) {
		this.donorBloodGroup = donorBloodGroup;
	}
	public int getDonorAge() {
		return donorAge;
	}
	public void setDonorAge(int donorAge) {
		this.donorAge = donorAge;
	}
	public int getDonorWeight() {
		return donorWeight;
	}
	public void setDonorWeight(int donorWeight) {
		this.donorWeight = donorWeight;
	}
	
	
}
