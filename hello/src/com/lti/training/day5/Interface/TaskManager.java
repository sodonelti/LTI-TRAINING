package com.lti.training.day5.Interface;
/**
 * an inbuilt task manager
 * 
 * @author Google Inc
 *
 */
public class TaskManager {
	
	private MobileApplication[] runningApps;
	private int count;
	
	public TaskManager() {
		//setting limits on how many apps can be open on the particular system
		runningApps = new MobileApplication[9999];
	}
	
	//counting the no. of apps open 
	public void inform(MobileApplication MobileApp) {
		runningApps [count++ ]= MobileApp;
	}
	
	//returning how many apps are running as of now
	public int runningApps() {
		return count;
	}
	
	public void clearAll() {
		//FOR-EACH LOOP TO STOP EACH APPLICATION
	//	for(MobileApplication app : runningApps)
		//	app.stop();
		for(int i=0;i<count;i++)
		{
			runningApps[i].stop();
		}
			
	}
}
