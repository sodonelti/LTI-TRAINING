package com.lti.training.day5.Interface;

public class MyMobileApplication3 implements  MobileApplication {

	@Override
	public void start() {
		System.out.println("my app  MyMobileApplication3.started");
	}

	@Override
	public void pause() {
		System.out.println(" my app MyMobileApplication3.paused");
		
	}

	@Override
	public void stop() {
		System.out.println(" my app MyMobileApplication3.stopped");
		
	}
	
}
