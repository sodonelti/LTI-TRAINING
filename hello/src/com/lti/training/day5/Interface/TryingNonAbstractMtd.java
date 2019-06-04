package com.lti.training.day5.Interface;

public interface TryingNonAbstractMtd {
	 String INFO="Developed By Google";
	 public void start();
	 public void pause();
	 public void stop();
	 
	 public default void Version() {
		 System.out.println(INFO +" Version is 1.0");
	 }
	 
}
