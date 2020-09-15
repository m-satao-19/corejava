package com.training;


public class DonorApplication {
	public static void main(String[] args) {
		Donor first = new Donor("John Doe", "B+", 23, 62);
		System.out.println(first.getDonorName());
		System.out.println(first.getDonorAge());
		System.out.println(first.getDonorWeight());
		System.out.println(first.getDonorBloodGroup());
		
		System.out.println();
		
		first.setDonorWeight(70);
		System.out.println(first.getDonorName());
		System.out.println(first.getDonorWeight());
		System.out.println(first.getDonorBloodGroup());
	}
}
