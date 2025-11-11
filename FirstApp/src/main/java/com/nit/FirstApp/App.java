package com.nit.FirstApp;

/**
 * Hello world!
 */
public class App {
	
	public int sum(int a,int b) {
		return a+b;
	}
    public static void main(String[] args) {
    	App app1=new App();
        System.out.println("SUM is :"+app1.sum(10,20));
    }
}
