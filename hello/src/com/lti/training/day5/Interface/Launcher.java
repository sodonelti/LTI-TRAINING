package com.lti.training.day5.Interface;
	/**inbuilt launcher for launching mobile apps**/

public class Launcher {
	//Informing the TM that a application has started/launched.
	//By using static I am creating one object of TM.
	//by using private - I am hiding the TM
	private static TaskManager taskManager=new TaskManager();
	
	public void launch(MobileApplication mobileApp) {
		mobileApp.start();
		taskManager.inform(mobileApp);		
		
		//mobileApp.pause();
		//mobileApp.stop();
	}
	
	//to stop all the running apps
	public void closeAllRunningApps() {
		taskManager.clearAll();
	}
	public int count() {
		return taskManager.runningApps();
	}
}