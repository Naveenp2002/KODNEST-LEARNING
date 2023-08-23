package com.kodnestmethodsprogramming;

import java.util.Scanner;

public class TheJourneyCalculatorApp {
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Speed And Time To Calculate Distance");
	double speed=scan.nextDouble();
	double time=scan.nextDouble();
	TheJourneyCalculator journeyCalculator=new TheJourneyCalculator();
	double distance=journeyCalculator.calculateDistance(speed, time);
	System.out.println(distance);
	}
}
