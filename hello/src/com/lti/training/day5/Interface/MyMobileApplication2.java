package com.lti.training.day5.Interface;

public class MyMobileApplication2 implements  MobileApplication {

	@Override
	public void start() {
		System.out.println(" yooo MyMobileApplication2.started");
	}

	@Override
	public void pause() {
		System.out.println(" yooo MyMobileApplication2.paused");
		
	}

	@Override
	public void stop() {
		System.out.println(" yooo bakwas MyMobileApplication2.stopped");
		
	}
	
}

