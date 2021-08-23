package com.git.app.git_demo;

/**
 * Hello world!
 *
 */
public class App {

	public void addData(String data) {
		if (data.equals(Constant.Data_Type)) {
			System.out.println("Welcome Mike");
		}
	}
	public void addName(){
		System.out.println("Welcome Rock in new method()");
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
