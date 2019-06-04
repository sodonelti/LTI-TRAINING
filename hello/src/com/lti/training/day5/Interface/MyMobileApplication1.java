package com.lti.training.day5.Interface;
/**
 * My dummy mobile app
 * @author SHREENA
 *
 */
public class MyMobileApplication1 implements  MobileApplication,TryingNonAbstractMtd {

	@Override
	public void start() {
		System.out.println(" my bakwas MyMobileApplication1.started");
	}

	@Override
	public void pause() {
		System.out.println(" my bakwas MyMobileApplication1.paused");
		
	}

	@Override
	public void stop() {
		System.out.println(" my bakwas MyMobileApplication1.stopped");
		
	}
	
}
