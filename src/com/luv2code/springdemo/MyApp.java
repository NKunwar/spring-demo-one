package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {

		//create the obj
		Coach theCoach = new TrackCoach(); // here new TrackCoach() is hardcoded, so using Spring Config file we will remove this dependency
//		Coach theCoach = new BaseballCoach();
		
		//use the obj
		System.out.println(theCoach.getDailyWorkout());
	}

}
