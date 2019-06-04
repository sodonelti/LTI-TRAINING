package com.lti.training.day5.Interface;

public class Main {
	public static void main(String[] args) {
		int a;
		Launcher launcher=new Launcher();
		
		MyMobileApplication1 app1=new MyMobileApplication1();
		launcher.launch(app1);
		
		MyMobileApplication2 app2=new MyMobileApplication2();
		launcher.launch(app2);
		
		MyMobileApplication3 app3=new MyMobileApplication3();
		launcher.launch(app3);
		
		app1.Version();
		
		//Trying to display the count of running apps
		a = launcher.count();
		System.out.println(a);
		
		//to close all the running apps\
		launcher.closeAllRunningApps();
		
		
		
	}

}
